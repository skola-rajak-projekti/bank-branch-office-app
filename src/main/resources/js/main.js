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
				
				$('#client-name').html("<h3 class='card-title'> Klijent : " + data.ime + " " + data.prezime + " </h3>");			
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
function makeAccount(){
	$('#clients-accounts').text(" froma za otvaranej racuna xd");
}

function renderAccounts(data){	 
	$('#clients-accounts').text("");	
		if(data.length == 0){
			$('#clients-accounts').append("<tr><td rowspan='10'>Klijent nema otvorenih racuna. <a href='javascript:makeAccount()'> Napravi novi. </a></td></tr>");
		}else{			
			$.each(data, function(index, item) {
				console.log(item);
				var text = "<tr><td>" + item.brojRacuna + "</td> <td>" + item.tipRacuna + "</td><td> <a href=''> <img src='izvod.jpg' height='45px'> </a>  </td> <td>" + item.stanje +"</td><td> " + item.rezervisanaSredstva + "</td> <td>" + item.raspolozivaSredstva +"</td><td>" + item.valuta + "</td></tr>";
				$('#clients-accounts').append(text);
			});		
		}
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