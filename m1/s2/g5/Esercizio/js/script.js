//creazione dell'oggetto Calcolatrice in cui inserire le funzioni
class Calculator {
    constructor(previousTextElement, currentTextElement) {
        this.previousTextElement = previousTextElement
        this.currentTextElement = currentTextElement
        this.clear()
    }


    //funzione per cancellare tutto
    clear() {
        this.currentOperation = ''
        this.previousOperation = ''
        this.operation = undefined
    }


    //funzione per cancellare una sola cifra dal display
    delete() {
        this.currentOperation = this.currentOperation.toString().slice(0, -1)
    }


    //funzione per aggiungere numeri senza effettuare operazioni (aka concatenazione di numeri come stringhe)
    addNumber(number) {
        if (number === '.' && this.currentOperation.includes('.')) return
        this.currentOperation = this.currentOperation.toString() + number.toString()
    }


    //funzione per scegliere quale operatore matematico usare
    chooseOperation(operation) {
        if (this.currentOperation === '') return
        if (this.previousOperation !== '') {
            this.calculate()
        }
        this.operation = operation
        this.previousOperation = this.currentOperation
        this.currentOperation = ''
    }


    //funzione per effettuare effetivamente i calcoli
    calculate() {
        let calculation
        const prev = parseFloat(this.previousOperation)
        const current = parseFloat(this.currentOperation)
        if (isNaN(prev) || isNaN(current)) return
        switch (this.operation) {
            case '+':
                calculation = prev + current
                break
            case '-':
                calculation = prev - current
                break
            case 'x':
                calculation = prev * current
                break
            case '÷':
                calculation = prev / current
                break
            case '%':
                calculation = prev * current / 100
                break
            default: //ho provato ad aggiungere altre funzioni come √, x^ o log, ma non riuscivo a farle funzionare nel modo corretto dovendo usare entrambi i termini dell'operazione
                return
        }
        this.currentOperation = calculation
        this.operation = undefined
        this.previousOperation = ''
    }

    //funzione per mostrare i numeri nel modo corretto a display
    getDisplayNumber(number) {
        const stringNumber = number.toString()
        const numeriInteri = parseFloat(stringNumber.split('.')[0])
        const numeriDecimali = stringNumber.split('.')[1]
        let numeriDisplay
        if (isNaN(numeriInteri)) {
            numeriDisplay = ''
        } else {
            numeriDisplay = numeriInteri.toLocaleString('eu', { maximumFractionDigits: 0 })
        }
        if (numeriDecimali != null) {
            return `${numeriDisplay}.${numeriDecimali}`
        } else {
            return numeriDisplay
        }
    }


    //funzione per aggiornare il display dopo un'operazione o delete/cancella
    updateDisplay() {
        this.currentTextElement.innerText =
            this.getDisplayNumber(this.currentOperation)
        if (this.operation != null) {
            this.previousTextElement.innerText =
                `${this.getDisplayNumber(this.previousOperation)} ${this.operation}`
        } else {
            this.previousTextElement.innerText = ''
        }
    }
}

//definizione delle variabili per il funzionamento della calcolatrice 
const numberButtons = document.querySelectorAll('[data-number]')
const operationButtons = document.querySelectorAll('[data-operation]')
const equalsButton = document.querySelector('[data-equals]')
const deleteButton = document.querySelector('[data-delete]')
const allClearButton = document.querySelector('[data-all-clear]')
const previousTextElement = document.querySelector('[data-previous]')
const currentTextElement = document.querySelector('[data-current]')

const calculator = new Calculator(previousTextElement, currentTextElement)


//richiamo ai tasti numerici
numberButtons.forEach(function(button) {
    button.addEventListener('click', () => {
        calculator.addNumber(button.innerText)
        calculator.updateDisplay()
    })
})

//richiamo ai tasti degli operatori
operationButtons.forEach(function(button) {
    button.addEventListener('click', function() {
        calculator.chooseOperation(button.innerText)
        calculator.updateDisplay()
    })
})


//richiamo al tasto = 
equalsButton.addEventListener('click', function() {
    calculator.calculate()
    calculator.updateDisplay()
})

//richiamo al tasto AC
allClearButton.addEventListener('click', function() {
    calculator.clear()
    calculator.updateDisplay()
})

//richiamo al tasto DEL 
deleteButton.addEventListener('click', function() {
    calculator.delete()
    calculator.updateDisplay()
})