package week2.Arrays;

public class ArrayPartitioning {
    public static void main(String[] args) {
        int[] arr={4,7,9,2,8,1};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(arr[left]%2==0){
                left++;//if left side has even numbers increment frward.
            }
            while(arr[right]%2!=0){
                right--;//if right side has od numbers decrement backwards.
            }
            if(left<right){// else swap...
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        for(int x: arr){
            System.out.print(x+ " ");
        }

    }
}
