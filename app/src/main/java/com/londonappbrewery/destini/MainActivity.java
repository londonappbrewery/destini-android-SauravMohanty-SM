package com.londonappbrewery.destini;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mTextView;
    Button mbuttonTop;
    Button mbuttonBottom;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mTextView = (TextView) findViewById(R.id.storyTextView);
        mbuttonTop = (Button) findViewById(R.id.buttonTop);
        mbuttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        //TopButton

        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1 || mStoryIndex == 2){
                    mTextView.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                 }
                else {
                    mTextView.setText(R.string.T6_End);
                    mbuttonTop.setVisibility(View.INVISIBLE);
                    mbuttonBottom.setVisibility(View.INVISIBLE);
                 }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        //EndButton

        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1){
                    mTextView.setText(R.string.T2_Story);
                    mbuttonTop.setText(R.string.T2_Ans1);
                    mbuttonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 2){
                    mTextView.setText(R.string.T4_End);
                    mbuttonTop.setVisibility(View.INVISIBLE);
                    mbuttonBottom.setVisibility(View.INVISIBLE);
                }
                else {
                    mTextView.setText(R.string.T5_End);
                    mbuttonTop.setVisibility(View.INVISIBLE);
                    mbuttonBottom.setVisibility(View.INVISIBLE);
                }
            }
        });


    }
}
