import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MultiSortVisualizer {

    public static void main(String[] args) {

        int SIZE = 150;
        int[] data = new int[SIZE];
        for (int i = 0; i < SIZE; i++) data[i] = i + 1;

        // Shuffle once
        Random rand = new Random();
        for (int i = SIZE - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

        JFrame frame = new JFrame("Sorting Algorithms Visualized");
        frame.setLayout(new GridLayout(1, 2));

        frame.add(new BubbleSortPanel(data));
        frame.add(new SelectionSortPanel(data));

        frame.setSize(1000, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
