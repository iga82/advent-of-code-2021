package com.advent

fun main(args: Array<String>) {
    val problems = AdventUtil.problemsToTest(listOf(
        "day2"
    ))

    for (problem in problems) {
        println("Begin Problems")
        println(problem.problemDay)
        println("---problem 1---")
        problem.problemOne()
        println("---problem 2---")
        problem.problemTwo()
    }
}