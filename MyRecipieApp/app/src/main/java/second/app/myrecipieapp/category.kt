package second.app.myrecipieapp

data class category(val idCategory:String,
    val strCategory:String,
    val strCategoryThumb:String,
    val strCategoryDescription:String)

data class categoriesResponse(val catgories: List<category>)
