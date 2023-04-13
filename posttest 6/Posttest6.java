import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public final class Posttest6 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<SudahSpk> listSpk = new ArrayList<>();
    static ArrayList<belumSpk> listTakSpk = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print(
                    " 1. Tambah Data Mobil \n 2. Melihat Data Mobil \n 3. Ubah Data Mobil \n 4. Hapus Data Mobil \n 5. Keluar \n Masukkan Pilihan Anda : ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1 -> tambah();
                case 2 -> lihatData();
                case 3 -> ubah();
                case 4 -> hapus();
                case 5 -> System.exit(0);
                default -> System.out.println("PILIHAN SALAH!");
            }
            System.out.println("\n\n");
        }
    }

    static void tambah() throws IOException {
        System.out.print("baru Spk / Gagal Spk : \n 1. Baru\n 2. Gagal \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            System.out.print("Masukkan Nama Mobil \t: ");
            String nama = br.readLine();

            System.out.print("Masukkan Tahun Keluar \t: ");
            int tahun = Integer.parseInt(br.readLine());

            System.out.print("Masukkan Harga \t\t: ");
            int harga = Integer.parseInt(br.readLine());

            System.out.print("Status Spk \t\t: ");
            String StatusSpk = br.readLine();

            System.out.print("Keterangan \t\t: ");
            String Keterangan = br.readLine();

            SudahSpk mblA = new SudahSpk(nama, tahun, harga, StatusSpk, Keterangan);
            listSpk.add(mblA);
            mblA.notif();

        } else if (pil == 2) {
            System.out.print("Masukkan Nama Mobil \t: ");
            String nama = br.readLine();

            System.out.print("Masukkan Tahun keluar \t: ");
            int tahun = Integer.parseInt(br.readLine());

            System.out.print("Masukkan Harga mobil \t: ");
            Integer harga = Integer.parseInt(br.readLine());

            System.out.print("Kendala Spk \t\t: ");
            String notrady = br.readLine();

            System.out.print("Keterangan \t\t: ");
            String Kondisi = br.readLine();

            belumSpk mblB = new belumSpk(nama, tahun, harga, notrady, Kondisi);
            listTakSpk.add(mblB);
            mblB.notif();
        } else {
            System.out.println("Yang Dimasukan Salah");
        }
    }

    static void lihatData() throws IOException {
        System.out.println("lihat data Sudah Spk / Belum Spk : /\n 1. Sudah \n 2. Belum \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            if (listSpk.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                System.out.println("\n");
                for (int i = 0; i < listSpk.size(); i++) {
                    System.out.println("\nData indeks ke-" + (i + 1));
                    listSpk.get(i).tampil();
                }
            }
        } else if (pil == 2) {
            if (listTakSpk.isEmpty()) {
                System.out.println("Data Kosong");
            } else {
                System.out.println("\n");
                for (int i = 0; i < listTakSpk.size(); i++) {
                    System.out.println("\nData indeks ke-" + (i + 1));
                    listTakSpk.get(i).tampil();
                }
            }
        }
    }

    static void ubah() throws IOException {
        System.out.print("Sudah Spk / Belum Spk : \n 1. Sudah \n 2. Belum \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            lihatData();
            System.out.print("\nMau Ubah Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            System.out.print("Nama Mobil Baru: ");
            listSpk.get(pilihan).setNama(br.readLine());

            System.out.print("tahun Keluar Baru: ");
            listSpk.get(pilihan).settahun(Integer.parseInt(br.readLine()));

            System.out.print("harga Mobil Baru: ");
            listSpk.get(pilihan).setharga(Integer.parseInt(br.readLine()));

            System.out.print("\nData Berhasil Diubah...");
        } else if (pil == 2) {
            lihatData();
            System.out.print("\nMau Ubah Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            System.out.print("Nama Mobil Baru: ");
            listTakSpk.get(pilihan).setNama(br.readLine());

            System.out.print("tahun Keluar Baru: ");
            listTakSpk.get(pilihan).settahun(Integer.parseInt(br.readLine()));

            System.out.print("harga Mobil Baru: ");
            listTakSpk.get(pilihan).setharga(Integer.parseInt(br.readLine()));

            System.out.print("\nData Berhasil Diubah...");
        }

    }

    static void hapus() throws IOException {
        System.out.print("Sudah Spk / Belum Spk : \n 1. Sudah \n 2. Belum \n masukan pilihan Anda :");
        int pil = Integer.parseInt(br.readLine());
        if (pil == 1) {
            lihatData();
            System.out.print("\nMau Hapus Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            listSpk.remove(pilihan);
            System.out.println("\nData Berhasil Dihapus");
        } else if (pil == 2) {
            lihatData();
            System.out.print("\nMau Hapus Data Ke Berapa : ");
            int pilihan = Integer.parseInt(br.readLine());
            pilihan -= 1;

            listTakSpk.remove(pilihan);
            System.out.println("\nData Berhasil Dihapus");
        }

    }
}
