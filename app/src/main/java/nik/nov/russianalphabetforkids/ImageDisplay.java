package nik.nov.russianalphabetforkids;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);
        Bundle extras = getIntent().getExtras();
        int res = extras.getInt("resInt");
        String text = super.getIntent().getExtras().getString("textStr");
        TextView textView = (TextView) findViewById(R.id.output_text);
        textView.setText(text);
        ImageView imageView = (ImageView) findViewById(R.id.output_image);
        imageView.setImageResource(res);
    }
}