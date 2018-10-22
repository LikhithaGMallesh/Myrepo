package activity2;

public class Student {
	String rollno;
	String name;
	int age;
	String course;
	
	public void Student(String rollno,String name,int age,String course)throws  AgeNotWithinRangeException,NameNotValidException{
		
		if((age<=15) || (age>=21)){
			throw new AgeNotWithinRangeException();
		}
		
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(Character.isDigit(c) ||Character.isSpaceChar(c) ) {
				throw new NameNotValidException();
			}
			
		}
	}

	}
package activity2;

@SuppressWarnings("serial")
public class AgeNotWithinRangeException extends Exception {
	 AgeNotWithinRangeException(){
   super("dsfdsgf");
	 
}
}package activity2;

@SuppressWarnings("serial")
public class AgeNotWithinRangeException extends Exception {
	 AgeNotWithinRangeException(){
   super("dsfdsgf");
	 
}
}package activity2;

public class valid {
	public static void main(String[] args) {
		Student n=new Student();
		
		try {
		n.Student("123","lik @",20,"java");
			
		}
catch(AgeNotWithinRangeException e){
	e.printStackTrace();
}
catch(NameNotValidException e){
	e.printStackTrace();
}
}
}