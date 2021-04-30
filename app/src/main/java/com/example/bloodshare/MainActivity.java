package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/**
 * Main Activity (Halaman Main)
 *
 * Dikerjakan Pada: 30 April 2021
 * Deskripsi Pekerjaan: Membuat activity Main dengan constraint layout yang dipadukan dengan linear layout yang didalamnya ada
 *                      custom toolbar,cardView yang didalamnya ada linearlayout untuk menampung textview dan imageView
 *                      kemudian ShapeableImageView digunakan untuk menampung foto profil .
 * NIM: 10118058
 * Nama: Satyaning Andaru Bawalaksana
 * Kelas: IF-2
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}