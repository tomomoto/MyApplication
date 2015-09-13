package tom.lession9;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдем View-элементы
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        // создаем обработчик нажатия
        /*OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };*/

        // присвоим обработчик кнопке OK (btnOk)
        //btnOk.setOnClickListener(this);
        //btnCancel.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        // Меняем текст в TextView (tvOut)
        switch(v.getId()){
            case R.id.btnOk:
                tvOut.setText("Нажата кнопка ОК!");
                break;
            case R.id.btnCancel:
                tvOut.setText("Нажата кнопка Cancel!");
                break;
        }
    }
}
