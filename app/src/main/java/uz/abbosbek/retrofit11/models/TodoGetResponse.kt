package uz.abbosbek.retrofit11.models

data class TodoGetResponse(
    val bajarildi: Boolean,
    val batafsil: String,
    val id: Int,
    val oxitgi_muddat: String,
    val sana: String,
    val sarlovha: String,
    val zarurlik: String
)