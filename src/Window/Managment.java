package Window;

/**
 * Created by dorota.janicka on 2017-12-25.
 */
public class Managment {
    private QuizWindow quizWindow;

    private Managment(){
        quizWindow = new QuizWindow();
        start();
    }

    private static Managment INSTANCE;

    public static Managment getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Managment();
        }
        return INSTANCE;
    }

    private void start(){
        MainWindow mainWindow = MainWindow.getINSTANCE();
        mainWindow.createWindow();
    }
}
