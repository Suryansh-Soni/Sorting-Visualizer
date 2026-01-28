class BubbleSortPanel extends SortPanel {

    public BubbleSortPanel(int[] data) {
        super(data, "Bubble Sort");
    }

    @Override
    public void run() {
        for (int i = 0; i < SIZE - 1; i++) {
            for (int j = 0; j < SIZE - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    repaint();
                    sleep();
                }
            }
        }
    }
}
