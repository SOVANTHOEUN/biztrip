package bizplay.biztrip.controller;

import bizplay.biztrip.service.HotelListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
@RequiredArgsConstructor
@RequestMapping("/")
public class HotelListController {
    private final HotelListService hotelListService;


}
