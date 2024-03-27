import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        String val ="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int input = scanner.nextInt();
        while (input!=0){
            val+=input%10;
            input=input/10;
        }
        System.out.println(Integer.parseInt(val));
    }
}
