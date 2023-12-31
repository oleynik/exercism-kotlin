import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {

    val date: LocalDateTime

    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())

    constructor(localDateTime: LocalDateTime) {
        date = localDateTime.plusSeconds(1_000_000_000)
    }
}
