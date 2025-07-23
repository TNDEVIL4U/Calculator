import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;
public class Calculator {
int appWidth = 360;
int appHeight = 540;
    String[] buttonValues = {
        "AC", "+/-", "%", "÷", 
        "7", "8", "9", "x", 
        "4", "5", "6", "-",
        "1", "2", "3", "+",
        "0", ".", "√", "="
    };
    String[] rightSymbols = {"÷", "x", "-", "+", "="};
    String[] topSymbols = {"AC", "+/-", "%"};
JFrame frame = new JFrame("CALCULATOR");
JPanel disPanel = new JPanel();
JLabel disLabel = new JLabel();
JPanel buttonPanel = new JPanel();
String A = "0";
String operator = null;
String B = null;
String str;
double s;
    public Calculator() {

        frame.setVisible(true);
        frame.setSize(appWidth,appHeight);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        disLabel.setBackground(Color.WHITE);
        disLabel.setForeground(Color.BLACK);
        disLabel.setText("0");
        disLabel.setFont(new Font("Arial",Font.PLAIN,80));
        disLabel.setHorizontalAlignment(JLabel.RIGHT);
        disLabel.setOpaque(true);

        disPanel.setLayout(new BorderLayout()); 
        disPanel.add(disLabel);

        frame.add(disPanel,BorderLayout.NORTH);

        buttonPanel.setLayout(new GridLayout(5,4));
        buttonPanel.setBackground(Color.WHITE);

        frame.add(buttonPanel);

        for(int i=0 ; i<buttonValues.length ; i++)
        {
            JButton button = new JButton();
            button.setFont(new Font("Arial",Font.PLAIN,30)); 
            button.setText(buttonValues[i]);
            buttonPanel.add(button);
            button.setFocusable(false);
            if(Arrays.asList(rightSymbols).contains(buttonValues[i]))
            {
                button.setBackground(Color.black);
                button.setForeground(Color.WHITE);
            }
            else if(Arrays.asList(topSymbols).contains(buttonValues[i]))
            {
                button.setBackground(Color.black);
                button.setForeground(Color.WHITE);
            }
            else{
                button.setBackground(Color.black);
                button.setForeground(Color.WHITE);
            }

            button.addActionListener(new ActionListener(){
        
                public void actionPerformed (ActionEvent e){

                    JButton buttonp = (JButton) e.getSource();
                    String buttonPressed = buttonp.getText();
                    if(Arrays.asList(rightSymbols).contains(buttonPressed))
                    {
                        if(buttonPressed == "=")
                                {
                                    if((disLabel.getText()).contains("√"))
                   
                                    {
                                      
                                      str = disLabel.getText();
                                      str = str.replace("√", "0");
                                      s = Double.parseDouble(str);
                                      s = Math.sqrt(s);
                                      
                                      clearZero(s);

                                    }

                                    if(A != "0")
                                    {
                                        double result = 0 ;
                                        B = disLabel.getText();
                                        double a = Double.parseDouble(A);
                                        double b = Double.parseDouble(B);
                                        
                                        switch (operator) {
                                            case "+":
                                                {result = a+b;
                                                clearZero(result);
                                                }
                                                break;
                                            case "-":
                                                {result = a-b;
                                                clearZero(result);
                                                }
                                                break;
                                            case "x":
                                                {result = a*b;
                                                clearZero(result);}
                                                break;
                                            case "÷":
                                                {result = a/b;
                                                clearZero(result);}
                                                break;
                                            
                                        }
                                    }
                                }
                        else if("+-÷x".contains(buttonPressed))  
                        {
                            if(operator == null)
                            {A = disLabel.getText();
                            disLabel.setText("0");
                            B = "0";
                            operator = buttonPressed;}
                        }      
                            
                        
                    
                    }
                    else if(Arrays.asList(topSymbols).contains(buttonPressed))
                    {
                        switch (buttonPressed) {
                            case "AC" :
                                clearall();
                                break;
                            case "+/-":
                               {double num = Double.parseDouble(disLabel.getText());
                                num*=-1;   
                                clearZero(num);
                                }
                                 break;

                            case "%" :
                                {double num = Double.parseDouble(disLabel.getText());
                                 disLabel.setText(String.valueOf(num/100));
                                }

                        }
                    }
                    else {
                        if(buttonPressed == ".")
                        {
                            if(!disLabel.getText().contains("."))
                            {
                                disLabel.setText(disLabel.getText()+buttonPressed);
                            }
                        }
                        else if("0123456789".contains(buttonPressed))
                        {
                            if(disLabel.getText() == "0")
                            {
                                disLabel.setText(buttonPressed);
                            }
                            else
                            {
                                disLabel.setText(disLabel.getText()+buttonPressed);
                            }
                        }
                        else if(buttonPressed=="√"){

                            disLabel.setText(buttonPressed);
                        }
                    }
                }
        });
        }
}
public void clearZero(double num)
{
    if(num%1==0)
    {
       int numi = (int)num;
       disLabel.setText(String.valueOf(numi));
    }   
    else
    {
       disLabel.setText(String.valueOf(num));
    }
}
public void clearall()
                {
                    disLabel.setText("0");
                    A = "0";
                    B = null;
                    operator = null;
                }
            
}
