package com.example.qx.q;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {
    String str1 = "";
    String str2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);
        // 设置“确定”按键监听
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                str2 = "";
                // 根据ID找到RadioGroup实例
                RadioGroup group = (RadioGroup) findViewById(R.id.radiogroup);
                // 绑定一个匿名监听器
                group.setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup arg0, int arg1) {
                        // 获取变更后的选中项的ID

                        int radioButtonId = arg0.getCheckedRadioButtonId();
                        // 根据ID获取RadioButton的实例
                        RadioButton radiobutton = (RadioButton) MainActivity.this
                                .findViewById(radioButtonId);
                        // 更新文本内容，以符合选中项
                        str1 ="你的性别是："+(String) radiobutton.getText();

                    }
                });
                str2 =";你的体育爱好是：";
                CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
                CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
                CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
                CheckBox checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
                CheckBox checkbox5 = (CheckBox) findViewById(R.id.checkbox5);
                //对选项进行确认
                if (checkbox1.isChecked()) {
                    str2 = str2 + checkbox1.getText()+ "  ";
                }
                if (checkbox2.isChecked()) {
                    str2 = str2 + checkbox2.getText()+ "  ";
                }
                if (checkbox3.isChecked()) {
                    str2 = str2 +  checkbox3.getText()+ "  ";
                }
                if (checkbox4.isChecked()) {
                    str2 = str2 +  checkbox4.getText()+ "  ";
                }
                if (checkbox5.isChecked()) {
                    str2 = str2 +  checkbox5.getText()+ "  ";
                }
                DisplayToast(str1+str2);
            }
        });

    }


    public void DisplayToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/
}
