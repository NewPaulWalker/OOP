package Java������ƻ���.��������������.Step4;

public class WuMingFen {
    String theMa = "����";
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
        System.out.println("���룺"+this.theMa+"���۵ķ�����"+this.quantity+"�����Ƿ������"+this.likeSoup);
    }
}
