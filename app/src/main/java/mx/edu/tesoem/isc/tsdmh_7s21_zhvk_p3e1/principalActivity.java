package mx.edu.tesoem.isc.tsdmh_7s21_zhvk_p3e1;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class principalActivity extends AppCompatActivity {
    SeekBar skb1;
    TextView txtskb1;

    SwitchCompat sh1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        skb1 = findViewById(R.id.skb1);
        sh1 = findViewById(R.id.sh1);
        txtskb1 = findViewById(R.id.txtskb1);
        skb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtskb1.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sh1.isChecked()){
                    Toast.makeText(principalActivity.this, "se activo", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(principalActivity.this, "no activado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}