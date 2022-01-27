package com.example.graficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class miView extends View {

    private final Context context;
    private final ShapeDrawable miForma;

    public miView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;

        miForma = new ShapeDrawable(new OvalShape());
        miForma.getPaint().setColor(0xff00ff00);
    }


    //dibuja mi forma
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        miForma.draw(canvas);
    }

    //cambiar dimensiones de forma
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        //objeto padre
        super.onSizeChanged(w, h, oldw, oldh);

        //nuevo objeto redimesionado
        miForma.setBounds(0, 0, w, h);
    }
}
