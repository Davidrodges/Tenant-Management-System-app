package com.example.tenantmangementsystem

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.tenantmangementsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        private const val TAG = "TENANT_LIFECYCLE"
        private const val KEY_TENANT_NAME = "tenant_name"
        private const val KEY_TENANT_PHONE = "tenant_phone"
        private const val KEY_TENANT_RENT = "tenant_rent"
    }

    private var restoredTenantName: String? = null
    private var restoredTenantPhone: String? = null
    private var restoredTenantRent: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate called")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState != null) {
            restoredTenantName = savedInstanceState.getString(KEY_TENANT_NAME)
            restoredTenantPhone = savedInstanceState.getString(KEY_TENANT_PHONE)
            restoredTenantRent = savedInstanceState.getString(KEY_TENANT_RENT)
            Log.d(TAG, "Restored state: Name=$restoredTenantName, Phone=$restoredTenantPhone, Rent=$restoredTenantRent")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState called")
        outState.putString(KEY_TENANT_NAME, restoredTenantName)
        outState.putString(KEY_TENANT_PHONE, restoredTenantPhone)
        outState.putString(KEY_TENANT_RENT, restoredTenantRent)
    }
}
