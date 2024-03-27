import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int prime=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int input = scanner.nextInt();
        for (int i=1;i<=input;i++){
            if (input%i==0){
                prime++;
            }
        }
        if (prime==2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
