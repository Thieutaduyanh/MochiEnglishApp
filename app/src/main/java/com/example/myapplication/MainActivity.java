package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView score;
    private TextView tvAnswer1, tvAnswer2, tvAnswer3;
    private ImageView imgVocab;
    private List<Question> listQuestion;
    private Question mQuestion;
    private int currentQuestion = 0;
    private int currentScore = 0;
    private int check = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        listQuestion = getListQuestion();
        if(listQuestion == null) {
            return;
        }
        setDataQuestion(listQuestion.get(currentQuestion));
    }

    public void initUi() {
        score = findViewById(R.id.tv_score);
        imgVocab = findViewById(R.id.img_vocab);
        tvAnswer1 = findViewById(R.id.tv_answer_1);
        tvAnswer2 = findViewById(R.id.tv_answer_2);
        tvAnswer3 = findViewById(R.id.tv_answer_3);
    }

    // tao cau hoi
    private List<Question> getListQuestion() {
        List<Question> list = new ArrayList<>();
        Intent receivedIntent = getIntent();
        String topicId = receivedIntent.getStringExtra("topicId");


        if(Objects.equals(topicId, "1")) {
            List<Answer> answerList1 = new ArrayList<>();
            answerList1.add(new Answer("Student", true));
            answerList1.add(new Answer("Teacher", false));
            answerList1.add(new Answer("Classroom", false));

            list.add(new Question(1, "@drawable/question_1", answerList1));

            List<Answer> answerList2 = new ArrayList<>();
            answerList2.add(new Answer("Learn", false));
            answerList2.add(new Answer("Truant", false));
            answerList2.add(new Answer("Teacher", true));

            list.add(new Question(2, "@drawable/question_2", answerList2));

            List<Answer> answerList3 = new ArrayList<>();
            answerList3.add(new Answer("Classroom", true));
            answerList3.add(new Answer("Student", false));
            answerList3.add(new Answer("Teacher", false));

            list.add(new Question(3, "@drawable/question_3", answerList3));

            List<Answer> answerList4 = new ArrayList<>();
            answerList4.add(new Answer("Classroom", false));
            answerList4.add(new Answer("Principal", true));
            answerList4.add(new Answer("Student", false));

            list.add(new Question(4, "@drawable/question_4", answerList4));

            List<Answer> answerList5 = new ArrayList<>();
            answerList5.add(new Answer("Learn", false));
            answerList5.add(new Answer("Truant", false));
            answerList5.add(new Answer("Examination", true));

            list.add(new Question(5, "@drawable/question_5", answerList5));

            List<Answer> answerList6 = new ArrayList<>();
            answerList6.add(new Answer("Examination", false));
            answerList6.add(new Answer("Learn", true));
            answerList6.add(new Answer("Principal", false));

            list.add(new Question(6, "@drawable/question_6", answerList6));

            List<Answer> answerList7 = new ArrayList<>();
            answerList7.add(new Answer("Break time", true));
            answerList7.add(new Answer("Teacher", false));
            answerList7.add(new Answer("Classroom", false));

            list.add(new Question(7, "@drawable/question_7", answerList7));

            List<Answer> answerList8 = new ArrayList<>();
            answerList8.add(new Answer("Learn", false));
            answerList8.add(new Answer("Examination", false));
            answerList8.add(new Answer("Exercise", true));

            list.add(new Question(8, "@drawable/question_8", answerList8));

            List<Answer> answerList9 = new ArrayList<>();
            answerList9.add(new Answer("Lesson", true));
            answerList9.add(new Answer("Teacher", false));
            answerList9.add(new Answer("Classroom", false));

            list.add(new Question(9, "@drawable/question_9", answerList9));

            List<Answer> answerList10 = new ArrayList<>();
            answerList10.add(new Answer("Student", false));
            answerList10.add(new Answer("Truant", true));
            answerList10.add(new Answer("Classroom", false));

            list.add(new Question(10, "@drawable/question_10", answerList10));
        }

        if(Objects.equals(topicId, "2")) {
            List<Answer> answerList11 = new ArrayList<>();
            answerList11.add(new Answer("Notebook", false));
            answerList11.add(new Answer("Pen", false));
            answerList11.add(new Answer("Ink", true));

            list.add(new Question(11, "@drawable/question_11", answerList11));


            List<Answer> answerList12 = new ArrayList<>();
            answerList12.add(new Answer("Eraser", false));
            answerList12.add(new Answer("Pen", true));
            answerList12.add(new Answer("Notebook", false));

            list.add(new Question(12, "@drawable/question_12", answerList12));


            List<Answer> answerList13 = new ArrayList<>();
            answerList13.add(new Answer("Blackboard", false));
            answerList13.add(new Answer("Eraser", false));
            answerList13.add(new Answer("Notebook", true));

            list.add(new Question(13, "@drawable/question_13", answerList13));


            List<Answer> answerList14 = new ArrayList<>();
            answerList14.add(new Answer("Ruler", false));
            answerList14.add(new Answer("Blackboard", false));
            answerList14.add(new Answer("Eraser", true));

            list.add(new Question(14, "@drawable/question_14", answerList14));


            List<Answer> answerList15 = new ArrayList<>();
            answerList15.add(new Answer("Pencil Case", false));
            answerList15.add(new Answer("Blackboard", true));
            answerList15.add(new Answer("Ruler", false));

            list.add(new Question(15, "@drawable/question_15", answerList15));


            List<Answer> answerList16 = new ArrayList<>();
            answerList16.add(new Answer("Pencil", false));
            answerList16.add(new Answer("Ruler", true));
            answerList16.add(new Answer("Pencil Case", false));

            list.add(new Question(16, "@drawable/question_16", answerList16));


            List<Answer> answerList17 = new ArrayList<>();
            answerList17.add(new Answer("Crayon", false));
            answerList17.add(new Answer("Pencil Case", true));
            answerList17.add(new Answer("Pencil", false));

            list.add(new Question(17, "@drawable/question_17", answerList17));


            List<Answer> answerList18 = new ArrayList<>();
            answerList18.add(new Answer("Sharpener", false));
            answerList18.add(new Answer("Crayon", false));
            answerList18.add(new Answer("Pencil", true));

            list.add(new Question(18, "@drawable/question_18", answerList18));


            List<Answer> answerList19 = new ArrayList<>();
            answerList19.add(new Answer("Ink", false));
            answerList19.add(new Answer("Sharpener", false));
            answerList19.add(new Answer("Crayon", true));

            list.add(new Question(19, "@drawable/question_19", answerList19));


            List<Answer> answerList20 = new ArrayList<>();
            answerList20.add(new Answer("Pen", false));
            answerList20.add(new Answer("Sharpener", true));
            answerList20.add(new Answer("Ink", false));

            list.add(new Question(20, "@drawable/question_20", answerList20));
        }

        if(Objects.equals(topicId, "3")) {

            List<Answer> answerList21 = new ArrayList<>();
            answerList21.add(new Answer("History", false));
            answerList21.add(new Answer("Mathematics", true));
            answerList21.add(new Answer("Geography", false));

            list.add(new Question(21, "@drawable/question_21", answerList21));


            List<Answer> answerList22 = new ArrayList<>();
            answerList22.add(new Answer("Physics", false));
            answerList22.add(new Answer("Science", false));
            answerList22.add(new Answer("Literature", true));

            list.add(new Question(22, "@drawable/question_22", answerList22));


            List<Answer> answerList23 = new ArrayList<>();
            answerList23.add(new Answer("History", true));
            answerList23.add(new Answer("Biology", false));
            answerList23.add(new Answer("Geography", false));

            list.add(new Question(23, "@drawable/question_23", answerList23));


            List<Answer> answerList24 = new ArrayList<>();
            answerList24.add(new Answer("Physics", true));
            answerList24.add(new Answer("Foreign Language", false));
            answerList24.add(new Answer("History", false));

            list.add(new Question(24, "@drawable/question_24", answerList24));


            List<Answer> answerList25 = new ArrayList<>();
            answerList25.add(new Answer("Biology", false));
            answerList25.add(new Answer("Science", true));
            answerList25.add(new Answer("Physics", false));

            list.add(new Question(25, "@drawable/question_25", answerList25));

            List<Answer> answerList26 = new ArrayList<>();
            answerList26.add(new Answer("Geography", true));
            answerList26.add(new Answer("Foreign Language", false));
            answerList26.add(new Answer("Literature", false));

            list.add(new Question(26, "@drawable/question_26", answerList26));


            List<Answer> answerList27 = new ArrayList<>();
            answerList27.add(new Answer("Geography", false));
            answerList27.add(new Answer("Biology", true));
            answerList27.add(new Answer("Physics", false));

            list.add(new Question(27, "@drawable/question_27", answerList27));


            List<Answer> answerList28 = new ArrayList<>();
            answerList28.add(new Answer("Literature", false));
            answerList28.add(new Answer("History", false));
            answerList28.add(new Answer("Music", true));

            list.add(new Question(28, "@drawable/question_28", answerList28));


            List<Answer> answerList29 = new ArrayList<>();
            answerList29.add(new Answer("Foreign Language", false));
            answerList29.add(new Answer("Music", false));
            answerList29.add(new Answer("Chemistry", true));

            list.add(new Question(29, "@drawable/question_29", answerList29));

            List<Answer> answerList30 = new ArrayList<>();
            answerList30.add(new Answer("Foreign Language", true));
            answerList30.add(new Answer("Physics", false));
            answerList30.add(new Answer("Biology", false));

        }
        return list;
    }

    // set du lieu cau hoi
    private void setDataQuestion(Question question) {
        if(question == null) {
            return;
        }
        mQuestion = question;
        tvAnswer1.setBackgroundResource(R.drawable.bg_green_corner_30);
        tvAnswer2.setBackgroundResource(R.drawable.bg_green_corner_30);
        tvAnswer3.setBackgroundResource(R.drawable.bg_green_corner_30);

        imgVocab.setImageResource(getResources().getIdentifier(question.getImage(), "drawable", getPackageName()));
        tvAnswer1.setText(question.getListAnswer().get(0).getContent());
        tvAnswer2.setText(question.getListAnswer().get(1).getContent());
        tvAnswer3.setText(question.getListAnswer().get(2).getContent());

        tvAnswer1.setOnClickListener(this);
        tvAnswer2.setOnClickListener(this);
        tvAnswer3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.tv_answer_1) {
            tvAnswer1.setBackgroundResource(R.drawable.bg_orange_corner_30);
            checkAnswer(tvAnswer1, mQuestion, mQuestion.getListAnswer().get(0));
        }
        if(v.getId() == R.id.tv_answer_2) {
            tvAnswer2.setBackgroundResource(R.drawable.bg_orange_corner_30);
            checkAnswer(tvAnswer2, mQuestion, mQuestion.getListAnswer().get(1));
        }
        if(v.getId() == R.id.tv_answer_3) {
            tvAnswer3.setBackgroundResource(R.drawable.bg_orange_corner_30);
            checkAnswer(tvAnswer3, mQuestion, mQuestion.getListAnswer().get(2));
        }
    }

    private void checkAnswer(final TextView textView, Question question, Answer answer) {
//        ham cho 1s trc khi check
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(answer.isCorrect()) {
                    currentScore++;
                    String mScore = String.valueOf(currentScore);
                    score.setText(mScore);
                    textView.setBackgroundResource(R.drawable.bg_blue_corner_30);
                    nextQuestion();
                } else {
                    textView.setBackgroundResource(R.drawable.bg_red_corner_30);
                    showAnswerCorrect(question);
                    gameOver();
                }
            }
        }, 1000);
    }

    private void gameOver() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showDialog("Gamer Over");
            }
        }, 1000);
    }

    private void showAnswerCorrect(Question question) {
        if(question == null || question.getListAnswer() == null || question.getListAnswer().isEmpty()) {
            return;
        }
        if(question.getListAnswer().get(0).isCorrect()) {
            tvAnswer1.setBackgroundResource(R.drawable.bg_blue_corner_30);
        }else if(question.getListAnswer().get(1).isCorrect()){
            tvAnswer2.setBackgroundResource(R.drawable.bg_blue_corner_30);
        }else if(question.getListAnswer().get(2).isCorrect()){
            tvAnswer3.setBackgroundResource(R.drawable.bg_blue_corner_30);
        }
    }

    private void nextQuestion() {
        if(currentQuestion == 9) {
            showDialog("Complete!");
        } else {
            currentQuestion++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    setDataQuestion(listQuestion.get(currentQuestion));
                }
            }, 1000);
        }
    }

    private void showDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setCancelable(false);
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String mScore = String.valueOf(currentScore);
                score.setText(mScore);
                setDataQuestion(listQuestion.get(currentQuestion));
                dialog.dismiss();
                // Trong MainActivity.java
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);

                String dataToSend = mScore;
                intent.putExtra("keyString", dataToSend);

                // Bắt đầu ResultActivity
                startActivity(intent);
                check = 1;
                finish();
            }
        });
        if(check == 1) {
            currentScore = 0;
            check = 0;
        }
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}


