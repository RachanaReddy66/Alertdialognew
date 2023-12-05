package in.visiontek.alertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button alertbutton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertbutton=findViewById(R.id.button);
        alertbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        DialogFragment dialogFragment = new AlertFragment();
        dialogFragment.show(getSupportFragmentManager(),"Alert Dialog");
    }
}