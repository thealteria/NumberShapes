package com.thealteria.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            class Number {

                int number;

                public boolean squ() {

                    double sqrt = Math.sqrt(number);
                    if(sqrt == Math.floor(sqrt)) {


                        return true;
                    }

                    else {

                        return false;
                    }
                }

                public boolean tri() {
                    int x = 1;
                    int trino = 1;

                    while (trino < number) {
                        x++;

                        trino+= x;

                    }

                    if (trino == number){
                        return true;
                    }

                    else {
                        return false;
                    }

                }
            }



    public void check(View view) {

        String msg = "";

        EditText userno = (EditText) findViewById(R.id.userNo);

        if (userno.getText().toString().isEmpty()) {

            Toast.makeText(MainActivity.this, "Enter a number!", Toast.LENGTH_LONG).show();
        }

        else {

            Number no = new Number();
            no.number = Integer.parseInt(userno.getText().toString());


            if (no.squ()) {
                if (no.tri()) {

                    msg = no.number + " is both, triangular and square!";
                } else {

                    msg = no.number + " is square but not triangular!";
                }
            } else {

                if (no.tri()) {

                    msg = no.number + " is triangular and not square!";
                } else {

                    msg = no.number + " is neither square nor triangular!";
                }

            }

            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
