package com.parkerneff.fb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BattlesController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api/battles/public")
    public List<Startup> publicBattles() {
        List<Startup> list = new ArrayList<>();
        list.add(new Startup("1111", "Startup NYC", "Alex Pescola", "500k"));
        list.add(new Startup("1112", "Startup Ontario", "Ryan Chenke", "750k"));
        return list;
    }
}
