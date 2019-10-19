package com.example.alertdelmta;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Delta extends AppCompatActivity {

    private View v;

    String button1String = "Вкусная пища";
    String button2String = "Здоровая пища";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_delta);

        onClick(v);


    }

        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Delta.this);
            builder.setTitle("Важное сообщение!")
                    .setMessage("Покормите кота!")
                    .setIcon(R.drawable.ic_launcher_background)
                    .setCancelable(false)
                    .setNegativeButton(button1String,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Intent intent = new Intent(Delta.this,MainActivity.class);
                                    startActivity(intent);
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
    }
}
