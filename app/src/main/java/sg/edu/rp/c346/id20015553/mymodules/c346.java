package sg.edu.rp.c346.id20015553.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class c346 extends AppCompatActivity {

    TextView textCode;
    TextView textName;
    TextView textYear;
    TextView textSemester;
    TextView textCredit;
    TextView textVenue;
    Button backButton;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);
        textCode = findViewById(R.id.textCode);
        textName = findViewById(R.id.textName);
        textYear = findViewById(R.id.textYear);
        textSemester = findViewById(R.id.textSemester);
        textCredit = findViewById(R.id.textCredit);
        textVenue = findViewById(R.id.textVenue);
        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(c346.this, MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });



        Intent intentReceived = getIntent();
        String a = intentReceived.getStringExtra("Code");
        String b = intentReceived.getStringExtra("Name");
        String c = intentReceived.getStringExtra("Year");
        String d = intentReceived.getStringExtra("Semester");
        String e = intentReceived.getStringExtra("Credit");
        String f = intentReceived.getStringExtra("Venue");

        textCode.setText("Module Code: " + a);
        textName.setText("Module Name: " + b);
        textYear.setText("Academic Year: " + c);
        textSemester.setText("Semester: " + d);
        textCredit.setText("Module Credit: " + e);
        textVenue.setText("Module Venue: " + f);

    }
}