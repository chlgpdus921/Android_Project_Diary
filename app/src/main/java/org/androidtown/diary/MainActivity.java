package org.androidtown.diary;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setListener();
    }

    private void init() {
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
    }

    ;

    private void setListener() {
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_input:
                             //   textView.setText("D-day");
                                break;
                            case R.id.action_day:
                              ///  textView.setText("Music");
                                break;
                            case R.id.action_diary:
                               // textView.setText("Schedules");
                                break;
                            case R.id.action_todo:
                                // textView.setText("Schedules");
                                break;
                        }
                        return true;
                    }
                });
    }
}
