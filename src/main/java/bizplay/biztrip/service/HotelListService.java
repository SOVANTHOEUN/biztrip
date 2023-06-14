package bizplay.biztrip.service;

import bizplay.biztrip.entity.BtHotelList;
import bizplay.biztrip.entity.BtHotelListPK;
import bizplay.biztrip.repository.HotelListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelListService {
    @Autowired
    private final HotelListRepository hotelListRepository;
    public List<BtHotelList> getHotelListAll() {
        return hotelListRepository.findAll();
    }
    public BtHotelList getHotelListRepositoryById(BtHotelListPK id) {
        return hotelListRepository.findById(id).orElse(null);
    }

}
