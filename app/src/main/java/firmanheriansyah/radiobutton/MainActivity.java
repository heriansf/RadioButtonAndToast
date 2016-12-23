package firmanheriansyah.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup mRadio;
    Button mButton;
    RadioButton mRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {

        mRadio = (RadioGroup)findViewById(R.id.radioGroup);
        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click radio button untuk mendapatkan pilihan dari radio group
                int selectedId = mRadio.getCheckedRadioButtonId();
                //lalu radio button menemukan id dari radio group
                mRadioButton = (RadioButton) findViewById(selectedId);
                //Sehingga menampilkan toast
                Toast.makeText(MainActivity.this, mRadioButton.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
