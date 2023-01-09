import java.util.Scanner;
public class exp {
    public static void main(String[] args) {

       int number;

       Scanner input = new Scanner(System.in);

       System.out.print("Please enter a number : ");
        number = input.nextInt();

        System.out.print("Numbers with powers of 4 : ");

        for (int start=1; start <= number; start *=4 ) {
            System.out.print(start + " ");
        }
        System.out.println(" ");

        System.out.print("Numbers with powers of 5 : ");
        for (int start=1; start <= number; start *=5 ){
            System.out.print(start +" ");
        }

        }

           }



