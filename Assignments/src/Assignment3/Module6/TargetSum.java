package Assignment3.Module6;

public class TargetSum {
    public static void main(String[] args) {
        int i, j;
        int[] arr={3,4,2,1,5,7,9,2};
        int target=5;
        for(i=0;i< arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+ "," + arr[j]+ " =" + target);
                }
            }
        }
    }
}
