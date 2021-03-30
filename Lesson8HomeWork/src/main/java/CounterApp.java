import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class CounterApp extends JFrame {
    private int value;
    private int secondValue;
    private int counter;

    public CounterApp(int initialValue){
    setBounds(500, 500, 300, 320);
    setTitle("My Counter");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

    JLabel counterValueView = new JLabel();
    counterValueView.setFont(font);
    counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
    add(counterValueView, BorderLayout.CENTER);

    value = initialValue;
    counterValueView.setText(String.valueOf(value));

    JButton decrementButton = new JButton("<");
    decrementButton.setFont(font);
    add(decrementButton,BorderLayout.WEST);

    JButton incrementButton = new JButton(">");
    incrementButton.setFont(font);
    add(incrementButton, BorderLayout.EAST);

    //кнопка сброса счётчика на первоначальное значение.
    JButton resetButton = new JButton("Reset");
    resetButton.setFont(font);
    add(resetButton, BorderLayout.SOUTH);

    //кнопка сохранения числа.
    JButton saveButton = new JButton("Save");
    saveButton.setFont(font);
    add(saveButton, BorderLayout.NORTH);

    saveButton.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (counter == 0) {
                secondValue += value;
            }
            // ниже условие для того чтобы при втором нажатии кнопки основное значение (value) стало как и запомненное значение (secondValue)
            if (counter !=0){
                value = secondValue;
            }
            counter++;
            counterValueView.setText("Saved:" + String.valueOf(secondValue));
        }
    });

    resetButton.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            value = 0;
            secondValue = 0;
            counter = 0;
            counterValueView.setText(String.valueOf(value));
        }
    });

    decrementButton.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            value--;
            counterValueView.setText(String.valueOf(value));

        }
    });

    incrementButton.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            value++;
            counterValueView.setText(String.valueOf(value));
        }
    });

    setVisible(true);
    }


    public static void main(String[] args) {
    new CounterApp(0);
    }
}
