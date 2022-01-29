package employeestuff;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // e1, e2 .. can obviously have their original types and still get inserted into Employee Array but Employee canot be instantiated as it gives error of being abstract class
        Employee e1 = new Worker("John Smith", 21, 'M');
        Employee e2 = new BoardMember("Jennifer Pole", 25, 'F');
        Employee e3 = new Worker("Lucia Anaya", 23, 'M');

        AddressBook addressBook = new AddressBook();
        addressBook.addEmployee(e1);
        addressBook.addEmployee(e2);
        addressBook.addEmployee(e3);

        addressBook.displaySalaryReport(350, 15);
    }
}
