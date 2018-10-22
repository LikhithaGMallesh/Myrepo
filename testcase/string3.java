package string;

import java.util.Arrays;

public class string3 {

	public static void main(String args[]) {
		
		String fname ="c:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		String[] items=fname.split("\\\\");
		System.out.println(Arrays.toString(items));
		System.out.println("Drive:"+ items[0]);
		System.out.println("Folders:"+items[1]+"||"+items[2]+"||"+items[3]);
		System.out.println("File"+items[4]);
		
	}
}