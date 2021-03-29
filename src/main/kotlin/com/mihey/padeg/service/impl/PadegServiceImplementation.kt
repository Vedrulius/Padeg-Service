package com.mihey.padeg.service.impl

import com.mihey.padeg.service.PadegService
import org.springframework.stereotype.Service
import padeg.lib.Padeg

@Service
class PadegServiceImplementation : PadegService {

    override fun spell(word: String): List<String> {
        print(word)
        if (word.isBlank()) {
            return listOf("Word shouldn't be empty!")
        }
        val words = mutableListOf<String>()
        for (i: Int in 1..6) {
            words.add(Padeg.getAppointmentPadeg(word, i))
        }
        return words
    }
}