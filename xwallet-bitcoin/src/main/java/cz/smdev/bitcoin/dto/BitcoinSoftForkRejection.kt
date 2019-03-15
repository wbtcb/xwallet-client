package cz.smdev.bitcoin.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class BitcoinSoftForkRejection(
    val status: Boolean? = null
)
