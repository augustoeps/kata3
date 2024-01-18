package software.ulpgc.kata3.swing;

import software.ulpgc.kata3.Histogram;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram(4, 3, 2, 1, 6, 8, 4, 2, 1, 4, 5, 7, 9, 9, 6, 8, 9);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);

    }
}
