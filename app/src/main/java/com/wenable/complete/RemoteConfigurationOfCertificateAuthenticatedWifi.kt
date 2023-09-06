package com.wenable.complete

import javax.inject.Inject

class RemoteConfigurationOfCertificateAuthenticatedWifi @Inject constructor(
    private val customCertificate: CustomCertificate
) {

    fun authWifi(): String {
        return customCertificate.getSSHCertificate()
    }

}