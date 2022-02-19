package itec.softwareengineer.mytimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import itec.softwareengineer.mytimer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}