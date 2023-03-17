jQuery.validator.addMethod(
  "password",
  function (value) {
    // une fonction qui vérifie que le mot de passe  contient
    //au moins une lettre majuscule, une lettre minuscule et un chiffre 
    return /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).*$/.test(value);
  },
  "Rentrez un mot de passe contient Majuscule et des chiffres"
);

$(document).ready(function () {
    $("#inscription2").validate({
    rules: {
      pwd: {
          required: true,
          minlength: 3
    },

      pw2: {
          required: true,
          equalTo: '#pwd'
    }
  },
  messages: {

      pwd: {
            required: "Saisir un champ mot de passe",
            minlength: "Votre identifiant doit contenir au minimum 3 charactères"

          },
      pw2: {
          required: "Veuillez saisir la confirmation du mot de passe",
          equalTo: 'Veuillez saisir le même mot passe'
        }
  }
  
  });
});


