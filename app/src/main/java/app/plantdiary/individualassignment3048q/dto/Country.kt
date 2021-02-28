package app.plantdiary.individualassignment3048q.dto

import com.google.gson.annotations.SerializedName

/**
 * Added properties to Country class to make the test pass
 * Used @SerializedName to match the JSON exactly
 */
class Country (@SerializedName("Code") var code: String, @SerializedName("Name") var name: String){

    override fun toString(): String {
        return name + " " + code
    }
}