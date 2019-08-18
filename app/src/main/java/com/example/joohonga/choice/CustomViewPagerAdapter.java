package com.example.joohonga.choice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.joohonga.choice.model.Question;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import java.util.List;

public class CustomViewPagerAdapter extends PagerAdapter {

    LayoutInflater layoutInflater;
    List<Question> questions;

    public CustomViewPagerAdapter(LayoutInflater layoutInflater){
        this.layoutInflater = layoutInflater;
    }

    public void add(List<Question> questions){
        this.questions = questions;
    }

    @Override
    public int getCount() {
        return questions.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = layoutInflater.inflate(R.layout.viewpager_item,null);
        RadioButton rb1,rb2,rb3,rb4;
        ImageView iv1, iv2, iv3, iv4;

        rb1 = view.findViewById(R.id.first_choice);
        rb2 = view.findViewById(R.id.second_choice);
        rb3 = view.findViewById(R.id.third_choice);
        rb4 = view.findViewById(R.id.fourth_choice);


        iv1 = view.findViewById(R.id.first_img);
        iv2 = view.findViewById(R.id.second_img);
        iv3 = view.findViewById(R.id.third_img);
        iv4 = view.findViewById(R.id.fourth_img);




        return super.instantiateItem(container, position);
    }
}
