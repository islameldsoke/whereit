package com.nursery.islam.whereit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.nursery.islam.whereit.model.Card

class MissingCardViewModel: ViewModel{
    var missingCardLiveData:MutableLiveData<Card> = MutableLiveData()
    var databaseReference:DatabaseReference
    var database:FirebaseDatabase


    constructor() : super() {
        database = FirebaseDatabase.getInstance()
        databaseReference = database.reference
    }

}