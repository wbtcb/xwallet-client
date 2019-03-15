package cz.smdev.bitcoin.security

import java.util.*

class Authorization(
    private val user: String,
    private val password: String
) {

    fun getBasicCredentials() =
        "Basic ${decoder.encodeToString("$user:$password".toByteArray())}"

    companion object {

        private val decoder = Base64.getEncoder()
    }
}
