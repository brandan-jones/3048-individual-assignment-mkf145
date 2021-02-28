package app.plantdiary.individualassignment3048q.dto

class Country (var code: String, var name: String){
    override fun toString(): String {
        return name + " " + code
    }
}