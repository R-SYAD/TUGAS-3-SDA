package TugasSDA3;

import java.util.LinkedList;

public class Tugas3 {
    public static void main(String[] args) {
        //Membuat variabel linkedlist
    LinkedList<String> nim = new LinkedList<>();
    LinkedList<String> nama = new LinkedList<>();
    LinkedList<String> alamat = new LinkedList<>();

    //Menambah elemen
    System.out.println("Menambah elemen :");
    nim.add("2111012006");
    nim.add("2111521015");
    nim.add("2111112031");
    nim.add("2111522028");
    nim.add("P07120321013");
    nim.add("2110311001");

    nama.add("Zane");
    nama.add("Fikri");
    nama.add("Wanda");
    nama.add("Afif");
    nama.add("Alda");
    nama.add("Yudha");

    alamat.add("Bukittinggi");
    alamat.add("Pekan Baru");
    alamat.add("Padang");
    alamat.add("Pasaman Barat");
    alamat.add("yogyakarta");
    alamat.add("Solok");

    System.out.println("NIM : "+nim+" Ukuran : "+nim.size());
    System.out.println("Nama : "+nama+" Ukuran : "+nama.size());
    System.out.println("Alamat : "+alamat+" Ukuran : "+alamat.size());
    System.out.println("=============================\n");

    //Menyisipkan data
    System.out.println("Menyisipkan data:");
    System.out.println("Data Nama Awal : "+nama+" Ukuran : "+nama.size());
    System.out.println("Data NIM Awal : "+nim+" Ukuran : "+nim.size());
    System.out.println("Data Alamat AWal : "+alamat+" Ukuran : "+alamat.size());

    nama.add(1, "Irsyad");
    nama.add(2, "Elsa");
    nama.add(4, "Zikri");

    nim.add(1, "2111522222");
    nim.add(2, "2111521111");
    nim.add(4, "2111511001");
    
    alamat.add(1, "Medan");
    alamat.add(2, "Aceh");
    alamat.add(4, "Surabaya");

    System.out.println("Nama Setelah penyisipan : "+nama+" Ukuran : "+nama.size());
    System.out.println("NIM setelah penyisipan: "+nim+" Ukuran : "+nim.size());
    System.out.println("Alamat setelah penyisipan : "+alamat+" Ukuran : "+alamat.size());
    System.out.println("=============================\n");

    //Mengganti data
    System.out.println("Mengganti data :");
    System.out.println("Data Nama awal : "+nama+" Ukuran :"+nama.size());
   
    nama.set(0, "Budi");
    nama.set(2, "Andi");
   
    nim.set(0, "2111577777");
    nim.set(2, "2111522323");
   
    alamat.set(0, "Surakarta");
    alamat.set(2, "Palembang");

    System.out.println("Nama setelah penggantian : "+nama+" Ukuran : "+nama.size());
    System.out.println("NIM setelah penggantian : "+nim+" Ukuran : "+nim.size());
    System.out.println("Alamat setelah penggantian : "+alamat+" Ukuran : "+alamat.size());
    System.out.println("=============================\n");

    //Menghapus data
    System.out.println("Menghapus data elemen awal dan akhir :");
    //First dan Last
    System.out.println("Data Alamat awal : "+alamat+" Ukuran : "+alamat.size());
    
    nama.removeFirst();
    nama.removeLast();

    nim.removeFirst();
    nim.removeLast();

    alamat.removeFirst();
    alamat.removeLast();
    
    System.out.println("Data Nama setelah remove : "+nama+" Ukuran : "+nama.size());
    System.out.println("Data Nim setelah remove : "+nim+" Ukuran : "+nim.size());
    System.out.println("Data Alamat setelah remove : "+alamat+" Ukuran : "+alamat.size());
    System.out.println("=============================\n");

    //Berdasarkan index
    System.out.println("Menghapus data berdasarkan index :");
    System.out.println("Data NIM awal : "+nim+" Ukuran : "+nim.size());
    nim.remove(2);
    nim.remove(3);

    System.out.println("Data NIM setelah remove : "+nim+" Ukuran : "+nim.size());
    System.out.println("=============================\n");

    //Hapus semua elemen
    System.out.println("Menghapus semua data :");
    System.out.println("Data NIM awal : "+nim+" Ukuran : "+nim.size());
    nim.clear();

    System.out.println("Data NIM setelah remove : "+nim+" Ukuran : "+nim.size());
    System.out.println("=============================\n");

    //Pengecekan apakah linkedlist kosong
    System.out.println("Cek elemen linkedlist :");
    //Cek LinkedList Nama
    Boolean cekNama = nama.isEmpty();
    if (cekNama) {
        System.out.println("LinkedList Nama Kosong");
    }else{
        System.out.println("LinkedList Nama memiliki "+nama.size()+" elemen");
    }

    //Cek LinkedList NIM
    Boolean cekNim = nim.isEmpty();
    if (cekNim) {
        System.out.println("LinkedList NIM Kosong");
    } else {
        System.out.println("LinkedList NIM memiliki "+nim.size()+" elemen");
    }

    //Cek LinkedList Alamat
    Boolean cekAlamat = alamat.isEmpty();
    if (cekAlamat) {
        System.out.println("LinkedList Alamat Kosong");
    } else {
        System.out.println("LinkedList Alamat memiliki "+alamat.size()+" elemen");
    }
    System.out.println("=============================\n");

    //Mengambil elemen dalam LinkedList
    System.out.println("Ambil elemen berdasarkan index :");
    //Berdasarkan index
    System.out.println("Elemen nama saat ini adalah : "+nama);
    System.out.println("Elemen nama pada index 0 adalah : "+nama.get(0));
    System.out.println("Elemen nama pada index 1 adalah : "+nama.get(1));
    System.out.println("Elemen nama pada index 2 adalah : "+nama.get(2));

    //First dan Last
    System.out.println("\nMengambil elemen awal dan akhir linkedlist : "+nama);
    System.out.println("Elemen nama pada index awal adalah : "+nama.getFirst());
    System.out.println("Elemen nama pada index akhir adalah : "+nama.getLast());

    System.out.println("=============================\n");

    }
    
}
