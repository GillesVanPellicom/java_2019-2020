package com.powkiemawn;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import java.io.File;

public class SoundEngine {
    Clip clip = AudioSystem.getClip();
    private Thread thread;
    private boolean isRunning = false;

    public SoundEngine() throws LineUnavailableException {
    }

    public void play(String pathName) {
        thread = new Thread(() -> {
            try {
                isRunning = true;
                AudioInputStream stream = AudioSystem.getAudioInputStream(new File(pathName).getAbsoluteFile());
                clip.open(stream);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                this.thread.sleep((clip.getMicrosecondLength()) / 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }

    public void stop() {
        clip.stop();
    }
}
