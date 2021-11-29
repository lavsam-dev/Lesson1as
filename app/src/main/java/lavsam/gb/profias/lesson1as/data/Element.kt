package lavsam.gb.profias.lesson1as.data

import com.google.gson.annotations.SerializedName

data class Elements(
    // Pokemon...
    @SerializedName("count")
    var count: Int? = null,
    @SerializedName("next")
    var next: String? = null,
    @SerializedName("previous")
    var previous: String? = null,
    @SerializedName("results")
    var results: List<Element>? = listOf()
)

data class Element(
    var page: Int = 0,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("url")
    var url: String? = null
) {
    fun getImageUrl(urlPart: String?): String {
        val index = url?.split("/".toRegex())?.dropLast(1)?.last()
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$index.png"
    }
}