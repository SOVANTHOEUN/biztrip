package bizplay.biztrip.service;

import bizplay.biztrip.entity.BtHotelList;
import bizplay.biztrip.repository.HotelListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelListService {
    private final HotelListRepository hotelListRepository;
    public List<BtHotelList> getHotelListRepository() {
        return hotelListRepository.findAll();
    }

}
