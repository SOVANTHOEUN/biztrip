package bizplay.biztrip.repository;

import bizplay.biztrip.entity.BtHotelList;
import bizplay.biztrip.entity.BtHotelListPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface HotelListRepository extends JpaRepository<BtHotelList, BtHotelListPK> {

}
