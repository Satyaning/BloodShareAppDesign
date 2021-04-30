package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Almost Activity (Halaman Almost)
 *
 * Dikerjakan Pada: 30 April 2021
 * Deskripsi Pekerjaan: Membuat activity Almost dengan constraint layout yang dipadukan dengan linear layout
 *                      serta custom tombol dengan drawable selector btn_outline_light.
 * NIM: 10118058
 * Nama: Satyaning Andaru Bawalaksana
 * Kelas: IF-2
 */

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }
    public void sendVerificationCode(View view) {
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}