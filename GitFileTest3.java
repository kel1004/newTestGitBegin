import java.util.Scanner;

public class GitFileTest3{
    public static void main(String[] args){
        int year;
        Scanner input = new Scanner(System.in);

        System.out.println("Checks if Leap Year");
        System.out.print("Enter Year: ");
        year = input.nextInt();

        if(year % 400 == 0)
            System.out.println(year +" is a leap year");
        else if(year % 100 == 0)
            System.out.println(year +" is not a leap year");
        else if(year % 4 == 0)
            System.out.println(year +" is a leap year");
        else
            System.out.println(year +" is not a leap year");
        input.close();
    }
}