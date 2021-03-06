package com.bookmyshow.core.model;

import lombok.Getter;
import lombok.Setter;

public enum MPAARating {
    GeneralAudience("G"),
    ParentalGuidanceSuggested("PG"),
    ParentsStronglyCautioned("PG-13"),
    Restricted("R"),
    AdultsOnly("NC-17");

    @Getter @Setter
    private String code;
    MPAARating(String code){
        this.code = code;
    }
}
