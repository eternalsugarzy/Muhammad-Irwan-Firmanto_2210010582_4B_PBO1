package UAS;

//inheritance
public class IdentitasDetail extends Identitas {
    //polymorhpsm (override)
    public IdentitasDetail(String nama, String noid) {
        super(nama, noid);
    }

    //seleksi
    public String getKodeProv (){
        String kodeProv = getNik().substring(0 , 2);
        if (kodeProv.equals("63")) {
            return "Provinsi Kalimantan Selatan";
        } else {
            return "Provinsi Lain";
        }
    }

    public String getKodeKab(){
        String kodeKab = getNik().substring(2, 4);
        switch (kodeKab) {
            case "01":
                return "Kabupaten Tanah Laut";
            case "02":
                return "Kabupaten Kotabaru";
            default:
                return "Kabupaten Banjar";
        }
    }

    public String getKodeKec(){
        String kodeKec = getNik().substring(4, 6);
        switch (kodeKec) {
            case "01": 
                return "Kecamatan Pelaihari";
            case "02":
                return "Kecamatan Jorong";
            default:
                return "Kecamatan Batulicin";
        }
    }

    public int getKodeTanggal(){
        return Integer.parseInt(getNik().substring(6, 12));
    }

    public String getKodeDesa(){
        String kodeDesa = getNik().substring((12));
        if (kodeDesa.equals("0002")) {
            return "Desa Jorong";
        } else {
            return "Desa Lain";
        }
    }

    //polymorphisme (override)
    @Override
    public String DisplayInfo(){
        return super.DisplayInfo()+
                    "\nKode Provinsi: "+getKodeProv()+
                    "\nKode Kabupaten: "+getKodeKab()+
                    "\nKode Kecamatan: "+getKodeKec()+
                    "\nTanggal Lahir: "+getKodeTanggal()+
                    "\nKode Desa: "+getKodeDesa();
    }
}
