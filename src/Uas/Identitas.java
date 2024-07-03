package UAS;
//class
public class Identitas {
    //atribut dan encapsulation
    private String nama;
    private String nik;

    //constructor
    public Identitas(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    //getter
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    //setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    //polymorphisme (overloading)
    public String DisplayInfo(){
        return "Nama: "+getNama()+"\nNIK: "+getNik();
    }

    public String DisplayInfo( String Asal){
        return DisplayInfo()+"\nAsal: "+Asal;
    }

    
    

    

    

}
