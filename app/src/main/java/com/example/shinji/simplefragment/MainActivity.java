package com.example.shinji.simplefragment;

import android.graphics.Color;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// コードからFragmentを追加

		// Fragmentを作成します
		MainFragment fragment1 = new MainFragment();
		// Fragmentの追加や削除といった変更を行う際は、Transactionを利用します
		FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
		// 新しく追加を行うのでaddを使用します
		// 他にも、よく使う操作で、replace removeといったメソッドがあります
		// メソッドの1つ目の引数は対象のViewGroupのID、2つ目の引数は追加するfragment
//		transaction.add(R.id.container1, fragment1);
		transaction1.add(R.id.container1, MainFragment.createInstance("hoge", Color.RED));
		// 最後にcommitを使用することで変更を反映します
		transaction1.commit();

		MainFragment fragment2 = new MainFragment();
		FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
		transaction2.add(R.id.container2, MainFragment.createInstance("fuga", Color.BLUE));
		transaction2.commit();
	}
}
