package week2.interfaces;
//Multiple Inheritance
public interface Browser1 {
	void browser1();

}

interface Browser2{
	void browser2();
	
}

interface Browser3{
	void browser3();
}
class Browsers implements Browser1, Browser2, Browser3{
	@Override
	public void browser1() {
		System.out.println("GOOGLE");
	}
		
    @Override
    public void browser2() {
    	System.out.println("Firefox");   	
    }
    
    @Override
    public void browser3() {
    	System.out.println("Microsoft edge");
	}
    
    public static void main(String[] args) {
		Browsers b=new Browsers();
		b.browser1();
		b.browser2();
		b.browser3();
	}
}