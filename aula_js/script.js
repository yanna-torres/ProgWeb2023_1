function validarCampoTextoObrigatorio(id) {
    var el = document.getElementById(id);
    if (el == null) {
        alert("O elemento não existe");
        return false;
    }
    /* testa se o valor é vazio ou formado por apenas espaços em branco */
    if (el.value == null || el.value.length == 0 || (/^\s+$/.test(el.value))) {
        return false;
    }
    return true;
}

function validarCampos() {
    if (!validarCampoTextoObrigatorio("name")) {
        alert("Nome inválido ou não foi informado");
        return false;
    }
    var cores = document.getElementsByName("cor");
    var corSelecionada = false;
    for (var i = 0; i < cores.length; i++) {
        if (cores[i].checked) {
            corSelecionada = true;
            break;
        }
    }
    if (!corSelecionada) {
        alert("Selecione pelo menos uma cor");
        return false;
    }
    var profissao = document.getElementById("profission");
    if (profissao.selectedIndex == 0) {
        alert("Selecione pelo menos uma profissão");
        return false;
    }
    var termosAceito = document.getElementById("accept").checked;
    if (!termosAceito) {
        alert("Aceite os termos");
        return false;
    
    }
    return true;
}
