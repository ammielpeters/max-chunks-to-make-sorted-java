import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) list.add(sc.nextInt());

        if (list.size() == 0) return;

        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = list.get(i);

        int maxSoFar = -1;
        int start = 0;

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);
            if (maxSoFar == i) {
                for (int j = start; j <= i; j++) {
                    out.append(arr[j]).append(" ");
                }
                out.append("\n");
                start = i + 1;
            }
        }

        System.out.print(out.toString());
    }
}
