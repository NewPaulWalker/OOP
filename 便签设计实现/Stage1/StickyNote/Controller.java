public class Controller {
    private Note model;
    private View view;

    public Controller(Note model, View view){
        this.model = model;
        this.view = view;
    }

    public String getNoteName(){
        return model.getName();
    }
    public void setNoteName(String name){
        model.setName(name);
    }
    public String getNoteHead(){
        return model.getHead();
    }
    public void setNoteHead(String head){
        model.setHead(head);
    }
    public String getNoteInfo(){
        return model.getInfo();
    }
    public void setNoteInfo(String info){
        model.setInfo(info);
    }
    public String getNoteTime(){
        return model.getTime();
    }
    public void setNoteTime(String time){
        model.setTime(time);
    }
    public boolean getNoteStar(){
        return model.getStar();
    }
    public void setNoteStar(boolean star){
        model.setStar(star);
    }

    public void printNoteInfo(String info){
        view.printInfo(info);
    }
    public void printNoteList(String name, String head, String time){
        view.printList(name,head,time);
    }
    public void printAskOp(){
        view.printOp();
    }
    public void printAskNote(){
        view.printNote();
    }
    public int inputOp(){
        return 1;
    }
    public int inputNote(){
        return 2;
    }
    public Note prepare(int op){
        return model;
    }
    public Note create(){
        return model;
    }
    public Note open(){
        return model;
    }
    public void delete(Note model){

    }
    public Note find(){
        return model;
    }
    public boolean back(){
        return false;
    }
    public void edit(){

    }
    public void inset(){

    }
    public void save(Note model){

    }
    public boolean exit(){
        return true;
    }
}
