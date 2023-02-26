package home;

public class Main {
    public static void main(String[] args) {
        Smartphone andrei = new Smartphone();

        andrei.brand_sm = "HTC";
        andrei.RAM = 8;
        andrei.memory = 128;
        System.out.println(andrei.brand_sm);
        andrei.start_sm();
        }

}  // public class Main
