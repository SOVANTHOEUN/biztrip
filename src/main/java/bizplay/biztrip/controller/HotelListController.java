package bizplay.biztrip.controller;

import bizplay.biztrip.entity.BtHotelList;
import bizplay.biztrip.entity.BtHotelListPK;
import bizplay.biztrip.service.HotelListService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class HotelListController {

    @Autowired
    private final HotelListService hotelListService;

    @GetMapping(value = "/")
    public String index(Model model){
        System.out.println("=============== 데이터 ================");

        List<BtHotelList> hotel = hotelListService.getHotelListAll();
        hotel.forEach((r) ->{
            System.out.println("Hotel Name: "+r.getHotelName());
        });

        BtHotelListPK listPk = new BtHotelListPK();
        listPk.setHotelSeq("2");
        listPk.setAffiliateId("001");
        listPk.setLanguageCode("ko-KR");
        BtHotelList hotel2 = hotelListService.getHotelListRepositoryById(listPk);

        System.out.println("Hotel Name: "+hotel2.getHotelName());
        System.out.println("=============== end data ================");


        model.addAttribute("hotel_name",hotel2.getHotelName());
        model.addAttribute("hotel_city_name",hotel2.getCityName());
        model.addAttribute("hotel_address",hotel2.getAddressLine1());
        return "index";
    }

}
