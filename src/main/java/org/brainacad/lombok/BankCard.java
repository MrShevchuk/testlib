package org.brainacad.lombok;

import lombok.Value;

/**
 * Created by Brainacad4 on 24.06.2020.
 */

@Value
public class BankCard {

     String bankName;
     String serialNamber;
     String cvv;
     boolean isPayPass;

}
