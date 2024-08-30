package NeetCode150_ProblemSolving;

import java.util.*;

public class CarFleet0853 {
    public int carFleet(int target, int[] position, int[] speed) {
        int numCarFleets = 0;
        final int MAX_LENGTH = position.length;
        double[][] info = new double[MAX_LENGTH][2];
        for (int i = 0; i < MAX_LENGTH; i++) {
            info[i][0] = position[i];
            info[i][1] = speed[i];
        }
        Arrays.sort(info, (a, b) -> Double.compare(b[0], a[0]));

        double[] fleets = new double[MAX_LENGTH];
        for (int j = 0; j < MAX_LENGTH; j++) {
            fleets[j] = (target - info[j][0]) / info[j][1];
            if (j >= 1 && fleets[j] <= fleets[j - 1]) {
                fleets[j] = fleets[j - 1];
            } else {
                numCarFleets++;
            }
        }
        return numCarFleets;
    }

    public static void main(String[] args) {
    }
}
