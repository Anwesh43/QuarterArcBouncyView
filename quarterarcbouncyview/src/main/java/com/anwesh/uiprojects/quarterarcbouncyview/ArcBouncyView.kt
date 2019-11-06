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

fun Int.inverse() : Float = 1f / this
fun Float.maxScale(i : Int, n : Int) : Float = Math.max(0f, this - i * n.inverse())
fun Float.divideScale(i : Int, n : Int) : Float = Math.min(n.inverse(), maxScale(i, n)) * n
fun Float.sinify() : Float = Math.sin(this * Math.PI).toFloat()
fun Float.cosify() : Float = 1 - Math.sin(Math.PI / 2 + (Math.PI / 2) * this).toFloat()
