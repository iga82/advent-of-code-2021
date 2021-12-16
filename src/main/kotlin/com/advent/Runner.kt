package com.advent

fun main(args: Array<String>) {
    val problems = AdventUtil.initializeProblems()
    for (problem in problems) {
        println("Begin Problems")
        println(problem.value.problemDay)
        problem.value.problemOne()
    }
}