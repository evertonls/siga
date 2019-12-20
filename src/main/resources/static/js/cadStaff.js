document.addEventListener("focusin", function() {
	//let inputEmail = document.getElementById("formStaff:email");
	let inputNome = document.getElementById("formStaff:nome");


	if (inputNome !== null && typeof inputNome !== 'undefined') {
		inputNome.addEventListener("keyup", maiuscula);
	}
	
	$('.telefone').mask(telMaskBehavior, opcoes);


    /*if(inputEmail !== null && typeof inputEmail !== 'undefined'){
        inputEmail.addEventListener("keyup", minuscula);
    }*/
	

});


