package com.wenable.complete

import javax.inject.Inject

class CustomCertificate @Inject constructor() {

    fun getSSHCertificate(): String {
        return "SomeSSHCertificate"
    }

    fun getSHACertificate(): String {
        return "SHACertificate"
    }

}