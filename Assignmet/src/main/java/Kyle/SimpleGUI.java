package Kyle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame implements ActionListener {

    //Declare Panels
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();

    //TextField
    private JTextField txt1 = new JTextField(5);

    //Radio Buttons
    private JRadioButton rdbtn1 = new JRadioButton("Green");
    private JRadioButton rdbtn2 = new JRadioButton("Yellow");

    /**group for radio buttons*/
    private ButtonGroup group = new ButtonGroup();

    //Labels for users
    private JLabel lable1 = new JLabel("Radio Button");
    private JLabel lable2 = new JLabel("TextField");
    private JLabel lable3 = new JLabel("ComboBox");

    //Buttons
    private JButton btn1 = new JButton("Red");
    private JButton btn2 = new JButton("Blue");
    private JButton readbtn = new JButton("Default");
    private JButton exitbtn = new JButton("Exit");

    //ComboBox for dropdowns
    private JComboBox combox = new JComboBox();

    //TextArea for user input
    private JTextArea txtarea = new JTextArea(70,40);

    public SimpleGUI() {

        super("Fun with colours");//Title of window bar
        setLayout(new BorderLayout());

        //Set panel layout
        panel1.setLayout(new GridLayout(7,2));
        panel2.setLayout(new GridLayout(1,2));
        panel3.setLayout(new GridLayout(1,4,10,50));

        //Add items to panel 1
        panel1.add(lable1);
        panel1.add(rdbtn1);
        panel1.add(rdbtn2);
        panel1.add(lable2);
        panel1.add(txt1);
        panel1.add(lable3);
        panel1.add(combox);

        //Add items to panel 2
        panel2.add(txtarea);

        //Add items to panel 3
        panel3.add(btn1);
        panel3.add(btn2);
        panel3.add(readbtn);
        panel3.add(exitbtn);

        //Group radio buttons
        group.add(rdbtn1);
        group.add(rdbtn2);

        //ComboBox
        combox.addItem("option 1");
        combox.addItem("option 2");
        combox.addItem("option 3");

        //Implemet actionListener
        rdbtn1.addActionListener(this);
        rdbtn2.addActionListener(this);
        txt1.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        readbtn.addActionListener(this);
        exitbtn.addActionListener(this);

        //Add panels to frame
        add(panel1,BorderLayout.WEST);
        add(panel2,BorderLayout.EAST);
        add(panel3,BorderLayout.SOUTH);
    }//end constructor

    public void actionPerformed(ActionEvent event){

        //Append textField to textArea
        if(event.getSource()==txt1){
            txtarea.append("\n"+txt1.getText());
        }

        //Change background colour
        if(event.getSource()==btn1){
            txtarea.append("\nYou changed the backgroud red by clicking the red button");
            txtarea.setBackground(Color.RED);
        }
        else if(event.getSource()==btn2){
            txtarea.append("\nYou changed the backgroud blue by clicking the blue button");
            txtarea.setBackground(Color.BLUE);
        }
        else if(event.getSource()==rdbtn1){
            txtarea.append("\nYou changed the backgroud green by clicking the green radio button");
            txtarea.setBackground(Color.GREEN);
        }
        else if(event.getSource()==rdbtn2){
            txtarea.append("\nYou changed the backgroud yellow by clicking the yellow radio button");
            txtarea.setBackground(Color.YELLOW);
        }
        else if(event.getSource()==readbtn){
            txtarea.setBackground(Color.WHITE);
        }
        else if(event.getSource()==exitbtn){
            int y = JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?","Exit?",JOptionPane.YES_NO_OPTION);
            if(y == JOptionPane.YES_OPTION){
                this.dispose();//close window
            }
        }


    }//end action event method
}

