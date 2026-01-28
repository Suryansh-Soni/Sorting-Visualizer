class SelectionSortPanel extends SortPanel {

    public SelectionSortPanel(int[] data) {
        super(data, "Selection Sort");
    }

    @Override
    public void run() {
        for (int i = 0; i < SIZE - 1; i++) {
            int min = i;
            for (int j = i + 1; j < SIZE; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            repaint();
            sleep();
        }
    }
}
