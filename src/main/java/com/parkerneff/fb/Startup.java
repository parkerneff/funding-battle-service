package com.parkerneff.fb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Startup {
    public Startup(String id, String name, String sponsor, String seedFund) {
        this.id = id;
        this.name = name;
        this.sponsor = sponsor;
        this.seedFund = seedFund;
    }
    private String id;
    private String name;
    private String sponsor;
    private String seedFund;

}
