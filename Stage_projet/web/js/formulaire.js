$(document).ready(function () {
    $("#inscription").validate({
        rules: {
            username: {
                required: true,
                minlength: 3
            },
            prenom: {
                required: true,
                minlength: 3
            },

            nom: {
                required: true,
                minlength: 3
            },
            condition: {
                required: true

            }
        },
        messages: {
            username: {
                required: "Veuillez saisir votre identifiant",
                minlength: "Minimum 3 charactères"

            },

            prenom: {
                required: "Veuillez saisir votre identifiant",
                minlength: "Minimum 3 charactères"
            },
            nom: {
                required: "Veuillez saisir votre identifiant",
                minlength: "Minimum 3 charactères"
            },
            condition: {
                required: "Veuillez cochez"

            }
        }
        
    });
});


