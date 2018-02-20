/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author franc
 */
abstract class IInstrument {

    int soundVolume;
    String color;

    public IInstrument(String color, int soundVolume) {
        this.soundVolume = soundVolume;
        this.color = color;
    }

    int getSoundVolume() {
        return soundVolume;
    }

    public String getColor() {
        return color;
    }

    abstract String play();
}

class Trumpet extends IInstrument {
    public Trumpet() {
        this("golden",10);
    }

    public Trumpet(String color, int soundVolume) {
        super(color,soundVolume);
    }

    @Override
    String play() {
        return "pouet";
    }
}

class Flute extends IInstrument {

    public Flute() {
        this("",5);
    }

    public Flute(String color,int soundVolume) {
        super(color,soundVolume);
    }

    @Override
    String play() {
        return "";
    }
}
