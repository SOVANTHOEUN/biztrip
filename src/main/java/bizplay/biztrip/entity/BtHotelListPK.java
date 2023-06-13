package bizplay.biztrip.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class BtHotelListPK implements Serializable {
    @Column(name = "HOTEL_SEQ", length = 20, nullable = false)
    private String hotelSeq;

    @Column(name = "LANGUAGE_CODE", length = 10, nullable = false)
    private String languageCode;

    @Column(name = "AFFILIATE_ID", length = 30, nullable = false)
    private String affiliateId;
}
