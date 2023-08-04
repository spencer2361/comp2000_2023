import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
        System.out.println("Red vs. Blue");
    }


private Main(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Grid grid = new Grid();
    this.setContentPane(grid);
    this.pack();
    this.setVisible( true);
}





public class Cell {

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


}

