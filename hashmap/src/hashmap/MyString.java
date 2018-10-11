package hashmap;

public class MyString implements Comparable<MyString> {

	String value;

	public MyString(String value) {
		super();
		this.value=value;
		// TODO Auto-generated constructor stub
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "MyString [value=" + value + "]";
	}

	@Override
	public int compareTo(MyString o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
