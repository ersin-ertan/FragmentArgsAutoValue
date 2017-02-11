package com.nullcognition.fragmentargsautovalue;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    AutoTitle at = AutoTitle.create("at");
    AutoTitle at2 = AutoTitle.create("at2");

    ArrayList<AutoTitle> atl = new ArrayList<>(1);
    atl.add(at2);

    Fragment fragment = new MyFragmentBuilder(at, atl).build();

    getFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
  }
}
