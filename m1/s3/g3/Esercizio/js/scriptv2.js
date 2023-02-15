//CODICE NON TERMINATO - STIAMO ANALIZZANDO LA LOGICA di un esempio già creato online

class MakeTodoList {
    constructor(list) {
      this.todoList = list;
      this.todos = [];
    }
  
    static addToList(text) {
      let list = document.getElementById("todo-list");
      let task = document.createElement("li");
      task.textContent = text;
      list.appendChild(task);
      return task;
    }
  
    static removeFromList(text) {
      let list = document.getElementById("todo-list");
      let childs = Array.from(list.childNodes);
      let item = childs.find(i => i.innerText === text);
      return item;
    }
  
    addToDo(text) {
      this.todos.push(text);
      this.todoList.appendChild(MakeTodoList.addToList(text));
    }
  
    deleteToDo(text) {
      let filter = this.todos.filter(i => i !== text);
      this.todoList.removeChild(MakeTodoList.removeFromList(text));
      this.todos = filter;
    }
  
    get getList() {
      return this.todos;
    }

  }


  let list = document.getElementById("todo-list");

    // create a object of Class

    let listEle = new MakeTodoList(list);

    // add something to list

    function addToDo() {
      let input = document.getElementById("input").value;
      listEle.addToDo(input); //  calling method from class
    }

    // simple utility function

    function getEventTarget(e) {
      e = e || window.event;
      return e.target || e.srcElement;
    }

    // delete some item from list

    function remove() {
      let updated = document.getElementById("todo-list");
      updated.onclick = function(event) {
        var target = getEventTarget(event);
        listEle.deleteToDo(target.innerText);
      };
    }