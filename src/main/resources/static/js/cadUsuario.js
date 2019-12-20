document.addEventListener("focusin", function () {
    let inputEmail = document.getElementById("email");
    let inputNome = document.getElementById("nome");
	let inputMat = document.getElementById("matricula");
    
    if (inputNome !== null && typeof inputNome !== 'undefined' ) {
       inputNome.addEventListener("keyup", maiuscula);
    }

    if(inputEmail !== null && typeof inputEmail !== 'undefined'){
        inputEmail.addEventListener("keyup", minuscula);
    }

    if(inputMat !== null && typeof inputMat !== 'undefined'){
        inputMat.addEventListener("keyup", onlyNumbers);
    }
    
    
    
});