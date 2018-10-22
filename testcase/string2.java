package string;

public class string2 {

	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("This is StringBuffer "); 
	sb.append(" This is a sample program");
	System.out.println(sb);
	sb.insert(21,"Object");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	sb.replace(15,20,"Builder");
	System.out.println(sb);
	}

}
