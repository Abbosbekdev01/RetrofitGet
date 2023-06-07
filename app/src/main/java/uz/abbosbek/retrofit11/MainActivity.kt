package uz.abbosbek.retrofit11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import uz.abbosbek.retrofit11.databinding.ActivityMainBinding
import uz.abbosbek.retrofit11.models.TodoGetResponse
import uz.abbosbek.retrofit11.retrofit.RetrofitClient

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        RetrofitClient.getRetrofitService()
            .getAllToDo()
            .enqueue(object : Callback<List<TodoGetResponse>> {
                override fun onResponse(
                    call: Call<List<TodoGetResponse>>,
                    response: Response<List<TodoGetResponse>>
                ) {
                    if (response.isSuccessful) {
                        Toast.makeText(this@MainActivity, "${response.code()}", Toast.LENGTH_SHORT)
                            .show()
                    }
                }

                override fun onFailure(call: Call<List<TodoGetResponse>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_SHORT).show()
                }
            })
    }
}