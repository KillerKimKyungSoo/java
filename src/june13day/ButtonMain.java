package june13day;

public class ButtonMain {
    public static void main(String[] args) {
        Button saveButton = new Button();
        Button cancelButton = new Button();
        Button undoButton = new Button();
        Button helpButton = new Button();

        saveButton.setButtonListener(new SaveAction());
        cancelButton.setButtonListener(new CancelAction());
        undoButton.setButtonListener(new UndoAction());
        helpButton.setButtonListener(new HelpAction());

        saveButton.click();
        saveButton.doubleClick();
        cancelButton.click();
        undoButton.click();
        helpButton.click();
    }
}
