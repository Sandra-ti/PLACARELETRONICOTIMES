package com.example.placareletronicotimes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    int pontostimeA = 0;
    int pontostimeB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pontosTimeA (int pontos){
        TextView pontosView= (TextView) findViewById(R.id.ponto_a_visao);
        pontosView.setText(String.valueOf(pontos));
    }
    public void pontosTimeB (int pontos){
        TextView pontosView= (TextView) findViewById(R.id.ponto_b_visao);
        pontosView.setText(String.valueOf(pontos));
    }
    public void addtrespontostimeA (View view){
        pontostimeA=pontostimeA +3;
        pontosTimeA(pontostimeA);
    }
    public void adddoispontostimeA (View view){
        pontostimeA = pontostimeA +2;
        pontosTimeA(pontostimeA);
    }
    public void addumpontotimeA (View view){
        pontostimeA = pontostimeA +1;
        pontosTimeA(pontostimeA);
    }
    public void menosumpontotimeA (View view) {
        pontostimeA = pontostimeA - 1;
        pontosTimeA(pontostimeA);
    }
    public void addtrespontostimeB (View view) {
        pontostimeB = pontostimeB + 3;
        pontosTimeB(pontostimeB);
    }
    public void adddoispontostimeB (View view) {
        pontostimeB = pontostimeB + 2;
        pontosTimeB(pontostimeB);
    }
    public void addumpontotimeB (View view) {
        pontostimeB = pontostimeB + 1;
        pontosTimeB(pontostimeB);
    }
    public void menosumpontotimeB (View view) {
        pontostimeB = pontostimeB - 1;
        pontosTimeB(pontostimeB);
    }
public  void resetpontos(View view){
        pontostimeA = 0;
        pontostimeB = 0;
        pontosTimeA(pontostimeA);
        pontosTimeB(pontostimeB);


}
}
