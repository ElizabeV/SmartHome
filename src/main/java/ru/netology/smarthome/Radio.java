package ru.netology.smarthome;

public class Radio {
    private int currentStation; //поле
    private int currentVolume;  //поле
    private int maxStation;
    private int minStation = 0;
    private int amountStation;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        maxStation = amountStation - 1;
    }

    public Radio() {
        amountStation = 10;
        maxStation = amountStation - 1;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) { //поменять, установить на новую
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { //установи громкость на (параметр)
        if (newCurrentVolume < 0) { //проверки
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume; //выполнение после проверки

    }

    public void increaseVolume() { //увеличение
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() { //уменьшение на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
