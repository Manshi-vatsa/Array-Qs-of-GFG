import java.util.ArrayList;
import java.util.Scanner;

public class zeoresatend {
    public static void main(String[] args) {
       System.out.println("enter the length of array");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        System.out.println("enter the elements of the array");
        ArrayList<Integer> array=new ArrayList<>();
        for (int i = 0; i< length; i++) {
           array.add(sc.nextInt());
        } 
        int countofzeroes=0; 
        ArrayList<Integer> newarray=new ArrayList<>();
       for (Integer num : array) {
        if (num!=0) {
            newarray.add(num);

        }
        else{
            countofzeroes++;
        }
       }


for (int i =0; i < countofzeroes; i++) {
    newarray.add(0);
    
}

System.out.print(newarray);

    }
}
