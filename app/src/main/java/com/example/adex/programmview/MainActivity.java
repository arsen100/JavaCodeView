package com.example.adex.programmview;

// http://androiddocs.ru/programmnoe-sozdanie-elementov-view-ekrana/
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //находим по id layout, в который будем добавлять программно новые элементы
        LinearLayout mainL = (LinearLayout) findViewById(R.id.mainLayout);

        //создаем параметры для новых элементов, которые определяют их ширину и высоту (используем встроенные константы)
        LayoutParams viewParams = new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);

        //Создаем элемент TextView
        TextView txtV = new TextView(this);
        txtV.setText("Hello from the code!");
        txtV.setLayoutParams(viewParams);
        //Добавляем элемент в Layout:
        mainL.addView(txtV);

        ////Создаем элемент Button
        Button btn = new Button(this);
        btn.setText("My button!");
        btn.setLayoutParams(viewParams);
        //Добавляем элемент в Layout:
        mainL.addView(btn);
    }
}

