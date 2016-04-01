fun renderProductTable(): String {
    return html {
        table {
            tr (getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            var row = 0
            products.forEachIndexed { i, it ->
                tr {
                    td(getCellColor(i, row)) { text(it.description) }
                    td(getCellColor(i, row)) { text(it.price) }
                    td(getCellColor(i, row)) { text(it.popularity) }
                }
                row += 1
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"