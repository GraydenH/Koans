class DateRange(val start: MyDate, val endInclusive: MyDate) {
    val yearRange = generateSequence(0) { it + 1 }
            .drop(start.year)
            .take(endInclusive.year - start.year)
            .toList()
    val monthRange = generateSequence(0) { it + 1 }
            .drop(start.month)
            .take(endInclusive.month - start.month)
            .toList()
    val dayRange = generateSequence(0) { it + 1 }
            .drop(start.dayOfMonth)
            .take(endInclusive.dayOfMonth - start.dayOfMonth)
            .toList()

    operator fun contains(d: MyDate) : Boolean =
        if(yearRange.contains(d.year)) true
        else if(monthRange.contains(d.month)) true
        else if(dayRange.contains(d.dayOfMonth)) true
        else false

}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}