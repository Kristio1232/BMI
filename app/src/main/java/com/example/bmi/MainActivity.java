package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void setScreenContent(int id, String newContents){
        View contentView = findViewById(id);
        TextView textView = (TextView) contentView;
        textView.setText(newContents);
    }
    private String getScreenContent(int id){
        View contentView = findViewById(id);
        EditText contentText = (EditText) contentView;
        String content =contentText.getText().toString();
        return content;
    }
    public void ComputeBMI (View view){
        String stringWeight = getScreenContent(R.id.weightBox);
        String stringHeight = getScreenContent(R.id.heightBox);
        String stringBMI = BMIModel.formatBMI(BMIModel.getBMI(BMIModel.toDouble(stringWeight),BMIModel.toDouble(stringHeight)));
        setScreenContent(R.id.outputResult, stringBMI);
    }
}