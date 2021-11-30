package lavsam.gb.profias.lesson1as.data

import lavsam.gb.profias.lesson1as.domain.Retrofit.Common
import lavsam.gb.profias.lesson1as.domain.repositories.BaseRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryImpl : BaseRepository {
    lateinit var mService: BaseRepository
    override fun providedata(): {
        mService = Common.retrofitService
        mService.providedata().enqueue(object : Callback<Elements> {
            override fun onResponse(call: Call<Elements>, response: Response<Elements>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<Elements>, t: Throwable) {

            }
        }

        )
    }
}