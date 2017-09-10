package cn.com.tyung.ThinkingInJava.eight_chapter.exam_14;

public class RoundGlyph extends Glyph {
	
	private int radius = 1;
	
	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph().radius "+radius);
	}
	
	void draw() {
		System.out.println("RoundGlyph.draw().radius "+radius);
	}
}
