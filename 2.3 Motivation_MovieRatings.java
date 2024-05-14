/*
chef has been searching for a good motivational movie that he can watch during his exam time.
His hard disk has X GB of space remaining. 
His friend has N movies represented with (𝑆𝑖,𝑅𝑖) representing (space required, IMDB rating). 
Help Chef choose the single best movie (highest IMDB rating) that can fit in his hard disk.
*/
import java.util.*;

class CodeChef {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();

        while (t-- > 0) {
            int n = m.nextInt();
            int x = m.nextInt();

            int[] s = new int[n];
            int[] r = new int[n];

            int high_rateings = -1;

            for (int i = 0; i < n; i++) {
                s[i] = m.nextInt();
                r[i] = m.nextInt();

                if (s[i] <= x && r[i] > high_rateings) {
                    high_rateings = r[i];
                }
            }
            System.out.println(high_rateings);
        }
    }
}
