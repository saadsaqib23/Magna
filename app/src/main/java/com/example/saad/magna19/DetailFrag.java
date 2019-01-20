package com.example.saad.magna19;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class DetailFrag extends Fragment {
    String name,rules;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle comp = getArguments();
        name = comp.getString("name");
        rules = comp.getString("rules");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.detail_frag,container,false);
        TextView textView = (TextView) view.findViewById(R.id.name);
        textView.setText(name);

        EditText editText = (EditText) view.findViewById(R.id.rules);
        editText.setText(rules);
        return view;
    }
}
