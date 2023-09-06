package com.wenable.complete

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityComponent::class)
object ThirdPartyCertificateModule {

    @Provides
    fun provideThirdPartyCertificate(): PersonalizedCertificate {
        return Retrofit.Builder()
            .baseUrl("https://www.thirdpartycertificate.com")
            .build()
            .create(PersonalizedCertificate::class.java)
    }
}