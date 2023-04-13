public class belumSpk extends Mobil {
    private String status = "Belum Spk";
    private String notrady;
    private String Kondisi;

    public belumSpk(String nama, int tahun, int harga, String notrady, String Kondisi) {
        super(nama, tahun, harga);
        this.notrady = notrady;
        this.Kondisi = Kondisi;
    }

    public String getstatuS() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public String getnotrady() {
        return notrady;
    }

    public void setnotrady(String notrady) {
        this.notrady = notrady;
    }

    public String Kondisi() {
        return Kondisi;
    }

    public void setKondisi(String Kondisi) {
        this.Kondisi = Kondisi;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Kendala Spk \t\t: " + notrady);
        System.out.println("Keterangan \t\t: " + Kondisi);

    }

    // overloading
    public void tampil(boolean showID) {
        if (showID)
            tampil();
        else
            super.tampil();
    }

}
