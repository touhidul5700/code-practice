
function setInnerText() {
    var inputValue = document.getElementById("myInput").value;
    var secret = document.getElementById("secret")
    var panel = document.getElementById("loginpanel");
    var hiden = document.getElementById("hiden");



    if (inputValue == "sir"){
        panel.style.display="none"
        hiden.style.display="block"
        secret.innerText ="পড়া পড়ো এটে তোমার কি?"
    }
        else{
        //window.close();
        alert("ভালো করি পাসওয়ার্ড দে")
    }

}
