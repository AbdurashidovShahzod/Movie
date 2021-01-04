package uz.unzosoft.movie.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.demo_rv_list.view.*
import uz.unzosoft.movie.R
import uz.unzosoft.movie.models.DemoMovie

class DemoAdapter1(var list: List<DemoMovie>) : RecyclerView.Adapter<DemoAdapter1.MyViewHolder>() {

//    var list = ArrayList<DemoMovie>()
//
//    fun addList(list: ArrayList<DemoMovie>) {
//        this.list = list
//        notifyDataSetChanged()
//    }

    inner class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        fun bind(position: Int) {
            val movie = list[position]
            view.title.text = movie.title
            view.view.text = movie.view
            view.releaseData.text = movie.releaseData

            Glide.with(view.context)
                .load(list[position].image)
                .into(view.findViewById(R.id.imageDemo))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflate =
            LayoutInflater.from(parent.context).inflate(R.layout.demo_rv_list, parent, false)
        return MyViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = list.size


}