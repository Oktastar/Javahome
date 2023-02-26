package home;

public class Notebook {
    String brand_nb;
    float cpu;
    int ssd;


    public Notebook(String brand_nb, float cpu, int ssd) {
        this.brand_nb = brand_nb;
        this.cpu = cpu;
        this.ssd = ssd;
    }

    public String getBrand_nb() {
        return brand_nb;
    }

    public float getCpu() {
        return cpu;
    }

    public int getSsd() {
        return ssd;
    }

    void start_this_nb(){
        System.out.println("Запускается "+this.brand_nb+" на частоте "+this.cpu+" GHz, диск"+this.ssd+" Gb.");
    }

    void start_get_nb(){
        System.out.println("Запускается "+ getBrand_nb()+" на частоте "+getCpu()+" GHz, диск"+getSsd()+" Gb.");
    }

}  // public class Notebook
