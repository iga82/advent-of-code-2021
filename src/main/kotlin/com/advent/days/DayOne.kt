package com.advent.days

import com.advent.AdventProblem
import com.advent.AdventUtil

class DayOne {
    companion object : AdventProblem {
        const val WINDOW_SIZE = 3

        override val problemDay = "day1"
        override fun problemOne() {
            val nums = AdventUtil.fileToInts(problemDay)

            var count = 0
            for(i in nums.indices.reversed()) {
                if ((i - 1) >= 0 && nums[i] > nums[i - 1]) count++
            }
            println(count)
        }

        override fun problemTwo() {
            val nums = AdventUtil.fileToInts(problemDay)

            var prev = 0
            var beg = 0
            var bigger = 0

            while ((beg + WINDOW_SIZE) < nums.size) {
                val currSlice = nums.subList(beg, beg + WINDOW_SIZE).reduce { acc, i -> acc + i }
                if(currSlice > prev) ++bigger
                prev = currSlice
                beg++
            }

            println(bigger)
        }
    }


}