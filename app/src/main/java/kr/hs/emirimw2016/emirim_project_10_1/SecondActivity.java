package kr.hs.emirimw2016.emirim_project_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnClose = findViewById(R.id.btn_close);

    }
    View.OnClickListener btnCloseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v){

        }
    };
}