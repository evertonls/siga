document.addEventListener("focusin", function() {
	let inputNome = document.getElementById("formEmpresa:nome");
	let inputEnd = document.getElementById("formEmpresa:endereco");
	let inputBairro = document.getElementById("formEmpresa:bairro");
	let inputComp = document.getElementById("formEmpresa:complemento");


	if (inputNome !== null && typeof inputNome !== 'undefined') {
		inputNome.addEventListener("keyup", maiuscula);
	}
	
	if (inputEnd !== null && typeof inputEnd !== 'undefined') {
		inputEnd.addEventListener("keyup", maiuscula);
	}
	
	if (inputBairro !== null && typeof inputBairro !== 'undefined') {
		inputBairro.addEventListener("keyup", maiuscula);
	}
	
	if (inputComp !== null && typeof inputComp !== 'undefined') {
		inputComp.addEventListener("keyup", maiuscula);
	}
	
	$('.telefone').mask(telMaskBehavior, opcoes);


});


