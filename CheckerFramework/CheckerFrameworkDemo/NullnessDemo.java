import org.checkerframework.checker.nullness.qual.*;    // Currently no annotations in use

public class NullnessDemo{

	public static void main(String[] args){
		Object demo = new Object();
		@Nullable Object demonull = null;
		System.out.println(demo.toString());
		System.out.println(demonull.toString());
	}

}