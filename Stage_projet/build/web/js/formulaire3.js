$(document).ready(function () {
    function toggle(ev) {
  
        var inputs = Array.prototype.slice.call(document.querySelectorAll('input'));


        inputs.forEach(input => input.value = '');


        switch (ev.target.value) {
          case 'Étudiant':
            document.querySelector('#idProf').style.display = 'block';
            document.querySelector('#telephone').style.display = 'block';
            document.querySelector('#contacte').style.display = 'block';
            break;
            
          case 'Professeur':
            document.querySelector('#da').style.display = 'block';
            document.querySelector('#statusStage').style.display = 'block';
            document.querySelector('#retention').style.display = 'block';
            document.querySelector('#numeroStage').style.display = 'block';
            document.querySelector('#telephone').style.display = 'block';
            document.querySelector('#contacte').style.display = 'block';
            break;
        }
      }

      document.querySelector('select').addEventListener('change', toggle);
});
