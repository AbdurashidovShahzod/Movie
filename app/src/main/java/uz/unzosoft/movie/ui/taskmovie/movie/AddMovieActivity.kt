package uz.unzosoft.movie.ui.taskmovie.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sdsmdg.tastytoast.TastyToast
import kotlinx.android.synthetic.main.activity_add_movie.*
import uz.unzosoft.movie.R
import uz.unzosoft.movie.models.Movie
import uz.unzosoft.movie.utils.SharedPreferenceMovie

class AddMovieActivity : AppCompatActivity() {
    lateinit var gson: Gson
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_movie)
        SharedPreferenceMovie.init(this)
        gson = Gson()


        saveBtn.setOnClickListener {

            val nameMovie = nameMovieEdit.text.toString()
            val authorsMovie = authorsMovieEdit.text.toString()
            val aboutMovie = aboutMovieEdit.text.toString()
            val dataMovie = dataMovieEdit.text.toString()


            if ((!TextUtils.isEmpty(nameMovie) && nameMovie != "")
                && (!TextUtils.isEmpty(authorsMovie) && authorsMovie != "")
                && (!TextUtils.isEmpty(aboutMovie) && aboutMovie != "")
                && (!TextUtils.isEmpty(dataMovie) && dataMovie != "")
            ) {

                val movie1 = SharedPreferenceMovie.movie
                val list = ArrayList<Movie>()

                if (movie1!!.isNotEmpty()) {
                    val type = object : TypeToken<ArrayList<Movie>>() {}.type
                    list.addAll(gson.fromJson(movie1, type))
                }

                val movie = Movie(nameMovie, authorsMovie, aboutMovie, dataMovie)
                var isHave = false


                for (i in list.indices) {
                    if (list[i].nameMovie == nameMovie) {
                        isHave = true
                        break
                    }
                }

                if (isHave) {
                    TastyToast.makeText(
                        this,
                        "Bunday movie oldindan mavjud!!!",
                        TastyToast.LENGTH_LONG, TastyToast.ERROR
                    ).show()
                } else {
                    list.add(movie)
                    SharedPreferenceMovie.movie = gson.toJson(list)
                    finish()
                }

            } else {
                TastyToast.makeText(
                    this,
                    "Siz malumot kiritmadingiz!!!",
                    TastyToast.LENGTH_LONG, TastyToast.ERROR
                ).show()
            }

        }
    }
}