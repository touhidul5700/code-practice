
function setInnerText() {
    var inputValue = document.getElementById("myInput").value;
    var secret = document.getElementById("secret")
    var panel = document.getElementById("loginpanel");
    var hiden = document.getElementById("hiden");



    if (inputValue == "77"){
        panel.style.display="none"
        hiden.style.display="block"
        secret.innerText ="I am going on Monday"
    }
        else{
        //window.close();
        alert("Enter Correct Password")
    }

}
