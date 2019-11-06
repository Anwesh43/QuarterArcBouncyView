package com.anwesh.uiprojects.quarterarcbouncyview

/**
 * Created by anweshmishra on 06/11/19.
 */

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF

val nodes : Int =  5
val sizeFactor : Float = 2.9f
val parts : Int = 4
val strokeFactor : Int  = 90
val rFactor : Float = 4f
val foreColor : Int = Color.parseColor("#f44336")
val backColor : Int = Color.parseColor("#BDBDBD")
val scGap : Float = 0.02f
val delay : Long = 30
val fullDeg : Float = 360f

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
fun Float.sinify() : Float = Math.sin(this * Math.PI).toFloat()
fun Float.cosify() : Float = 1 - Math.sin(Math.PI / 2 + (Math.PI / 2) * this).toFloat()

fun Canvas.drawArcLine(i : Int, size : Float, scale : Float, paint : Paint) {
    val r : Float = size / rFactor
    val sc : Float = scale.divideScale(i, parts)
    val sf : Float = sc.sinify()
    val scf : Float = sc.divideScale(1, 2).cosify()
    val deg : Float = fullDeg / parts
    save()
    rotate(deg * i)
    save()
    rotate(deg * sf)
    drawLine(0f, 0f, size, 0f, paint)
    restore()
    drawArc(RectF(-r, -r, r, r), fullDeg - deg, deg * scf, true, paint)
    restore()
}

fun Canvas.drawABNode(i : Int, scale : Float, paint : Paint) {
    val w : Float = width.toFloat()
    val h : Float = height.toFloat()
    val gap : Float =  h / (nodes + 1)
    val size : Float = gap / sizeFactor
    paint.color = foreColor
    paint.strokeCap = Paint.Cap.ROUND
    paint.strokeWidth = Math.min(w, h) / strokeFactor
    save()
    translate(w / 2, gap * (i + 1))
    drawArcLine(i, size, scale, paint)
    restore()
}
