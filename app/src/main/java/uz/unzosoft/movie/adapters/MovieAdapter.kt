package uz.unzosoft.movie.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movie_item_rv.view.*
import uz.unzosoft.movie.R
import uz.unzosoft.movie.models.Movie
import uz.unzosoft.movie.utils.SharedPreferenceMovie.movie

class MovieAdapter(var list: List<Movie>, var movieClickListener: MovieClickListener) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(movie: Movie, position: Int) {

            itemView.avengers.text = movie.nameMovie
            itemView.dataM.text = movie.dataMovie
            itemView.authorsM.text = movie.authorsMovie

            itemView.setOnClickListener {
                movieClickListener.itemMovieClickListener(movie, position)
            }
            itemView.editBtn.setOnClickListener {
                movieClickListener.editMovieClickListener(movie, position)
            }
            itemView.deleteBtn.setOnClickListener {
                movieClickListener.deleteMovieClickListener(movie, position)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item_rv, parent, false)
        return MyViewHolder(layoutInflater)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var mbPosition = list[position]
        holder.bind(mbPosition, position)
    }

    override fun getItemCount(): Int = list.size


    interface MovieClickListener {
        fun itemMovieClickListener(movie: Movie, position: Int)
        fun editMovieClickListener(movie: Movie, position: Int)
        fun deleteMovieClickListener(movie: Movie, position: Int)
    }


}