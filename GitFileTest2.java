import java.util.Scanner;
public class GitFileTest2 {
    public static void main(String[] args){
        int[] array = new int[10];//Changed the array size to 10
        Scanner input = new Scanner(System.in);
        System.out.println("Determines the highest and lowest of 5 input values.");
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter value of input " + (i + 1) + ": ");
            array[i] = input.nextInt();

        }//Testing!!
        
        int lowest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < lowest){
                lowest = array[i];
            }
        }

        int highest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > highest){
                highest = array[i];
            }
        }
        
        System.out.println("The lowest number is " + lowest);
        System.out.println("The highest number is " + highest);
        input.close();
    }
}
