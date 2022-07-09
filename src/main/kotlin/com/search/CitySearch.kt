package com.search

class CitySearch {
    fun search(searchText: String): String? {
        return if (searchText.length < 2) null else searchText
    }

}
