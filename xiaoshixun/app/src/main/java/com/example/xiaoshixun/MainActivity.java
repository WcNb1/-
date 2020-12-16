package com.example.xiaoshixun;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.xiaoshixun.factory.phone;
import com.example.xiaoshixun.factory.phoneFacotry;
import com.example.xiaoshixun.factory_a.XiaoMMiphonefactory;
import com.example.xiaoshixun.factory_a.XiaoMiMiphonefactory;
import com.example.xiaoshixun.factory_c.ThreadPoolFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt;
    private Button bt_a;
    private Button bt_b;
    private Button bt_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(this);
        bt_a = (Button) findViewById(R.id.bt_a);
        bt_a.setOnClickListener(this);
        bt_b = (Button) findViewById(R.id.bt_b);
        bt_b.setOnClickListener(this);
        bt_c = (Button) findViewById(R.id.bt_c);
        bt_c.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt:
                phone iphone = phoneFacotry.createpahone("iphone");
                iphone.aaa();

                phone miphone = phoneFacotry.createpahone("miphone");
                miphone.aaa();
                break;
            case R.id.bt_a:
                XiaoMMiphonefactory xiaoMMiphonefactory = new XiaoMMiphonefactory();
                com.example.xiaoshixun.factory_a.phone phone = xiaoMMiphonefactory.createPhone();
                phone.nbnb();

                new XiaoMiMiphonefactory().createPhone().nbnb();
                //phone1.nbnb();
                break;
            case R.id.bt_b:
                break;
            case R.id.bt_c:

                ThreadPoolFactory.getThreadPool(ThreadPoolFactory.NB_1).
                        executeTask(new Runnable() {
                            @Override
                            public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(MainActivity.this, "牛逼牛逼牛逼牛逼", Toast.LENGTH_SHORT).show();

                                }
                            });
                            }
                        });

                break;
        }
    }
}
