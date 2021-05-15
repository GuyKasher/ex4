package exercise.find.roots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent=getIntent();
        long num1=intent.getLongExtra("root1",0);
        long num2=intent.getLongExtra("root2",0);
        long original_number=intent.getLongExtra("original_number",0);
        String time=intent.getStringExtra("time");
        TextView root1_view=findViewById(R.id.root1);
        TextView root2_view=findViewById(R.id.root2);
        TextView original_time_view=findViewById(R.id.original);
        TextView time_view=findViewById(R.id.time);
        root1_view.setText("root 1: "+String.valueOf(num1));
        root2_view.setText("root 2: "+String.valueOf(num2));
        original_time_view.setText("original number: "+String.valueOf(original_number));
        time_view.setText("calculation time: "+time);

    }
}