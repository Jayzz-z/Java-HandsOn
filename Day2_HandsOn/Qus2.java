package Day2;

class Member{
	  String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
	    System.out.println(salary);
	  }

	}

	class Employee extends Member{
	  String specialization;
	}

	class Manager extends Member{
	  String department;
	public String specialization;
	}

	class Qus2{
	  public static void main(String[] args){
	    Employee e = new Employee();
	    e.name = "Jayzz";
	    e.age = 22;
	    e.number = "8770***";
	    e.address = "Neemuch(m.p)";
	    e.salary = 1000000;
	    e.specialization = "java";

	    Manager m = new Manager();
	    m.name = "Ram";
	    m.age = 24;
	    m.number = "986****";
	    m.address = "Indore(m.p)";
	    m.salary = 1230000;
	    m.specialization = "c#";
	  }
	}	