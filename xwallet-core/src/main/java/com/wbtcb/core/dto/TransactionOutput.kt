package com.wbtcb.core.dto

import java.math.BigDecimal

data class TransactionOutput(
    var address: String?,
    var amount: BigDecimal = BigDecimal.ZERO
)