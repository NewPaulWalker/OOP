package Java程序设计基础.面向对象类与对象.Step4;

public class WuMingFen {
    String theMa = "酸辣";
    int quantity = 2;
    boolean likeSoup = true;

    WuMingFen(String theMa, int quantity, boolean likeSoup){
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }
    WuMingFen(String theMa, int quantity){
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = false;
    }
    WuMingFen(){
    }
    void check(){
        System.out.println("面码："+this.theMa+"，粉的份量："+this.quantity+"两，是否带汤："+this.likeSoup);
    }
}
