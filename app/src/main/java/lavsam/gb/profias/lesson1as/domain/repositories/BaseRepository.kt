package lavsam.gb.profias.lesson1as.domain.repositories

import lavsam.gb.profias.lesson1as.data.Elements
import retrofit2.Call
import retrofit2.http.GET

interface BaseRepository {
    @GET("pokemon")
    fun providedata(): Call<Elements>
}