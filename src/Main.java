public class Main {
    public static void main(String[] args) {
        long[] sales = {10, 99, 4, 34, 28, 67, 89};

        SalesManager salesManager = new SalesManager(sales);

        System.out.println("Максимально продано раз: " + salesManager.max());
        System.out.println("Среднее значение: " + salesManager.getMiddleValueIgnoreHighestAndLowest());
    }
}
