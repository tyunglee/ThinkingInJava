package cn.com.tyung.exam_12;

public class Description {
	private String s;
	
	Description(String s) {
		this.s = s;
		System.out.println("Creatin Description "+s);
	}
	
	protected void dispose() {
		System.out.println("Dispose Description "+s);
	}
}
