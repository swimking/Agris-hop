package com.example.agrishop.ui.Categories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CategoriesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CategoriesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Categories for various products");
    }

    public LiveData<String> getText() {
        return mText;
    }
}