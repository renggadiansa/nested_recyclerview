package com.example.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var parentList = ArrayList<ParentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.parent_recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter
    }
    private fun addDataToList() {
        val childItem1 = ArrayList<ChildItem>()
        childItem1.add(ChildItem("C", R.drawable.c))
        childItem1.add(ChildItem("C#", R.drawable.csharp))
        childItem1.add(ChildItem("Java", R.drawable.java))
        childItem1.add(ChildItem("C++", R.drawable.cplusplus))
        parentList.add(ParentItem("Game Development", R.drawable.console, childItem1))

        val childItem2 = ArrayList<ChildItem>()
        childItem2.add(ChildItem("Kotlin", R.drawable.kotlin))
        childItem2.add(ChildItem("XML", R.drawable.xml))
        childItem2.add(ChildItem("Java", R.drawable.java))
        parentList.add(
            ParentItem(
                "Android Development",
                R.drawable.android,
                childItem2
            )
        )
        val childItem3 = ArrayList<ChildItem>()
        childItem3.add(ChildItem("Javascript", R.drawable.javascript))
        childItem3.add(ChildItem("HTML", R.drawable.html))
        childItem3.add(ChildItem("CSS", R.drawable.css))
        parentList.add(
            ParentItem(
                "Front End Web",
                R.drawable.front_end,
                childItem3
            )
        )
        val childItem4 = ArrayList<ChildItem>()
        childItem4.add(ChildItem("Julia", R.drawable.julia))
        childItem4.add(ChildItem("Python", R.drawable.python))
        childItem4.add(ChildItem("R", R.drawable.r))
        parentList.add(
            ParentItem(
                "Artificial Intelligence",
                R.drawable.ai,
                childItem4
            )
        )
        val childItem5 = ArrayList<ChildItem>()
        childItem5.add(ChildItem("Java", R.drawable.java))
        childItem5.add(ChildItem("Python", R.drawable.python))
        childItem5.add(ChildItem("PHP", R.drawable.php))
        parentList.add(
            ParentItem(
                "Back End Web",
                R.drawable.backend,
                childItem5
            )
        )
    }
}