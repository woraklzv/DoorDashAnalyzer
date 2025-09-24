package com.ejemplo;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("🚗 ¡App Funciona!\nOrder Analyzer");
        tv.setTextSize(20);
        tv.setPadding(50, 100, 50, 50);
        setContentView(tv);
    }
}
