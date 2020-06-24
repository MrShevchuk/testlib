package org.brainacad.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by Brainacad4 on 24.06.2020.
 */

@Data
@AllArgsConstructor
public class Animal {

    private final  String name;
    private boolean isWild;

}
