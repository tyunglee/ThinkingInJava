package cn.com.tyung.exam_3;
import cn.com.tyung.exam_3.Processor;
public class Apply {
	
	public static void process(Processor p,Object o) {
		System.out.println("Useing processor "+p.name());
		System.out.println(p.process(o));
	}
	
}
