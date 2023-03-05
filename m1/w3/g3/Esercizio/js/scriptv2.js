//CODICE NON TERMINATO - STIAMO cercando di capirci qualcosa senza copiare da nessuna parte

class MakeTodoList {
    constructor(list) {
        this.todoList = list
    }

    addToList(content) {
        let list = document.getElementById('todo-list')
        let task = document.createElement('li')
        task.textContent = content
        list.appendChild(task)
    }

    removeFromList(text) {
        let li = document.getElementById('li')
        let updated = document.getElementById('todo-list')
        updated.onclick = listEle.removeFromList(li.innerText)
    }

    addToDo() {
        let content = document.getElementById('input').value
        listEle.addToList(content)
    }

    deleteToDo(text) {
        
    }
}



let list = document.getElementById("todo-list")

let plusButton = document.getElementById("plusButton")

let listEle = new MakeTodoList(list)

plusButton.addEventListener('click', () => listEle.addToDo())