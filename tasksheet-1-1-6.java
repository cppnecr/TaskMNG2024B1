import java.util.*;

class Tasksheet6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        ArrayList <Integer> a = new ArrayList<>();
        a.add(input.nextInt());
        a.add(input.nextInt());
        a.add(input.nextInt());
        if(a.get(0)==a.get(1) && a.get(1)==a.get(2))
            System.out.println("All numbers are equal");
        else
            System.out.println("The largest number is "+Collections.max(a));
        System.exit(0);
    }
}
