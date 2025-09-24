package com.example.doordashanalyzer.model

data class DoorDashOffer(
    val restaurant: String,
    val amount: Double,
    val distance: Double,
    val estimatedTime: Int
)
