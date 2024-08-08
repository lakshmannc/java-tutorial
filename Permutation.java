import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        permutation(list, 0, list.size() - 1);
    }

    /**
     * Generates all permutations of the list.
     *
     * @param list the list of integers
     * @param l    the starting index
     * @param r    the ending index
     */
    private static void permutation(List<Integer> list, int l, int r) {
        if (l == r)
            System.out.println(list);
        else {
            for (int i = l; i <= r; i++) {
                swap(list, l, i);
                permutation(list, l + 1, r);
                swap(list, l, i);
            }
        }
    }

    /**
     * Swaps two elements in the list.
     *
     * @param list the list of integers
     * @param i    the index of the first element
     * @param j    the index of the second element
     */
    public static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}