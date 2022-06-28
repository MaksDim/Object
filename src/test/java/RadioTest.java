import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radio station = new Radio();
        int expected = 7;
        station.setCurrentStation(expected);

        assertEquals(expected, station.getCurrentStation());
    }


    @Test
    void setCurrentStationUnderMax() {
        Radio station = new Radio();
        int expected = 0;
        station.setCurrentStation(10);

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void setCurrentStationUnderMin() {
        Radio station = new Radio();
        int expected = 0;
        station.setCurrentStation(-10);

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void setCurrentVolume() {
        Radio volume = new Radio();
        int expected = 5;
        volume.setCurrentVolume(expected);

        assertEquals(expected, volume.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnderMax() {
        Radio volume = new Radio();
        int expected = 0;
        volume.setCurrentVolume(11);

        assertEquals(expected, volume.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnderMin() {
        Radio volume = new Radio();
        int expected = 0;
        volume.setCurrentVolume(-5);

        assertEquals(expected, volume.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeMAX() {
        Radio volume = new Radio();
        int expected = 0;
        volume.setCurrentVolume(expected);

        assertEquals(expected, volume.getCurrentVolume());
    }

    @Test
    void shouldBoundaryNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;

        assertEquals(expected, station.getCurrentStation());

    }


    @Test
    void shouldNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(8);
        station.nextStation();

        int expected = 9;

        assertEquals(expected, station.getCurrentStation());

    }



    @Test
    void shouldBoundaryPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prevStation();

        int expected = 9;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        station.prevStation();

        int expected = 4;

        assertEquals(expected, station.getCurrentStation());
    }



    @Test
    void shouldBoundaryPlusVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increasePlusVolume();

        int expected = 10;

        assertEquals(expected, volume.getCurrentVolume());

    }

    @Test
    void shouldPlusVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.increasePlusVolume();

        int expected = 6;

        assertEquals(expected, volume.getCurrentVolume());

    }


    @Test
    void shouldBoundaryMinusVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseMinusVolume();

        int expected = 0;

        assertEquals(expected, volume.getCurrentVolume());
    }

    @Test
    void shouldMinusVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.increaseMinusVolume();

        int expected = 4;

        assertEquals(expected, volume.getCurrentVolume());
    }

    @Test
    void pushNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushDoubleNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();
        station.nextStation();

        int expected = 1;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushNextRadioStation2() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushDoubleNextRadioStation2() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();
        station.nextStation();

        int expected = 1;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prevStation();


        int expected = 9;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushDoublePrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(2);
        station.prevStation();
        station.prevStation();


        int expected = 0;

        assertEquals(expected, station.getCurrentStation());
    }

}