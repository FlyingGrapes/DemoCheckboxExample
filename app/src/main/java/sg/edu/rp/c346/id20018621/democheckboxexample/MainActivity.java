package sg.edu.rp.c346.id20018621.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cbEnabled.isChecked()){
                    tvShow.setText("The discount is given.");
                    Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();

                }else {
                    tvShow.setText("The discount is not given.");
                }
            }
        });

    }

    private double calcPay(double price, double discount){

        if(cbEnabled.isChecked()) {
            double pay = calcPay(100, 20);
            tvShow.setText("The discount is given. You need to pay " + pay);
        }
        else {
            double pay = calcPay(100, 0);
            tvShow.setText("The discount is not given. You need to pay " + pay);
        }
        return pay;

    }
}