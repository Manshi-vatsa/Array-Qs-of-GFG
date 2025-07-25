import java.util.*;

public class zeroesandones {
    public static void main(String[] args) {

        System.out.println("enter the length of array");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        System.out.println("enter the elements of the array");
        int[] array=new int[length];
        System.out.println("enter elements of array");
        for (int i = 0; i< length; i++) {
            array[i]=sc.nextInt();
        }
int countofzero=0;
int countofone=0;
        for (int i = 0; i < length-1; i++) {

            if(array[i]==0 && array[i+1]==0) {

                countofzero++;
                
            }
            else if(array[i]==1 && array[i+1]==1){
                countofone++;
            }
            
           
        }
        if (countofone>0) {
                countofone=countofone+1;
            }
            if (countofzero>0) {
                countofzero=countofzero+1;
            }
        System.out.println("the number of consecutive ones and consecutive zeroes are"+ countofone + " " + countofzero);
        System.out.println(Math.max(countofzero, countofone));
    }
}
