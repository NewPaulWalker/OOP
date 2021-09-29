package Assignment1.书山有路勤为径;

public class Student{
    /*  性别、年龄等信息在此处用不到，
    *   因此就只定义两个自身的属性
    */
    //姓名
    String name;
    //学号
    String id;

    //  学生与书籍的交互
    //借书的数量
    int borrow_count;
    //借书的名字
    String[] borrow_book;

    //  学生与管理员的交互
    //信用分
    int credit;
    //借书许可
    boolean allow;

    //构造性方法
    Student(String namestr, String idstr){
        name = namestr;
        id = idstr;
        credit = 80;
        borrow_count = 0;
        allow = false;
    }

    //一般方法

    //请求借书许可
    boolean ask(){
        if(borrow_count < 3 || credit > 90)
            allow = true;
        return allow;
    }
    //还书
    void back(String book_name){
        borrow_count--;
        credit++;
        //并从记录数组中删除书籍
        //待实现
    }
    //借书
    boolean borrow(String book_name, boolean book_remainder){
        if(allow || book_remainder){
            borrow_count++;
            //并从记录数组中加上书籍
            //待实现
            allow = false;
            return true;
        }
        return false;
    }
    //丢失后补偿
    int pay(String book_name, int price){
        borrow_count--;
        //删除借的书
        return price;
    }
}