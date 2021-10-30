public class Note {
    private String name = "新建便签";
    private String head = "";
    private String info = "";
    private String time;
    private boolean star = false;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHead() {
        return head;
    }
    public void setHead(String head) {
        this.head = head;
    }
    public String getInfo(){
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public boolean getStar() {
        return star;
    }
    public void setStar(boolean star) {
        this.star = star;
    }
}
