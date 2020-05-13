package addressbook;

public class TestAddressBook {

	public static void main(String[] args) {
		AddressBookInterface b = new AddressBook();
		Contact a = new Contact("Homer", "Simpson", "+158623496", "homer@fox.com");
		Contact c = new Contact("Peter", "Griffin", "+1588888", "peter@fox.com");
		Contact d = new Contact("Walter", "White", "+15111", "heisenberg@gmail.com");
		Contact e = new Contact("Sheldon", "Cooper", "+14444", "cooper@caltech.edu");
		b.add(a);b.add(c);b.add(d);b.add(e);
		System.out.println(a);
		System.out.println(b.list());
		System.out.println(b.search("Peter"));
		System.out.println(b.searchAll("homer@fox.com"));
		System.out.println("End");
		
	}

}
