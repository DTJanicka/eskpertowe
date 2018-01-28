package Window; /**
 * Created by dorota.janicka on 2017-12-25.
 */
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainWindow extends JFrame{
    JPanel panel;
    QuizWindow quizWindow;
    private static MainWindow INSTANCE;

    private MainWindow() throws IOException {
        super();
        quizWindow = new QuizWindow();
    }

    public static MainWindow getINSTANCE() throws IOException {
        if(INSTANCE == null){
            INSTANCE = new MainWindow();
        }
        return INSTANCE;
    }

    protected void createWindow(){
        changeWindow(quizWindow.getPanel());
        this.setMinimumSize(new Dimension(500,500));
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    protected void changeWindow(JPanel jpanel){
        if (panel != null){
            this.remove(panel);
        }
        this.add(jpanel);
        panel = jpanel;
        this.pack();
        this.revalidate();
        this.repaint();
    }

    protected void closeWindow(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
