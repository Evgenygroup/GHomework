public class MainFlora {
    public static void main(String[] args) {
        Plant t1 = new Tree("Birch", 10, 1);
        Plant t2 = new Tree("Oak", 20, 1);
        Plant f1 = new Flower("Sun Flower", 0, 1);
        Plant f2 = new Flower("Orchid", 0, 2);

        Plant[] plants = {t1, t2, f1, f2};
        int yearsToGrow = 2;
        for (int i = 0; i < yearsToGrow; i++) {
            for (Plant k : plants) {
                k.doYear();
                System.out.println("_____________________");

            }
        }
    }
}
