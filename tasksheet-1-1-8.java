import java.util.*;

class Tasksheet8 {
static int cumulativeSum(int a, int b, int c){
    return sumOfANumber(a)+sumOfANumber(b)+sumOfANumber(c);
}
static int sumOfANumber(int x){
    int sum = 0;
    for(int p=1;p<=x;p++)
    sum+=p;
    return sum;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("The cumulative sum of "+a+ "+"+b+"+"+c+"= "+cumulativeSum(a, b, c));
        input.close();
        System.exit(0);
    }   
}