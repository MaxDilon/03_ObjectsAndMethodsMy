public class Arithmetic {

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(2, 5);
        arithmetic.additional();
        arithmetic.subtraction();
        arithmetic.multiplication();
        arithmetic.division();
        arithmetic.averageValue();
        arithmetic.maxValue();
        arithmetic.minValue();
    }

    private double a; // Переменные создал double, поскольку ввёл дополнительный метод "деление".
    private double b; // Всё остальное в соответствии с заданием.

    public Arithmetic(double a, double b){
        this.a = a;
        this.b = b;
    }

    public void additional() {      // " Сумма чисел "
        double add = a + b;
        System.out.println(add);
    }

    public void subtraction() {     // " Разность чисел "
        double sub = a - b;
        System.out.println(sub);
    }

    public void multiplication() {  // " Произведение чисел "
        double mul = a * b;
        System.out.println(mul);
    }

    public void division() {        // " Деление чисел "
        double div = a / b;
        System.out.println(div);
    }

    public void averageValue() {    // " Среднее значение "
        double ave = (a + b) / 2;
        System.out.println(ave);
    }

    public void maxValue() {        // " Максимальное значение "

        if (a > b) {
            double max = a;
            System.out.println(max);
        }

        else {
            double max = b;
            System.out.println(max);
        }
    }

    public void minValue() {        // " Минимальное значение "

        if (a > b) {
            double min = b;
            System.out.println(min);
        }

        else {
            double min = a;
            System.out.println(min);
        }
    }
}
