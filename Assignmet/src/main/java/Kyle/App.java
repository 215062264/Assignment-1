package Kyle;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SimpleGUI gui = new SimpleGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close window
        gui.setSize(550,300);//Dimensions of window
        gui.setVisible(true);//Make window visible

    }
}
