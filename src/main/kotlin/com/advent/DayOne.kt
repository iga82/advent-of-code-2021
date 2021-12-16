package com.advent

class DayOne {
    companion object : AdventProblem {
        override val problemDay = "day1"
        override fun problemOne() {
            val nums = AdventUtil.fileToInts(problemDay)

            var count = 0
            for(i in nums.indices.reversed()) {
                if ((i - 1) >= 0 && nums[i] > nums[i - 1]) count++
            }
            println(count)
        }
    }


}