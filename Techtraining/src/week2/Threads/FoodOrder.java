package week2.Threads;

public class FoodOrder extends Thread{
	String task;
	
	FoodOrder(String task){
		this.task=task;
	}
	public void run() {
		System.out.println(task + " started");
	}
	
	public static void main(String[] args) {
		FoodOrder f1=new FoodOrder("Cooking");
		FoodOrder f2=new FoodOrder("Packing");
		FoodOrder f3=new FoodOrder("Assigning delivery");
		f1.start();
		f2.start();
		f3.start();
	}

}
/*Points to remember
 * Extend thread
 * Override run()
 * use start()
it is less flexible because of inheritance limitation.abstract*/