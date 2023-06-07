package uz.abbosbek.retrofit11.retrofit

import retrofit2.Call
import retrofit2.http.GET
import uz.abbosbek.retrofit11.models.TodoGetResponse

interface RetrofitService {

    @GET("plan")
    fun getAllToDo():Call<List<TodoGetResponse>>

}