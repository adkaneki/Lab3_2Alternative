package my.edu.tarc.lab3_2alternative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMessage = findViewById(R.id.textViewMessage);
    }

    public void showMessage(View view){
        textViewMessage.setText(getString(R.string.message));
    }

}
