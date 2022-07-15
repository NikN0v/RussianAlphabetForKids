package nik.nov.russianalphabetforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultTest extends AppCompatActivity {

    private TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_test);

        Intent intent = getIntent();
        String correct = intent.getStringExtra("score");
        String wrong = intent.getStringExtra("wrong");

        int correct_int = Integer.parseInt(correct);
        int wrong_int = Integer.parseInt(wrong);
        int total = correct_int + wrong_int;

        text1 = findViewById(R.id.textView1);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);

        text1.setText("Всего ответов: " + Integer.toString(total));
        text2.setText("Правильных ответов: " + Integer.toString(correct_int));
        text3.setText("Неправильных ответов: " + Integer.toString(wrong_int));
    }
}