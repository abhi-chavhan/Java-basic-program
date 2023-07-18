// import javax.swing.JButton;
// //import java.awt.*;
// //import java.applet.*;

// public class Button {
//     JButton b1;
//     public static void main(String[] args) {
        
//     }
//     /**
//      * @param string
//      * 
//      */
//     public Button(String string)
//     {
//         b1=new JButton("Submit");
//         setLayout(null);
//         setSize(500,500);
//         setVisible(true);
//     }
//     private void setVisible(boolean b) {
//     }
//     private void setLayout(Object object) {
//     }
//     private void setSize(int i, int j) {
//     }
// }

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Clicked");
        JButton button = new Button("Click me");
        button.setBound(100, 20, 100, 40);

        button.addActionListener(new ActionListner() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(:Button Clicked);
            }
        });

        frame.getContentPane().add(button);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}