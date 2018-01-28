package Window;

import Question.Question;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private List<String> listOfQuestion;
    private List<String> listOfAnswer;
    private int size;

    protected QuizWindow() throws IOException {
        readQuestion();
        setFirstQuestion(listOfQuestion.get(0));

    }

    protected void readQuestion()throws IOException{
        questions = new Question();
        listOfQuestion = questions.getList();
    }


    protected void setFirstQuestion(String text){
        question.setText(text);
    }

    protected void changeQuestion(int index){
        question.setText(listOfQuestion.get(index));
    }

    @Override
    public void change(String text) {
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listOfAnswer.add("1");
                size = listOfAnswer.size();
                changeQuestion(size + 1);
            }
        });
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listOfAnswer.add("0");
                size = listOfAnswer.size();
                changeQuestion(size + 1);
            }
        });
    }


    @Override
    public JPanel getPanel(){
        return panel;
    }


}
