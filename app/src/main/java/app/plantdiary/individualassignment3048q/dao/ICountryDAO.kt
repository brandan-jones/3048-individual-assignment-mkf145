/**
 * Interface use for Retrofit in CountryService.kt
 *
 * @Get domain is defined in RetrofitClientInstance.kt
 * The Full URL for reference: https://pkgstore.datahub.io/core/country-list/data_json/data/8c458f2d15d9f2119654b29ede6e45b8/data_json.json
 */
package app.plantdiary.individualassignment3048q.dao

import app.plantdiary.individualassignment3048q.dto.Country
import retrofit2.http.GET
import retrofit2.Call

interface ICountryDAO {
   @GET("/core/country-list/data_json/data/8c458f2d15d9f2119654b29ede6e45b8/data_json.json")
   fun getAllCountries(): Call<ArrayList<Country>>
}