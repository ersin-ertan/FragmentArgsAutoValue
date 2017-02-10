package com.nullcognition.fragmentargsautovalue;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.hannesdorfmann.fragmentargs.FragmentArgs;
import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs;
import com.hannesdorfmann.fragmentargs.bundler.CastedArrayListArgsBundler;
import java.util.List;

/**
 * Created by mms on 2/10/17.
 */

@FragmentWithArgs public class MyFragment extends Fragment {

  @Arg AutoTitle autoTitle; // working
  @Arg(bundler = CastedArrayListArgsBundler.class) List<AutoTitle> autoTitleList; // not working

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FragmentArgs.inject(this); // read @Arg fields
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {

    t(autoTitle.title());

    for (AutoTitle at : autoTitleList) t(at.title());

    return null;
  }

  void t(String text) {
    Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
  }
}
