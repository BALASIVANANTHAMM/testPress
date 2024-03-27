import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String input = scanner.nextLine().toLowerCase();
        char[] charArray = input.toCharArray();
        for (int i=charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]);
        }
    }
}
