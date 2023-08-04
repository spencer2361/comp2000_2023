import javax.swing.JFrame;
import java.awt.*;

public class Cell extends JFrame {

    private Color color;
 

   // the teacher said that if we keep track of the x, y's, set them as a something.
    public Cell() {
        color = Color.WHITE;
    }
    public void paint(Graphics g, int x, int y) {
           // Find a different way to do this, 
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 70, 70);
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 70, 70);
    }
    public void setColor(Color color) {
        this.color = color;
    }
}