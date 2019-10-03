package Calculator;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Calculator extends JFrame
{
    private final JPanel buttonJPanel2, buttonJPanel3, buttonJPanel4,
            buttonJPanel5; // panel to hold buttons
    private final JButton[] buttons3, buttons4, buttons5;
    private final JButton[] buttons2;
    private final JTextField buttonJPanel1;

    // no-argument constructor
    public Calculator()
    {
        super("Calculator");
        buttonJPanel1 = new JTextField();

//        add(buttonJPanel1); // add panel1 to JFrame

        buttons2 = new JButton[4];
        buttons2[0] = new JButton("7");
        buttons2[1] = new JButton("8");
        buttons2[2] = new JButton("9");
        buttons2[3] = new JButton("/");
        buttonJPanel2 = new JPanel();
        buttonJPanel2.setLayout(new GridLayout(1, buttons2.length));

        buttonJPanel2.add(buttons2[0]);
        buttonJPanel2.add(buttons2[1]);
        buttonJPanel2.add(buttons2[2]);
        buttonJPanel2.add(buttons2[3]);

        add(buttonJPanel2,BorderLayout.BEFORE_FIRST_LINE); // add panel2 to JFrame

        buttons3 = new JButton[4];
        buttons3[0] = new JButton("4");
        buttons3[1] = new JButton("5");
        buttons3[2] = new JButton("6");
        buttons3[3] = new JButton("*");
        buttonJPanel3 = new JPanel();
        buttonJPanel3.setLayout(new GridLayout(1, buttons3.length));
        buttonJPanel3.add(buttons3[0]);
        buttonJPanel3.add(buttons3[1]);
        buttonJPanel3.add(buttons3[2]);
        buttonJPanel3.add(buttons3[3]);

        add(buttonJPanel3,BorderLayout.BEFORE_FIRST_LINE); // add panel3 to JFrame

        buttons4 = new JButton[4];
        buttons4[0] = new JButton("1");
        buttons4[1] = new JButton("2");
        buttons4[2] = new JButton("3");
        buttons4[3] = new JButton("-");
        buttonJPanel4 = new JPanel();
        buttonJPanel4.setLayout(new GridLayout(1, buttons4.length));

      //  add(buttonJPanel4, BorderLayout.AFTER_LAST_LINE); // add panel4 to JFrame

        buttons5 = new JButton[4];
        buttons2[0] = new JButton("0");
        buttons5[1] = new JButton(".");
        buttons5[2] = new JButton("=");
        buttons5[3] = new JButton("+");
        buttonJPanel5 = new JPanel();
        buttonJPanel5.setLayout(new GridLayout(1, buttons5.length));
        for(JButton b : buttons2) { buttonJPanel2.add(b);}
        //add(buttonJPanel5, BorderLayout.AFTER_LAST_LINE); // add panel5 to
//JFrame
    }


    public static void main(String[] args)
    {
        Calculator panelFrame = new Calculator();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(700, 500);
        panelFrame.setVisible(true);
    }

} // end class PanelFramee