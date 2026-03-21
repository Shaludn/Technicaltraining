package Assignment4.Module8;
//LEETCODE-136 SINGLE ELEMENT USING XOR
public class SingleNumber {
    public static int singlenumber(int [] arr){
        int result=0;
        for(int n:arr){
            result^=n;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1};
        System.out.println("Unique element in array is :" + singlenumber(arr));
    }
}
