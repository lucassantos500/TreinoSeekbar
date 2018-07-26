package com.example.lucas.treinoseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekbar;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekbar = (SeekBar) findViewById(R.id.seekbarId);
        texto = (TextView) findViewById(R.id.nivelId);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //Quando o seekbar está em movimento
                texto.setText(+progress+"/10");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Quando o seekbar é pressionado
                Toast.makeText(getApplicationContext(),"Seekbar pressionado",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Quando o seekbar é solto
                Toast.makeText(getApplicationContext(),"Seekbar não está pressionado",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
