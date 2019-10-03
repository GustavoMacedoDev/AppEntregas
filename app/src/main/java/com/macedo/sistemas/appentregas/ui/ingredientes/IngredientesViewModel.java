package com.macedo.sistemas.appentregas.ui.ingredientes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IngredientesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IngredientesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Cadastro de Ingredientes");
    }

    public LiveData<String> getText() {
        return mText;
    }
}