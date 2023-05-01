package com.main.harjoitusty;

import android.os.Parcel;
import android.os.Parcelable;

public class Lutemon {
    protected String name;
    protected String vari;
    protected int hyokkays;
    protected int puolustus;
    protected int kokemus;
    protected int elamat;


    protected int image;

    public Lutemon(String name, String vari, int hyokkays, int puolustus, int kokemus, int elamat) {
        this.name = name;
        this.vari = vari;
        this.hyokkays = hyokkays;
        this.puolustus = puolustus;
        this.kokemus = kokemus;
        this.elamat = elamat;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVari(){
        return vari;
    }

    public void setVari(String vari){
        this.vari = vari;
    }

    public int getHyokkays() {
        return hyokkays;
    }

    public void setHyokkays(int hyokkays) {
        this.hyokkays = hyokkays;
    }

    public int getPuolustus() {
        return puolustus;
    }

    public void setPuolustus(int puolustus) {
        this.puolustus = puolustus;
    }

    public int getKokemus() {
        return kokemus;
    }

    public void setKokemus(int kokemus) {
        this.kokemus = kokemus;
    }

    public int getElamat() {
        return elamat;
    }

    public void setElamat(int elamat) {
        this.elamat = elamat;
    }

    public int getImage() {
        return image;
    }

    public void printSpecs() {
        }

    public class operator2 implements Parcelable {
        // luokan muuttujat ja metodit

        // tarvittavat Parcelable-metodit
        public final Parcelable.Creator<Lutemon> CREATOR = new Parcelable.Creator<Lutemon>() {
            public Lutemon createFromParcel(Parcel in) {
                String name = in.readString();
                String vari = in.readString();
                int hyokkays = in.readInt();
                int puolustus = in.readInt();
                int kokemus = in.readInt();
                int elamat = in.readInt();
                return new Lutemon(name, vari, hyokkays, puolustus, kokemus, elamat);
            }

            public Lutemon[] newArray(int size) {
                return new Lutemon[size];
            }
        };

        private operator2(Parcel in) {
            // lue muuttujat in-parametrista
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel out, int flags) {
            // kirjoita muuttujat out-parametriin
        }
    }
}