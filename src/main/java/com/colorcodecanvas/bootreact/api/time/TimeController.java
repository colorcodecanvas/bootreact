package com.colorcodecanvas.bootreact.api.time;

import java.time.ZonedDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
  @GetMapping("/api/time")
  ZonedDateTime get() {
    return ZonedDateTime.now();
  }
}
