package plus.jdk.cli.weight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressBarTest {

    @Test
    public void testProgressBar() {
        int total = 512;
        ProgressBar progressBar = new ProgressBar(total, 40, "Processing");
        for (int i = 0; i <= total; i++) {
            progressBar.update(i, "Processing", String.format("%s/%s", i, total));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}