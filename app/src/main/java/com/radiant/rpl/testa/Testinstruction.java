package com.radiant.rpl.testa;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.radiant.rpl.testa.ExamSection.TestQuestion;

import radiant.rpl.radiantrpl.R;

public class Testinstruction extends AppCompatActivity {
    Button testinstructproceed;
    AlertDialog alertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testinstruction);
        testinstructproceed=findViewById(R.id.testinstructproceed);
        testinstructproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    public void showDialog(){

        CharSequence[] values = {"English","Hindi"};

        AlertDialog.Builder builder = new AlertDialog.Builder(Testinstruction.this);
        builder.setTitle("Choose Your Language");
        builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                switch (i)
                {
                    case 0:
                        Toast.makeText(Testinstruction.this,"yeah",Toast.LENGTH_SHORT).show();
                        Intent ii =new Intent(Testinstruction.this,TestQuestion.class);
                        startActivity(ii);

                        break;
                    case 1:
                        Toast.makeText(Testinstruction.this,"yeah",Toast.LENGTH_SHORT).show();

                        Intent iii =new Intent(Testinstruction.this,TestQuestion.class);
                        startActivity(iii);

                        break;
                }

                alertDialog.dismiss();



            }
        });

        alertDialog = builder.create();
        alertDialog.show();





    }






}
