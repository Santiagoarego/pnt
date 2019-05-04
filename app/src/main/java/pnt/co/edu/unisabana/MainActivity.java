package pnt.co.edu.unisabana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.edit1);
        txt1 = (TextView) findViewById(R.id.txtview);

    }

    public void cambiar(View view) {
        if(et1.getText().length()!=0) {
            txt1.setText(et1.getText());
        }else{
            Toast.makeText(this,"Ingresa un texto",Toast.LENGTH_SHORT).show();
        }
    }
}
