package com.yamaks.dadatest.rest

import com.google.gson.annotations.SerializedName

data class Companies(

    @field:SerializedName("suggestions")
    val suggestions: List<SuggestionsItem?>? = null
)

data class SuggestionsItem(

    @field:SerializedName("data")
    val data: Data? = null,

    @field:SerializedName("unrestricted_value")
    val unrestrictedValue: String? = null,

    @field:SerializedName("value")
    val value: String? = null
)

data class Data(

    @field:SerializedName("capital")
    val capital: Any? = null,

    @field:SerializedName("hid")
    val hid: String? = null,

    @field:SerializedName("documents")
    val documents: Any? = null,

    @field:SerializedName("branch_count")
    val branchCount: Int? = null,

    @field:SerializedName("phones")
    val phones: Any? = null,

    @field:SerializedName("founders")
    val founders: Any? = null,

    @field:SerializedName("source")
    val source: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("emails")
    val emails: Any? = null,

    @field:SerializedName("qc")
    val qc: String? = null,

    @field:SerializedName("ogrn_date")
    val ogrnDate: Long? = null,

    @field:SerializedName("branch_type")
    val branchType: String? = null,

    @field:SerializedName("state")
    val state: State? = null,

    @field:SerializedName("okveds")
    val okveds: Any? = null,

    @field:SerializedName("ogrn")
    val ogrn: String? = null,

    @field:SerializedName("employee_count")
    val employeeCount: Any? = null,

    @field:SerializedName("address")
    val address: Address? = null,

    @field:SerializedName("opf")
    val opf: Opf? = null,

    @field:SerializedName("inn")
    val inn: String? = null,

    @field:SerializedName("okved_type")
    val okvedType: String? = null,

    @field:SerializedName("kpp")
    val kpp: String? = null,

    @field:SerializedName("authorities")
    val authorities: Any? = null,

    @field:SerializedName("okpo")
    val okpo: Any? = null,

    @field:SerializedName("licenses")
    val licenses: Any? = null,

    @field:SerializedName("management")
    val management: Management? = null,

    @field:SerializedName("okved")
    val okved: String? = null,

    @field:SerializedName("name")
    val name: Name? = null,

    @field:SerializedName("managers")
    val managers: Any? = null,

    @field:SerializedName("finance")
    val finance: Finance? = null,

    @field:SerializedName("country")
    val country: String? = null,

    @field:SerializedName("city_district_fias_id")
    val cityDistrictFiasId: Any? = null,

    @field:SerializedName("settlement_type_full")
    val settlementTypeFull: Any? = null,

    @field:SerializedName("block_type")
    val blockType: String? = null,

    @field:SerializedName("settlement_fias_id")
    val settlementFiasId: Any? = null,

    @field:SerializedName("city_district_kladr_id")
    val cityDistrictKladrId: Any? = null,

    @field:SerializedName("region_type")
    val regionType: String? = null,

    @field:SerializedName("area_type_full")
    val areaTypeFull: Any? = null,

    @field:SerializedName("okato")
    val okato: String? = null,

    @field:SerializedName("house_fias_id")
    val houseFiasId: String? = null,

    @field:SerializedName("geoname_id")
    val geonameId: Any? = null,

    @field:SerializedName("street_with_type")
    val streetWithType: String? = null,

    @field:SerializedName("fias_id")
    val fiasId: String? = null,

    @field:SerializedName("federal_district")
    val federalDistrict: String? = null,

    @field:SerializedName("area_kladr_id")
    val areaKladrId: Any? = null,

    @field:SerializedName("region_type_full")
    val regionTypeFull: String? = null,

    @field:SerializedName("beltway_hit")
    val beltwayHit: Any? = null,

    @field:SerializedName("square_meter_price")
    val squareMeterPrice: Any? = null,

    @field:SerializedName("geo_lon")
    val geoLon: String? = null,

    @field:SerializedName("region_fias_id")
    val regionFiasId: String? = null,

    @field:SerializedName("block_type_full")
    val blockTypeFull: String? = null,

    @field:SerializedName("block")
    val block: String? = null,

    @field:SerializedName("city_district")
    val cityDistrict: String? = null,

    @field:SerializedName("city_type")
    val cityType: String? = null,

    @field:SerializedName("area_fias_id")
    val areaFiasId: Any? = null,

    @field:SerializedName("area")
    val area: Any? = null,

    @field:SerializedName("flat_type")
    val flatType: String? = null,

    @field:SerializedName("settlement_kladr_id")
    val settlementKladrId: Any? = null,

    @field:SerializedName("settlement_with_type")
    val settlementWithType: Any? = null,

    @field:SerializedName("area_with_type")
    val areaWithType: Any? = null,

    @field:SerializedName("fias_actuality_state")
    val fiasActualityState: String? = null,

    @field:SerializedName("fias_level")
    val fiasLevel: String? = null,

    @field:SerializedName("area_type")
    val areaType: Any? = null,

    @field:SerializedName("beltway_distance")
    val beltwayDistance: Any? = null,

    @field:SerializedName("country_iso_code")
    val countryIsoCode: String? = null,

    @field:SerializedName("city_fias_id")
    val cityFiasId: String? = null,

    @field:SerializedName("fias_code")
    val fiasCode: String? = null,

    @field:SerializedName("metro")
    val metro: List<MetroItem?>? = null,

    @field:SerializedName("kladr_id")
    val kladrId: String? = null,

    @field:SerializedName("tax_office")
    val taxOffice: String? = null,

    @field:SerializedName("house_kladr_id")
    val houseKladrId: String? = null,

    @field:SerializedName("postal_box")
    val postalBox: Any? = null,

    @field:SerializedName("region")
    val region: String? = null,

    @field:SerializedName("settlement_type")
    val settlementType: Any? = null,

    @field:SerializedName("flat_price")
    val flatPrice: Any? = null,

    @field:SerializedName("qc_complete")
    val qcComplete: Any? = null,

    @field:SerializedName("qc_house")
    val qcHouse: Any? = null,

    @field:SerializedName("city")
    val city: String? = null,

    @field:SerializedName("timezone")
    val timezone: String? = null,

    @field:SerializedName("flat_area")
    val flatArea: Any? = null,

    @field:SerializedName("house")
    val house: String? = null,

    @field:SerializedName("settlement")
    val settlement: Any? = null,

    @field:SerializedName("region_iso_code")
    val regionIsoCode: String? = null,

    @field:SerializedName("capital_marker")
    val capitalMarker: String? = null,

    @field:SerializedName("region_kladr_id")
    val regionKladrId: String? = null,

    @field:SerializedName("street")
    val street: String? = null,

    @field:SerializedName("flat")
    val flat: String? = null,

    @field:SerializedName("qc_geo")
    val qcGeo: String? = null,

    @field:SerializedName("house_type")
    val houseType: String? = null,

    @field:SerializedName("city_district_with_type")
    val cityDistrictWithType: String? = null,

    @field:SerializedName("city_kladr_id")
    val cityKladrId: String? = null,

    @field:SerializedName("city_type_full")
    val cityTypeFull: String? = null,

    @field:SerializedName("city_area")
    val cityArea: Any? = null,

    @field:SerializedName("street_kladr_id")
    val streetKladrId: String? = null,

    @field:SerializedName("flat_type_full")
    val flatTypeFull: String? = null,

    @field:SerializedName("house_type_full")
    val houseTypeFull: String? = null,

    @field:SerializedName("oktmo")
    val oktmo: String? = null,

    @field:SerializedName("city_district_type")
    val cityDistrictType: String? = null,

    @field:SerializedName("geo_lat")
    val geoLat: String? = null,

    @field:SerializedName("history_values")
    val historyValues: Any? = null,

    @field:SerializedName("street_type_full")
    val streetTypeFull: String? = null,

    @field:SerializedName("city_district_type_full")
    val cityDistrictTypeFull: String? = null,

    @field:SerializedName("tax_office_legal")
    val taxOfficeLegal: String? = null,

    @field:SerializedName("street_type")
    val streetType: String? = null,

    @field:SerializedName("region_with_type")
    val regionWithType: String? = null,

    @field:SerializedName("postal_code")
    val postalCode: String? = null,

    @field:SerializedName("city_with_type")
    val cityWithType: String? = null,

    @field:SerializedName("unparsed_parts")
    val unparsedParts: Any? = null,

    @field:SerializedName("street_fias_id")
    val streetFiasId: String? = null
)

data class Opf(

    @field:SerializedName("code")
    val code: String? = null,

    @field:SerializedName("short")
    val jsonMemberShort: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("full")
    val full: String? = null
)

data class Management(

    @field:SerializedName("disqualified")
    val disqualified: Any? = null,

    @field:SerializedName("post")
    val post: String? = null,

    @field:SerializedName("name")
    val name: String? = null
)

data class Address(

    @field:SerializedName("data")
    val data: Data? = null,

    @field:SerializedName("unrestricted_value")
    val unrestrictedValue: String? = null,

    @field:SerializedName("value")
    val value: String? = null
)

data class Finance(

    @field:SerializedName("income")
    val income: Any? = null,

    @field:SerializedName("penalty")
    val penalty: Any? = null,

    @field:SerializedName("expense")
    val expense: Any? = null,

    @field:SerializedName("tax_system")
    val taxSystem: Any? = null,

    @field:SerializedName("debt")
    val debt: Any? = null
)

data class Name(

    @field:SerializedName("short_with_opf")
    val shortWithOpf: String? = null,

    @field:SerializedName("full_with_opf")
    val fullWithOpf: String? = null,

    @field:SerializedName("short")
    val jsonMemberShort: String? = null,

    @field:SerializedName("latin")
    val latin: Any? = null,

    @field:SerializedName("full")
    val full: String? = null
)

data class State(

    @field:SerializedName("liquidation_date")
    val liquidationDate: Any? = null,

    @field:SerializedName("actuality_date")
    val actualityDate: Long? = null,

    @field:SerializedName("registration_date")
    val registrationDate: Long? = null,

    @field:SerializedName("status")
    val status: String? = null
)

data class MetroItem(

    @field:SerializedName("distance")
    val distance: Double? = null,

    @field:SerializedName("line")
    val line: String? = null,

    @field:SerializedName("name")
    val name: String? = null
)
