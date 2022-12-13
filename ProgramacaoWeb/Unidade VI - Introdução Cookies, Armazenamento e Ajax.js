// Cookies

localStorage.setItem("nome", "Maria");
sessionStorage.setItem("nome", "Maria");

localStorage.getItem("nome");
sessionStorage.getItem("nome");

localStorage.removeItem("nome");
sessionStorage.removeItem("nome");

localStorage.clear();
sessionStorage.clear();


// Ajax

function loadXMLDoc() {
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    } else { //code for IE6, IE5
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            // código de retorno aqui;
        }
    }
    xmlhttp.open("GET", url, true);
    xmlhttp.send(); 
}

$.ajax({
    url: 'info.php',
    type: 'post',
    data: {'aluno':'Prof. Gobbato',
        'email': 'professorgobbato@yahoo.com.br'
    },
    dataType: 'html',
    username: 'professor',
    password: '123456',
    beforeSend: function () {
        $('#carregando').fadeln();
    },
    timeout: 3000,
    success: function (retorno) {
        $('#resposta').html(retorno);
    },
    error: function (erro) {
        $('#resposta').html(erro);
    }
})