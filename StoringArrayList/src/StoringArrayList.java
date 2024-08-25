import java.util.ArrayList;
// Student class
class Student {
	// Student Fields
	private int rollno;
	private String name;
	private String address;
	// Constructor
	Student(int rollno, String name, String address) {
		
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	// Getters and Setters
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}


public class StoringArrayList {

	public static void main(String[] args) {
		// Create student object arraylist
		ArrayList<Student> myStudents = new ArrayList<>();
		// Add students to list
		myStudents.add(new Student(10, "John", "123 Main Street"));
		myStudents.add(new Student(2, "Matt", "456 Apple Lane"));
		myStudents.add(new Student(9, "Amy", "007 West Road"));
		myStudents.add(new Student(7, "Erica", "369 Houston Ave"));
		myStudents.add(new Student(3, "Jeff", "789 Lenora Street"));
		myStudents.add(new Student(1, "Will", "888 Rocky Road"));
		myStudents.add(new Student(8, "Gwen", "246 Jefferson Ave"));
		myStudents.add(new Student(4, "Kim", "141 Kings Blvd"));
		myStudents.add(new Student(5, "Crystal", "777 Lucky Lane"));
		myStudents.add(new Student(6, "Israel", "185 Bender Road"));
		// Print students before sorting
		System.out.println("Before Sorting...");
		for(int i = 0; i < myStudents.size(); i++) {
			System.out.println(myStudents.get(i).getRollno() + " | " + myStudents.get(i).getName() + " | " + myStudents.get(i).getAddress());
		}
		
		SelectionSort sort = new SelectionSort();
		// Sort list by roll number
		sort.sortRollno(myStudents);
		System.out.println("\nAfter Sorting...(roll number)");
		for(int i = 0; i < myStudents.size(); i++) {
			System.out.println(myStudents.get(i).getRollno() + " | " + myStudents.get(i).getName() + " | " + myStudents.get(i).getAddress());
		}
		// Sort list alphabetical order
		sort.sortName(myStudents);
		// Print students after sorting
		System.out.println("\nAfter Sorting...(alphabetical)");
		for(int i = 0; i < myStudents.size(); i++) {
			System.out.println(myStudents.get(i).getRollno() + " | " + myStudents.get(i).getName() + " | " + myStudents.get(i).getAddress());
		}
		
	}
}
