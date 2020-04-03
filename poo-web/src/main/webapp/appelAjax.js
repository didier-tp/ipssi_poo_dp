var divRes,divMsg;
window.onload=function(){

	var btnConv = document.getElementById("btnConv");
	var btnlogin = document.getElementById("btnLogin");
	
	divRes = document.getElementById("divRes");
	divMsg = document.getElementById("divMsg");
	
	btnConv.addEventListener("click" , function (){
		var codeSource = document.getElementById("source").value;
		var codeCible= document.getElementById("cible").value;
		var montant = document.getElementById("montant").value;
		
		var url= "MyServlet?action=conversion&source="+ codeSource+"&cible="+codeCible+
                 "&montant="+montant ;
		console.log(url);
		makeAjaxGetRequest(url ,  cbGererResultat);
	});
	
	
	btnLogin.addEventListener("click" , function (){
		var username = document.getElementById("username").value;
		var password= document.getElementById("password").value;
		
		var url= "MyServlet?action=login&username="+ username+"&password="+password;
		console.log(url);
		makeAjaxGetRequest(url ,  cbGererResultatLogin);
	});
	
}

function cbGererResultatLogin(texteReponse){
	//divRes.innerHTML = texteReponse;
	var resLogin = JSON.parse(texteReponse /* au format json string */)
	divMsg.innerHTML= resLogin.message; 
	if(resLogin.token!=null){
		console.log(resLogin.token);
		localStorage.setItem("token",resLogin.token);
	}else{
		localStorage.setItem("token",null);
	}
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
	var token = localStorage.getItem("token");
	
	xhr.open("GET", url, true);
	if(token!=null){
		xhr.setRequestHeader("Authorization", "Bearer "+token);
	}
	xhr.send(null);
}
