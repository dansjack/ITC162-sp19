package com.example.notificationexample;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {

    // give channels descriptive names
    public static final String CHANNEL_1_ID = "channel1";
    public static final String CHANNEL_2_ID = "channel2";

    @Override
    // called right when the app starts
    // good place to set up our channels because
    // this way we don't do it unnecessarily often
    public void onCreate() {
        super.onCreate();

        createNotificationChannels();

    }

    private void createNotificationChannels() {
        // check if on Android Oreo or higher
        // because notifications not available
        // on lower API levels
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel1 = new NotificationChannel(
                    CHANNEL_1_ID,
                    "Channel 1", // user will see this name, make it descriptive
                    NotificationManager.IMPORTANCE_HIGH // how disruptive the notification will be
            );
            channel1.setDescription("This is Channel 1");

            NotificationChannel channel2 = new NotificationChannel(
                    CHANNEL_2_ID,
                    "Channel 2", // user will see this name, make it descriptive
                    NotificationManager.IMPORTANCE_LOW // how disruptive the notification will be
            );
            channel2.setDescription("This is Channel 2");

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
            manager.createNotificationChannel(channel2);
        }
    }
}
