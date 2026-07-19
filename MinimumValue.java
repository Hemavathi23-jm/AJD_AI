public class MinimumValue{
    public static void main (String [] args){
        int [] arr = {3,2,4,1,7};
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];

            }
        }
        System.out.println("Minimum value in the array is: " + min);
        }
    }
