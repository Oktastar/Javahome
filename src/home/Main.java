package home;

public class Main {
    public static void main(String[] args) {
        Notebook andrei = new Notebook("Acer", 1.0F, 512);
        Notebook galina = new Notebook("Asus", 3.0F, 256);

        System.out.println(andrei.ssd);
        System.out.println(galina.brand_nb);
        andrei.start_this_nb();
        }

}  // public class Main
