package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ebirincisayi,eIkincisayi;
    private TextView textView;
    private String say1,say2;
    private int s1,s2,sonuc;
    private  hesapla hesapla;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ebirincisayi=(EditText) findViewById(R.id.eTxtBiriciSayi);
        eIkincisayi=(EditText) findViewById(R.id.eTxtIkinciSayi);
        textView=(TextView) findViewById(R.id.textView);






    }
    public void btnhesapla(View v) {
        say1=ebirincisayi.getText().toString();
        say2=eIkincisayi.getText().toString();

        if(!TextUtils.isEmpty(say1)&&!TextUtils.isEmpty(say2)){
            s1=Integer.valueOf(say1);
            s2=Integer.valueOf(say2);
            hesapla=new hesapla(s1,s2);
            switch(v.getId()){
                case R.id.topla:
                    sonuc= hesapla.topla();
                    break;
                case R.id.cikar:
                    sonuc= hesapla.cikar();
                    break;
                case R.id.carp:
                    sonuc= hesapla.carp();
                    break;
                case R.id.bol:
                    sonuc= hesapla.bol();
                    break;

            }
            textView.setText("sonuç = "+sonuc);
        }
        else
            textView.setText("Girilen değerler boş olamaz ");


    }
}