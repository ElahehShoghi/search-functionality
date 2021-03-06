package com.search

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class CitySearchTest {
    private val citySearch = CitySearch()

    companion object {
        @JvmStatic
        fun searchTextArguments() = listOf(
                Arguments.of("l", listOf<String>()),
                Arguments.of("Va", listOf("Valencia", "Vancouver")),
                Arguments.of("vA", listOf("Valencia", "Vancouver")),
                Arguments.of("APE", listOf("Budapest")),
                Arguments.of("*",
                        listOf("Paris", "Budapest", "Skopje", "Rotterdam", "Valencia",
                                "Vancouver", "Amsterdam", "Vienna", "Sydney", "New York City",
                                "London", "Bangkok", "Hong Kong", "Dubai", "Rome", "Istanbul")),
        )
    }

    @ParameterizedTest
    @MethodSource("searchTextArguments")
    fun `should return cities for search text`(searchText: String, cities: List<String>) {
        assertEquals(cities, citySearch.search(searchText))
    }
}