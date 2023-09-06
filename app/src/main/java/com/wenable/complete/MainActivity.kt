package com.wenable.complete

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.wenable.complete.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    /**
     * Called as field injection, and they cannot be private
     */
    @Inject
    lateinit var remoteConfigurationOfCertificateAuthenticatedWifi: RemoteConfigurationOfCertificateAuthenticatedWifi

    @Inject
    lateinit var customCertificateService: CustomCertificateService

    @Inject
    lateinit var personalizedCertificate: PersonalizedCertificate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        Log.d("!!@####", remoteConfigurationOfCertificateAuthenticatedWifi.authWifi())

//        Log.d("!!@####", customCertificateService.getCertificate())

        Log.d("!!@####", personalizedCertificate.toString())

    }
}