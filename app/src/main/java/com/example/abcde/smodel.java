package com.example.abcde;

public class smodel {
    String smartphoneModel;
    String prosesorName;
    String penyimpananNama;
    int image;


    public smodel(String smartphoneModel, String prosesorName,
                  String penyimpananNama, int image) {
        this.smartphoneModel = smartphoneModel;
        this.prosesorName = prosesorName;
        this.penyimpananNama = penyimpananNama;
        this.image = image;
    }

    public String getSmartphoneModel() {
        return smartphoneModel;
    }

    public String getProsesorName() {
        return prosesorName;
    }

    public String getPenyimpananNama() {
        return penyimpananNama;
    }

    public int getImage() {
        return image;
    }
}
