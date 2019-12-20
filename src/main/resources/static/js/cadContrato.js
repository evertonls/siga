document.addEventListener("focusin", function () {
    let inputDesc = document.getElementById("formContrato:descricao");
    let dataIni = document.getElementById("formContrato:dataInicio_input");
    let dataPubli = document.getElementById("formContrato:dataPublicacao_input");
    let dataFinal = document.getElementById("formContrato:dataTermino_input")
    
    if (inputDesc !== null && typeof inputDesc !== 'undefined' ) {
       inputDesc.addEventListener("keyup", maiuscula);
    }

    if(dataIni !== null && typeof dataPubli !== 'undefined'){
        dataIni.addEventListener("keyup", mascaraData);
    }
    
    if(dataPubli !== null && typeof dataPubli !== 'undefined'){
        dataPubli.addEventListener("keyup", mascaraData);
    }

    if (dataFinal !== null && dataFinal !== 'undefined') {
        dataFinal.addEventListener("keyup", mascaraData);
    }
    
    
});

