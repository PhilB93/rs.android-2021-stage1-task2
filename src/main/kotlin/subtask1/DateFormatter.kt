package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {


        return try {
            LocalDate.of(year.toInt(),month.toInt(),day.toInt()).format(
                DateTimeFormatter.ofPattern("d MMMM, EEEE",
                    Locale("ru")
                ))
        }catch (ex: DateTimeException){
            "Такого дня не существует"
        }
    }

}
