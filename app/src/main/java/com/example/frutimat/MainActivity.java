package com.example.frutimat;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_nombre;
    private ImageView iv_personaje;
    private TextView tv_bestScore;
    private MediaPlayer mp;

    int num_aleatorio=(int)Math.random()*10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_nombre = findViewById(R.id.txt_nombre);
        iv_personaje = findViewById(R.id.imagenview_Personaje);
        tv_bestScore = findViewById(R.id.textView_BestScore);

        //COLOCAR EL ICONO DENTRO DEL ACTION BAR
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        int id;

    }
}
