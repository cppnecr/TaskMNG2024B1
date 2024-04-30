class tasksheet10 {
    public static void main(String[] args) {
    Book b1 = new Book("Shelter in Place", "Nora Roberts", 2024, 11.99);
    Book b2 = new Book("Random in Death", "J.D. Robb", 2024, 14.99);
    Book b3 = new Book("Breaking the Silence", "Diane Chamberlaine", 1999, 11.17);
    System.out.println("Book 1:\nTitle: "+b1.title+"\nAuthor: "+b1.author+
    "\nYear Published: "+b1.yearPublished+"\nPrice: $"+b1.price+"\n ");
    System.out.println("Book 2:\nTitle: "+b2.title+"\nAuthor: "+b2.author+
    "\nYear Published: "+b2.yearPublished+"\nPrice: $"+b2.price+"\n ");
    System.out.println("Book 3:\nTitle: "+b3.title+"\nAuthor: "+b3.author+
    "\nYear Published: "+b3.yearPublished+"\nPrice: $"+b3.price);
}
}

class Book {
    String title;
    String author;
    int yearPublished;
    double price;
    
    Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author= author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
}