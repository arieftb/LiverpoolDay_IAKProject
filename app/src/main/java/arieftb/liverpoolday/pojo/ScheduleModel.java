package arieftb.liverpoolday.pojo;

import java.io.Serializable;

/**
 * Created by root on 14/05/17.
 */

public class ScheduleModel implements Serializable {


    String club, waktu, lokasi;
    int image, harga;


    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
