package com.wenable.complete

import javax.inject.Inject

class RemoteConfigurationOfCertificateAuthenticatedWifi @Inject constructor() {

    fun authWifi(): String {
        return "I am an injected method"
    }

}