package ru.netology.smarthome;

public class Radio {
    private int currentStation; //поле
    private int currentVolume;  //поле

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) { //поменять, установить на новую
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == 9) {
            setCurrentStation(0);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation == 0) {
            setCurrentStation(9);
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
