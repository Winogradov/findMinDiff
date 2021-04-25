public class findMinDiff {
    public static void main(String[] args) {
        int arr[] = new int[]{30,5,20,9};

        System.out.println("Minimum difference is " +

                findMinDiff(arr, arr.length));
    }
    static int findMinDiff(int[] arr, int n) {
        // Инициализируем разницу как бесконечную
        int diff = Integer.MAX_VALUE;
        // Находим минимальную разницу, сравнивая разницу
        // всех возможных пар в данном массиве
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));
        // Возвращаем min diff
        return diff;
    }
}
