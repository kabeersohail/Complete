package com.wenable.complete.hiltmodules

import com.wenable.complete.CustomCertificateService
import com.wenable.complete.CustomCertificateServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class CertificateModule {
    @Binds
    abstract fun bindCustomCertificateService(customCertificateServiceImpl: CustomCertificateServiceImpl): CustomCertificateService
}