package com.example.hello_constraits;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        Button toast = findViewById(R.id.button_toast);
        Button count = findViewById(R.id.button_count);
        Button zero = findViewById(R.id.button_zero);
        TextView st = findViewById(R.id.show_count);

        if (st != null) {
            st.setText("0");
        }

        if (zero != null) {
            zero.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
            zero.setTextColor(Color.BLACK);
        }

        if (toast != null) {
            toast.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show());
        }

        if (count != null) {
            count.setOnClickListener(v -> {
                if (st == null) return;
                int stevilo = 0;
                try {
                    stevilo = Integer.parseInt(st.getText().toString());
                } catch (NumberFormatException ignored) {
                }
                stevilo++;

                st.setText(String.valueOf(stevilo));

                if (stevilo % 2 == 0) {
                    v.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                } else {
                    v.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                }

                if (zero != null) {
                    zero.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                    zero.setTextColor(Color.BLACK);
                }
            });
        }

        if (zero != null) {
            zero.setOnClickListener(v -> {
                if (st != null) {
                    st.setText("0");
                }

                v.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                if (v instanceof Button) {
                    ((Button) v).setTextColor(Color.BLACK);
                }
                if (count != null) {
                    count.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#00008B")));
                }
            });
        }
    }
}
