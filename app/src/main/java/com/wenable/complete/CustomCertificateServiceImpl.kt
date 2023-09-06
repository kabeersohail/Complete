package com.wenable.complete

import javax.inject.Inject

class CustomCertificateServiceImpl @Inject constructor(): CustomCertificateService {

    override fun getCertificate(): String {
        return "Providing custom certificate"
    }
}