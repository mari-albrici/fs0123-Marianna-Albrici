/*  SWITCH
struttura di controllo delle condizioni che segue la logica del costrutto if implementando diverse opzioni (case) che al verificarsi eseguono le istruzioni prescritte. 

Può avere un numero indefinito di casi. Il valore della variabile/espressione viene comparato con i casi: quando si verifica una combinazione viene eseguita l'istruzione prescritta. 
*/

let frutto = 'mela';

switch (frutto) {
    case 'mela':
        document.write('Le mele costano 1€');
        break; //al contrario dell'if, vera una va avanti a dar vere le altre, a meno che non si dia il BREAK
    case 'pera':
        document.write('Le pere costano 0,90€')
        break;
    case 'ananas':
    case 'mango':
        document.write('Ananas e Mango costano 3,90€')
    default: //in pratica un else
        document.write('Non abbiamo ' + frutto)
}

/*CICLI
Lettura a scorrimento di una serie di elementi - esecuzione ripetuta di un set di righe. Ciclo che scorre un blocco di istruzioni fino a che (while) la condizione rimane vera. */


let i = 0;
while (i < 10) {
    document.write(i)
    i++; //serve a incrementare i di 1 - il corrispettivo -- diminuisce di 1 || += -= cambia di quanto aumenta o diminuisce
}

//i cicli sono BLOCCANTI - la riga successiva non viene letta finchè il while non ha finito le operazioni

//setInterval(funzione, tempo in millisecondi)
let x = 0;
setInterval(function () {
    console.log(x);
    x++
}, 1000);

//esempi con break e continue

i = 0; //resetto i a 0
while (i <= 5) {

    if (i == 2) {
        i++
        continue; //fa saltare il resto dei passaggi da eseguire e ricomincia il loop (passa all'iterazione successiva)
    }

    document.write(i);
    i++
}

document.write('<br>')

i = 0; //resetto i a 0
while (i <= 5) {

    if (i == 2) {
        i++
        break; //termina il ciclo
    }

    document.write(i);
    i++
}

// DO WHILE - l'esecuzione viene fatta prima della verifica dell'esecuzione

let a = 0;
do {
    document.write(a)
} while (a > 10) //verrebbe bloccata dopo la prima esecuzione in quanto 1 non sarà mai > a 10. Se fosse stato < avrebbe continuato con l'iterazione


// FOR - simile al while. 

//con variabile incrementata
for (let b = 0; b < 10; b++) { //si usa il ; nelle tonde - negli altri casi si usano le ,
    document.write(b)
}

document.write('<hr>')

//con variabile decrementata
for (let c = 9; c < 10; c--) {
    document.write(c)
}

document.write('<hr>')

// CICLARE GLI ARRAY

let pizze = ['Margherita', 'Diavola', 'Marinara', 'Siciliana'];
for (let d = 0; d < pizze.length; d++) {
    document.write(`<div> ${pizze[d]} </div>`)
}

document.write('<hr>')

// FOR OF
pizze = ['Margherita', 'Diavola', 'Marinara', 'Siciliana'];
for (let pizza of pizze) {
    document.write(`<div> ${pizza} </div>`)
}

// FOR IN
let margherita = {
    gusto: 'Margherita',
    prezzo: 5
}

for (let prop in margherita) {
    document.write(`<div> ${margherita[prop]} </div>`)
}

// METODI DEGLI ARRAY

// array.metodo(funzione) //callback: funzione passata come argomento ad un'altra funzione

pizze = ['Margherita', 'Diavola', 'Marinara', 'Siciliana'];

pizze.forEach(fuction(valore){ //serve a ciclare gli array
    document.write(valore);
})

let pizzeDiv = pizze.map(function (valore) { //si usa quando dobbiamo effettuare una modifica ad ogni elemento dell'array
    return `<div> ${valore} </div>`
})

//filter restituisce un array - a prescindere
//find restituisce un solo elemento e solo il primo che dà true 


// REDUCE 
let numeri = [1, 2, 3, 4, 5, 6];

let somma = numeri.reduce(function (p, c) {
    return p + c;
})
console.log(somma);

let numeroGrande = numeri.reduce(function (p, c) {
    if (p > c) {
        return p;
    } else {
        return c;
    }
})
console.log(numeroGrande);


// Eliminare da un array

pizze = ['Margherita', 'Diavola', 'Marinara', 'Siciliana'];

pizze = pizze.filter(function(p){
    return p != 'Marinara'
})
console.log(pizze);

pizze = ['Margherita', 'Diavola', 'Marinara', 'Siciliana'];

let indice = pizze.indexOf('Marinara'); //mi da la sua posizione
console.log(indice);

pizze.splice(indice, 1); //elimina n elementi a partire da quello indicato nell'indice

//eliminazione da array di oggetti
pizze = [
    {
        gusto: 'Margherita',
        prezzo: 2,
        disponibile: true
    },
    {
        gusto: 'Diavola',
        prezzo: 1,
        disponibile: true
    },
    {
        gusto: 'Marinaria',
        prezzo: 3,
        disponibile: false
    },
    {
        gusto: 'Siciliana',
        prezzo: 5,
        disponibile: true
    },
];

let index = pizze.findIndex(function(p){
    return p.disponibile === false
})
console.log(index);