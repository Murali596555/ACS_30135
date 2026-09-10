import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) {
            return 0;
        }

        int[] frequency = new int[26];

        for (char task : tasks) {
            frequency[task - 'A']++;
        }

        Arrays.sort(frequency);

        int maxFrequency = frequency[25];
        int maxFrequencyTasks = 0;

        for (int freq : frequency) {
            if (freq == maxFrequency) {
                maxFrequencyTasks++;
            }
        }

        int intervals = (maxFrequency - 1) * (n + 1) + maxFrequencyTasks;

        return Math.max(tasks.length, intervals);
    }
}
