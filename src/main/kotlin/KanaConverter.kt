package com.example

import com.ibm.icu.text.Transliterator

/**
 * Utility class for Katakana conversion
 */
object KanaConverter {
    private val fullToHalfKana = Transliterator.getInstance("Fullwidth-Halfwidth")
    private val halfToFullKana = Transliterator.getInstance("Halfwidth-Fullwidth")

    /**
     * Converts full-width Katakana to half-width Katakana
     * @param text The string to convert
     * @return The string converted to half-width Katakana
     */
    fun toHalfWidth(text: String): String {
        return fullToHalfKana.transliterate(text)
    }

    /**
     * Converts half-width Katakana to full-width Katakana
     * @param text The string to convert
     * @return The string converted to full-width Katakana
     */
    fun toFullWidth(text: String): String {
        return halfToFullKana.transliterate(text)
    }
}
