public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }



    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        if (currentStation < 10) {
            currentStation = currentStation - 1;
        }

    }


    public void increasePlusVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }
    }

    public void increaseMinusVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
            return;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }
}
