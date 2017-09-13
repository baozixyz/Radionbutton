package fubuki.com.radionbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    public void init(){
       //RadioGroup sex=(RadioGroup)findViewById(R.id.rg1);
       // sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        //    @Override
       //     public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
       //         RadioButton r=(RadioButton)findViewById(i);
       //         r.getText();
       //     }
      //  });
        final RadioGroup sex=(RadioGroup)findViewById(R.id.rg1);
        Button button=(Button)findViewById(R.id.btn1);
        TextView tv2=(TextView)findViewById(R.id.tv2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<sex.getChildCount();i++){
                    RadioButton r=(RadioButton)sex.getChildAt(i);
                    if(r.isChecked()){
                        //r.getText();
                        Toast.makeText(MainActivity.this,r.getText(),Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });


    }
}
