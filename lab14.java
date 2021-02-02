package lab14;

import java.awt.*;
import java.awt.event.*;

class lab14 extends Frame {
    lab14() {
        setTitle("Лабораторная №14");
        setLayout(null);

        Label labelX = new Label("Число x");
        Label labelY = new Label("Число y");
        Label labelSum = new Label("Сумма");
        labelX.setBounds(80, 50, 50, 25);
        labelY.setBounds(80, 80, 50, 25);
        labelSum.setBounds(80, 110, 50, 25);

        TextField x = new TextField();
        TextField y = new TextField();
        TextField sum = new TextField();
        x.setBounds(130, 50, 60, 25);
        y.setBounds(130, 80, 60, 25);
        sum.setBounds(130, 110, 60, 25);

        Button cal = new Button("Вычислить");
        Button cle = new Button("Очистить");
        cal.setBounds(115, 140, 75, 30);
        cle.setBounds(115, 175, 75, 30);

        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double xNum = Double.parseDouble(x.getText());
                Double yNum = Double.parseDouble(y.getText());
                sum.setText(Double.toString(xNum + yNum));
            }
        });

        cle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x.setText("");
                y.setText("");
                sum.setText("");
            }
        });

        add(cal);
        add(cle);
        add(x);
        add(y);
        add(sum);
        add(labelX);
        add(labelY);
        add(labelSum);
        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        lab14 lab14 = new lab14();
    }
}
