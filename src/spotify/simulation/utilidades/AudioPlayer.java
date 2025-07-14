package spotify.simulation.utilidades;

import java.io.ByteArrayInputStream;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioPlayer {

    private static Clip clip;
    private static long pausePosition = 0;
    private static boolean isPaused = false;
    private static boolean muted = false;
    private static FloatControl gainControl;
    private static float previousVolume;

    public static void playFromBytes(byte[] audioBytes) {
        try {
            if (clip != null && clip.isOpen()) {
                clip.stop();
                clip.close();
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new ByteArrayInputStream(audioBytes));
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            pausePosition = 0;
            isPaused = false;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void pause() {
        if (clip != null && clip.isRunning()) {
            pausePosition = clip.getMicrosecondPosition();
            clip.stop();
            isPaused = true;
        }
    }

    public static void resume() {
        if (clip != null && isPaused) {
            clip.setMicrosecondPosition(pausePosition);
            clip.start();
            isPaused = false;
        }
    }

    public static void stop() {
        if (clip != null) {
            clip.stop();
            clip.close();
            pausePosition = 0;
            isPaused = false;
        }
    }

    public static boolean isPaused() {
        return isPaused;
    }

    public static boolean isPlaying() {
        return clip != null && clip.isRunning();
    }

    public static Clip getClip() {
        return clip;
    }

    public static void setGainControl(Clip clip) {
        if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        }
    }

    public static void setClip(Clip c) {
        clip = c;
        if (clip != null && clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
            gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            previousVolume = gainControl.getValue();
            System.out.println("Control de volumen seteado. Volumen inicial: " + previousVolume);
        }
    }

    public static boolean isMuted() {
        System.out.println("isMuted = " + muted);
        return muted;
    }

    public static void mute() {
        if (gainControl != null && !muted) {
            previousVolume = gainControl.getValue();
            gainControl.setValue(gainControl.getMinimum());
            muted = true;
            System.out.println("Audio muteado.");
        }
    }

    public static void unmute() {
        if (gainControl != null && muted) {
            gainControl.setValue(previousVolume);
            muted = false;
            System.out.println("Audio desmuteado.");
        }
    }

}
