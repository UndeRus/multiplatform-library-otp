package ml.dev.kotlin.openotp.otp

import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.DateTimeUnit.Companion.SECOND
import kotlinx.datetime.Instant
import kotlinx.datetime.plus

enum class TotpPeriod(
    private val step: Int,
    private val unit: DateTimeUnit.TimeBased,
) {
    Fifteen(15, SECOND), Thirty(30, SECOND), Sixty(60, SECOND);

    val millis: Long = Instant
        .fromEpochMilliseconds(0L)
        .plus(step, unit)
        .toEpochMilliseconds()
}



