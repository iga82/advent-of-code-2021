package com.advent.days

import com.advent.AdventProblem
import com.advent.AdventUtil

class DayTwo {
    companion object : AdventProblem {
        override val problemDay: String
            get() = "day2"

        override fun problemOne() {
            var horizontal = 0
            var depth = 0
            AdventUtil.fileToString(problemDay).forEach {
                val splitInst = it.split(' ')
                val instruction = splitInst[0]
                val length = splitInst[1].toInt()
                when(instruction) {
                    "forward" -> horizontal += length
                    "down" -> depth += length
                    "up" -> depth -= length
                }
            }

            println(horizontal * depth)
        }

        override fun problemTwo() {
            var horizontal = 0
            var depth = 0
            var aim = 0
            AdventUtil.fileToString(problemDay).forEach {
                val splitInst = it.split(' ')
                val instruction = splitInst[0]
                val length = splitInst[1].toInt()
                when(instruction) {
                    "forward" -> {
                        horizontal += length
                        depth += (aim * length)
                    }
                    "down" -> aim += length
                    "up" -> aim -= length
                }
            }

            println(horizontal * depth)
        }
    }
}