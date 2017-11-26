package com.example.android.miwok;

class Word {
    private String frenchTranslation;
    private String defaultTranslation;
    private int imageResourceId = -1;

    Word(String defaultTranslation, String frenchTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.frenchTranslation = frenchTranslation;
    }

    Word(String defaultTranslation, String frenchTranslation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.frenchTranslation = frenchTranslation;
        this.imageResourceId = imageResourceId;
    }

    int getImageResourceId() {

        return imageResourceId;
    }

    String getDefaultTranslation() {
        return defaultTranslation;
    }

    String getFrenchTranslation() {
        return frenchTranslation;
    }

}
