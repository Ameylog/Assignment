
import java.util.Random;

public class Shuffle_Array_Element {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};

        Random random=new Random();

        for (int i = 0; i <arr.length ; i++) {
            int randomIndex=random.nextInt(arr.length);
            int temp=arr[randomIndex];
            arr[randomIndex]=arr[i];
            arr[i]=temp;
        }
        for (int i =0 ; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
