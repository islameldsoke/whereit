package com.nursery.islam.whereit.data

import com.nursery.islam.whereit.model.Card

class CardsRepository(val remoteDataSource: CardsDataSource):CardsDataSource {
    override fun saveCard(card: Card) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCard(cardNumber: Int, callback: CardsDataSource.CardCallBack) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}