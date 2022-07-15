package nik.nov.russianalphabetforkids;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LearnWords extends AppCompatActivity {

    private Button next_button;
    private Button previous_button;
    private TextView image_name_1, image_name_2, image_name_3, image_name_4, image_name_5, image_name_6;
    private ImageView image_set_1, image_set_2, image_set_3, image_set_4, image_set_5, image_set_6;
    int rescounter = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_words);

        next_button = (Button) findViewById(R.id.next_words);
        previous_button = (Button) findViewById(R.id.previous_words);

        image_name_1 = (TextView) findViewById(R.id.image_names_1);
        image_name_2 = (TextView) findViewById(R.id.image_names_2);
        image_name_3 = (TextView) findViewById(R.id.image_names_3);
        image_name_4 = (TextView) findViewById(R.id.image_names_4);
        image_name_5 = (TextView) findViewById(R.id.image_names_5);
        image_name_6 = (TextView) findViewById(R.id.image_names_6);

        image_set_1 = (ImageView) findViewById(R.id.image_heading_1);
        image_set_2 = (ImageView) findViewById(R.id.image_heading_2);
        image_set_3 = (ImageView) findViewById(R.id.image_heading_3);
        image_set_4 = (ImageView) findViewById(R.id.image_heading_4);
        image_set_5 = (ImageView) findViewById(R.id.image_heading_5);
        image_set_6 = (ImageView) findViewById(R.id.image_heading_6);

        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rescounter = rescounter + 1;
                setImageAndText();
            }
        });

        previous_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rescounter = rescounter - 1;
                setImageAndText();
            }
        });
    }

    private void setImageAndText() {
        switch (rescounter) {
            case (0):
                image_name_1.setText("Апельсин");
                image_set_1.setImageResource(R.drawable.orange);
                image_name_2.setText("Брокколи");
                image_set_2.setImageResource(R.drawable.broccoli);
                image_name_3.setText("Виноград");
                image_set_3.setImageResource(R.drawable.grapes);
                image_name_4.setText("Гранат");
                image_set_4.setImageResource(R.drawable.garnet);
                image_name_5.setText("Дыня");
                image_set_5.setImageResource(R.drawable.melon);
                image_name_6.setText("Ежевика");
                image_set_6.setImageResource(R.drawable.blackberry);
                previous_button.setVisibility(View.INVISIBLE);
                next_button.setVisibility(View.VISIBLE);
                break;

            case (1):
                image_name_1.setText("Акула");
                image_set_1.setImageResource(R.drawable.shark);
                image_name_2.setText("Белка");
                image_set_2.setImageResource(R.drawable.squirrel);
                image_name_3.setText("Гепард");
                image_set_3.setImageResource(R.drawable.gepard);
                image_name_4.setText("Дракон");
                image_set_4.setImageResource(R.drawable.dragon);
                image_name_5.setText("Змея");
                image_set_5.setImageResource(R.drawable.snake);
                image_name_6.setText("Курица");
                image_set_6.setImageResource(R.drawable.chicken);
                previous_button.setVisibility(View.VISIBLE);
                next_button.setVisibility(View.VISIBLE);
                break;

            case (2):
                image_name_1.setText("Ночь");
                image_set_1.setImageResource(R.drawable.night);
                image_name_2.setText("Футболка");
                image_set_2.setImageResource(R.drawable.tshirt);
                image_name_3.setText("Юрта");
                image_set_3.setImageResource(R.drawable.yrta);
                image_name_4.setText("Шишка");
                image_set_4.setImageResource(R.drawable.pinecone);
                image_name_5.setText("Контейнер");
                image_set_5.setImageResource(R.drawable.cargo);
                image_name_6.setText("Железо");
                image_set_6.setImageResource(R.drawable.iron);
                previous_button.setVisibility(View.VISIBLE);
                next_button.setVisibility(View.VISIBLE);
                break;

            case (3):
                image_name_1.setText("Корабль");
                image_set_1.setImageResource(R.drawable.cargoship);
                image_name_2.setText("Грузовик");
                image_set_2.setImageResource(R.drawable.truck);
                image_name_3.setText("Машина");
                image_set_3.setImageResource(R.drawable.vehicle);
                image_name_4.setText("Самолет");
                image_set_4.setImageResource(R.drawable.plane);
                image_name_5.setText("Экскаватор");
                image_set_5.setImageResource(R.drawable.excavator);
                image_name_6.setText("Мотоцикл");
                image_set_6.setImageResource(R.drawable.motorcycle);
                previous_button.setVisibility(View.VISIBLE);
                next_button.setVisibility(View.INVISIBLE);
                break;

            default:
                break;
        }
    }
}

