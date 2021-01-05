package uz.unzosoft.movie.adapters

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.icycle_rv_item.view.*
import uz.unzosoft.movie.R
import uz.unzosoft.movie.models.IRecycle

class ICycleAdapter(var list: ArrayList<IRecycle>) :
    RecyclerView.Adapter<ICycleAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        fun bind(position: Int) {
            val iRecycle = list[position]
            itemView.iRecycleTitle.text = iRecycle.title
            itemView.layout1.setBackgroundResource(list[position].backColor)
            itemView.imageIcon.setImageResource(list[position].imageIcon)
//            Glide.with(itemView.context)
//                .load(list[position].imageIcon)
//                .into(itemView.imageIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.icycle_rv_item, parent, false)
        return MyViewHolder(itemView)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = list.size

}