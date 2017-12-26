package Window;

import Window.iPanel;

import javax.swing.*;

/**
 * Created by dorota.janicka on 2017-12-25.
 */
public class QuizWindow implements iPanel {
    private JButton startAgain;
    private JTextField question;
    private JButton yes;
    private JButton no;
    private JPanel panel;

    protected QuizWindow(){

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
