NO. 1 Menambah Method untuk mengubah PIN lama menjadi PIN baru
Langkah-Langkah:
1. Menambah method pada class Account yaitu method changePin(Scanner scanner) yang berfungsi untuk:
- Verifikasi Pin Lama
- Meminta Pin Baru 2 kali
- Menococokkan Pin Baru yang diinput
- Memperbarui Pin baru
2. Setelah itu menambah case 5 pada menu utama (ATM.java) yang memanggil method changePin(scanner) yang ada pada Account.java
contoh ubahPin:
![image](https://github.com/user-attachments/assets/c795acf4-7858-43b8-b73a-57d99d7ecfc3)

NO. 2 Menambah Method saat Penarikan, saldo atm harus ada minimal Rp.50.000 
Langkah-Langkah:
1. Membuat public static final double MINIMUM_BALANCE = 50000.0; pada Account.java
2. Membuat method execute() yang berfungsi untuk fungsi penarikan, jika saat penarikan saldo yang tersisa pada atm > 50.000, maka transaksi akan berhasil, jika tidak > 50.000, transaksi akan gagal, dan diharuskan
menyisakan saldo minimal 50.000
contoh penarikan berhasil:
![image](https://github.com/user-attachments/assets/c60e39a2-3e86-4406-8b60-bed3a63a7789)

contoh penarikan gagal:
![image](https://github.com/user-attachments/assets/cc6fa61d-8ecd-4b18-b232-91f8e5388b39)
