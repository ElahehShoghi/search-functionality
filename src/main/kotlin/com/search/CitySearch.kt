package com.search

class CitySearch {
    fun search(searchText: String): String? {
        if (searchText.length < 2)
            return null
        return searchText
    }

}
