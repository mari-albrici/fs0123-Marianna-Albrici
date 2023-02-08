// DISCLAIMER: esercizi commentati per evitare conflitti e per un prompt noioso :)


/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let numeriInteri = [25, 50];
console.log(Math.max.apply(null, numeriInteri));

//oppure:

let a = 3;
let b = 5;

if (a > b) {
  console.log(a);
} else {
  console.log(b);
}

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let number = 3;

if (number != 5) {
  console.log('not equal')
}

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let numero = 25;

if (numero % 5 === 0) {
  console.log('divisibile per 5');
}

/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let numeraccio = 5;
let numerino = 3;

if (numeraccio == 8 || numerino == 8 || numeraccio + numerino == 8 || numeraccio - numerino == 8) {
  console.log('true')
}

/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
/*let totalShoppingCart = Number(prompt('Totale carrello'));
let spedizione = 10;

if (totalShoppingCart >= 50) {
  console.log(totalShoppingCart);
} else {
  console.log(totalShoppingCart + spedizione);
}
*/

/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
/* let sconto = 20;

function percentuale() {
  return (totalShoppingCart / 100) * sconto;
}

// console.log(percentuale());

let discountedShoppingCart = totalShoppingCart - percentuale();

if (discountedShoppingCart >= 50) {
console.log(discountedShoppingCart);
} else {
console.log(discountedShoppingCart + spedizione);
}
*/

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let alpha = 8;
let beta = 5;
let gamma = 3;

if(alpha > beta && alpha > gamma && beta < alpha && beta > gamma) {
  console.log(alpha, beta, gamma)
}

//oppure: 

let m = 27;
let n = 78;
let o = 3;

let arr = [m, n, o]
arr.sort(function(a, b){
  return a - b;
})
arr.reverse()
console.log(arr);

// Abbiamo usato le proprietà degli array per ordinare - TORNO DOPO :) 

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let intero = 8;

function tipodi() {
  return typeof intero
}

if (tipodi() == "number") {
  console.log('è un numero');
} else {
  console.log('non è un numero');
}


/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let topolino = 7;

if (topolino % 2 == 0) {
  console.log('Pari');
} else {
  console.log('Dispari');
}

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let val = 7
  if (val < 5) {
      console.log("Meno di 5");
    } else if (val < 10) {
      console.log("Meno di 10");
    } else {
      console.log("Uguale a 10 o maggiore");
    }


/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
*/

/* SCRIVI QUI LA TUA RISPOSTA */
const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}
me.city = 'Toronto'
console.log(me);

/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
delete me.lastName
console.log(me);

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
me.skills.pop(2)
console.log(me);

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let paperino = []

for (var i = 1; i <= 10 ; i++ ) {
  paperino.push(i);
}

console.log(paperino);

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
paperino.pop(9)
paperino.push(100)

console.log(paperino);
