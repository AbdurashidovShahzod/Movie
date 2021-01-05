package uz.unzosoft.movie.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.icycle_rv_item.view.*
import kotlinx.android.synthetic.main.item_start_rv.view.*
import uz.unzosoft.movie.R
import uz.unzosoft.movie.models.GirlBook

class GirlBookAdapter(var list: ArrayList<GirlBook>) :
    RecyclerView.Adapter<GirlBookAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun find(position: Int) {
            itemView.tvR.text = list[position].name
            itemView.imageR.setImageResource(list[position].image)
//            Glide.with(itemView.context)
//                .load(list[position].image)
//                .into(itemView.imageR)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.item_start_rv, parent, false)
        return MyViewHolder(layoutInflater)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.find(position)
    }

    override fun getItemCount(): Int = list.size


}