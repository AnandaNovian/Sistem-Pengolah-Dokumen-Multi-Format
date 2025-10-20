package com.example.app;

import com.example.core.DocumentProcessor;
import java.util.ServiceLoader;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Sistem Pengolah Dokumen Multi-Format ===");

        ServiceLoader<DocumentProcessor> loader = ServiceLoader.load(DocumentProcessor.class);

        for (DocumentProcessor processor : loader) {
            System.out.println("Menemukan format: " + processor.getFormatName());
            String hasil = processor.process("Halo dunia Java Modul!");
            System.out.println("Hasil proses: " + hasil);
            System.out.println("-------------------------------------------");
        }
    }
}
