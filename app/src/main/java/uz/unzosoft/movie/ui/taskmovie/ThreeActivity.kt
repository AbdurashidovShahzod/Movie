package uz.unzosoft.movie.ui.taskmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_three.*
import uz.unzosoft.movie.R
import uz.unzosoft.movie.adapters.GirlBookAdapter
import uz.unzosoft.movie.models.GirlBook

class ThreeActivity : AppCompatActivity() {


    lateinit var girlBookAdapter: GirlBookAdapter
    var list = ArrayList<GirlBook>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        initData()
        girlBookAdapter = GirlBookAdapter(list)
        startRv.adapter = girlBookAdapter
    }

    private fun initData() {
        list.add(GirlBook("Coffee", R.drawable.girlbook4))
        list.add(GirlBook("Beautiful", R.drawable.girlbook5))
        list.add(GirlBook("Harry", R.drawable.girlbook6))
        list.add(GirlBook("Work girl", R.drawable.girlbook))
        list.add(GirlBook("Marketing", R.drawable.girlbook2))
        list.add(GirlBook("Girl book", R.drawable.girlbook3))

    }
}