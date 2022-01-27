package com.example.graficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

import androidx.core.content.ContextCompat;

public class EjemploView extends View {
    public final Context context;
    private ShapeDrawable miForma;

    public EjemploView(Context context) {
        super(context);
        this.context=context;

        miForma = new ShapeDrawable(new RectShape());
        miForma.setBounds(300, 500, 500, 900);
        Paint miPincel = miForma.getPaint();
        miPincel.setStrokeWidth(10);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //fondos

        //setBackgroundColor(Color.BLUE);

        //setBackgroundColor(Color.parseColor("#ff5200"));

        //setBackground(ContextCompat.getDrawable(context, R.drawable.ic_launcher_background));

        setBackground(ContextCompat.getDrawable(context, R.drawable.gradient));

        //dibujar tipo paint
        Paint pincel = new Paint();
        //asignamos color al pincel
        pincel.setColor(Color.BLUE);
        //asignamos ancho de la brocha
        pincel.setStrokeWidth(10);
        //asignamos el estilo de brocha rellenar espacio vacio
        pincel.setStyle(Paint.Style.FILL_AND_STROKE);
        //dibujamos el pincel
        canvas.drawCircle(100,100,30, pincel);

        Paint pincel2 = new Paint();
        pincel2.setColor(Color.YELLOW);
        pincel2.setStrokeWidth(5);
        pincel2.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(250, 250, 50, pincel2);

        canvas.drawRect(20,200,40, 220,pincel2);

        //rectangulo con bordes redondeados
        canvas.drawRoundRect(500,500, 700, 700,20,20, pincel2);

        //otra forma de dibujar un circulo
        Path trazo = new Path();
        trazo.addCircle(300,400, 100, Path.Direction.CCW);
        canvas.drawPath(trazo, pincel2);

        pincel2.setStrokeWidth(5);
        pincel2.setTextSize(40);
        pincel2.setTypeface(Typeface.MONOSPACE);
        canvas.drawTextOnPath("Desarrollo Android", trazo, 200,90, pincel2);

        //trazos
        Path trazo2 = new Path();

        //no dibuja solo ubica el puntero
        trazo2.moveTo(0,0);
        trazo2.lineTo(150, 150);
        trazo2.cubicTo(150, 250, 200,300, 270,370);

        canvas.drawPath(trazo2, pincel2);
        canvas.drawTextOnPath("Desarrollo Android", trazo2, 50, -30, pincel2);

        Drawable miImagenYoutube = ContextCompat.getDrawable(context, R.drawable.ic_youtube_icon_f7801);
        Rect rect = new Rect(100, 700, 300, 800);
        miImagenYoutube.setBounds(rect);
        miImagenYoutube.draw(canvas);

        miForma.draw(canvas);

    }
}
