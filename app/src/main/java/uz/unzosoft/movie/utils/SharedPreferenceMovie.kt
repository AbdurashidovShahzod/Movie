package uz.unzosoft.movie.utils

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceMovie {
    private const val NAME = "Movie"
    private const val MODE = Context.MODE_PRIVATE
     lateinit var sharedPreferences: SharedPreferences


    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(NAME, MODE)

    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        var editor = edit()
        operation(editor)
        editor.apply()
    }

    fun clear() {
        movie = ""
    }

    var movie: String?
        get() = sharedPreferences.getString("movie", "")
        set(value) = SharedPreferenceMovie.sharedPreferences.edit() {
            if (value != "") {
                it.putString("movie", value)
            }
        }


}