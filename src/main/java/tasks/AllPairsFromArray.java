package tasks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AllPairsFromArray {
    static final Logger LOGGER = LogManager.getLogger(AllPairsFromArray.class);

    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 4, 6, 5, 25};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                LOGGER.info("[" + arr[i] + "," + arr[j] + "]");
            }
        }
    }
}
