package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Verify Activity (Halaman Verifikasi)
 *
 * Dikerjakan Pada: 30 April 2021
 * Deskripsi Pekerjaan: Membuat activity Verify dengan constraint layout serta custom tombol dengan drawable selector btn_outline_light.
 * NIM: 10118058
 * Nama: Satyaning Andaru Bawalaksana
 * Kelas: IF-2
 */


public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }
    public void submitCode(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}