package com.example.listview_dynamic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_ItemSelect;
    private ListView list; //ListView 宣告

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_ItemSelect = (TextView) findViewById(R.id.txt_ItemSelect);
        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<CharSequence> arrAdapter
                = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.listview,  //設定清單內容資訊
                android.R.layout.simple_list_item_1); //設定列表選項格式
        //simple_list_item_1 另一種預設介面

        list.setAdapter(arrAdapter); //將設定好的 ArrayAdapter 丟進 ListView

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txt_ItemSelect.setText("你選擇了:"+((TextView) view).getText());
            }
        });


    };
}