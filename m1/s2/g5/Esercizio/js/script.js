class Calculator {
    constructor(previousTextElement, currentTextElement) {
        this.previousTextElement = previousTextElement
        this.currentTextElement = currentTextElement
        this.clear()
    }

    clear() {
        this.currentOperation = ''
        this.previousOperation = ''
        this.operation = undefined
    }

    delete() {
        this.currentOperation = this.currentOperation.toString().slice(0, -1)
    }

    addNumber(number) {
        if (number === '.' && this.currentOperation.includes('.')) return
        this.currentOperation = this.currentOperation.toString() + number.toString()
    }

    chooseOperation(operation) {
        if (this.currentOperation === '') return
        if (this.previousOperation !== '') {
            this.compute()
        }
        this.operation = operation
        this.previousOperation = this.currentOperation
        this.currentOperation = ''
    }

    compute() {
        let computation
        const prev = parseFloat(this.previousOperation)
        const current = parseFloat(this.currentOperation)
        if (isNaN(prev) || isNaN(current)) return
        switch (this.operation) {
            case '+':
                computation = prev + current
                break
            case '-':
                computation = prev - current
                break
            case 'x':
                computation = prev * current
                break
            case '÷':
                computation = prev / current
                break
            case '%':
                computation = prev / current * 100
                break
            default:
                return
        }
        this.currentOperation = computation
        this.operation = undefined
        this.previousOperation = ''
    }

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


const numberButtons = document.querySelectorAll('[data-number]')
const operationButtons = document.querySelectorAll('[data-operation]')
const equalsButton = document.querySelector('[data-equals]')
const deleteButton = document.querySelector('[data-delete]')
const allClearButton = document.querySelector('[data-all-clear]')
const previousTextElement = document.querySelector('[data-previous]')
const currentTextElement = document.querySelector('[data-current]')

const calculator = new Calculator(previousTextElement, currentTextElement)

numberButtons.forEach(button => {
    button.addEventListener('click', () => {
        calculator.addNumber(button.innerText)
        calculator.updateDisplay()
    })
})

operationButtons.forEach(button => {
    button.addEventListener('click', () => {
        calculator.chooseOperation(button.innerText)
        calculator.updateDisplay()
    })
})

equalsButton.addEventListener('click', () => {
    calculator.compute()
    calculator.updateDisplay()
})

allClearButton.addEventListener('click', () => {
    calculator.clear()
    calculator.updateDisplay()
})

deleteButton.addEventListener('click', () => {
    calculator.delete()
    calculator.updateDisplay()
})