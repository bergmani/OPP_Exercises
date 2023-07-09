package org.geneation.excercises;


public class Student {
	//Attributes
	 private String firstName;
	 private String lastName;
	 private int registration;
	 private int grade;
	 private int year;

     //Constructors
    public Student(String firstName, String lastName, int registration, int grade, int year) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}
    
    //Methods
	public void printFullName(){
      System.out.println(firstName + " " + lastName);
   }

   public boolean isApproved(int grade){
       //TODO implement: should return true if grade >= 60
	   boolean approved = false;
	   if(grade >= 60 && grade <= 100) {
		   approved = true;
		   
	   } else if (grade <= 59 && grade >= 0 ) {
		   approved = false;
	   }
	   return approved;
   }

   public int changeYearIfApproved(int grade, int year){
       //TODO implement: the student should advance to the next year if he/she grade is >= 60
       // Make year = year + 1, and print "Congragulations" if the student has been approved
	   if(grade >= 60 && grade <= 100) {
		   year ++;
		   System.out.println("Congratulations");
		   
	   } else if (grade <= 59 && grade >= 0 ) {
		   System.out.println("Not approved");
	   }
	   return year;
   }
   
   //Setters setters
   public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

   //toString
	   @Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration + ", grade="
				+ grade + ", year=" + year + "]";
	}

	
   
}
