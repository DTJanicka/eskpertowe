package Window;

import java.io.IOException;

/**
 * Created by dorota.janicka on 2017-12-25.
 */
public class Managment {
    private QuizWindow quizWindow;

    private Managment() throws IOException {
        quizWindow = new QuizWindow();
        start();
    }

    private static Managment INSTANCE;

    public static Managment getINSTANCE() throws IOException {
        if (INSTANCE == null){
            INSTANCE = new Managment();
        }
        return INSTANCE;
    }

    private void start() throws IOException {
        MainWindow mainWindow = MainWindow.getINSTANCE();
        mainWindow.createWindow();
    }
}
