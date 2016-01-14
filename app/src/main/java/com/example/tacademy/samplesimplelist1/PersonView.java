package com.example.tacademy.samplesimplelist1;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-14.
 */
public class PersonView extends FrameLayout{

    public PersonView(Context context) {
        super(context);
        init();
    }

    ImageView iconView;
    TextView textView_name, textView_description;
    Person person;
    private void init(){
        inflate(getContext(), R.layout.view_person, this);
        iconView = (ImageView)findViewById(R.id.image_icon);
        textView_name = (TextView)findViewById(R.id.text_name);
        textView_description = (TextView)findViewById(R.id.text_description);

    }

    public void setPerson(Person p){
        person = p;
        if( p.getIcon() != null){
            iconView.setImageDrawable(p.getIcon());
        }else {
            iconView.setImageResource(R.mipmap.ic_launcher);
        }
        textView_name.setText(p.getNameAndAge());
        textView_description.setText(p.getDescription());
    }



}
