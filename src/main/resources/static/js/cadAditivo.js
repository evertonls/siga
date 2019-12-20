document.addEventListener("focusin", function() {
	let inputDesc = document.getElementById("formAditivo:descricao");
	let inputProc = document.getElementById("formAditivo:processo");

	if (inputDesc !== null && typeof inputDesc !== 'undefined') {
		inputDesc.addEventListener("keyup", maiuscula);
	}

	if (inputProc !== null && typeof inputProc !== 'undefined') {
		inputProc.addEventListener("keyup", maiuscula);
	}


});


