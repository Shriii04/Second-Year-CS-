// A vit melange comittee is conducting a audition to admit intrested candidates. You need to implement a participant class for the dance club based on description given below.

class exp1{
	static int counter;
	String RegistrationID;
	String name;
	long ContactNO;
	String Branch;

	static{
		counter = 1000;
	}

	exp1(String name, long ContactNO, String Branch){
		this.name = name;
		this.ContactNO = ContactNO;
		this.Branch = Branch;
		this.RegistrationID = "D"+counter;
		exp1.counter++;
	}
	
	public String getRegID(){
		return RegistrationID;
	}

	public void setRegID(String RegistrationID){
		this.RegistrationID = RegistrationID;
	}

	public static int getCounter(){
		return counter;
	} 

	public static void setCounter(int counter){
		exp1.counter = counter;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public long getCont(){
		return ContactNO;
	}

	public void setCont(long ContactNO){
		this.ContactNO = ContactNO;
	}

	public String getBranch(){
		return Branch;
	}

	public void setBranch(String Branch){
		this.Branch = Branch;
	}

	
	public static void main(String [] args){
		exp1 student1 = new exp1("Shrinivas", 24681012, "EnTC");
		exp1 student2 = new exp1("Raj", 13579111, "EnTC");

		System.out.println("Hi "+student1.getName()+" your registration ID is "+student1.getRegID());
		System.out.println("Hi "+student2.getName()+" your registration ID is "+student2.getRegID());
	}
	
}