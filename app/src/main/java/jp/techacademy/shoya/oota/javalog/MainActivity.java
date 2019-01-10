package jp.techacademy.shoya.oota.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human=new Human("田中",20); //名前を田中、年齢を20でHumanのインスタンスを作る

        human.say();

        human.think();
    }


}
