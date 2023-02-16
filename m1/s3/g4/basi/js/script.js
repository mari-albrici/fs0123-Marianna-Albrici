let formBtn = document.getElementById('send')

/* VERSIONE SEMPLIFICATA 

formBtn.addEventListener('click', function(e){
    e.preventDefault() //blocca i funzionamenti predefiniti
    console.log(e);

    let nome = document.getElementById('nome')
    let cognome = document.getElementById('cognome')
    let email = document.getElementById('email')
    let password = document.getElementById('password')

    let valid = true

    if(!nome.value) {
        valid = false
    }

    if(!cognome.value) {
        valid = false
    }

    if(!email.value) {
        valid = false
    }

    if(!password.value) {
        valid = false
    }

    if(valid){
        //invio del form
    }
}) 
*/

formBtn.addEventListener('click', function(e){
    e.preventDefault() //blocca i funzionamenti predefiniti
    console.log(e);

})