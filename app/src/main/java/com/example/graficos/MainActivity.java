package com.example.graficos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(new EjemploView(this));
        //setContentView(new miView(this));

        //AnimationDrawable animacion = (AnimationDrawable)getDrawable(R.drawable.animation);

        ImageView imageView = new ImageView(this);
        setContentView(imageView);

        //relacionar el imageView con la animacion
//        imageView.setImageDrawable(animacion);
//        imageView.setBackgroundColor(Color.BLUE);
//        imageView.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        if(animacion.isRunning()){
//                            animacion.stop();
//                        }else {
//                            animacion.start();
//                        }
//                    }
//                }
//        );


        //generamos otra animacion es una transicion que no funciona con mas de 2 imagenes
//        ImageView imageTransition = new ImageView(this);
//        imageTransition.setBackgroundColor(Color.BLACK);
//        setContentView(imageTransition);
//        TransitionDrawable transicion = (TransitionDrawable) getDrawable(R.drawable.transition);
//        imageTransition.setImageDrawable(transicion);
//        transicion.startTransition(10000);


        //trasformar una vista
        setContentView(R.layout.activity_main);
        Button view = findViewById(R.id.button);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.transformacion);
        view.setAnimation(animacion);

    }
}