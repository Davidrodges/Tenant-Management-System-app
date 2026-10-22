package com.example.tenantmangementsystem

import java.io.Serializable

class Tenant(
    val name: String,
    val phone: String,
    val rent: String = "0"
) : Serializable {
    val summary: String
        get() = "Tenant: $name\nPhone: $phone\nRent: KSh $rent"

    fun summary(): String = summary
}
