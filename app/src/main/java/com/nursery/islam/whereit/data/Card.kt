package com.nursery.islam.whereit.model

data class Card (
        var type: Int,
        var cardNumber: Int,
        var cardUserName: String = "",
        var phone: Int,
        var notes: String = ""){
    val isEmpty
        get() = type > 0 || cardNumber > 0 || cardUserName.isEmpty() || phone > 0 || notes.isEmpty()
}


