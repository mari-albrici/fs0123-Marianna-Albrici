let plusButton = document.getElementById('add');
let list = document.getElementById('lists');
let textInput = document.querySelector('.textInput');
let deleteButton = document.createElement('button');

class ToDoList {
    constructor(textInput) {
        this.textInput = textInput;
    }

    addTask() {
        let task = document.createElement('li');
        list.appendChild(task);
        task.appendChild(document.createTextNode(textInput.value))
    }

    delete() {
        deleteButton.addEventListener('click', () => {
            this.textInput = ''
        })
    }
}

let toDoList = new ToDoList(textInput)




