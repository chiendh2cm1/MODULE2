package com.codegym;

public class HotelManagement {
    private Hotel[] hotels = new Hotel[0];

    public Hotel[] getHotels() {
        return hotels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public int size() {
        return this.hotels.length;
    }

    public void displayAllHotel() {
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }

    public void addNewHotel(int index, Hotel hotel) {
        Hotel[] newHotels = new Hotel[this.hotels.length + 1];
        for (int i = 0; i < newHotels.length; i++) {
            if (i < index)
                newHotels[i] = this.hotels[i];
            else if (index == i)
                newHotels[i] = hotel;
            else
                newHotels[i] = this.hotels[i - 1];
        }
        this.hotels = newHotels;
    }

    public void updateHotel(int index, Hotel hotel) {
        this.hotels[index] = hotel;
    }

    public void removeHotel(int index) {
        Hotel[] newHotel = new Hotel[this.hotels.length - 1];
        for (int i = 0; i < newHotel.length; i++) {
            if (i < index)
                newHotel[i] = hotels[i];
            else
                newHotel[i] = hotels[i + 1];
        }
        this.hotels = newHotel;
    }

    public double payment(String identity){
        double moneys = 0;
        int count =0;
        for (Hotel hotel : hotels) {
            if (hotel.getPerson().getIdentity().equalsIgnoreCase(identity)) {
                moneys = hotel.getPrice() * hotel.getRentDays();
                count++;
            }
            if (count ==0)
                System.out.println("Không tìm thấy số CMT");
        }
        return moneys;
    }


}
