package mooc.logic;
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui){
        this.ui = ui;
    }

    public void execute(int HowManyTimes) {
        int i = 0;
        while (i < HowManyTimes) {
            System.out.println("The application logic works");
            i++;
            ui.update();
        }
    }
}
