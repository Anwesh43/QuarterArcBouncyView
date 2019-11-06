package com.anwesh.uiprojects.linkedquarterarcbouncyview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.quarterarcbouncyview.ArcBouncyView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ArcBouncyView.create(this)
    }
}
