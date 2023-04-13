public class SudahSpk extends Mobil {
    private String status = "Sudah Spk";
    String StatusSpk;
    String Keterangan;

    public SudahSpk(String nama, int tahun, int harga, String StatusSpk, String Keterangan) {
        super(nama, tahun, harga);
        this.StatusSpk = StatusSpk;
        this.Keterangan = Keterangan;
    }

    public String getstatuS() {
        return status;
    }

    public String getStatusSpk() {
        return StatusSpk;
    }

    public void setStatusUkt(String StatusSpk) {
        this.StatusSpk = StatusSpk;
    }

    public String keterangan() {
        return Keterangan;
    }

    public String Keterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Status Spk \t\t: " + StatusSpk);
        System.out.println("Keterangan \t\t: " + Keterangan);
    }

    // overloading
    public void tampil(boolean showID) {
        if (showID)
            tampil();
        else
            super.tampil();
    }

}
