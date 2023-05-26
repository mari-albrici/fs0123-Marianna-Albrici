package exerciseThree;

public class Main {

	public static void main(String[] args) {

		ContactsList contactsList = new ContactsList();

		contactsList.addContact("Marianna", "123456789");
		contactsList.addContact("Andrea", "987654321");
		contactsList.addContact("Matteo", "123459876");
		contactsList.addContact("Emanuele", "543216789");
		contactsList.addContact("Elisa", "678912345");

		contactsList.printContactsList();

		contactsList.deleteContact("Elisa");
		contactsList.printContactsList();

		contactsList.searchContactByNumber("123456789");

	}

}
