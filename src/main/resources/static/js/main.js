var rootURL = "http://localhost:8080/api";

 



//Register listeners
$('#btnSearch').click(function() {
	search($('#searchKey').val());
	return false;
});

function findAllUsers() {
	
	$.ajax({
		type: 'GET',
		url: rootURL+"client/all",
		dataType: "json", // data type of response
		success: renderList
	});
}

function findByName(searchKey) {
	
	client = {}
	$.ajax({
		type: 'GET',
		url: rootURL + '/client/' + searchKey,
		dataType: "json",		
		success: function(data){
			if(data === null)					
				$('#userList').html("<li> Nepoznati korisnik </li>");
			else{
				
				$('#client-name').text(" Ime i prezime klijenta: " + data.ime + " " + data.prezime);			
				$('#client-data-div').removeClass('client-data');	
				$.ajax({
					type: 'GET',
					url: rootURL + "/account/" + data.jmbg,
					dataType: "json",
					success: renderAccounts
				});
			}

		}
	});

	
}

function renderAccounts(data){	 
			console.log(data);
			$.each(data, function(index, item) {
				$('#clients-accounts').append("<tr><td> " + item.brojRacuna + "</td> <td>" + item.tipRacuna +"</td></tr>");
			});		
}
function search(searchKey){
	if (searchKey == '') 
		findAllUsers();
	else
	 	findByName(searchKey);
	}

function renderList(data) {
	
	var list = data;

	$('#userList').html("");
	$.each(list, function(index, item) {
		$('#userList').append('<li>' + item.ime + item.prezime +'</li>');
	});
}
function renderUser(data){
	
		if(data === null)					
			$('#userList').html("<li> Nepoznati korisnik </li>");
		else{
			$('#client-name').text(" Ime i prezime klijenta: " + data.ime + " " + data.prezime);			
			$('#client-data-div').removeClass('client-data');
		}

}