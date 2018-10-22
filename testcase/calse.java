package activity1;

public class MyCalculator {
	
	long power;
       int n,p;
    public double MyCalculator(int n,int p) throws  norp,nandp{
       
    if((n<0) || (p<0)) {
    	throw new norp();
    }
    	if((n==0) && (p==0)) {
    		throw new nandp();
    		}
    
   double power1=Math.pow(n,p);
       return power1;
}
}
package activity1;

@SuppressWarnings("serial")
public class nandp extends Exception {
	nandp(){
		super("n and p should not be zero");
	}
}
package activity1;

@SuppressWarnings("serial")
public class norp extends Exception {
	norp(){
		super("n or p should not be zero");
		}
	
	}
package activity1;

public class calsi {

	public static void main(String[] args) {
		 MyCalculator c=new  MyCalculator();
		 
		 try {
			System.out.println(c.MyCalculator(3,2));
			}
 catch(norp e){
	 e.printStackTrace();
 }
catch (nandp e) {
	e.printStackTrace();
}
	}
}

