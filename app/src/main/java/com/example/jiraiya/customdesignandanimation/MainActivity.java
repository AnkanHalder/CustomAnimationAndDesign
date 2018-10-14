package com.example.jiraiya.customdesignandanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.customanimationdesign.CustomDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog dialog_alert =new CustomDialog(MainActivity.this);
                dialog_alert.setPositiveButton("Yes");
                dialog_alert.setNeagtiveButton("No");
                dialog_alert.setMessage("Are You Sure ?This is a better version of the simple list of items that we saw earlier.\n" +
                        "Each of the items in the list has a CheckBoxbeside it." +
                        " The isChecked boolean value returns the checkBox current state.");
                dialog_alert.setTitle("Are you sure?");
                dialog_alert.setCanceledOnTouchOutside(false);
                dialog_alert.show();
            }
        });



    }
}
