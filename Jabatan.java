public class Jabatan {
    protected String jenis,deskripsi;
    protected int gaji,lemburan;

    public Jabatan(String jenis,int gaji, String deskripsi,int lemburan){
        this.jenis=jenis;
        this.gaji=gaji;
        this.deskripsi=deskripsi;
        this.lemburan=lemburan;
    }

    public Jabatan() {}

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getLemburan() {
        return lemburan;
    }

    public void setLemburan(int lemburan) {
        this.lemburan = lemburan;
    }
}
