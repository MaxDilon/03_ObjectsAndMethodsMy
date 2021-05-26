public class Printer {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("Анекдот","Анекдот про Васю", 5);
        printer.append("Анекдот","Анекдот про Петю", 2);
        printer.append("Анекдот","Анекдот про Федю", 3);
        System.out.println("\n" + "Количество страниц на печать: " + printer.getPagesCount() + " шт.");
        System.out.println("Количество документов на печать: " + printer.getDocumentsCount() + " шт.");
        printer.print();
        printer.append("Сказка","Сказка про Царя Гвидона");
        printer.append("Сказка", "Сказ про Илью Муромца", 8);
        printer.append("Монолог");
        System.out.println("\n" + "Количество страниц на печать: " + printer.getPagesCount() + " шт.");
        System.out.println("Количество документов на печать: " + printer.getDocumentsCount() + " шт.");
        printer.print();
        System.out.println("\n" + "Всего распечатанных документов: " + printer.getPrintDocumentsCount()+ " шт.");
    }

    private String queue = "";
    private int pagesCount = 0;
    private int documentsCount = 0;
    private int printDocumentsCount = 0;

    public void append(String text, String name, int pagesCount){
        queue = queue + "\n" + text + " (" + name + ") - " + pagesCount + " стр.";
        this.pagesCount = this.pagesCount + pagesCount;
        this.documentsCount = this.documentsCount + 1;
        //this.printDocumentsCount = this.printDocumentsCount + 1;
        // Сначала добавил счетчик распечатанных документов в этот метод, потом понял,
        // что он будет работать также, как и счетчик документов на печать.
    }

    public void append(String text){
        append(text, "без названия", 0);
    }

    public void append(String text, String name){
        append(text, name, 0);
    }

    public void clear(){
        queue = "";
        pagesCount = 0;
        documentsCount = 0;
    }

    public void print(){
        this.printDocumentsCount = this.printDocumentsCount + 1;
        // Нам нужен счетчик распечатанных документов, поэтому перенес формулу в метод print.
        // Но немного поигравшись я обнаружил, что консоль выдаёт мне не количество распечатанных документов,
        // а количество вызванных методов print... Надеюсь на вашу небольшую подсказку...
        System.out.println(queue);
        clear();
    }

    public int getPagesCount(){
        return pagesCount;
    }

    public int getDocumentsCount(){
        return documentsCount;
    }

    public int getPrintDocumentsCount() {
        return printDocumentsCount;
    }
}
