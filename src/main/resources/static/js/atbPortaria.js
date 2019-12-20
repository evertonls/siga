document.addEventListener("focusin", function() {
	let dataPubli = document.getElementById("formPortaria:dataPublicacao_input");
	
	if (dataPubli !== null && dataPubli !== 'undefined') {
        dataPubli.addEventListener("keyup", mascaraData);
    }

});


