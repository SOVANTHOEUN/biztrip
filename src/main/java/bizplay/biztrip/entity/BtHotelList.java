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

    public BtHotelListPK getBtHotelListPK() {
        return btHotelListPK;
    }

    public void setBtHotelListPK(BtHotelListPK btHotelListPK) {
        this.btHotelListPK = btHotelListPK;
    }

    public String getEpsHotelId() {
        return epsHotelId;
    }

    public void setEpsHotelId(String epsHotelId) {
        this.epsHotelId = epsHotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public String getStateProvinceName() {
        return stateProvinceName;
    }

    public void setStateProvinceName(String stateProvinceName) {
        this.stateProvinceName = stateProvinceName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Boolean getObfuscated() {
        return obfuscated;
    }

    public void setObfuscated(Boolean obfuscated) {
        this.obfuscated = obfuscated;
    }

    public String getLocalized() {
        return localized;
    }

    public void setLocalized(String localized) {
        this.localized = localized;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getExpediaCollect() {
        return expediaCollect;
    }

    public void setExpediaCollect(Boolean expediaCollect) {
        this.expediaCollect = expediaCollect;
    }

    public Boolean getPropertyCollect() {
        return propertyCollect;
    }

    public void setPropertyCollect(Boolean propertyCollect) {
        this.propertyCollect = propertyCollect;
    }

    public BigDecimal getRank() {
        return rank;
    }

    public void setRank(BigDecimal rank) {
        this.rank = rank;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getKnowBeforeYouGo() {
        return knowBeforeYouGo;
    }

    public void setKnowBeforeYouGo(String knowBeforeYouGo) {
        this.knowBeforeYouGo = knowBeforeYouGo;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAmenitiesId() {
        return amenitiesId;
    }

    public void setAmenitiesId(String amenitiesId) {
        this.amenitiesId = amenitiesId;
    }

    public String getAmenitiesName() {
        return amenitiesName;
    }

    public void setAmenitiesName(String amenitiesName) {
        this.amenitiesName = amenitiesName;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getOnsitePayments() {
        return onsitePayments;
    }

    public void setOnsitePayments(String onsitePayments) {
        this.onsitePayments = onsitePayments;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public String getDatesAdded() {
        return datesAdded;
    }

    public void setDatesAdded(String datesAdded) {
        this.datesAdded = datesAdded;
    }

    public String getDatesUpdated() {
        return datesUpdated;
    }

    public void setDatesUpdated(String datesUpdated) {
        this.datesUpdated = datesUpdated;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(String registryNumber) {
        this.registryNumber = registryNumber;
    }

    public String getThemes() {
        return themes;
    }

    public void setThemes(String themes) {
        this.themes = themes;
    }

    public String getAllInclusiveDetails() {
        return allInclusiveDetails;
    }

    public void setAllInclusiveDetails(String allInclusiveDetails) {
        this.allInclusiveDetails = allInclusiveDetails;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(String spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public Boolean getMultiUnit() {
        return multiUnit;
    }

    public void setMultiUnit(Boolean multiUnit) {
        this.multiUnit = multiUnit;
    }

    public String getCreateDt() {
        return createDt;
    }

    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getModDt() {
        return modDt;
    }

    public void setModDt(String modDt) {
        this.modDt = modDt;
    }

    public String getModUser() {
        return modUser;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReserveEarly() {
        return reserveEarly;
    }

    public void setReserveEarly(String reserveEarly) {
        this.reserveEarly = reserveEarly;
    }

    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getModSts() {
        return modSts;
    }

    public void setModSts(String modSts) {
        this.modSts = modSts;
    }

    public String getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(String maxNum) {
        this.maxNum = maxNum;
    }

    public String getReviewsCount() {
        return reviewsCount;
    }

    public void setReviewsCount(String reviewsCount) {
        this.reviewsCount = reviewsCount;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getReviewAvg() {
        return reviewAvg;
    }

    public void setReviewAvg(String reviewAvg) {
        this.reviewAvg = reviewAvg;
    }
}
