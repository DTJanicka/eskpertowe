package Window;
import Window.iPanel;

import Question.Question;
import javax.swing.*;
import java.io.IOException;
import java.util.List;

/**
 * Created by dorota.janicka on 2017-12-25.
 */
public class QuizWindow implements iPanel {
    private JButton startAgain;
    private JTextField question;
    private JButton yes;
    private JButton no;
    private JPanel panel;
    private Question questions;
    private List<String> list;

    protected QuizWindow() throws IOException {
        readQuestion();
        change(list.get(0));

    }

    protected void readQuestion()throws IOException{
        questions = new Question();
        list = questions.getList();
    }

    @Override
    public void change(String text) {
        question.setText(text);
    }

    @Override
    public JPanel getPanel(){
        return panel;
    }


}
