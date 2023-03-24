class User {
	constructor(firstName, lastName, age, location) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.location = location;
	}

	static ageComparison(A, B) {
		if (A.age > B.age) {
			return A.firstName + ' is older than ' + B.firstName;
		} else {
			return B.firstName + ' is older than ' + A.firstName;
		}
	}
}

let users = [
	new User('Nicola', 'C', 28, 'Bergamo'),
	new User('Marianna', 'A', 27, 'Bergamo'),
	new User('Greta', 'D', 28, 'Vicenza'),
	new User('Elisa', 'A', 18, 'Bergamo'),
	new User('Alice', 'A', 15, 'Bergamo'),
	new User('Simone', 'B', 29, 'Milano'),
	new User('Francesco', 'I', 26, 'Taranto'),
];

console.log(User.ageComparison(users[1], users[4]));
console.log(User.ageComparison(users[4], users[2]));

///// ESERCIZIO DUE - FORM PET /////

class Pet {
	constructor(petName, ownerName, petSpecies, petBreed) {
		this.petName = petName;
		this.ownerName = ownerName;
		this.petSpecies = petSpecies;
		this.petBreed = petBreed;
	}

	static sameOwner(A, B) {
		if ('A.ownerName' === 'B.ownerName') {
			return true;
		} else {
			return false;
		}
	}
}

function addData() {
	let petName = document.getElementById('petName').value;
	let ownerName = document.getElementById('ownerName').value;
	let petSpecies = document.getElementById('petSpecies').value;
	let petBreed = document.getElementById('petBreed').value;
	let newPet = new Pet(petName, ownerName, petSpecies, petBreed);
	console.log(newPet);

	return newPet;
}

let pets = [];
localStorage.setItem('pets', JSON.stringify(pets));

addPetLocalStorage(addData()); // add some data to the pets array

function addPetLocalStorage() {
	const pets = JSON.parse(localStorage.getItem('pets'));
	//creating the key-value pairs
	let petName = document.getElementById('petName').value;
	let ownerName = document.getElementById('ownerName').value;
	let petSpecies = document.getElementById('petSpecies').value;
	let petBreed = document.getElementById('petBreed').value;

	//push the string to the Object Array
	pets.push({ petName, ownerName, petSpecies, petBreed });

	//store the new note
	localStorage.setItem('pets', JSON.stringify(pets));
	console.log(Pet.sameOwner(pets[0], pets[2]));
}
