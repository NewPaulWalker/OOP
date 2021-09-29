package Assignment1.书山有路勤为径;

public class Admin {
    String name;    //姓名
    String id;      //工号

    Admin(String namestr, String idstr){
        name = namestr;
        id = idstr;
    }

    //拉黑
    void lock(String stu_id){

    }
    //恢复
    boolean release(String stu_id){
        return false;
    }
    //购入
    void buy(String book_code){

        
    }
    //清理书籍
    void clean(String book_code){

    }
}
