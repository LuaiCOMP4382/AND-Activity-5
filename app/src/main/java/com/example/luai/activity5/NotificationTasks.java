package com.example.luai.activity5;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;

public class NotificationTasks {

    public static final String ACTION_NOTIFY_EDIT_TEXT = "notify_edit_text";
    private static final int EDIT_TEXT_NOTIFICATION_ID = 100;
    private static final int EDIT_TEXT_PENDING_INTENT_ID = 200;
    private static final String EDIT_TEXT_NOTIFICATION_CHANNEL_ID = "edit_text_notification_channel";

    public static void executeTask(Context context, String action, String editText) {

        // TODO (3): If the action is ACTION_NOTIFY_EDIT_TEXT, call notifyEditText

    }

    public static void notifyEditText(Context context, String editText) {

        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);

        // TODO (4): Create an intent that goes from context to MainActivity

        // TODO (5): Create an activity pending intent with id EDIT_TEXT_PENDING_INTENT_ID that uses the intent you just created, and use FLAG_UPDATE_CURRENT flag

        PendingIntent pendingIntent = PendingIntent.getActivity(
                ,
                ,
                ,

        );

        // TODO (6): Set the notification's content's title. Use edit_text_notification_title from strings.xml
        // TODO (7): Set the notification's content's text to the passed editText
        // TODO (8): Don't forget to set the notification's content's intent to the pending intent you created
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context, EDIT_TEXT_NOTIFICATION_CHANNEL_ID)
                .setColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .setContentTitle(...)
                .set...
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setStyle(new NotificationCompat.BigTextStyle().bigText(editText))
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .setAutoCancel(true);

        Notification theNotificationThatWasJustBuiltByAGreatNanodegreeStudent = notificationBuilder.build();

        // TODO (9): Notify using EDIT_TEXT_NOTIFICATION_ID as id
        notificationManager.notify(..., ...);
    }

}
