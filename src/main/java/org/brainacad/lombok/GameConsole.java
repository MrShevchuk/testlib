package org.brainacad.lombok;

import lombok.Builder;

import java.awt.*;

/**
 * Created by Brainacad4 on 24.06.2020.
 */

@Builder
public class GameConsole {

    private String label;
    private String model;
    private int ram;
    private String cpu;
    private String rev;
    private Color color;
    private String serial;

}
