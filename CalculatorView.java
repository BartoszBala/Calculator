package Calculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame implements ActionListener {

    JTextField resultshow = new JTextField();

    JButton equals = new JButton("=");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multiply = new JButton("*");
    JButton divide = new JButton("/");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton clear = new JButton("C");

    public CalculatorView() {
        JPanel mypanel = new JPanel();
        JPanel mypanel0 = new JPanel();
        JPanel mypaneltxt = new JPanel();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mypaneltxt, BorderLayout.PAGE_START);

        mypaneltxt.setLayout(new GridLayout(1, 1));
        mypanel.setLayout(new GridLayout(0, 4));
        mypanel0.setLayout(new GridLayout(4, 4));
        mypaneltxt.add(resultshow);


        mypanel0.add(one);
        mypanel0.add(two);
        mypanel0.add(three);
        mypanel0.add(equals);
        mypanel0.add(four);

        mypanel0.add(five);
        mypanel0.add(six);
        mypanel0.add(plus);
        mypanel0.add(seven);
        mypanel0.add(eight);
        mypanel0.add(nine);
        mypanel0.add(minus);
        mypanel0.add(clear);
        mypanel0.add(zero);
        mypanel0.add(multiply);
        mypanel0.add(divide);

        resultshow.setSize(200, 50);
//        resultshow.setHorizontalAlignment(JTextField.RIGHT);
//        resultshow.setFont(new Font("Arial", Font.PLAIN, 40));
//        resultshow.setBorder(new EmptyBorder(30, 0, 0, 0));
//        resultshow.setForeground(Color.WHITE);
        add(mypanel, BorderLayout.PAGE_END);
        add(mypanel0, BorderLayout.CENTER);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);               // nie wiem co oznacza ten this
        divide.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);

    }

    String data = "";
    boolean b = true;
    double zmienna1;
    double zmienna2;
    double wynik;
    String znak = "";
    String pom = "";

    @Override
    public void actionPerformed(ActionEvent ae) {
        String liczba = new String("");

        do {
            if (ae.getSource() == one) {
                data = data + "1";
                resultshow.setText(data);
                break;
            } else if (ae.getSource() == two) {
                data = data + 2;
                resultshow.setText(data);
                break;
            } else if (ae.getSource() == three) {
                data = data + 3;
                resultshow.setText(data);
                break;
            } else if (ae.getSource() == four) {
                data = data + 4;
                resultshow.setText(data);
                break;
            } else if (ae.getSource() == five) {
                data = data + 5;
                resultshow.setText(data);
                break;
            } else if (ae.getSource() == six) {
                data = data + 6;
                resultshow.setText(data);
                break;
            } else if (ae.getSource() == seven) {
                data = data + 7;
                resultshow.setText(data);
                break;
            } else if (ae.getSource() == eight) {
                data = data + 8;
                resultshow.setText(data);
                break;
            } else if (ae.getSource() == nine) {
                data = data + 9;
                resultshow.setText(data);
                System.out.println(b);
                break;
            } else if (ae.getSource() == zero) {
                if (data.equals("") || zmienna2 == 0) {
                    break;
                }
                data = data + 0;
                resultshow.setText(data);
                System.out.println(b);
                break;
            } else if (ae.getSource() == plus) {
                if (data.equals("") || pom.equals("+") || pom.equals("-") || pom.equals("*") || pom.equals("/")) {
                    break;
                }
//else if()
                else {
                    zmienna1 = Number.number(data);
                    data = data + "+";
                    resultshow.setText(data);
                    znak = "+";
                    pom = znak;
                    break;
                }
            } else if (ae.getSource() == minus) {
                if (data.equals("") || pom.equals("+") || pom.equals("-") || pom.equals("*") || pom.equals("/")) {
                    break;
                } else {
                    zmienna1 = Number.number(data);
                    data = data + "-";
                    resultshow.setText(data);
                    znak = "-";
                    pom = znak;

                    System.out.println(b);
                    break;
                }
            } else if (ae.getSource() == multiply) {
                if (data.equals("") || pom.equals("+") || pom.equals("-") || pom.equals("*") || pom.equals("/")) {
                    break;
                } else {
                    zmienna1 = Number.number(data);
                    data = data + "*";
                    resultshow.setText(data);
                    znak = "*";
                    pom = znak;
                    System.out.println(b);
                    break;
                }
            } else if (ae.getSource() == divide) {
                if (data.equals("") || pom.equals("+") || pom.equals("-") || pom.equals("*") || pom.equals("/")) {
                    break;
                } else {
                    zmienna1 = Number.number(data);
                    data = data + "/";
                    resultshow.setText(data);
                    znak = "/";
                    pom = znak;
                    System.out.println(b);
                    break;
                }
            } else if (ae.getSource() == equals) {
                data = data + "=";

                zmienna2 = RegexNumber2.liczba2(data);
                switch (znak) {
                    case "+":
                        wynik = Sum.sum(zmienna1, zmienna2);
                        break;
                    case "*":
                        wynik = Multiplication.product(zmienna1, zmienna2);
                        break;
                    case "-":
                        wynik = Substraction.substraction(zmienna1, zmienna2);
                        break;
                    case "/":
                        wynik = Division.division(zmienna1, zmienna2);
                        break;
                }
                pom = "";
                zmienna2 = 0;
                data = data + wynik;
                resultshow.setText(data);
                data = "";
                break;
            } else if (ae.getSource() == clear) {
                data = "";
                resultshow.setText(data);
                System.out.println(zmienna1);
                System.out.println(zmienna2);
                System.out.println(data);
                break;

            }


        }
        while (b);
    }


    public static void main(String[] args) {

        System.out.println("test błędu");

        CalculatorView g = new CalculatorView();
        g.setLocation(500, 300);
        g.setSize(400, 400);
        g.setVisible(true);


    }
}