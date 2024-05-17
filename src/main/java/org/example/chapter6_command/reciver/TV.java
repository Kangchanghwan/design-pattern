package org.example.chapter6_command.reciver;

public class TV {
    private boolean powerOn;
    private int channel;
    private int volume;
    public void increaseVolume() {
        volume++;
    }
    public void decreaseVolume() {
        volume--;
    }
    public void channelUp() {
        channel++;
    }
    public void channelDown() {
        channel--;
    }
    public void on() {
        powerOn = true;
    }
    public void off() {
        powerOn = false;
    }
}
