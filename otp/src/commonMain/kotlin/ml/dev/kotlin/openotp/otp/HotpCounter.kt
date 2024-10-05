package ml.dev.kotlin.openotp.otp

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

typealias HotpCounter = Long

@OptIn(ExperimentalContracts::class)
fun HotpCounter?.isValid(): Boolean {
    contract {
        returns(true) implies (this@isValid != null)
    }
    return this != null && this >= 0
}
