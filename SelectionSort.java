public class SelectionSort {
    public static void main(String[] args) {

        double [] revenue = {150.00, 200.00, 154.98, 335.01, 475.12, 555.87, 216.38};
        selectionMax(revenue);

    }

    public static void selectionMax(double revenue[]) {
        double len = revenue.length;

        for (int i = 0; i < len - 1; i++) {

            int max_index = i;

            for (int j = i + 1; j < len; j++)
                if (revenue[max_index] < revenue[j])
                    max_index = j;

            double temp = revenue[max_index];
            revenue[max_index] = revenue[i];
            revenue[i] = temp;

        }
        System.out.println("The largest value is £" + revenue[0]);
    }
}
