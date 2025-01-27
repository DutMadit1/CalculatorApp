import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
        JFrame frame = new JFrame("Calculator");
        JLabel label = new JLabel();
        JTextField textField = new JTextField();
        JRadioButton OnButton = new JRadioButton("On");
        JRadioButton OffButton = new JRadioButton("Off");
        JButton buttonZero = new JButton("0");
        JButton buttonOne = new JButton("1");
        JButton buttonTwo = new JButton("2");
        JButton buttonThree = new JButton("3");
        JButton buttonFour = new JButton("4");
        JButton buttonFive = new JButton("5");
        JButton buttonSix = new JButton("6");
        JButton buttonSeven = new JButton("7");
        JButton buttonEight = new JButton("8");
        JButton buttonNine = new JButton("9");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonDivide = new JButton("/");
        JButton buttonMul = new JButton("X");
        JButton buttonClear = new JButton("AC");
        JButton buttonEqual = new JButton("=");
        JButton buttonSquare = new JButton("x²");
        JButton buttonSqrt = new JButton("√");
        JButton buttonReciprocal = new JButton("1/x");
        JButton buttonPoint = new JButton(".");
        JButton buttonDelete = new JButton("DEL");

        double num1 = 0;
        double num2 = 0;
        double result = 0;
        int calculations = 0;

        public Calculator() {

            this.prepareGui();
            this.addComponents();
            this.addActionListeners();
        }

        public void prepareGui() {
            this.frame.setSize(300, 510);
            this.frame.getContentPane().setLayout(null);
            this.frame.getContentPane().setBackground(Color.BLACK);
            this.frame.setLocationRelativeTo(null);
            //this.frame.pack();
            this.frame.setVisible(true);
            this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void addComponents() {
            //setting the properties of the label and adding it to the frame
            label.setBounds(250, 0, 50, 50);
            label.setForeground(Color.LIGHT_GRAY);
            frame.add(label);

            //setting the properties of the text field and adding it to the frame
            textField.setBounds(10, 40, 270, 40);
            textField.setEditable(false);
            textField.setFont(new Font("Arial", Font.BOLD, 20));
            textField.setHorizontalAlignment(SwingConstants.RIGHT);
            frame.add(textField);

            //setting the properties of the Onbutton and adding it to the frame
            OnButton.setBounds(10, 95,60,40);
            OnButton.setSelected(true);
            OnButton.setFont(new Font("Arial", Font.BOLD, 14));
            OnButton.setBackground(Color.BLACK);
            OnButton.setForeground(Color.WHITE);
            OnButton.setFocusable(false);
            frame.add(OnButton);

            //Setting the properties of the Offbutton and adding it to the frame
            OffButton.setBounds(10, 120,60,40);
            OffButton.setSelected(false);
            OffButton.setFont(new Font("Arial", Font.BOLD, 14));
            OffButton.setBackground(Color.BLACK);
            OffButton.setForeground(Color.WHITE);
            OffButton.setFocusable(false);
            frame.add(OffButton);

            //Grouping the on and off button together
            ButtonGroup onOffGroup = new ButtonGroup();
            onOffGroup.add(OnButton);
            onOffGroup.add(OffButton);

            //setting the properties of buttonSeven and adding it to the frame
            buttonSeven.setBounds(10,230,60,40);
            buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonSeven);

            //setting the properties of buttonEight and adding it to the frame
            buttonEight.setBounds(80,230,60,40);
            buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonEight);

            //setting the properties of buttonNine and adding it to the frame
            buttonNine.setBounds(150,230,60,40);
            buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonNine);

            //setting the properties of buttonFour and adding it to the frame
            buttonFour.setBounds(10,290,60,40);
            buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonFour);

            //setting the properties of buttonFive and adding it to the frame
            buttonFive.setBounds(80,290,60,40);
            buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonFive);

            //setting the properties of buttonSix and adding it to the frame
            buttonSix.setBounds(150,290,60,40);
            buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonSix);

            //setting the properties of buttonOne and adding it to the frame
            buttonOne.setBounds(10,350,60,40);
            buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonOne);

            //setting the properties of buttonTwo and adding it to the frame
            buttonTwo.setBounds(80,350,60,40);
            buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonTwo);

            //setting the properties of buttonThree and adding it to the frame
            buttonThree.setBounds(150,350,60,40);
            buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonThree);

            //setting the properties of buttonPoint and adding it to the frame
            buttonPoint.setBounds(150,410,60,40);
            buttonPoint.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonPoint);

            //setting the properties of buttonZero and adding it to the frame
            buttonZero.setBounds(10,410,130,40);
            buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonZero);

            //setting the properties of Equal Button and adding it to the frame
            buttonEqual.setBounds(220,350,60,100);
            buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
            buttonEqual.setBackground(new Color(139, 88,2));
            frame.add(buttonEqual);

            //setting the properties of Divide Button and adding it to the frame
            buttonDivide.setBounds(220,110,60,40);
            buttonDivide.setFont(new Font("Arial", Font.BOLD, 20));
            buttonDivide.setBackground(new Color(139, 88,2));
            frame.add(buttonDivide);

            //setting the properties of Square root Button and adding it to the frame
            buttonSqrt.setBounds(10,170,60,40);
            buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
            frame.add(buttonSqrt);

            //setting the properties of the Reciprocation button and adding it to the frame
            buttonReciprocal.setBounds(150,170,60,40);
            buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 14));
            frame.add(buttonReciprocal);

            //setting the properties of the Addition button and adding it to the frame
            buttonPlus.setBounds(220,290,60,40);
            buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
            buttonPlus.setBackground(new Color(139, 88,2));
            frame.add(buttonPlus);


            //setting the properties of Multiply Button and adding it to the frame
            buttonMul.setBounds(220,230,60,40);
            buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
            buttonMul.setBackground(new Color(139, 88,2));
            frame.add(buttonMul);

            //setting the properties of the Subtract button and adding it to the frame
            buttonMinus.setBounds(220,170,60,40);
            buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
            buttonMinus.setBackground(new Color(139, 88,2));
            frame.add(buttonMinus);

            //setting the properties of the Square button and adding it to the frame
            buttonSquare.setBounds(80,170,60,40);
            buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
            buttonSquare.setBackground(new Color(139, 88,2));
            frame.add(buttonSquare);

            //setting the properties of the Addition button and adding it to the frame
            buttonClear.setBounds(80,110,60,40);
            buttonClear.setFont(new Font("Arial", Font.BOLD, 20));
            buttonClear.setFocusable(true);
            frame.add(buttonClear);

            //setting the properties of the Delete button and adding it to the frame
            buttonDelete.setBounds(150,110,60,40);
            buttonDelete.setFont(new Font("Arial", Font.BOLD, 20));
            buttonDelete.setFocusable(false);
            frame.add(buttonDelete);

            /* There is an issue with the Delete button, the problem is:
            I am yet to figure out why it is invisible, yet I have added the same properties as the rest of the
            buttons

            --finally figured out that the x and y coordinates of the two buttons, delete and the dot button were
            the same. so they were stacked on top of each other
             */

        }

        public void addActionListeners(){
            OnButton.addActionListener(this);
            OffButton.addActionListener(this);
            buttonDelete.addActionListener(this);
            buttonClear.addActionListener(this);
            buttonReciprocal.addActionListener(this);
            buttonPlus.addActionListener(this);
            buttonMul.addActionListener(this);
            buttonMinus.addActionListener(this);
            buttonDivide.addActionListener(this);
            buttonEqual.addActionListener(this);
            buttonSqrt.addActionListener(this);
            buttonPoint.addActionListener(this);
            buttonOne.addActionListener(this);
            buttonTwo.addActionListener(this);
            buttonThree.addActionListener(this);
            buttonFour.addActionListener(this);
            buttonFive.addActionListener(this);
            buttonSix.addActionListener(this);
            buttonSeven.addActionListener(this);
            buttonEight.addActionListener(this);
            buttonNine.addActionListener(this);
            buttonZero.addActionListener(this);
            buttonSquare.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();
            /*We are forced to else an else-if ladder here due to
            the fact that switch statement in java only support primitive data types,
            strings and enums
             */
            if(source == OnButton){
                powerOn();
            } else if (source == OffButton) {
                powerOff();
            } else if (source == buttonClear) {
                //if the user clicks clear button, the text field and the label
                //will both be set to empty strings
                textField.setText("");
                label.setText("");
            } else if (source == buttonDelete) {
                //positional variables that will help in deleting the last digit
                int length = textField.getText().length();
                int number = length - 1;
                if(number > 0){  //if the text field is not empty
                    //Create a new string with the digits in the text field. necessary because
                    //textField.getText() returns a String literal(immutable)
                    StringBuilder delete = new StringBuilder(textField.getText());
                    //delete the digit at the last index
                    delete.deleteCharAt(number);
                    //convert the remaining digits to a string literal
                    //and set it as the content of the text field
                    textField.setText(delete.toString());
                }if (length == 1){
                    textField.setText("");
                }
            } else if (source == buttonZero) {
                if (textField.getText().equals("0")){
                    return;
                }else {
                    textField.setText(textField.getText()+ "0");
                }

            } else if (source == buttonTwo) {
                textField.setText(textField.getText()+"2");
            } else if (source == buttonThree) {
                textField.setText(textField.getText()+"3");
            } else if (source == buttonFour) {
                textField.setText(textField.getText()+"4");
            } else if (source == buttonFive) {
                textField.setText(textField.getText()+"5");
            } else if (source == buttonSix) {
                textField.setText(textField.getText()+"6");
            } else if (source == buttonSeven) {
                textField.setText(textField.getText()+"7");
            } else if (source == buttonEight) {
                textField.setText(textField.getText()+"8");
            } else if (source == buttonNine) {
                textField.setText(textField.getText()+"9");
            } else if (source == buttonPoint) {
                if(textField.getText().contains(".")){
                    return;
                }else {
                    textField.setText(textField.getText() + ".");
                }
            } else if (source == buttonPlus) {
                String Str = textField.getText();
                num1 = Double.parseDouble(textField.getText());
                calculations = 1;
                textField.setText("");
                label.setText(Str +" +");
            } else if (source == buttonMinus) {
                String Str = textField.getText();
                num1 = Double.parseDouble(textField.getText());
                calculations = 2;
                textField.setText("");
                label.setText(Str +" -"); 
            } else if (source == buttonMul) {
                String Str = textField.getText();
                num1 = Double.parseDouble(textField.getText());
                calculations = 3;
                textField.setText("");
                label.setText(Str +" X");
            } else if (source == buttonDivide) {
                String Str = textField.getText();
                num1 = Double.parseDouble(textField.getText());
                calculations = 4;
                textField.setText("");
                label.setText(Str + " /");
            } else if (source == buttonSquare) {
                num1 = Double.parseDouble(textField.getText());
                double square = Math.pow(num1, 2);
                String str = Double.toString(square);
                if(str.endsWith(".0")){
                    textField.setText(str.replace(".0", ""));
                }else{
                    textField.setText(str);
                }
            }else if (source == buttonOne) {
                textField.setText(textField.getText()+"1");
            } else if (source == buttonSqrt) {
                num1 = Double.parseDouble(textField.getText());
                double sqrt = Math.sqrt(num1);
                if (Double.toString(sqrt).endsWith(".0")){
                    textField.setText(Double.toString(sqrt).replace(".0", ""));
                }else{
                    textField.setText(Double.toString(sqrt));
                }
            } else if (source == buttonReciprocal) {
                num1 = Double.parseDouble(textField.getText());
                double rec = 1/num1;
                String str = Double.toString(rec);
                if(str.endsWith(".0")){
                    textField.setText(str.replace(".0",""));
                }else {
                    textField.setText(str);
                }
            } else if (source == buttonEqual) {
                num2 = Double.parseDouble(textField.getText());
                //Switching operation depending on the operator clicked
                switch (calculations){
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        result = num1/num2;
                        break;
                }if (Double.toString(result).endsWith(".0")){
                    textField.setText(Double.toString(result).replace(".0", ""));
                }else {
                    textField.setText(Double.toString(result));
                }
                //Storing the value of the previous calculation in the variable num1 to avoid errors
                //And clearing the text in the label
                label.setText("");
                num1 = result;
            }
        }

        public void powerOn(){
            //the enable method enables all the elements except the onButton
            OnButton.setEnabled(false);
            OffButton.setEnabled(true);
            buttonSqrt.setEnabled(true);
            buttonSquare.setEnabled(true);
            buttonReciprocal.setEnabled(true);
            buttonPlus.setEnabled(true);
            buttonDivide.setEnabled(true);
            buttonMinus.setEnabled(true);
            buttonMul.setEnabled(true);
            buttonEqual.setEnabled(true);
            buttonPoint.setEnabled(true);
            buttonOne.setEnabled(true);
            buttonTwo.setEnabled(true);
            buttonThree.setEnabled(true);
            buttonFour.setEnabled(true);
            buttonFive.setEnabled(true);
            buttonSix.setEnabled(true);
            buttonSeven.setEnabled(true);
            buttonEight.setEnabled(true);
            buttonNine.setEnabled(true);
            buttonZero.setEnabled(true);
            buttonDelete.setEnabled(true);
            buttonClear.setEnabled(true);
        }

        public void powerOff(){
            OnButton.setEnabled(true);
            label.setText("");
            textField.setText("");
            OffButton.setEnabled(false);
            buttonSqrt.setEnabled(false);
            buttonSquare.setEnabled(false);
            buttonReciprocal.setEnabled(false);
            buttonPlus.setEnabled(false);
            buttonDivide.setEnabled(false);
            buttonMinus.setEnabled(false);
            buttonMul.setEnabled(false);
            buttonEqual.setEnabled(false);
            buttonPoint.setEnabled(false);
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            buttonSeven.setEnabled(false);
            buttonEight.setEnabled(false);
            buttonNine.setEnabled(false);
            buttonZero.setEnabled(false);
            buttonDelete.setEnabled(false);
            buttonClear.setEnabled(false);
        }
        public static void main(String[] args) {
            Calculator cal = new Calculator();
        }
    }


