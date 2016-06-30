package com.example.pratikratnaparkhi.showhideapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn1);
        imageView=(ImageView)findViewById(R.id.image1);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(imageView.getVisibility()==View.INVISIBLE){
                            imageView.setVisibility(View.VISIBLE);
                            button.setText("Hide");
                        }else if(imageView.getVisibility()==View.VISIBLE){
                            imageView.setVisibility(View.INVISIBLE);
                            button.setText("Show");
                        }

                    }
                }
        );

    }
}
