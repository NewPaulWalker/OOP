package Assignment1.书山有路勤为径;

public class Book {
    String name;    //书名
    String code;    //编号
    String author;  //作者
    String price;   //价格

    int book_count;   //该书总数量
    boolean book_remainder;     //该书是否剩余

    Book(String namestr, String codestr, String authorstr, String pricestr, int book_countint){
        name = namestr;
        code = codestr;
        author = authorstr;
        price = pricestr;
        book_count = book_countint;
        book_remainder = true;
    }

    void Book_add(){
        book_count++;
        book_remainder = true;
    }
    void Book_lost(){
        book_count--;
    }
    void Book_back(){}
    boolean Book_borrow(){
        return true;
    }
}
