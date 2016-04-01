import java.util.*

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override operator fun iterator() = object : Iterator<MyDate> {
        var cur = start

        override fun hasNext(): Boolean = cur <= end
        override fun next(): MyDate {
            if (!hasNext())
                throw NoSuchElementException()

            val result = cur
            cur = cur.nextDay()
            return result
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}