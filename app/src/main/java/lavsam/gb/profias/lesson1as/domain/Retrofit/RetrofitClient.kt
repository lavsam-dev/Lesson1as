package lavsam.gb.profias.lesson1as.domain.Retrofit

import lavsam.gb.profias.lesson1as.domain.repositories.BaseRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var retrofit: Retrofit? = null

    fun getClient(baseUrl: String): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}

object Common {
    private val BASE_URL = "https://pokeapi.co/api/v2/"

    val retrofitService: BaseRepository
        get() = RetrofitClient.getClient(BASE_URL).create(BaseRepository::class.java)
}
