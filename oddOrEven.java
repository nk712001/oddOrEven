import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args){
        int i;

        Scanner input = new Scanner(System.in);

        System.out.println("enter the value of  i: ");
        i = input.nextInt();

        if (i%2!=0){
            System.out.println("the enter value is odd");
        }
        else {
            System.out.println("the entered value is even");
        }

    }
}
