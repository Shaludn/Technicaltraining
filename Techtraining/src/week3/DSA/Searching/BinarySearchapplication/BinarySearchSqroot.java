package week3.DSA.Searching.BinarySearchapplication;

public class BinarySearchSqroot {

    public static int squareroot(int n){
        int s=0;
        int e=n;
        int ans=-1;

        while(s<=e){
            int mid= s+(e-s)/2;
            int sq=mid*mid;

            if(sq==n){
                return mid;
            }
            else if(sq>n){
                e=mid-1;//Go to the left hand side
            }
            else{
                //Store the probable answer and move to right
                ans=mid;//the mid value is stored in the answer
                s=mid+1;//we move to the right to find accurate answer.
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareroot(36));
    }
}
