package mcm.edu.ph.robles_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView displayText;

        displayText = findViewById(R.id.displayText);

        String firstName = "Kenichi";
        char middleinitial = 'R';
        String lastname = "Robles";
        int myAge = 18;
        float myDreamTVLGrade = 88.0f;

        displayText.setText("My Name is " +firstName+ " "
                +String.valueOf(middleinitial)+ " "
                +lastname+ " \nand my age is "
                +myAge+ " . I want my grade in TVL3, "
                +String.valueOf(myDreamTVLGrade));
    }
}