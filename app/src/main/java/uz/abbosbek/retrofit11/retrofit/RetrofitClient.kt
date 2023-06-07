package uz.abbosbek.retrofit11.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    const val BASE_URL = "https://plans1.puthonanywhere.com/"

    // todo: bu funcsiya faqat shuyerda ishlagani uchun < private > qilib qo'ysak ham bo'ladi
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //todo: Retrofit ni hizmatini qaytarib beradigan funksiya
    fun getRetrofitService(): RetrofitService {
        return getRetrofit().create(RetrofitService::class.java)
    }
}