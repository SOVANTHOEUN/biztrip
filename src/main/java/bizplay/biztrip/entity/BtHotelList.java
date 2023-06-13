package bizplay.biztrip.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "BT_HOTEL_LIST")
public class BtHotelList {
    @EmbeddedId
    private BtHotelListPK btHotelListPK;

    @Column(name = "EPS_HOTEL_ID", length = 30, nullable = false)
    private String epsHotelId;

    @Column(name = "HOTEL_NAME", columnDefinition = "TEXT")
    private String hotelName;

    @Column(name = "COUNTRY_CODE", length = 2)
    private String countryCode;

    @Column(name = "CITY_NAME", columnDefinition = "TEXT")
    private String cityName;

    @Column(name = "LATITUDE", precision = 9, scale = 6)
    private Double latitude;

    @Column(name = "LONGITUDE", precision = 9, scale = 6)
    private Double longitude;

    @Column(name = "ADDRESS_LINE_1", columnDefinition = "TEXT")
    private String addressLine1;

    @Column(name = "ADDRESS_LINE_2", columnDefinition = "TEXT")
    private String addressLine2;

    @Column(name = "STATE_PROVINCE_CODE", length = 3)
    private String stateProvinceCode;

    @Column(name = "STATE_PROVINCE_NAME", columnDefinition = "TEXT")
    private String stateProvinceName;

    @Column(name = "POSTAL_CODE", length = 100)
    private String postalCode;

    @Column(name = "OBFUSCATED", columnDefinition = "BIT")
    private Boolean obfuscated;

    @Column(name = "LOCALIZED", columnDefinition = "TEXT")
    private String localized;

    @Column(name = "RATINGS", columnDefinition = "TEXT")
    private String ratings;

    @Column(name = "PHONE", length = 100)
    private String phone;

    @Column(name = "FAX", length = 100)
    private String fax;

    @Column(name = "CATEGORY_ID", length = 30)
    private String categoryId;

    @Column(name = "CATEGORY_NAME", columnDefinition = "TEXT")
    private String categoryName;

    @Column(name = "EXPEDIA_COLLECT", columnDefinition = "BIT")
    private Boolean expediaCollect;

    @Column(name = "PROPERTY_COLLECT", columnDefinition = "BIT")
    private Boolean propertyCollect;

    @Column(name = "`RANK`", precision = 100)
    private BigDecimal rank;

    @Column(name = "CHECKIN", columnDefinition = "TEXT")
    private String checkin;

    @Column(name = "CHECKOUT_TIME", length = 100)
    private String checkoutTime;

    @Column(name = "FEES", columnDefinition = "TEXT")
    private String fees;

    @Column(name = "KNOW_BEFORE_YOU_GO", columnDefinition = "TEXT")
    private String knowBeforeYouGo;

    @Column(name = "ATTRIBUTES", columnDefinition = "TEXT")
    private String attributes;

    @Column(name = "AMENITIES_ID", columnDefinition = "TEXT")
    private String amenitiesId;

    @Column(name = "AMENITIES_NAME", columnDefinition = "TEXT")
    private String amenitiesName;

    @Column(name = "IMAGES", columnDefinition = "TEXT")
    private String images;

    @Column(name = "ONSITE_PAYMENTS", columnDefinition = "TEXT")
    private String onsitePayments;

    @Column(name = "ROOMS", columnDefinition = "TEXT")
    private String rooms;

    @Column(name = "RATES", columnDefinition = "TEXT")
    private String rates;

    @Column(name = "DATES_ADDED", length = 10)
    private String datesAdded;

    @Column(name = "DATES_UPDATED", length = 10)
    private String datesUpdated;

    @Column(name = "DESCRIPTIONS", columnDefinition = "TEXT")
    private String descriptions;

    @Column(name = "STATISTICS", columnDefinition = "TEXT")
    private String statistics;

    @Column(name = "IATA_AIRPORT_CODE", length = 3)
    private String iataAirportCode;

    @Column(name = "REGISTRY_NUMBER", columnDefinition = "TEXT")
    private String registryNumber;

    @Column(name = "THEMES", columnDefinition = "TEXT")
    private String themes;

    @Column(name = "ALL_INCLUSIVE_DETAILS", columnDefinition = "TEXT")
    private String allInclusiveDetails;

    @Column(name = "TAX_ID", columnDefinition = "TEXT")
    private String taxId;

    @Column(name = "CHAIN", columnDefinition = "TEXT")
    private String chain;

    @Column(name = "BRAND", columnDefinition = "TEXT")
    private String brand;

    @Column(name = "SPOKEN_LANGUAGES", columnDefinition = "TEXT")
    private String spokenLanguages;

    @Column(name = "MULTI_UNIT", columnDefinition = "BIT")
    private Boolean multiUnit;

    @Column(name = "CREATE_DT", length = 30, nullable = false)
    private String createDt;

    @Column(name = "CREATE_USER", length = 100, nullable = false)
    private String createUser;

    @Column(name = "MOD_DT", length = 30)
    private String modDt;

    @Column(name = "MOD_USER", length = 100)
    private String modUser;

    @Column(name = "IS_OPEN", length = 1)
    private String isOpen;

    @Column(name = "DAYS", length = 1)
    private String days;

    @Column(name = "LOCATION", columnDefinition = "TEXT")
    private String location;

    @Column(name = "RESERVE_EARLY", length = 1)
    private String reserveEarly;

    @Column(name = "RESERVATION_TYPE", length = 100)
    private String reservationType;

    @Column(name = "KEYWORD", columnDefinition = "TEXT")
    private String keyword;

    @Column(name = "MIN_PRICE", length = 10)
    private String minPrice;

    @Column(name = "MOD_STS", length = 1)
    private String modSts;

    @Column(name = "MAXNUM", length = 3)
    private String maxNum;

    @Column(name = "REVIEWS_CNT", length = 10)
    private String reviewsCount;

    @Column(name = "REVIEWS", columnDefinition = "TEXT")
    private String reviews;

    @Column(name = "REVIEW_AGG", length = 5)
    private String reviewAvg;

}
