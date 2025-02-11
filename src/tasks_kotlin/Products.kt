package tasks_kotlin

interface Product {
    fun getTitle(): String
    fun getFinalPrice(): Double
}

class Electronics(
    private val title: String,
    private val price: Double
) : Product {
    override fun getTitle(): String {
        return title
    }

    override fun getFinalPrice(): Double {
        return price * 0.9
    }
}

class Clothing(
    private val title: String,
    private val price: Double
) : Product {
    override fun getTitle(): String {
        return title
    }

    override fun getFinalPrice(): Double {
        return price * 0.85
    }
}

class Food(
    private val title: String,
    private val price: Double
) : Product {
    override fun getTitle(): String {
        return title
    }

    override fun getFinalPrice(): Double {
        return price
    }
}