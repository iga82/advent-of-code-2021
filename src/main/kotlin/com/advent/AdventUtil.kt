package com.advent

import com.advent.days.*
import java.io.File

object AdventUtil {
    val path = "src/main/resources/inputs/"
    val ending = ".txt"

    fun fileToInts(filename: String): List<Int> {
        return File(path + filename + ending).bufferedReader().readLines().map { it.toInt() }
    }

    fun fileToString(filename: String): List<String> {
        return File(path + filename + ending).bufferedReader().readLines()
    }

    private fun initializeProblems(): HashMap<String, AdventProblem> {
        val problems = hashMapOf<String, AdventProblem>()
        problems[DayOne.problemDay] = DayOne.Companion
        problems[DayTwo.problemDay] = DayTwo.Companion
        return problems
    }

    fun problemsToTest(wantedProblems: List<String>): List<AdventProblem> {
        return initializeProblems().filter { predicate ->
            wantedProblems.contains(predicate.key)
        }.values.toList()
    }
}