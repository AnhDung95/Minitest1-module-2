public class main {
    public static void main(String[] args) {

        FictionBook book1 = new FictionBook(1, "Harry Potter", "J.K.Rowling", 100, "Viễn tưởng 1");
        FictionBook book2 = new FictionBook(2, "Sherlock Holmes", "Conan Doyle", 150, "");
        FictionBook book3 = new FictionBook(3, "Chí Phèo", "Nam Cao", 100, "Viễn tưởng 1");
        FictionBook book4 = new FictionBook(4, "Tắt đèn", "Ngô Tất Tố", 120, "");
        FictionBook book5 = new FictionBook(5, "Số đỏ", "Vũ Trọng Phụng", 100, "");

        ProgrammingBook book6 = new ProgrammingBook(6, "Toán lớp 1", "Dũng", 50, "java", "paper");
        ProgrammingBook book7 = new ProgrammingBook(7, "Toán lớp 2", "Hiền", 50, "java", "paper");
        ProgrammingBook book8 = new ProgrammingBook(8, "Toán lớp 3", "Quyết", 50, "java", "paper");
        ProgrammingBook book9 = new ProgrammingBook(9, "Toán lớp 4", "Đức Anh", 50, "", "paper");
        ProgrammingBook book10 = new ProgrammingBook(10, "Toán lớp 5", "Ba", 50, "", "paper");
//        Tổng giá 10 cuốn sách
        double[] sumPrice = {book1.getPrice(), book2.getPrice(), book3.getPrice(), book4.getPrice(), book5.getPrice(), book6.getPrice(), book7.getPrice(), book8.getPrice(), book9.getPrice(), book10.getPrice()};
        double x = 0;
        for (int i = 0; i < sumPrice.length; i++) {
            x += sumPrice[i];
        }
        System.out.println("Tổng giá 10 cuốn sách là: " + x);

//    đếm số sách ProgrammingBook có language là "Java".
        String[] countBook = {book6.getLanguage(), book7.getLanguage(), book8.getLanguage(), book9.getLanguage(), book10.getLanguage()};
        int count = 0;
        for (int i = 0; i < countBook.length; i++) {
            if (countBook[i] == "java") {
                count++;
            }
        }
        System.out.println("Số sách có ngôn ngữ là java: " + count);

//    Đếm số sách Fiction có category là “Viễn tưởng 1”.
        String[] countBook2 = {book1.getCategory(), book2.getCategory(), book3.getCategory(), book4.getCategory(), book5.getCategory()};
        int count2 = 0;
        for (int i = 0; i < countBook2.length; i++) {
            if (countBook2[i] == "Viễn tưởng 1") {
                count2++;
            }
        }
        System.out.println("Số sách có category là Viễn tưởng 1: " + count2);
        double[] bookPrice={book1.getPrice(), book2.getPrice(), book3.getPrice(), book4.getPrice(), book5.getPrice(), book6.getPrice(), book7.getPrice(), book8.getPrice(), book9.getPrice(), book10.getPrice()};
        int price=0;
        for (int i = 0; i < bookPrice.length; i++) {
            if(bookPrice[i]<100){
                price++;
            }
        }
        System.out.println("Tổng số  sách có giá nhỏ hơn 100 là: "+ price);
    }
}
