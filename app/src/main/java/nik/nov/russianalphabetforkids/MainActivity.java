package nik.nov.russianalphabetforkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton btn_1,btn_2,btn_3,btn_4,btn_5, btn_6, btn_7, btn_8, btn_9, btn_10, btn_11, btn_12, btn_13, btn_14, btn_15, btn_16, btn_17, btn_18,
            btn_19, btn_20, btn_21, btn_22, btn_23, btn_24, btn_25, btn_26, btn_27, btn_28, btn_29, btn_30, btn_31, btn_32, btn_33, btn_words, btn_test;
    private MediaPlayer letter1s, letter2s, letter3s, letter4s, letter5s, letter6s, letter7s, letter8s, letter9s, letter10s, letter11s, letter12s, letter13s, letter14s,
            letter15s, letter16s, letter17s, letter18s, letter19s, letter20s, letter21s, letter22s, letter23s, letter24s, letter25s, letter26s, letter27s, letter28s,
            letter29s, letter30s, letter31s, letter32s, letter33s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.letter_1);
        btn_2 = findViewById(R.id.letter_2);
        btn_3 = findViewById(R.id.letter_3);
        btn_4 = findViewById(R.id.letter_4);
        btn_5 = findViewById(R.id.letter_5);
        btn_6 = findViewById(R.id.letter_6);
        btn_7 = findViewById(R.id.letter_7);
        btn_8 = findViewById(R.id.letter_8);
        btn_9 = findViewById(R.id.letter_9);
        btn_10 = findViewById(R.id.letter_10);
        btn_11 = findViewById(R.id.letter_11);
        btn_12 = findViewById(R.id.letter_12);
        btn_13 = findViewById(R.id.letter_13);
        btn_14 = findViewById(R.id.letter_14);
        btn_15 = findViewById(R.id.letter_15);
        btn_16 = findViewById(R.id.letter_16);
        btn_17 = findViewById(R.id.letter_17);
        btn_18 = findViewById(R.id.letter_18);
        btn_19 = findViewById(R.id.letter_19);
        btn_20 = findViewById(R.id.letter_20);
        btn_21 = findViewById(R.id.letter_21);
        btn_22 = findViewById(R.id.letter_22);
        btn_23 = findViewById(R.id.letter_23);
        btn_24 = findViewById(R.id.letter_24);
        btn_25 = findViewById(R.id.letter_25);
        btn_26 = findViewById(R.id.letter_26);
        btn_27 = findViewById(R.id.letter_27);
        btn_28 = findViewById(R.id.letter_28);
        btn_29 = findViewById(R.id.letter_29);
        btn_30 = findViewById(R.id.letter_30);
        btn_31 = findViewById(R.id.letter_31);
        btn_32 = findViewById(R.id.letter_32);
        btn_33 = findViewById(R.id.letter_33);
        btn_words = findViewById(R.id.button_to_words);
        btn_test = findViewById(R.id.button_test);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_10.setOnClickListener(this);
        btn_11.setOnClickListener(this);
        btn_12.setOnClickListener(this);
        btn_13.setOnClickListener(this);
        btn_14.setOnClickListener(this);
        btn_15.setOnClickListener(this);
        btn_16.setOnClickListener(this);
        btn_17.setOnClickListener(this);
        btn_18.setOnClickListener(this);
        btn_19.setOnClickListener(this);
        btn_20.setOnClickListener(this);
        btn_21.setOnClickListener(this);
        btn_22.setOnClickListener(this);
        btn_23.setOnClickListener(this);
        btn_24.setOnClickListener(this);
        btn_25.setOnClickListener(this);
        btn_26.setOnClickListener(this);
        btn_27.setOnClickListener(this);
        btn_28.setOnClickListener(this);
        btn_29.setOnClickListener(this);
        btn_30.setOnClickListener(this);
        btn_31.setOnClickListener(this);
        btn_32.setOnClickListener(this);
        btn_33.setOnClickListener(this);

        btn_words.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, LearnWords.class);
                startActivity(intent2);
            }
        });

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Test.class);
                intent3.putExtra("score", "0");
                intent3.putExtra("wrong", "0");
                startActivity(intent3);
            }
        });

        letter1s = MediaPlayer.create(this, R.raw.letter1sound);
        letter2s = MediaPlayer.create(this, R.raw.letter2sound);
        letter3s = MediaPlayer.create(this, R.raw.letter3sound);
        letter4s = MediaPlayer.create(this, R.raw.letter4sound);
        letter5s = MediaPlayer.create(this, R.raw.letter5sound);
        letter6s = MediaPlayer.create(this, R.raw.letter6sound);
        letter7s = MediaPlayer.create(this, R.raw.letter7sound);
        letter8s = MediaPlayer.create(this, R.raw.letter8sound);
        letter9s = MediaPlayer.create(this, R.raw.letter9sound);
        letter10s = MediaPlayer.create(this, R.raw.letter10sound);
        letter11s = MediaPlayer.create(this, R.raw.letter11sound);
        letter12s = MediaPlayer.create(this, R.raw.letter12sound);
        letter13s = MediaPlayer.create(this, R.raw.letter13sound);
        letter14s = MediaPlayer.create(this, R.raw.letter14sound);
        letter15s = MediaPlayer.create(this, R.raw.letter15sound);
        letter16s = MediaPlayer.create(this, R.raw.letter16sound);
        letter17s = MediaPlayer.create(this, R.raw.letter17sound);
        letter18s = MediaPlayer.create(this, R.raw.letter18sound);
        letter19s = MediaPlayer.create(this, R.raw.letter19sound);
        letter20s = MediaPlayer.create(this, R.raw.letter20sound);
        letter21s = MediaPlayer.create(this, R.raw.letter21sound);
        letter22s = MediaPlayer.create(this, R.raw.letter22sound);
        letter23s = MediaPlayer.create(this, R.raw.letter23sound);
        letter24s = MediaPlayer.create(this, R.raw.letter24sound);
        letter25s = MediaPlayer.create(this, R.raw.letter25sound);
        letter26s = MediaPlayer.create(this, R.raw.letter26sound);
        letter27s = MediaPlayer.create(this, R.raw.letter27sound);
        letter28s = MediaPlayer.create(this, R.raw.letter28sound);
        letter29s = MediaPlayer.create(this, R.raw.letter29sound);
        letter30s = MediaPlayer.create(this, R.raw.letter30sound);
        letter31s = MediaPlayer.create(this, R.raw.letter31sound);
        letter32s = MediaPlayer.create(this, R.raw.letter32sound);
        letter33s = MediaPlayer.create(this, R.raw.letter33sound);
    }




    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, ImageDisplay.class);
        switch (v.getId()){
            case R.id.letter_1:
                intent.putExtra("resInt", R.drawable.watermelon);
                intent.putExtra("textStr", "Арбуз");
                soundPlayBtn(letter1s);
                startActivity(intent);
                break;
            case R.id.letter_2:
                intent.putExtra("resInt", R.drawable.banana);
                intent.putExtra("textStr", "Банан");
                soundPlayBtn(letter2s);
                startActivity(intent);
                break;
            case R.id.letter_3:
                intent.putExtra("resInt", R.drawable.cherries);
                intent.putExtra("textStr", "Вишня");
                soundPlayBtn(letter3s);
                startActivity(intent);
                break;
            case R.id.letter_4:
                intent.putExtra("resInt", R.drawable.pear);
                intent.putExtra("textStr", "Груша");
                soundPlayBtn(letter4s);
                startActivity(intent);
                break;
            case R.id.letter_5:
                intent.putExtra("resInt", R.drawable.dinosaur);
                intent.putExtra("textStr", "Динозавр");
                soundPlayBtn(letter5s);
                startActivity(intent);
                break;
            case R.id.letter_6:
                intent.putExtra("resInt", R.drawable.raccoon);
                intent.putExtra("textStr", "Енот");
                soundPlayBtn(letter6s);
                startActivity(intent);
                break;
            case R.id.letter_7:
                intent.putExtra("resInt", R.drawable.christmastree);
                intent.putExtra("textStr", "Ёлка");
                soundPlayBtn(letter7s);
                startActivity(intent);
                break;
            case R.id.letter_8:
                intent.putExtra("resInt", R.drawable.jiraffe);
                intent.putExtra("textStr", "Жираф");
                soundPlayBtn(letter8s);
                startActivity(intent);
                break;
            case R.id.letter_9:
                intent.putExtra("resInt", R.drawable.zebra);
                intent.putExtra("textStr", "Зебра");
                soundPlayBtn(letter9s);
                startActivity(intent);
                break;
            case R.id.letter_10:
                intent.putExtra("resInt", R.drawable.caviar);
                intent.putExtra("textStr", "Икра");
                soundPlayBtn(letter10s);
                startActivity(intent);
                break;
            case R.id.letter_11:
                intent.putExtra("resInt", R.drawable.yogurt);
                intent.putExtra("textStr", "Йогурт");
                soundPlayBtn(letter11s);
                startActivity(intent);
                break;
            case R.id.letter_12:
                intent.putExtra("resInt", R.drawable.cow);
                intent.putExtra("textStr", "Корова");
                soundPlayBtn(letter12s);
                startActivity(intent);
                break;
            case R.id.letter_13:
                intent.putExtra("resInt", R.drawable.lion);
                intent.putExtra("textStr", "Лев");
                soundPlayBtn(letter13s);
                startActivity(intent);
                break;
            case R.id.letter_14:
                intent.putExtra("resInt", R.drawable.bear);
                intent.putExtra("textStr", "Медведь");
                soundPlayBtn(letter14s);
                startActivity(intent);
                break;
            case R.id.letter_15:
                intent.putExtra("resInt", R.drawable.rhinoceros);
                intent.putExtra("textStr", "Носорог");
                soundPlayBtn(letter15s);
                startActivity(intent);
                break;
            case R.id.letter_16:
                intent.putExtra("resInt", R.drawable.octopus);
                intent.putExtra("textStr", "Осьминог");
                soundPlayBtn(letter16s);
                startActivity(intent);
                break;
            case R.id.letter_17:
                intent.putExtra("resInt", R.drawable.penguin);
                intent.putExtra("textStr", "Пингвин");
                soundPlayBtn(letter17s);
                startActivity(intent);
                break;
            case R.id.letter_18:
                intent.putExtra("resInt", R.drawable.lobster);
                intent.putExtra("textStr", "Рак");
                soundPlayBtn(letter18s);
                startActivity(intent);
                break;
            case R.id.letter_19:
                intent.putExtra("resInt", R.drawable.elephant);
                intent.putExtra("textStr", "Слон");
                soundPlayBtn(letter19s);
                startActivity(intent);
                break;
            case R.id.letter_20:
                intent.putExtra("resInt", R.drawable.pumpkin);
                intent.putExtra("textStr", "Тыква");
                soundPlayBtn(letter20s);
                startActivity(intent);
                break;
            case R.id.letter_21:
                intent.putExtra("resInt", R.drawable.duck);
                intent.putExtra("textStr", "Утка");
                soundPlayBtn(letter21s);
                startActivity(intent);
                break;
            case R.id.letter_22:
                intent.putExtra("resInt", R.drawable.flamingo);
                intent.putExtra("textStr", "Фламинго");
                soundPlayBtn(letter22s);
                startActivity(intent);
                break;
            case R.id.letter_23:
                intent.putExtra("resInt", R.drawable.hamster);
                intent.putExtra("textStr", "Хомяк");
                soundPlayBtn(letter23s);
                startActivity(intent);
                break;
            case R.id.letter_24:
                intent.putExtra("resInt", R.drawable.chick);
                intent.putExtra("textStr", "Цыплёнок");
                soundPlayBtn(letter24s);
                startActivity(intent);
                break;
            case R.id.letter_25:
                intent.putExtra("resInt", R.drawable.turtle);
                intent.putExtra("textStr", "Черепаха");
                soundPlayBtn(letter25s);
                startActivity(intent);
                break;
            case R.id.letter_26:
                intent.putExtra("resInt", R.drawable.scarf);
                intent.putExtra("textStr", "Шарф");
                soundPlayBtn(letter26s);
                startActivity(intent);
                break;
            case R.id.letter_27:
                intent.putExtra("resInt", R.drawable.shield);
                intent.putExtra("textStr", "Щит");
                soundPlayBtn(letter27s);
                startActivity(intent);
                break;
            case R.id.letter_28:
                intent.putExtra("resInt", R.drawable.ads);
                intent.putExtra("textStr", "Объявление");
                soundPlayBtn(letter28s);
                startActivity(intent);
                break;
            case R.id.letter_29:
                intent.putExtra("resInt", R.drawable.cheese);
                intent.putExtra("textStr", "Сыр");
                soundPlayBtn(letter29s);
                startActivity(intent);
                break;
            case R.id.letter_30:
                intent.putExtra("resInt", R.drawable.goose);
                intent.putExtra("textStr", "Гусь");
                soundPlayBtn(letter30s);
                startActivity(intent);
                break;
            case R.id.letter_31:
                intent.putExtra("resInt", R.drawable.excavator);
                intent.putExtra("textStr", "Экскаватор");
                soundPlayBtn(letter31s);
                startActivity(intent);
                break;
            case R.id.letter_32:
                intent.putExtra("resInt", R.drawable.ynga);
                intent.putExtra("textStr", "Юнга");
                soundPlayBtn(letter32s);
                startActivity(intent);
                break;
            case R.id.letter_33:
                intent.putExtra("resInt", R.drawable.egg);
                intent.putExtra("textStr", "Яйцо");
                soundPlayBtn(letter33s);
                startActivity(intent);
                break;
        }
    }

    private void soundPlayBtn(MediaPlayer sound) {
        if(sound.isPlaying()) {
            sound.stop();
        }
        sound.start();
    }
}