package de.flyndre.flompiler.scannerparserlexer.parser.adapter;

import javax.sound.sampled.AudioInputStream;
import java.io.InputStream;

public class GardenaAufKlinkeAdapter {
    public static AudioInputStream adapt(InputStream wasser) {
        return (AudioInputStream) wasser;
    }
}
