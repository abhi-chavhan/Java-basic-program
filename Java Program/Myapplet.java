import java.applet.*;
import java.awt.*;

// public class Myapplet extends Applet {
//     Button b1 = new Button("Submit");
//     Button b2 = new Button("Reset");

//     public void init()
//     {
//         add(b1);
//         add(b2);
//     }

//     private void add(Button b12) {
//     }

// }

public class Myapplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello Java", 11,110);
    }
}

