import org.intellij.lang.annotations.Pattern
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
fun main() {
    val current = LocalDateTime.now()
    val time = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm")
    val t1me = current.format(time)
    println("the time is: $t1me")
}