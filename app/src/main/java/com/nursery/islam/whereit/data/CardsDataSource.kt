package com.nursery.islam.whereit.data

import com.nursery.islam.whereit.model.Card

interface CardsDataSource {

    interface CardCallBack{

        fun onCardSaveSucess(card: Card)

        fun onCardSaveFailed()
    }

    fun saveCard(card: Card)

    fun getCard(cardNumber:Int , callback:CardCallBack)
}