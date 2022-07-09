package com.search

import org.junit.Test
import kotlin.test.assertNull

class CitySearchTest {
    @Test
    fun `should return no results for search text is fewer than 2 characters`() {
        assertNull(CitySearch().search("l"))
    }
}