// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> =
    customers.fold(customers.flatMap { orderedProducts }.toSet(), {
        orderedByAll, customer -> customer.orders.flatMap { it.products }.toSet().intersect(orderedProducts)
    })

