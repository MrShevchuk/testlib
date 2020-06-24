package org.brainacad.lombok;

import lombok.*;

/**
 * Created by Brainacad4 on 24.06.2020.
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Car {

    private String model;
    private String label;
    private Double volume;
    private Boolean isRacing;
    private Boolean isLowing;



}
