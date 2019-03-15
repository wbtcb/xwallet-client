package cz.smdev.bitcoin.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
enum class BitcoinFeeEstimateMode {
    UNSET,
    ECONOMICAL,
    CONSERVATIVE
}
