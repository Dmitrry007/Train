package com.example.train;

import java.io.Serializable;

public class Ticket implements Serializable {
    private String idUser;
    private String priceUser;
    private String placeStartTrainUser;
    private String placeEndTrainUser;
    private String timeStartTrainUser;
    private String timeEndTrainUser;

    public Ticket(String idUser,String priceUser ,String placeStartTrainUser ,String placeEndTrainUser , String timeStartTrainUser,String timeEndTrainUser ) {
        this.idUser = idUser;
        this.priceUser = priceUser;
        this.placeStartTrainUser = placeStartTrainUser;
        this.placeEndTrainUser = placeEndTrainUser;
        this.timeStartTrainUser = timeStartTrainUser;
        this.timeEndTrainUser =timeEndTrainUser;
    }
    public String getIdUser () {
        return idUser;
    }
        public void setIdUser(String idUser) {
        this.idUser = idUser;
        }


    public String getPriceUser () {
        return priceUser;
    }
    public void setPriceUser(String priceUser) {
        this.priceUser = priceUser;
    }


    public String getPlaceStartTrainUser () {
        return placeStartTrainUser;
    }
    public void setPlaceStartTrainUser(String placeStartTrainUser) {
        this.placeStartTrainUser = placeStartTrainUser;
    }


    public String getPlaceEndTrainUser () {
        return placeEndTrainUser;
    }
    public void setPlaceEndTrainUser(String placeEndTrainUser) {
        this.placeEndTrainUser = placeEndTrainUser;
    }


    public String getTimeStartTrainUser () {
        return timeStartTrainUser;
    }
    public void setTimeStartTrainUser(String timeStartTrainUser) {
        this.timeStartTrainUser = timeStartTrainUser;
    }

    public String getTimeEndTrainUser () {
        return timeEndTrainUser;
    }
    public void setTimeEndTrainUser(String timeEndTrainUser) {
        this.timeEndTrainUser = timeEndTrainUser;
    }

}
