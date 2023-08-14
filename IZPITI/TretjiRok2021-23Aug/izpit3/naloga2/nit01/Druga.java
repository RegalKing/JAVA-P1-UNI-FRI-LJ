
import java.util.*;

public class Druga {

    public static int steviloShranjenih(int[] h, int[] w, int[] a, int[] b) {
        // popravite / dopolnite ...
	int index = Integer.MIN_VALUE;
	int count = 0;
	for (int j=0; j<h.length; j++) {
		for (int i=0; i<w.length; i++) {
			for (int k=0; k<a.length; k++) {
				if (a[k] == 0) {
					continue;
				}
				if ((a[k] <= w[i] && b[k] <= h[j]) || (a[k] <= h[j] && b[k] <= w[i])) {
					if (index == Integer.MIN_VALUE || (a[k] * b[k] > a[index] * b[index])) {
						index = k;
					}
				}
			}
			if (index != Integer.MIN_VALUE) {
				a[index] = 0;
				b[index] = 0;
				count++;
				index = Integer.MIN_VALUE;
			}
			else {
				return count;
			}
		}
	}
        return count;
    }
}
