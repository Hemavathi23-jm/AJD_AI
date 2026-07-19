import java.util.Scanner;
public class MultiArray {
    public static void main(String [] args){
        int [][][] arr = new int[2][2][5];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<arr.length; i++){//Branches
            for(int j=0; j<arr[i].length; j++){//Batches
                for(int k=0;k<arr[i][j].length; k++){//Students
                    System.out.println("enter the age of Student"+(k+1)+" "+"of Batch"+(j+1)+" "+"of Branch"+(i+1));
                    arr[i][j][k]= s.nextInt();

                }
            }
        }
        System.out.println("the ages of students are:");
         for(int i=0;i<arr.length; i++){//Branches
            for(int j=0; j<arr[i].length; j++){//Batches
                for(int k=0;k<arr[i][j].length; k++){//Students
                    System.out.println("The age of Student"+(k+1)+" "+"of Batch"+(j+1)+" "+"of Branch"+(i+1)+" is "+arr[i][j][k]);
             
                }
            }
        }
    }
}
