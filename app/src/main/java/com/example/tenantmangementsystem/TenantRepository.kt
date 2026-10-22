package com.example.tenantmangementsystem

object TenantRepository {
    val tenants = mutableListOf<Tenant>()

    fun totalRent(): Double {
        return tenants.sumOf { it.rent.toDoubleOrNull() ?: 0.0 }
    }
}
