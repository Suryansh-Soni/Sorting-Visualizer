import javax.swing.*;
import java.awt.*;

abstract class SortPanel extends JPanel implements Runnable {

    protected int[] arr;
    protected final int SIZE = 150;
    protected final int BAR_WIDTH = 3;
    protected String title;

    public SortPanel(int[] data, String title) {
        this.arr = data.clone(); // important: separate copy
        this.title = title;
        setBackground(Color.BLACK);
        new Thread(this).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        for (int i = 0; i < SIZE; i++) {
            int x = i * BAR_WIDTH;
            int h = arr[i];
            g.drawLine(x, SIZE, x, SIZE - h);
        }

        g.setColor(Color.GREEN);
        g.drawString(title, 10, 15);
    }

    protected void sleep() {
        try { Thread.sleep(5); } catch (InterruptedException ignored) {}
    }
}
