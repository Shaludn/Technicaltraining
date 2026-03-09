package Assignment3.Module7;

public class Occurences {
    public static int firstOccurence(int[] a, int key){
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e){
            int mid= s+ (e-s)/2;
            if(a[mid]==key){
                //Store the index and move to extreme left for 1st occurence
                ans=mid;
                e=mid-1;
            }else if(a[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;

    }
    public static int lastOccurence(int[] a, int key){
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e){
            int mid= s+ (e-s)/2;
            if(a[mid]==key){
                //Store the index and move to extreme left for 1st occurence
                ans=mid;
                s=mid+1;
            }else if(a[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,4,4,4,6,7};
        int f=firstOccurence(a, 4);
        int l=lastOccurence(a, 4);
        System.out.println("First occurence index:" + f);
        System.out.println("Last occurence index: " +l);
    }
}
