# Sistem Informasi Inventaris Barang

## Deskripsi
Program ini merupakan aplikasi inventaris barang sederhana menggunakan bahasa Java. Program dibuat untuk menerapkan konsep Object-Oriented Programming (OOP) dan Java Collections, khususnya `HashMap`, dalam mengelola data barang.

## Fitur
- Menyimpan data produk berupa kode, nama, dan stok.
- Menambahkan minimal lima produk ke dalam inventaris.
- Menampilkan daftar produk beserta total stok.
- Mengubah stok produk berdasarkan kode produk.
- Menghapus produk dari inventaris.
- Menampilkan daftar produk setelah perubahan.

## Struktur File
- `Produk.java` — Berisi class Produk, atribut, constructor, getter, dan setter.
- `MainInventaris.java` — Berisi program utama untuk mengelola data inventaris menggunakan HashMap.

## Konsep yang Digunakan
- **OOP:** Menggunakan class, objek, constructor, dan enkapsulasi melalui atribut private serta getter dan setter.
- **HashMap:** Menyimpan data produk dengan kode produk sebagai key dan objek Produk sebagai value.
- **For-each:** Melakukan iterasi untuk menampilkan seluruh produk.
- **Getter dan Setter:** Mengambil dan memperbarui data produk.
- **Akumulasi:** Menghitung jumlah seluruh stok produk.

## Cara Menjalankan
Pastikan Java JDK sudah terpasang, kemudian buka terminal pada folder proyek dan jalankan perintah berikut:

1. Kompilasi program:

   ```bash
   javac Produk.java MainInventaris.java
   ```

2. Jalankan program:

   ```bash
   java MainInventaris
   ```

## Alur Program
1. Membuat HashMap untuk menyimpan data produk.
2. Menambahkan lima produk ke dalam inventaris.
3. Menampilkan daftar produk awal dan total stok.
4. Mengubah stok produk dengan kode `P003`.
5. Menghapus produk dengan kode `P003`.
6. Menampilkan daftar produk akhir beserta jumlah stok terbaru.

## Tujuan
Proyek ini dibuat untuk memahami penerapan OOP dan Java Collections dalam pengelolaan data inventaris sederhana menggunakan Java.

## Screenshots

![App Screenshot](PBO_S3_Final1)

![App Screenshot](PBO_S3_Final2)

![App Screenshot](PBO_S3_Final3)
