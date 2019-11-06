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
