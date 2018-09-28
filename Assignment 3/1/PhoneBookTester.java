import java.util.Scanner;

class PhoneEntry {
//makes the strings for each variable in the phone book
	String address;
	String city;
	String State;
	String postalCode;
	String name; // name of a person
	String phone; // their phone number

	PhoneEntry(String name, String phone, String address, String city, String State, String postalCode) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.State = State;
		this.postalCode = postalCode;
	}
}

class PhoneBook {
	PhoneEntry[] phoneBook;

	PhoneBook() // all the phone book results
	{// info in the phone book
		phoneBook = new PhoneEntry[5];
		phoneBook[0] = new PhoneEntry("James Barclay", "(418)665-1223", "3829 Flinderation Road", "Oak Park", "IL",
				"60300");
		phoneBook[1] = new PhoneEntry("Grace Dunbar", "(860)399-3044", "3290 Chery Ridge Drive", "Utica", "MI",
				"31536");
		phoneBook[2] = new PhoneEntry("Paul Kratides", "(815)439-9271", "3135 Corbin Branch Road", "Kingsport", "TN",
				"32352");
		phoneBook[3] = new PhoneEntry("Violet Smith", "(312)223-1937", "3153 Rocket Drive", "Saint Paul", "MN",
				"13535");
		phoneBook[4] = new PhoneEntry("John Wood", "(913)883-2874", "2400 Rose Street", "Chicago", "IL", "13536");
	}

	// searches for the name
	PhoneEntry searchname(String name) {
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].name.equals(name)) {
				return phoneBook[i];
			}

		}
		return null;
	}

	// searches for the phone number
	PhoneEntry searchphone(String phone) {
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].phone.equals(phone)) {
				return phoneBook[i];
			}

		}
		return null;
	}

	// searches for the address
	PhoneEntry searchaddress(String address) {
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].address.equals(address)) {
				return phoneBook[i];
			}

		}
		return null;
	}

	// searches the for the state
	PhoneEntry searchState(String State) {
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].State.equals(State)) {
				return phoneBook[i];
			}

		}
		return null;
	}

	// searches for postal code
	PhoneEntry searchpostalCode(String postalCode) {
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].postalCode.equals(postalCode)) {
				return phoneBook[i];
			}

		}
		return null;
	}

	PhoneEntry searchcity(String city) {
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].city.equals(city)) {
				return phoneBook[i];
			}

		}
		return null;
	}
}

class PhoneBookTester {
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();

		Scanner sc = new Scanner(System.in);
		while (true) {
			PhoneEntry entry;

			int searchType;
			// promt user to enter 0-6 store in searchType
			System.out.println(
					"Enter 0 to quit, 1 to search name, 2 to search number, 3 to search address, 4 the search city, 5 to search state, 6 to search postal code");

			searchType = sc.nextInt();
			sc.nextLine();
//gives a function for each case 
			String searchQuery;
			switch (searchType) {
			case 0:
				System.out.println("bye");
				System.exit(0);

			case 1:
				System.out.println("enter name: ");
				searchQuery = sc.nextLine();
				entry = pb.searchname(searchQuery);
				break;

			case 2:
				System.out.println("Enter phone: ");
				searchQuery = sc.nextLine();
				entry = pb.searchphone(searchQuery);
				break;
			case 3:
				System.out.println("Enter address: ");
				searchQuery = sc.nextLine();
				entry = pb.searchaddress(searchQuery);
				break;
			case 4:
				System.out.println("Enter city: ");
				searchQuery = sc.nextLine();
				entry = pb.searchcity(searchQuery);
				break;
			case 5:
				System.out.println("Enter state: ");
				searchQuery = sc.nextLine();
				entry = pb.searchState(searchQuery);
				break;
			case 6:
				System.out.println("Enter postal code: ");
				searchQuery = sc.nextLine();
				entry = pb.searchpostalCode(searchQuery);
				break;
			default:
				entry = null;

			}

			// prints out the info
			if (entry != null) {
				System.out.println(entry.name + " " + entry.phone + " " + entry.address + " " + entry.city + " "
						+ entry.State + " " + entry.postalCode);
			}

			else {
				System.out.println("Name not found");

			}
		}
	}
}