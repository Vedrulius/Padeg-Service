package com.mihey.padeg.controller

import com.mihey.padeg.service.PadegService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("words")
class PadegController(private val padegService: PadegService) {

    @GetMapping("/{word}")
    fun getWord(@PathVariable word: String): ResponseEntity<List<String>> {
        return ResponseEntity(padegService.spell(word), HttpStatus.OK);
    }

}