package jp.techacademy.katsuhito.muratomi.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText1;
    EditText editText2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //たぶん配列を使うとすっきりすると思われる
        editText1 = (EditText) findViewById(R.id.et1);
        editText2 = (EditText) findViewById(R.id.et2);
        button1 = (Button) findViewById(R.id.tasu);
        button2 = (Button) findViewById(R.id.hiku);
        button3 = (Button) findViewById(R.id.waru);
        button4 = (Button) findViewById(R.id.kakeru);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, Main2Activity.class);
        int id = v.getId();
        String num1 = editText1.getText().toString();
        String num2 = editText2.getText().toString();
        boolean check1 = hantei(num1);
        boolean check2 = hantei(num2);

        if (check1 && check2) {
            double value1 = Double.parseDouble(editText1.getText().toString());
            double value2 = Double.parseDouble(editText2.getText().toString());

            if (id == R.id.waru && value2 == 0) {
                Toast.makeText(this, "0では割り算できません", Toast.LENGTH_SHORT).show();
            } else {
                intent.putExtra("VALUE1", value1);
                intent.putExtra("VALUE2", value2);
                intent.putExtra("ID", id);
                startActivity(intent);
            }

        } else {
            Toast.makeText(this, "入力が正しくありません", Toast.LENGTH_SHORT).show();
        }


    }


    public boolean hantei(String num) {
        try {
            double n = Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
