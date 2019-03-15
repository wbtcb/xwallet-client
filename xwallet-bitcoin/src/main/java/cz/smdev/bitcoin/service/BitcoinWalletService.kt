package cz.smdev.bitcoin.service

import cz.smdev.core.Wallet
import cz.smdev.core.dto.WalletInfo
import cz.smdev.core.service.wallet.WalletService

class BitcoinWalletService(wallet: Wallet) : BitcoinWalletServiceRaw(wallet), WalletService {

    override fun getWalletInfo(): WalletInfo {
        getBitcoinWalletInfo().let { info ->
            return WalletInfo().copy(
                walletName = info.walletname,
                walletVersion = info.walletversion,
                balance = info.balance,
                unconfirmedBalance = info.unconfirmed_balance,
                immatureBalance = info.immature_balance,
                txCount = info.txcount,
                keyPoolOldest = info.keypoololdest,
                keyPoolSize = info.keypoolsize,
                keyPoolSizeHdInternal = info.keypoolsize_hd_internal,
                unlockedUntil = info.unlocked_until,
                payTxFee = info.paytxfee,
                hdMasterKeyId = info.hdmasterkeyid
            )
        }
    }

    override fun isAddressValid(address: String): Boolean {
        return isBitcoinAddressValid(address).isvalid
    }
}
