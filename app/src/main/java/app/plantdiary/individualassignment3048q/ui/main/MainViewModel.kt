/**
 * MainViewModel with mutable livedata countries
 * Added Country service class to wire the model view
 *
 */

package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment3048q.dto.Country
import app.plantdiary.individualassignment3048q.service.CountryService
import retrofit2.Call
import retrofit2.http.GET

class MainViewModel : ViewModel() {
    var countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>()
    var countryService: CountryService = CountryService()

    init {
        fetchCountries()
    }

    fun fetchCountries() {
        countries = countryService.fetchCountries()
    }
}
