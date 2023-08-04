import javax.swing.*;
import java.awt.*;
class Grid extends JPanel {
    private int rows = 10;
    private  int cols = 10;
    private Cell[][] cells;

    public Grid() {
        setPreferredSize(new Dimension(720, 720));
        cells = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell();
            }
        }
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j].paint(g, i * 70, j * 70);
            }
        }
    }
}