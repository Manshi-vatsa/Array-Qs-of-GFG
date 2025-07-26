import java.util.Scanner;

public class rotate_array {

    static void rotate_array(int[] array,int k){
        int n=array.length;
         k = k % n;
      
       while (k!=0) {
        int temp=array[0];
        
        for (int i = 0; i < n-1; i++) {
            
            
          array[i]=array[i+1];
        
            }
            array[n-1]=temp;

             k--;
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
        System.out.println("enter the number of required rotations");
        int k=sc.nextInt();

       rotate_array(array, k);
    for (int num : array) {
        System.out.print(num + " ");
    }      

    
    }
}
