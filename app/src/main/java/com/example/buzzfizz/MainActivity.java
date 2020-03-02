package com.example.buzzfizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView loop = (TextView) findViewById(R.id.loop);
        final EditText maxLoop = (EditText) findViewById(R.id.loopMax);
        final Button button = (Button) findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 String max = maxLoop.getText().toString();
                 int looper = Integer.parseInt(max);
                 loop.setText("");
            for (int i = 0; i <= looper; i++){

                boolean fizz = i % 3 == 0;
                boolean buzz = i % 5 == 0;
                if (i > 110){
                    loop.setText("Sorry, your number must be below 110.");
                }
                else if (buzz && fizz)
                {
                    loop.append("Fizzbuzz!\n");
                }
                else if (buzz)
                {
                    loop.append(" buzz ");
                } else if (fizz)
                {
                    loop.append(" fizz ");
                }
                else
                {
                    loop.append(String.valueOf(" "+ i + " "));
                }
                }
            }
        });
    }
}
