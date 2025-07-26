public class waveform {


    static void waveformarray(int[] array){
        int n=array.length;
        for (int i = 0; i < n-1; i=i+2) {
            int  temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        waveformarray(arr);
        System.out.println("the new array is ");

        for (int i : arr) {
            System.out.println(i +" ");
        }
    }
}
