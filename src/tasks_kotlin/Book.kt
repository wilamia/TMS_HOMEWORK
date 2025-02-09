package tasks_kotlin

class Book (
    private val title: String,
    private val author: Author,
    private val year: Int
) {
    fun getInfo() {
        println("Название: $title \nАвтор: $author \nГод: $year")
    }

    /*Создайте класс Author, который будет содержать имя автора и его год рождения.
    Используйте класс Book из задачи 1 и добавьте в него ссылку на объект типа Author.
    Переопределите метод equals для сравнения двух объектов типа Book, где два объекта
    считаются одинаковыми, если у них одинаковые название и автор.
    */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Book) return false
        return this.title == other.title && this.author.getName() == other.author.getName()
    }

    override fun hashCode(): Int {
        return this.title.hashCode() + this.author.getName().hashCode() + this.year.hashCode()
    }
}