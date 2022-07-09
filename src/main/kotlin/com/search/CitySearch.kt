package com.search

class CitySearch {
    private val cities = listOf("Paris", "Budapest", "Skopje", "Rotterdam", "Valencia", "Vancouver", "Amsterdam", "Vienna",
            "Sydney", "New York City", "London", "Bangkok", "Hong Kong", "Dubai", "Rome", "Istanbul")

    fun search(searchText: String): List<String> {
        return if (searchText.length < 2) listOf() else cities.filter { it.startsWith(searchText) }
    }

}
