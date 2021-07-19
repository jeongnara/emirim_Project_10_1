package kr.hs.emirimw2016.emirim_project_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btnThirdClose = findViewById(R.id.btn_third_close);
        btnThirdClose.setOnClickListener(btnThirdCloseListenner);
    }

    View.OnClickListener btnThirdCloseListenner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}