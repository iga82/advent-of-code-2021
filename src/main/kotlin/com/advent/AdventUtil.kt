package com.advent

import java.io.BufferedReader
import java.io.File

object AdventUtil {
    val path = "src/main/resources/inputs/"
    val ending = ".txt"

    fun fileToInts(filename: String): List<Int> {
        return File(path + filename + ending).bufferedReader().readLines().map { it.toInt() }
    }

    fun initializeProblems(): HashMap<String, AdventProblem> {
        val problems = hashMapOf<String, AdventProblem>()
        problems[DayOne.problemDay] = DayOne.Companion
        return problems
    }
}