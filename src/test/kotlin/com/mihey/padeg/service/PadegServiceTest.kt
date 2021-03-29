package com.mihey.padeg.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PadegServiceTest {

    @Autowired lateinit var padegService: PadegService

    private val words = listOf("дом", "дома", "дому", "дома", "домом", "доме")

    @Test
    fun spellTest() {
        Assertions.assertEquals(words, padegService.spell("дом"))
        Assertions.assertNotEquals(words,padegService.spell("яблоко"))
        Assertions.assertEquals(listOf("Word shouldn't be empty!"), padegService.spell(" "))
    }
}