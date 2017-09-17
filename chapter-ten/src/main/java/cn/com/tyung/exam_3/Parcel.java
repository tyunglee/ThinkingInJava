package cn.com.tyung.exam_3;

public class Parcel {
	
	private class PContents implements Contents {
		private int i = 11;
		
		@Override
		public int value() {
			return i;
		}
		
	}
	
	protected class PDestination implements Destination {
		private String label;
		
		private PDestination(String whereTo) {
			this.label = whereTo;
		}
		
		@Override
		public String readLabel() {
			return label;
		}
		
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	
	public Contents contents() {
		return new PContents();
	}
	
}
