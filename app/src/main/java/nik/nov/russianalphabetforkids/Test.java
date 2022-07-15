package nik.nov.russianalphabetforkids;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import java.util.Locale;
import java.util.Random;

public class Test extends AppCompatActivity {

    public ImageView image;
    private RadioButton rb1, rb2, rb3;
    private Button nextqbtn, resultbtn;
    public String correct_word;
    public String[] other = new String[3];
    public int ask_image, correct_count, wrong_count, clicked;
    public String correct_count_str, wrong_count_str, clickedanswer;
    public boolean check1 = false;
    String[] selected_names = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        correct_count_str = extras.getString("score", "");
        wrong_count_str = extras.getString("wrong", "");
        correct_count = Integer.parseInt(correct_count_str);
        wrong_count = Integer.parseInt(wrong_count_str);

        image = findViewById(R.id.imageTestQuestions);
        rb1 = findViewById(R.id.radioButton1);
        rb2 = findViewById(R.id.radioButton2);
        rb3 = findViewById(R.id.radioButton3);
        nextqbtn = findViewById(R.id.nextQuestions);
        resultbtn = findViewById(R.id.resultTest);

        int[] letter_1 = {R.drawable.orange, R.drawable.apricot, R.drawable.pineapple};
        int[] letter_2 = {R.drawable.broccoli, R.drawable.banana, R.drawable.metalcan};
        int[] letter_3 = {R.drawable.grapes, R.drawable.bucket, R.drawable.fork};
        int[] letter_4 = {R.drawable.mushroom, R.drawable.caterpillar, R.drawable.garnet};
        int[] letter_5 = {R.drawable.tree, R.drawable.woodpecker, R.drawable.dolphin};
        int[] letter_6 = {R.drawable.food, R.drawable.blackberry, R.drawable.unicorn};
        int[] letter_7 = {R.drawable.cargo, R.drawable.christmastree, R.drawable.hedgehog};
        int[] letter_8 = {R.drawable.iron, R.drawable.insent, R.drawable.jiraffe};
        int[] letter_9 = {R.drawable.snake, R.drawable.rabbit, R.drawable.zebra};
        int[] letter_10 = {R.drawable.caviar, R.drawable.fig, R.drawable.needle};
        int[] letter_11 = {R.drawable.yogurt, R.drawable.iodine, R.drawable.lotus};
        int[] letter_12 = {R.drawable.cow, R.drawable.cat, R.drawable.chicken};
        int[] letter_13 = {R.drawable.lion, R.drawable.fox, R.drawable.frog};
        int[] letter_14 = {R.drawable.bear, R.drawable.ant, R.drawable.mouse};
        int[] letter_15 = {R.drawable.rhinoceros, R.drawable.night, R.drawable.nectarine};
        int[] letter_16 = {R.drawable.octopus, R.drawable.deer, R.drawable.sheep};
        int[] letter_17 = {R.drawable.bee, R.drawable.penguin, R.drawable.panda};
        int[] letter_18 = {R.drawable.lobster, R.drawable.fish, R.drawable.horn};
        int[] letter_19 = {R.drawable.elephant, R.drawable.pig, R.drawable.sun};
        int[] letter_20 = {R.drawable.pumpkin, R.drawable.seal, R.drawable.tiger};
        int[] letter_21 = {R.drawable.duck, R.drawable.dill, R.drawable.snail};
        int[] letter_22 = {R.drawable.flamingo, R.drawable.pheasant, R.drawable.tshirt};
        int[] letter_23 = {R.drawable.hamster, R.drawable.chameleon, R.drawable.ferret};
        int[] letter_24 = {R.drawable.chick, R.drawable.cauliflower, R.drawable.heron};
        int[] letter_25 = {R.drawable.turtle, R.drawable.human, R.drawable.seagull};
        int[] letter_26 = {R.drawable.scarf, R.drawable.chimpanzee, R.drawable.pinecone};
        int[] letter_27 = {R.drawable.shield, R.drawable.brush, R.drawable.pike};
        int[] letter_28 = {R.drawable.ads, R.drawable.houseentirence, R.drawable.road};
        int[] letter_29 = {R.drawable.cheese, R.drawable.lynx, R.drawable.melon};
        int[] letter_30 = {R.drawable.goose, R.drawable.anchor, R.drawable.chain};
        int[] letter_31 = {R.drawable.emu, R.drawable.excavator, R.drawable.popsicle};
        int[] letter_32 = {R.drawable.ynga, R.drawable.skirt, R.drawable.yrta};
        int[] letter_33 = {R.drawable.egg, R.drawable.apple, R.drawable.lizard};

        Random random = new Random();
        int i = 0;
        Boolean check = false;
        int[] selected_imgs = new int[3];
        int image_id = 0;
        while (i!= 3) {
            int random_letter = random.nextInt(33);
            int random_index = random.nextInt(3);
            check = false;
            switch (random_letter) {
                case 1:
                    image_id = letter_1[random_index];
                    break;
                case 2:
                    image_id = letter_2[random_index];
                    break;
                case 3:
                    image_id = letter_3[random_index];
                    break;
                case 4:
                    image_id = letter_4[random_index];
                    break;
                case 5:
                    image_id = letter_5[random_index];
                    break;
                case 6:
                    image_id = letter_6[random_index];
                    break;
                case 7:
                    image_id = letter_7[random_index];
                    break;
                case 8:
                    image_id = letter_8[random_index];
                    break;
                case 9:
                    image_id = letter_9[random_index];
                    break;
                case 10:
                    image_id = letter_10[random_index];
                    break;
                case 11:
                    image_id = letter_11[random_index];
                    break;
                case 12:
                    image_id = letter_12[random_index];
                    break;
                case 13:
                    image_id = letter_13[random_index];
                    break;
                case 14:
                    image_id = letter_14[random_index];
                    break;
                case 15:
                    image_id = letter_15[random_index];
                    break;
                case 16:
                    image_id = letter_16[random_index];
                    break;
                case 17:
                    image_id = letter_17[random_index];
                    break;
                case 18:
                    image_id = letter_18[random_index];
                    break;
                case 19:
                    image_id = letter_19[random_index];
                    break;
                case 20:
                    image_id = letter_20[random_index];
                    break;
                case 21:
                    image_id = letter_21[random_index];
                    break;
                case 22:
                    image_id = letter_22[random_index];
                    break;
                case 23:
                    image_id = letter_23[random_index];
                    break;
                case 24:
                    image_id = letter_24[random_index];
                    break;
                case 25:
                    image_id = letter_25[random_index];
                    break;
                case 26:
                    image_id = letter_26[random_index];
                    break;
                case 27:
                    image_id = letter_27[random_index];
                    break;
                case 28:
                    image_id = letter_28[random_index];
                    break;
                case 29:
                    image_id = letter_29[random_index];
                    break;
                case 30:
                    image_id = letter_30[random_index];
                    break;
                case 31:
                    image_id = letter_31[random_index];
                    break;
                case 32:
                    image_id = letter_32[random_index];
                    break;
                case 33:
                    image_id = letter_33[random_index];
                    break;
            }
            for (int j = 0; j < selected_imgs.length - 1; j++){
                if (image_id == selected_imgs[j]) {
                    check = true;
                }
            }
            if (check == false) {
                String selected_name = getResources().getResourceEntryName(image_id);
                selected_name = selected_name.substring(0, 1).toUpperCase() + selected_name.substring(1).toLowerCase();
                selected_imgs[i] = image_id;
                selected_names[i] = selected_name;
                i++;
            }
        }
        int asked_img_no = random.nextInt(3);
        correct_word = selected_names[asked_img_no];
        ask_image = selected_imgs[asked_img_no];
        image.setImageResource(ask_image);
        rb1.setText(selected_names[0]);
        rb2.setText(selected_names[1]);
        rb3.setText(selected_names[2]);

        nextqbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check1 == true) {
                    Intent intent1 = new Intent(Test.this, Test.class);
                    intent1.putExtra("score", Integer.toString(correct_count));
                    intent1.putExtra("wrong", Integer.toString(wrong_count));
                    startActivity(intent1);
                    finish();
                }
            }
        });

        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Test.this, ResultTest.class);
                intent.putExtra("score", Integer.toString(correct_count));
                intent.putExtra("wrong", Integer.toString(wrong_count));
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onSaveInstanceState(@Nullable Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("imgstring", ask_image);
        savedInstanceState.putString("correctword", correct_word);
        savedInstanceState.putString("first", selected_names[0]);
        savedInstanceState.putString("second", selected_names[1]);
        savedInstanceState.putString("third", selected_names[2]);
        savedInstanceState.putInt("clickedid", clicked);
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ask_image = savedInstanceState.getInt("imgstring");
        correct_word = savedInstanceState.getString("correctword");
        image.setImageResource(ask_image);
        selected_names[0] = savedInstanceState.getString("first");
        selected_names[1] = savedInstanceState.getString("second");
        selected_names[2] = savedInstanceState.getString("third");
        rb1.setText(selected_names[0]);
        rb2.setText(selected_names[1]);
        rb3.setText(selected_names[2]);
        int a = savedInstanceState.getInt("clickedid");
        HighlightAnswer(a);
    }

    public void RadioClicked(View v) {
        check1 = true;
        clicked = v.getId();
        HighlightAnswer(clicked);
    }

    public void HighlightAnswer(int a) {
        if (a != 0) {
            check1 = true;
            RadioButton clicked1 = findViewById(R.id.radioButton1);
            rb1 = findViewById(R.id.radioButton1);
            rb2 = findViewById(R.id.radioButton2);
            rb3 = findViewById(R.id.radioButton3);
            switch (a) {
                case R.id.radioButton1:
                    clicked1 = findViewById(R.id.radioButton1);
                    break;
                case R.id.radioButton2:
                    clicked1 = findViewById(R.id.radioButton2);
                    break;
                case R.id.radioButton3:
                    clicked1 = findViewById(R.id.radioButton3);
                    break;
            }

            clickedanswer = clicked1.getText().toString();
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            if (correct_word == clickedanswer) {
                clicked1.setBackgroundColor(Color.GREEN);
                correct_count++;
            }else {
                clicked1.setBackgroundColor(Color.RED);
                wrong_count++;
            }
        }
    }
}