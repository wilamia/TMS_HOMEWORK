package tasks_kotlin

class Author(
    private val name: String,
    private val age: Int
) {
    fun getName(): String {
        return this.name
    }

    fun getAge(): Int {
        return this.age
    }
}