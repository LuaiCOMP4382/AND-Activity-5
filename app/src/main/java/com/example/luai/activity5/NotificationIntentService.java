package com.example.luai.activity5;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class NotificationIntentService extends IntentService {

    public NotificationIntentService() {
        // TODO (2): Pass in the class name in super
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {

            // TODO (10): Get the action and the edit text (EDIT_TEXT_INTENT_KEY) from the intent, and execute the task

            NotificationTasks.executeTask(this, ..., ...);

        }
    }

}
