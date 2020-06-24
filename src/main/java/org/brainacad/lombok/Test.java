package org.brainacad.lombok;

import java.awt.*;

/**
 * Created by Brainacad4 on 24.06.2020.
 */
public class Test {

    public static void main(String[] args) {


GameConsole gameConsole = GameConsole.builder()
        .model("PS5")
        .label("Sony")
        .cpu("core I HZ")
        .ram(16)
        .color(Color.BLUE)
        .build();

    }
}
