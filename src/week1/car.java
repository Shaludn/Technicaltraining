package week1;

//Practice Question
 class Vehicle{
    static void speed(){
        System.out.println("The vehicles speed should be in control");

    }

    static void speed(int maxspeed){
        System.out.println("The maxsoeed of vehicle is:"+ maxspeed);
    }
}

public class car extends Vehicle{
    void speed(String mode){
        System.out.println("The mode of the car is:"+ mode);
    }
     public static void main(String[] args){
        car c=new car();
        c.speed();
        c.speed(90);
        c.speed("eco");
    }
    

}