package com.search

import org.junit.Test
import kotlin.test.assertEquals

class CitySearchTest {
    private val citySearch = CitySearch()

    @Test
    fun `should return no results for search text is fewer than 2 characters`() {
        assertEquals(citySearch.search("l"), listOf())
    }

    @Test
    fun `should return city names starting with the search text which are more than 1 character`() {
        assertEquals(listOf("Valencia", "Vancouver"), citySearch.search("Va"))
    }
}