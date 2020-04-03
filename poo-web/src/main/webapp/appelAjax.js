var divrRes;
window.onload=function(){

	var btnConv = document.getElementById("btnConv");
	
	divRes = document.getElementById("divRes");
	
	btnConv.addEventListener("click" , function (){
		var codeSource = document.getElementById("source").value;
		var codeCible= document.getElementById("cible").value;
		var montant = document.getElementById("montant").value;
		
		var url= "MyServlet?action=conversion&source="+ codeSource+"&cible="+codeCible+
                 "&montant="+montant ;
		console.log(url);
		makeAjaxGetRequest(url ,  cbGererResultat);
	});
	
}

function cbGererResultat(texteReponse){
	//divRes.innerHTML = texteReponse;
	var resConv = JSON.parse(texteReponse /* au format json string */)
	divRes.innerHTML= resConv.montantConverti; 
}

function makeAjaxGetRequest(url,callback) {
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && (xhr.status == 200 || xhr.status == 0)) {
		    callback(xhr.responseText);
		}
	};
	xhr.open("GET", url, true);
	xhr.send(null);
}
