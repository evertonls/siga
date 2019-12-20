document.addEventListener("focusin", function() {
	let inputDesc = document.getElementById("formApostila:descricao");
	let inputProc = document.getElementById("formApostila:processo");

	if (inputDesc !== null && typeof inputDesc !== 'undefined') {
		inputDesc.addEventListener("keyup", maiuscula);
	}

	if (inputProc !== null && typeof inputProc !== 'undefined') {
		inputProc.addEventListener("keyup", maiuscula);
	}


});


