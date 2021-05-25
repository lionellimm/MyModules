package sg.edu.rp.c346.id20015553.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button c346Button;
    Button c203Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346Button = findViewById(R.id.c346Button);
        c203Button = findViewById(R.id.c203Button);

        c346Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, c346.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });

        c203Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, c203.class);
                intent.putExtra("Code", "C203");
                intent.putExtra("Name", "Web Appln Development in php");
                intent.putExtra("Year", "2020");
                intent.putExtra("Semester", "1");
                intent.putExtra("Credit", "4");
                intent.putExtra("Venue", "W67N");
                startActivity((intent));
            }
        });
    }
}