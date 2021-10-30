public class MVCStickyNote {
    public static void main(String[] args) {
       Note model = retrieveNoteFromDatabase();
       View view = new View();
       Controller controller = new Controller(model, view) ;
       controller.printAskOp();
    }

    private static Note retrieveNoteFromDatabase() {
        Note note = new Note();
        return note;
    }
}
