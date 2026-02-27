package week2.Strings;

public class bufferbuilder {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		StringBuffer b=new StringBuffer("Java");
		for(int i=1;i<100;i++) {
			b.append("DSA");
		}
		System.out.println("Buffer time: "+ (System.currentTimeMillis()-startTime) + "ms");
		
		startTime=System.currentTimeMillis();
		
		StringBuilder s=new StringBuilder("Java");
		for(int i=1;i<100;i++) {
			s.append("DSA");
		}
		System.out.println("Builder time: "+ (System.currentTimeMillis()-startTime) + "ms");
		
	}

}
