package com.advent

fun main(args: Array<String>) {
    val problems = AdventUtil.problemsToTest(listOf(
        "day1"
    ))
    for (problem in problems) {
        println("Begin Problems")
        println(problem.problemDay)
        problem.problemOne()
    }
}