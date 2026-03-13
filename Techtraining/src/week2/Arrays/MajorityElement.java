package week2.Arrays;

public class MajorityElement {
    //Boyer Moore's Algorithm for voting...
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,3,4,4,4,4};
        int i, count=0;
        int candidate=0;
        for(i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(candidate==arr[i]){
                count++;
            }
            else{
                count --;
            }
        }
        System.out.println("Majority element : "+ candidate);

    }
}


/*count    candidate  index
0             2        0
1             2        1
0             2         3

 */
