package com.example.luai.activity5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EDIT_TEXT_INTENT_KEY = "edit_text";

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.et_notification_text);

    }

    public void notifyText(View view) {

        // TODO (11): Create an explicit intent to NotificationIntentService, pass mEditText's text with key EDIT_TEXT_INTENT_KEY, and set action to ACTION_NOTIFY_EDIT_TEXT. Then use this intent to start service


    }

}
