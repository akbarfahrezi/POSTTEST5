package posttest5;
public class filter extends Tembakau {
    private String status = "filter";
    int gram;

    public filter(String nama, String rasa, float harga,  int gram) {
        super(nama, rasa, harga);
        this.gram = gram;
    }

    public String getstatus() {
        return status;
    }
    
    public void setstatus(String status) {
        this.status = status;
    }

    public int setGram() {
        return gram;
    }
    
    public int getGram() {
        return gram;
    }
    
    @Override
    public void Tampil(){
        System.out.println("Tembakau " + asal);
        System.out.println("Nama Tembakau : " + getNama() );
        System.out.println("Rasa Tembakau  : " + getRasa() );
        System.out.println("Harga Tembakau  : " + getHarga() );
        System.out.println("Berat /gram : " + gram);
    }
  }
