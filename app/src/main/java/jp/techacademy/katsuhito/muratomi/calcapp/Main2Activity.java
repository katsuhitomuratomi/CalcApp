package jp.techacademy.katsuhito.muratomi.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        TextView textView;
        textView = (TextView) findViewById(R.id.textView);
        double value1 = intent.getDoubleExtra("VALUE1", 0);
        double value2 = intent.getDoubleExtra("VALUE2", 0);
        double value3;
        int id = intent.getIntExtra("ID", 0);

        switch (id) {
            case R.id.tasu:
                value3 = value1 + value2;
                if ((int) value3 - value3 == 0) {
                    textView.setText("計算結果:"+String.valueOf((int) value3));
                } else {
                    textView.setText("計算結果:"+String.valueOf(value3));
                }
                break;
            case R.id.hiku:
                value3 = value1 - value2;
                if ((int) value3 - value3 == 0) {
                    textView.setText("計算結果:"+String.valueOf((int) value3));
                } else {
                    textView.setText("計算結果:"+String.valueOf(value3));
                }
                break;
            case R.id.waru:
                value3 = value1 / value2;
                if ((int) value3 - value3 == 0) {
                    textView.setText("計算結果:"+String.valueOf((int) value3));
                } else {
                    textView.setText("計算結果:"+String.valueOf(value3));
                }
                break;
            case R.id.kakeru:
                value3 = value1 * value2;
                if ((int) value3 - value3 == 0) {
                    textView.setText("計算結果:"+String.valueOf((int) value3));
                } else {
                    textView.setText("計算結果:"+String.valueOf(value3));
                }
                break;

            default:
                break;

        }


    }
}
