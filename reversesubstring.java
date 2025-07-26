//not done solely by me ...took help of gfg
import java.util.*;


public class reversesubstring {
    static void reverse(int[] array,int k){
      int n=array.length;
     for (int i = 0; i < n; i=i+k) {
        int left=i;
        int right=Math.min(i+k-1, n-1);
        while (left<right) {
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;


            left++;
            right--;
        }
     }
    
    }
    public static void main(String[] args) {
        System.out.println("enter the lenght of array");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        sc.nextLine();
        int[] array=new int[length];
        System.out.println("enter the elements of array");
        for (int i = 0; i < length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("enter the lenght of substring");
        int k=sc.nextInt();

       reverse(array, k);
    for (int num : array) {
        System.out.print(num + " ");
    }      

        
    }
}
