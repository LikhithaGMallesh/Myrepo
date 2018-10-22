public class stringexample {

	public static void main(String[] args) {
		int count=0;
		String s="Welcome to Java World ";
		char m=s.charAt(4);
		  System.out.println(m);
		String s1="Welcome to Java World " + "Let us learn";
		String s2="Welcome";
		  System.out.println(s1.equals(s2));
          System.out.println(s1);
          for(int i=0;i<s.length();i++) {
        	  char n=s.charAt(i);
        	  count++;
        	  if( n=='a') {
        		  System.out.println(count);
        	    break;
        	  }
          } 
          String replaceString=s.replace('a','e');
          System.out.println(replaceString);
          String substr = s.substring(4,10);
          System.out.println(substr);   
        System.out.println(s1.toLowerCase());
	}

}
