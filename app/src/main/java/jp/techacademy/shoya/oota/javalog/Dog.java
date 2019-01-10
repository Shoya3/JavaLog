package jp.techacademy.shoya.oota.javalog;
import android.util.Log;
public class Dog extends Animal implements Movable {

    // クラス変数
    static String to_jp = "犬";


    // 引数付きコンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メソッド
    @Override
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move(){
        Log.d("javatest",this.name+"("+this.age+"歳)"+"は全力で走った。");
    }

}
