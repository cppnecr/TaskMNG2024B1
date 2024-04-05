import java.util.Scanner;

class StringTask {
    
    public static void main(String[] args) {
    System.out.println("Enter a word");
    Scanner input = new Scanner(System.in);
    String a = "noon";
    StringBuilder b = new StringBuilder(input.nextLine());

    if (b.toString().equals(a)) {
        System.out.println("The input string is a palindrome.");
    } else {
        System.out.println("The input string is not a palindrome.");
    }
    }
}