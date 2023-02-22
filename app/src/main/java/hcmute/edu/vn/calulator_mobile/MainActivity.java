package hcmute.edu.vn.calulator_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
    }
    ptotected void Hocbaidiloz()
    {
        log.e("concak");
    }
    ptotected void Lozmaidihochtheduc()
    {
        log.e("Tuoi loz");
    }
}