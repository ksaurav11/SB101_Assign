package dailyassignment.day11.que4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DemoA {
	
	public static void main(String[] args) throws Exception {
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student(1,"Shri", 100, new Address("Nr","Nagpur" , 28219)));
		stdList.add(new Student(11,"Kumar", 200, new Address("Pnbe","Patna" , 226219)));
		stdList.add(new Student(21,"Adi", 300, new Address("Del","Delhi" , 34726)));
		stdList.add(new Student(31,"Anup", 250, new Address("Bpl","Jaipur" , 27863)));
		stdList.add(new Student(41,"Shivam", 130, new Address("Dbg","Darbhanga" , 54339)));
		
		 ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
		
		 oos.writeObject(stdList);
		 
		 oos.close();
		 
		 System.out.println("done");
	}

}

class Address implements Serializable{
	
	String state ; 
	String city ; 
	int pincode; 
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}

class Student implements Serializable{
		int roll;
		String name; 
		int marks; 
	    Address address; 
	    
	    public Student() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
		}

		public Student(int roll, String name, int marks, Address address) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.address = address;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		};

}
