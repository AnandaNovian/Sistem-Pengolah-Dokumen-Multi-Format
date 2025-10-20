# 📘 Sistem Pengolah Dokumen Multi-Format

## 🧩 Deskripsi Proyek
Proyek ini adalah tugas **Pemrograman Berbasis Platform** dengan studi kasus *Sistem Pengolah Dokumen Multi-Format* menggunakan **Java Platform Module System (JPMS)**.  
Tujuan sistem ini adalah untuk memproses dan menampilkan dokumen dari berbagai format (contohnya: *Plain Text*).

---

## 📂 Struktur Modul
| Modul | Deskripsi |
|--------|------------|
| **doc.core** | Modul inti yang berisi antarmuka `DocumentProcessor` dan model data `Document`. |
| **doc.txt** | Modul implementasi yang memproses teks biasa dan menyediakan implementasi `PlainTextProcessor`. |
| **doc.app** | Modul utama (aplikasi) yang menggunakan `ServiceLoader` untuk menemukan semua implementasi `DocumentProcessor` dan menjalankannya. |

---

## ⚙️ Cara Menjalankan Proyek
1. **Kompilasi semua modul**
   ```bash
   javac -d out --module-source-path . $(find . -name "*.java")
   ```

2. **Jalankan aplikasi utama**
   ```bash
   java --module-path out -m doc.app/com.example.app.MainApp
   ```

---

## 🧠 Contoh Output
```
=== Sistem Pengolah Dokumen Multi-Format ===
Menemukan format: Plain Text
Hasil proses: PROCESSED PLAIN TEXT: HALO DUNIA JAVA MODUL!
-------------------------------------------
```

---

## 👨‍💻 Teknologi yang Digunakan
- **Java 11+**
- **Java Platform Module System (JPMS)**
- **ServiceLoader API**

---

## 📅 Informasi Tugas
| Detail | Keterangan |
|--------|-------------|
| Mata Kuliah | Pemrograman Berbasis Platform |
| Dosen | Aditya, S.Kom., M.Kom |
| Judul | Sistem Pengolah Dokumen Multi-Format |
| Mahasiswa | Ananda Novian Dwi Cahya |
| Kelas | TI24 G |

---

## 💬 Catatan
Struktur ini dirancang agar mendukung *pluggability*, sehingga modul baru (misalnya `doc.html`) bisa ditambahkan tanpa memodifikasi kode utama.
