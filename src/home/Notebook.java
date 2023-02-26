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

    void start_this_nb(){
        System.out.println("Запускается "+this.brand_nb+" на частоте "+this.cpu+" GHz, диск"+this.ssd+" Gb.");
    }

}  // public class Notebook
