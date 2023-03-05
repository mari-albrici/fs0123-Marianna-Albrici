// ARRAY 
// una lista di valori tra loro correlati, contraddistinto dalle parentesi quadre []

let numeri = [1, 2, 3, 4, 5, 6]


let arrOld = new Array(); //non si usa più

let arr = []; //può anche essere vuoto

let dati = [
    'stringa',
    0,
    true,
    {},
    []
]

//In JS un array può essere trasformato in stringa, ma non sempre con l'output sperato o corretto, in formato CSV. Altri linguaggi non lo permettono. 

//Lettura dei valori in un array
let pizze = ['Margherita','Diavola','4 Formaggi'];

console.log(pizze);

console.log(pizze[1]);  //mai evitare di selezionare un elemento

let [p1, p2, p3] = pizze;
console.log(p1);

//Scrittura

pizze[2] = 'Capricciosa';
console.log(pizze);

//ATTENZIONE: EVITARE I BUCHI

pizze[4] = 'Marinara';
console.log(pizze); //risulta esserci uno spazio vuoto, metodo sconsigliato

//aggiungere alla fine dell'array senza creare buchi:
pizze.push('Parigina'); // il . si usa per i METODI degli array
console.log(pizze);

pizze.push('Siciliana','Valtellina');
console.log(pizze);


//proprietà length - in comune con le stringhe
pizze.length //restituisce la lunghezza attuale dell'array
console.log(pizze.length);
console.log( pizze[pizze.length - 1] ); //legge l'ultimo elemento dell'array

//riordinare
let studenti = ['Mauro', 'Vittorio', 'Rebecca'];
console.log(studenti);
studenti.sort(); //riordina in ordine alfabetico - modifica diretta all'array. Non è adatto per riordinare i NUMERI, in quanto metto in ordine alfabetico, non valore numerico eg. 1 11 12 13...2 20 21 22...3 30 31 32...
studenti.reverse(); //inverte l'ordine, anche non alfabetico, switcha l'ordine dell'array

let numerati = [1, 100, 20];
numerati.sort();
console.log(numerati);

numerati.sort(function(a, b){
    return a - b;
});
console.log(numerati);
