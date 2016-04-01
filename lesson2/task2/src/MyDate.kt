data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>{
    override fun compareTo(other: MyDate): Int =
        if(year != other.year) year - other.year
        else if(month != other.month) month - other.month
        else dayOfMonth - other.dayOfMonth
}