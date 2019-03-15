package cz.smdev.bitcoin.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
enum class BitcoinBlockTemplateRequestMode {
    template,
    proposal
}
