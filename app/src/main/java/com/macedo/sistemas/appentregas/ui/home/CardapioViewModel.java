package com.macedo.sistemas.appentregas.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CardapioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CardapioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Cardápio Semanal");
    }

    public LiveData<String> getText() {
        return mText;
    }
}