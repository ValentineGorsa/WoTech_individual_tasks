class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int countOfSheets;

    public Book(int id, String name, String author, String publisher, int yearOfPublishing, int countOfSheets) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.countOfSheets = countOfSheets;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Publisher: " + publisher +
                ", Year: " + yearOfPublishing + ", Sheets: " + countOfSheets;
    }
}
