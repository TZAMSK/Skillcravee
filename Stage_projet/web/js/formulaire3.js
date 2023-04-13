
function toggleLabels(value) {
    var prenomLabel = document.getElementById("prenom");
    var nomLabel = document.getElementById("nom");
    var telephoneLabel = document.getElementById("telephone");
    var adresseLabel = document.getElementById("adresse");
    switch (value) {
        case "0":
            prenomLabel.style.display = "none";
            nomLabel.style.display = "none";
            telephoneLabel.style.display = "none";
            adresseLabel.style.display = "none";
            break;
        case "1":
            prenomLabel.style.display = "block";
            nomLabel.style.display = "block";
            telephoneLabel.style.display = "block";
            adresseLabel.style.display = "none";
            break;
        case "2":
            prenomLabel.style.display = "block";
            nomLabel.style.display = "block";
            telephoneLabel.style.display = "block";
            adresseLabel.style.display = "none";
            break;
        case "3":
            prenomLabel.style.display = "block";
            nomLabel.style.display = "none";
            telephoneLabel.style.display = "block";
            adresseLabel.style.display = "block";
            break;
        default:
            prenomLabel.style.display = "block";
            nomLabel.style.display = "block";
            telephoneLabel.style.display = "block";
            adresseLabel.style.display = "block";
            break;
    }
}

document.addEventListener("DOMContentLoaded", function (event) {
    var selectElement = document.getElementsByName("selection")[0];
    selectElement.addEventListener("change", function (event) {
        toggleLabels(this.value);
    });
});


var password = document.getElementById("password");
var confirm_password = document.getElementById("confirm_password");
function validatePassword() {
    if (password.value !== confirm_password.value) {
        confirm_password.setCustomValidity("Les mots de passe doivent correspondre");
    } else {
        confirm_password.setCustomValidity('');
    }
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;

