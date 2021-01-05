package uz.unzosoft.movie.ui.taskmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import uz.unzosoft.movie.R
import uz.unzosoft.movie.adapters.ICycleAdapter
import uz.unzosoft.movie.models.IRecycle

class SecondActivity : AppCompatActivity() {
    lateinit var list: ArrayList<IRecycle>
    lateinit var adapter: ICycleAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        loadData()
        adapter = ICycleAdapter(list)
        rvCycle.adapter = adapter

    }

    private fun loadData() {
        list = ArrayList()
        list.add(
            IRecycle(
                "Automative",
                R.drawable.ic_car,
                R.color.a1
            )
        )
        list.add(
            IRecycle(
                "Batteries",
                R.drawable.ic_battery_charge,
                R.color.a2
            )
        )
        list.add(
            IRecycle(
                "Electronics",
                R.drawable.ic_repair_tools,
                R.color.a3
            )
        )
        list.add(
            IRecycle(
                "Garden",
                R.drawable.ic_growth,
                R.color.a4
            )
        )
        list.add(
            IRecycle(
                "Glass",
                R.drawable.ic_water,
                R.color.a5
            )
        )
        list.add(
            IRecycle(
                "Hazardous",
                R.drawable.ic_hazard_sign,
                R.color.a6
            )
        )
        list.add(
            IRecycle(
                "Household",
                R.drawable.ic_home,
                R.color.a7
            )
        )
        list.add(
            IRecycle(
                "Metal",
                R.drawable.ic_beam,
                R.color.a8
            )
        )
        list.add(
            IRecycle(
                "Paint",
                R.drawable.ic_paint_bucket,
                R.color.a9
            )
        )
        list.add(
            IRecycle(
                "Paper",
                R.drawable.ic_document,
                R.color.a10
            )
        )
        list.add(
            IRecycle(
                "Plastic",
                R.drawable.ic_plastic_bottle,
                R.color.a11
            )
        )
        list.add(
            IRecycle(
                "Construction",
                R.drawable.ic_pages,
                R.color.a12
            )
        )
        list.add(
            IRecycle(
                "Construction",
                R.drawable.ic_pages,
                R.color.a12
            )
        )
    }
}