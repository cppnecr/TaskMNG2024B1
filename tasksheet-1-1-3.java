class Task3 {
    public static void main(String[] args) {
        int check_number = 10;
        String message = new String();
        for (int i = 1; i <= check_number; i++)
            System.out.println(message = (i%2==0) ? i+" is even number" : i+ " is odd number");
    }
}
