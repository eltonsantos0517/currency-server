package com.elton.currencyserver.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

/**
 * Created by elton on 26/06/2017.
 */
@JsonRootName("quotes")
public class QuotesDTO implements Serializable{

    @JsonProperty("USDAED")
    private Double unitedArabEmiratesDirham;
    @JsonProperty("USDAFN")
    private Double afghanAfghani;
    @JsonProperty("USDALL")
    private Double albanianLek;
    @JsonProperty("USDAMD")
    private Double armenianDram;
    @JsonProperty("USDANG")
    private Double netherlandsAntilleanGuilder;
    @JsonProperty("USDAOA")
    private Double angolanKwanza;
    @JsonProperty("USDARS")
    private Double argentinePeso;
    @JsonProperty("USDAUD")
    private Double australianDollar;
    @JsonProperty("USDAWG")
    private Double arubanFlorin;
    @JsonProperty("USDAZN")
    private Double azerbaijaniManat;
    @JsonProperty("USDBAM")
    private Double bosniaHerzegovinaConvertibleMark;
    @JsonProperty("USDBBD")
    private Double barbadianDollar;
    @JsonProperty("USDBDT")
    private Double bangladeshiTaka;
    @JsonProperty("USDBGN")
    private Double bulgarianLev;
    @JsonProperty("USDBHD")
    private Double bahrainiDinar;
    @JsonProperty("USDBIF")
    private Double burundianFranc;
    @JsonProperty("USDBMD")
    private Double bermudanDollar;
    @JsonProperty("USDBND")
    private Double bruneiDollar;
    @JsonProperty("USDBOB")
    private Double bolivianBoliviano;
    @JsonProperty("USDBRL")
    private Double brazilianReal;
    @JsonProperty("USDBSD")
    private Double bahamianDollar;
    @JsonProperty("USDBTC")
    private Double bitcoin;
    @JsonProperty("USDBTN")
    private Double bhutaneseNgultrum;
    @JsonProperty("USDBWP")
    private Double botswananPula;
    @JsonProperty("USDBYN")
    private Double newBelarusianRuble;
    @JsonProperty("USDBYR")
    private Double belarusianRuble;
    @JsonProperty("USDBZD")
    private Double belizeDollar;
    @JsonProperty("USDCAD")
    private Double canadianDollar;
    @JsonProperty("USDCDF")
    private Double congoleseFranc;
    @JsonProperty("USDCHF")
    private Double swissFranc;
    @JsonProperty("USDCLF")
    private Double chileanUnitofAccount;
    @JsonProperty("USDCLP")
    private Double chileanPeso;
    @JsonProperty("USDCNY")
    private Double chineseYuan;
    @JsonProperty("USDCOP")
    private Double colombianPeso;
    @JsonProperty("USDCRC")
    private Double costaRicanColon;
    @JsonProperty("USDCUC")
    private Double cubanConvertiblePeso;
    @JsonProperty("USDCUP")
    private Double cubanPeso;
    @JsonProperty("USDCVE")
    private Double capeVerdeanEscudo;
    @JsonProperty("USDCZK")
    private Double czechRepublicKoruna;
    @JsonProperty("USDDJF")
    private Double djiboutianFranc;
    @JsonProperty("USDDKK")
    private Double danishKrone;
    @JsonProperty("USDDOP")
    private Double dominicanPeso;
    @JsonProperty("USDDZD")
    private Double algerianDinar;
    @JsonProperty("USDEEK")
    private Double estonianKroon;
    @JsonProperty("USDEGP")
    private Double egyptianPound;
    @JsonProperty("USDERN")
    private Double eritreanNakfa;
    @JsonProperty("USDETB")
    private Double ethiopianBirr;
    @JsonProperty("USDEUR")
    private Double euro;
    @JsonProperty("USDFJD")
    private Double fijianDollar;
    @JsonProperty("USDFKP")
    private Double falklandIslandsPound;
    @JsonProperty("USDGBP")
    private Double pritishPoundSterling;
    @JsonProperty("USDGEL")
    private Double georgianLari;
    @JsonProperty("USDGGP")
    private Double guernseyPound;
    @JsonProperty("USDGHS")
    private Double ghanaianCedi;
    @JsonProperty("USDGIP")
    private Double gibraltarPound;
    @JsonProperty("USDGMD")
    private Double gambianDalasi;
    @JsonProperty("USDGNF")
    private Double guineanFranc;
    @JsonProperty("USDGTQ")
    private Double guatemalanQuetzal;
    @JsonProperty("USDGYD")
    private Double guyanaeseDollar;
    @JsonProperty("USDHKD")
    private Double hongKongDollar;
    @JsonProperty("USDHNL")
    private Double honduranLempira;
    @JsonProperty("USDHRK")
    private Double croatianKuna;
    @JsonProperty("USDHTG")
    private Double haitianGourde;
    @JsonProperty("USDHUF")
    private Double hungarianForint;
    @JsonProperty("USDIDR")
    private Double indonesianRupiah;
    @JsonProperty("USDILS")
    private Double israeliNewSheqel;
    @JsonProperty("USDIMP")
    private Double manxpound;
    @JsonProperty("USDINR")
    private Double indianRupee;
    @JsonProperty("USDIQD")
    private Double traqiDinar;
    @JsonProperty("USDIRR")
    private Double tranianRial;
    @JsonProperty("USDISK")
    private Double tcelandicKrona;
    @JsonProperty("USDJEP")
    private Double jerseyPound;
    @JsonProperty("USDJMD")
    private Double jamaicanDollar;
    @JsonProperty("USDJOD")
    private Double jordanianDinar;
    @JsonProperty("USDJPY")
    private Double japaneseYen;
    @JsonProperty("USDKES")
    private Double kenyanShilling;
    @JsonProperty("USDKGS")
    private Double kyrgystaniSom;
    @JsonProperty("USDKHR")
    private Double cambodianRiel;
    @JsonProperty("USDKMF")
    private Double comorianFranc;
    @JsonProperty("USDKPW")
    private Double northKoreanWon;
    @JsonProperty("USDKRW")
    private Double southKoreanWon;
    @JsonProperty("USDKWD")
    private Double kuwaitiDinar;
    @JsonProperty("USDKYD")
    private Double caymanIslandsDollar;
    @JsonProperty("USDKZT")
    private Double kazakhstaniTenge;
    @JsonProperty("USDLAK")
    private Double laotianKip;
    @JsonProperty("USDLBP")
    private Double lebanesePound;
    @JsonProperty("USDLKR")
    private Double sriLankanRupee;
    @JsonProperty("USDLRD")
    private Double liberianDollar;
    @JsonProperty("USDLSL")
    private Double lesothoLoti;
    @JsonProperty("USDLTL")
    private Double lithuanianLitas;
    @JsonProperty("USDLVL")
    private Double latvianLats;
    @JsonProperty("USDLYD")
    private Double libyanDinar;
    @JsonProperty("USDMAD")
    private Double moroccanDirham;
    @JsonProperty("USDMDL")
    private Double moldovanLeu;
    @JsonProperty("USDMGA")
    private Double malagasyAriary;
    @JsonProperty("USDMKD")
    private Double macedonianDenar;
    @JsonProperty("USDMMK")
    private Double myanmaKyat;
    @JsonProperty("USDMNT")
    private Double mongolianTugrik;
    @JsonProperty("USDMOP")
    private Double macanesePataca;
    @JsonProperty("USDMRO")
    private Double mauritanianOuguiya;
    @JsonProperty("USDMUR")
    private Double mauritianRupee;
    @JsonProperty("USDMVR")
    private Double maldivianRufiyaa;
    @JsonProperty("USDMWK")
    private Double malawianKwacha;
    @JsonProperty("USDMXN")
    private Double mexicanPeso;
    @JsonProperty("USDMYR")
    private Double malaysianRinggit;
    @JsonProperty("USDMZN")
    private Double mozambicanMetical;
    @JsonProperty("USDNAD")
    private Double namibianDollar;
    @JsonProperty("USDNGN")
    private Double nigerianNaira;
    @JsonProperty("USDNIO")
    private Double nicaraguanCordoba;
    @JsonProperty("USDNOK")
    private Double norwegianKrone;
    @JsonProperty("USDNPR")
    private Double nepaleseRupee;
    @JsonProperty("USDNZD")
    private Double newZealandDollar;
    @JsonProperty("USDOMR")
    private Double omaniRial;
    @JsonProperty("USDPAB")
    private Double panamanianBalboa;
    @JsonProperty("USDPEN")
    private Double peruvianNuevoSol;
    @JsonProperty("USDPGK")
    private Double papuaNewGuineanKina;
    @JsonProperty("USDPHP")
    private Double philippinePeso;
    @JsonProperty("USDPKR")
    private Double pakistaniRupee;
    @JsonProperty("USDPLN")
    private Double polishZloty;
    @JsonProperty("USDPYG")
    private Double paraguayanGuarani;
    @JsonProperty("USDQAR")
    private Double qatariRial;
    @JsonProperty("USDRON")
    private Double romanianLeu;
    @JsonProperty("USDRSD")
    private Double serbianDinar;
    @JsonProperty("USDRUB")
    private Double russianRuble;
    @JsonProperty("USDRWF")
    private Double rwandanFranc;
    @JsonProperty("USDSAR")
    private Double saudiRiyal;
    @JsonProperty("USDSBD")
    private Double solomonIslandsDollar;
    @JsonProperty("USDSCR")
    private Double seychelloisRupee;
    @JsonProperty("USDSDG")
    private Double sudanesePound;
    @JsonProperty("USDSEK")
    private Double swedishKrona;
    @JsonProperty("USDSGD")
    private Double singaporeDollar;
    @JsonProperty("USDSHP")
    private Double saintHelenaPound;
    @JsonProperty("USDSLL")
    private Double sierraLeoneanLeone;
    @JsonProperty("USDSOS")
    private Double somaliShilling;
    @JsonProperty("USDSRD")
    private Double surinameseDollar;
    @JsonProperty("USDSTD")
    private Double saoTomeandPrincipeDobra;
    @JsonProperty("USDSVC")
    private Double salvadoranColon;
    @JsonProperty("USDSYP")
    private Double syrianPound;
    @JsonProperty("USDSZL")
    private Double swaziLilangeni;
    @JsonProperty("USDTHB")
    private Double thaiBaht;
    @JsonProperty("USDTJS")
    private Double tajikistaniSomoni;
    @JsonProperty("USDTMT")
    private Double turkmenistaniManat;
    @JsonProperty("USDTND")
    private Double tunisianDinar;
    @JsonProperty("USDTOP")
    private Double tonganPaanga;
    @JsonProperty("USDTRY")
    private Double turkishLira;
    @JsonProperty("USDTTD")
    private Double trinidadandTobagoDollar;
    @JsonProperty("USDTWD")
    private Double newTaiwanDollar;
    @JsonProperty("USDTZS")
    private Double tanzanianShilling;
    @JsonProperty("USDUAH")
    private Double ukrainianHryvnia;
    @JsonProperty("USDUGX")
    private Double ugandanShilling;
    @JsonProperty("USDUSD")
    private Double unitedStatesDollar;
    @JsonProperty("USDUYU")
    private Double uruguayanPeso;
    @JsonProperty("USDUZS")
    private Double uzbekistanSom;
    @JsonProperty("USDVEF")
    private Double venezuelanBolivarFuerte;
    @JsonProperty("USDVND")
    private Double vietnameseDong;
    @JsonProperty("USDVUV")
    private Double vanuatuVatu;
    @JsonProperty("USDWST")
    private Double samoanTala;
    @JsonProperty("USDXAF")
    private Double cfaFrancBEAC;
    @JsonProperty("USDXAG")
    private Double silver;
    @JsonProperty("USDXAU")
    private Double gold;
    @JsonProperty("USDXCD")
    private Double eastCaribbeanDollar;
    @JsonProperty("USDXDR")
    private Double specialDrawingRights;
    @JsonProperty("USDXOF")
    private Double cfaFrancBCEAO;
    @JsonProperty("USDXPF")
    private Double cfpFranc;
    @JsonProperty("USDYER")
    private Double yemeniRial;
    @JsonProperty("USDZAR")
    private Double southAfricanRand;
    @JsonProperty("USDZMK")
    private Double zambianKwachaPre2013;
    @JsonProperty("USDZMW")
    private Double zambianKwacha;
    @JsonProperty("USDZWL")
    private Double zimbabweanDollar;

    public Double getUnitedArabEmiratesDirham() {
        return unitedArabEmiratesDirham;
    }

    public void setUnitedArabEmiratesDirham(Double unitedArabEmiratesDirham) {
        this.unitedArabEmiratesDirham = unitedArabEmiratesDirham;
    }

    public Double getAfghanAfghani() {
        return afghanAfghani;
    }

    public void setAfghanAfghani(Double afghanAfghani) {
        this.afghanAfghani = afghanAfghani;
    }

    public Double getAlbanianLek() {
        return albanianLek;
    }

    public void setAlbanianLek(Double albanianLek) {
        this.albanianLek = albanianLek;
    }

    public Double getArmenianDram() {
        return armenianDram;
    }

    public void setArmenianDram(Double armenianDram) {
        this.armenianDram = armenianDram;
    }

    public Double getNetherlandsAntilleanGuilder() {
        return netherlandsAntilleanGuilder;
    }

    public void setNetherlandsAntilleanGuilder(Double netherlandsAntilleanGuilder) {
        this.netherlandsAntilleanGuilder = netherlandsAntilleanGuilder;
    }

    public Double getAngolanKwanza() {
        return angolanKwanza;
    }

    public void setAngolanKwanza(Double angolanKwanza) {
        this.angolanKwanza = angolanKwanza;
    }

    public Double getArgentinePeso() {
        return argentinePeso;
    }

    public void setArgentinePeso(Double argentinePeso) {
        this.argentinePeso = argentinePeso;
    }

    public Double getAustralianDollar() {
        return australianDollar;
    }

    public void setAustralianDollar(Double australianDollar) {
        this.australianDollar = australianDollar;
    }

    public Double getArubanFlorin() {
        return arubanFlorin;
    }

    public void setArubanFlorin(Double arubanFlorin) {
        this.arubanFlorin = arubanFlorin;
    }

    public Double getAzerbaijaniManat() {
        return azerbaijaniManat;
    }

    public void setAzerbaijaniManat(Double azerbaijaniManat) {
        this.azerbaijaniManat = azerbaijaniManat;
    }

    public Double getBosniaHerzegovinaConvertibleMark() {
        return bosniaHerzegovinaConvertibleMark;
    }

    public void setBosniaHerzegovinaConvertibleMark(Double bosniaHerzegovinaConvertibleMark) {
        this.bosniaHerzegovinaConvertibleMark = bosniaHerzegovinaConvertibleMark;
    }

    public Double getBarbadianDollar() {
        return barbadianDollar;
    }

    public void setBarbadianDollar(Double barbadianDollar) {
        this.barbadianDollar = barbadianDollar;
    }

    public Double getBangladeshiTaka() {
        return bangladeshiTaka;
    }

    public void setBangladeshiTaka(Double bangladeshiTaka) {
        this.bangladeshiTaka = bangladeshiTaka;
    }

    public Double getBulgarianLev() {
        return bulgarianLev;
    }

    public void setBulgarianLev(Double bulgarianLev) {
        this.bulgarianLev = bulgarianLev;
    }

    public Double getBahrainiDinar() {
        return bahrainiDinar;
    }

    public void setBahrainiDinar(Double bahrainiDinar) {
        this.bahrainiDinar = bahrainiDinar;
    }

    public Double getBurundianFranc() {
        return burundianFranc;
    }

    public void setBurundianFranc(Double burundianFranc) {
        this.burundianFranc = burundianFranc;
    }

    public Double getBermudanDollar() {
        return bermudanDollar;
    }

    public void setBermudanDollar(Double bermudanDollar) {
        this.bermudanDollar = bermudanDollar;
    }

    public Double getBruneiDollar() {
        return bruneiDollar;
    }

    public void setBruneiDollar(Double bruneiDollar) {
        this.bruneiDollar = bruneiDollar;
    }

    public Double getBolivianBoliviano() {
        return bolivianBoliviano;
    }

    public void setBolivianBoliviano(Double bolivianBoliviano) {
        this.bolivianBoliviano = bolivianBoliviano;
    }

    public Double getBrazilianReal() {
        return brazilianReal;
    }

    public void setBrazilianReal(Double brazilianReal) {
        this.brazilianReal = brazilianReal;
    }

    public Double getBahamianDollar() {
        return bahamianDollar;
    }

    public void setBahamianDollar(Double bahamianDollar) {
        this.bahamianDollar = bahamianDollar;
    }

    public Double getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(Double bitcoin) {
        this.bitcoin = bitcoin;
    }

    public Double getBhutaneseNgultrum() {
        return bhutaneseNgultrum;
    }

    public void setBhutaneseNgultrum(Double bhutaneseNgultrum) {
        this.bhutaneseNgultrum = bhutaneseNgultrum;
    }

    public Double getBotswananPula() {
        return botswananPula;
    }

    public void setBotswananPula(Double botswananPula) {
        this.botswananPula = botswananPula;
    }

    public Double getNewBelarusianRuble() {
        return newBelarusianRuble;
    }

    public void setNewBelarusianRuble(Double newBelarusianRuble) {
        this.newBelarusianRuble = newBelarusianRuble;
    }

    public Double getBelarusianRuble() {
        return belarusianRuble;
    }

    public void setBelarusianRuble(Double belarusianRuble) {
        this.belarusianRuble = belarusianRuble;
    }

    public Double getBelizeDollar() {
        return belizeDollar;
    }

    public void setBelizeDollar(Double belizeDollar) {
        this.belizeDollar = belizeDollar;
    }

    public Double getCanadianDollar() {
        return canadianDollar;
    }

    public void setCanadianDollar(Double canadianDollar) {
        this.canadianDollar = canadianDollar;
    }

    public Double getCongoleseFranc() {
        return congoleseFranc;
    }

    public void setCongoleseFranc(Double congoleseFranc) {
        this.congoleseFranc = congoleseFranc;
    }

    public Double getSwissFranc() {
        return swissFranc;
    }

    public void setSwissFranc(Double swissFranc) {
        this.swissFranc = swissFranc;
    }

    public Double getChileanUnitofAccount() {
        return chileanUnitofAccount;
    }

    public void setChileanUnitofAccount(Double chileanUnitofAccount) {
        this.chileanUnitofAccount = chileanUnitofAccount;
    }

    public Double getChileanPeso() {
        return chileanPeso;
    }

    public void setChileanPeso(Double chileanPeso) {
        this.chileanPeso = chileanPeso;
    }

    public Double getChineseYuan() {
        return chineseYuan;
    }

    public void setChineseYuan(Double chineseYuan) {
        this.chineseYuan = chineseYuan;
    }

    public Double getColombianPeso() {
        return colombianPeso;
    }

    public void setColombianPeso(Double colombianPeso) {
        this.colombianPeso = colombianPeso;
    }

    public Double getCostaRicanColon() {
        return costaRicanColon;
    }

    public void setCostaRicanColon(Double costaRicanColon) {
        this.costaRicanColon = costaRicanColon;
    }

    public Double getCubanConvertiblePeso() {
        return cubanConvertiblePeso;
    }

    public void setCubanConvertiblePeso(Double cubanConvertiblePeso) {
        this.cubanConvertiblePeso = cubanConvertiblePeso;
    }

    public Double getCubanPeso() {
        return cubanPeso;
    }

    public void setCubanPeso(Double cubanPeso) {
        this.cubanPeso = cubanPeso;
    }

    public Double getCapeVerdeanEscudo() {
        return capeVerdeanEscudo;
    }

    public void setCapeVerdeanEscudo(Double capeVerdeanEscudo) {
        this.capeVerdeanEscudo = capeVerdeanEscudo;
    }

    public Double getCzechRepublicKoruna() {
        return czechRepublicKoruna;
    }

    public void setCzechRepublicKoruna(Double czechRepublicKoruna) {
        this.czechRepublicKoruna = czechRepublicKoruna;
    }

    public Double getDjiboutianFranc() {
        return djiboutianFranc;
    }

    public void setDjiboutianFranc(Double djiboutianFranc) {
        this.djiboutianFranc = djiboutianFranc;
    }

    public Double getDanishKrone() {
        return danishKrone;
    }

    public void setDanishKrone(Double danishKrone) {
        this.danishKrone = danishKrone;
    }

    public Double getDominicanPeso() {
        return dominicanPeso;
    }

    public void setDominicanPeso(Double dominicanPeso) {
        this.dominicanPeso = dominicanPeso;
    }

    public Double getAlgerianDinar() {
        return algerianDinar;
    }

    public void setAlgerianDinar(Double algerianDinar) {
        this.algerianDinar = algerianDinar;
    }

    public Double getEstonianKroon() {
        return estonianKroon;
    }

    public void setEstonianKroon(Double estonianKroon) {
        this.estonianKroon = estonianKroon;
    }

    public Double getEgyptianPound() {
        return egyptianPound;
    }

    public void setEgyptianPound(Double egyptianPound) {
        this.egyptianPound = egyptianPound;
    }

    public Double getEritreanNakfa() {
        return eritreanNakfa;
    }

    public void setEritreanNakfa(Double eritreanNakfa) {
        this.eritreanNakfa = eritreanNakfa;
    }

    public Double getEthiopianBirr() {
        return ethiopianBirr;
    }

    public void setEthiopianBirr(Double ethiopianBirr) {
        this.ethiopianBirr = ethiopianBirr;
    }

    public Double getEuro() {
        return euro;
    }

    public void setEuro(Double euro) {
        this.euro = euro;
    }

    public Double getFijianDollar() {
        return fijianDollar;
    }

    public void setFijianDollar(Double fijianDollar) {
        this.fijianDollar = fijianDollar;
    }

    public Double getFalklandIslandsPound() {
        return falklandIslandsPound;
    }

    public void setFalklandIslandsPound(Double falklandIslandsPound) {
        this.falklandIslandsPound = falklandIslandsPound;
    }

    public Double getPritishPoundSterling() {
        return pritishPoundSterling;
    }

    public void setPritishPoundSterling(Double pritishPoundSterling) {
        this.pritishPoundSterling = pritishPoundSterling;
    }

    public Double getGeorgianLari() {
        return georgianLari;
    }

    public void setGeorgianLari(Double georgianLari) {
        this.georgianLari = georgianLari;
    }

    public Double getGuernseyPound() {
        return guernseyPound;
    }

    public void setGuernseyPound(Double guernseyPound) {
        this.guernseyPound = guernseyPound;
    }

    public Double getGhanaianCedi() {
        return ghanaianCedi;
    }

    public void setGhanaianCedi(Double ghanaianCedi) {
        this.ghanaianCedi = ghanaianCedi;
    }

    public Double getGibraltarPound() {
        return gibraltarPound;
    }

    public void setGibraltarPound(Double gibraltarPound) {
        this.gibraltarPound = gibraltarPound;
    }

    public Double getGambianDalasi() {
        return gambianDalasi;
    }

    public void setGambianDalasi(Double gambianDalasi) {
        this.gambianDalasi = gambianDalasi;
    }

    public Double getGuineanFranc() {
        return guineanFranc;
    }

    public void setGuineanFranc(Double guineanFranc) {
        this.guineanFranc = guineanFranc;
    }

    public Double getGuatemalanQuetzal() {
        return guatemalanQuetzal;
    }

    public void setGuatemalanQuetzal(Double guatemalanQuetzal) {
        this.guatemalanQuetzal = guatemalanQuetzal;
    }

    public Double getGuyanaeseDollar() {
        return guyanaeseDollar;
    }

    public void setGuyanaeseDollar(Double guyanaeseDollar) {
        this.guyanaeseDollar = guyanaeseDollar;
    }

    public Double getHongKongDollar() {
        return hongKongDollar;
    }

    public void setHongKongDollar(Double hongKongDollar) {
        this.hongKongDollar = hongKongDollar;
    }

    public Double getHonduranLempira() {
        return honduranLempira;
    }

    public void setHonduranLempira(Double honduranLempira) {
        this.honduranLempira = honduranLempira;
    }

    public Double getCroatianKuna() {
        return croatianKuna;
    }

    public void setCroatianKuna(Double croatianKuna) {
        this.croatianKuna = croatianKuna;
    }

    public Double getHaitianGourde() {
        return haitianGourde;
    }

    public void setHaitianGourde(Double haitianGourde) {
        this.haitianGourde = haitianGourde;
    }

    public Double getHungarianForint() {
        return hungarianForint;
    }

    public void setHungarianForint(Double hungarianForint) {
        this.hungarianForint = hungarianForint;
    }

    public Double getIndonesianRupiah() {
        return indonesianRupiah;
    }

    public void setIndonesianRupiah(Double indonesianRupiah) {
        this.indonesianRupiah = indonesianRupiah;
    }

    public Double getIsraeliNewSheqel() {
        return israeliNewSheqel;
    }

    public void setIsraeliNewSheqel(Double israeliNewSheqel) {
        this.israeliNewSheqel = israeliNewSheqel;
    }

    public Double getManxpound() {
        return manxpound;
    }

    public void setManxpound(Double manxpound) {
        this.manxpound = manxpound;
    }

    public Double getIndianRupee() {
        return indianRupee;
    }

    public void setIndianRupee(Double indianRupee) {
        this.indianRupee = indianRupee;
    }

    public Double getTraqiDinar() {
        return traqiDinar;
    }

    public void setTraqiDinar(Double traqiDinar) {
        this.traqiDinar = traqiDinar;
    }

    public Double getTranianRial() {
        return tranianRial;
    }

    public void setTranianRial(Double tranianRial) {
        this.tranianRial = tranianRial;
    }

    public Double getTcelandicKrona() {
        return tcelandicKrona;
    }

    public void setTcelandicKrona(Double tcelandicKrona) {
        this.tcelandicKrona = tcelandicKrona;
    }

    public Double getJerseyPound() {
        return jerseyPound;
    }

    public void setJerseyPound(Double jerseyPound) {
        this.jerseyPound = jerseyPound;
    }

    public Double getJamaicanDollar() {
        return jamaicanDollar;
    }

    public void setJamaicanDollar(Double jamaicanDollar) {
        this.jamaicanDollar = jamaicanDollar;
    }

    public Double getJordanianDinar() {
        return jordanianDinar;
    }

    public void setJordanianDinar(Double jordanianDinar) {
        this.jordanianDinar = jordanianDinar;
    }

    public Double getJapaneseYen() {
        return japaneseYen;
    }

    public void setJapaneseYen(Double japaneseYen) {
        this.japaneseYen = japaneseYen;
    }

    public Double getKenyanShilling() {
        return kenyanShilling;
    }

    public void setKenyanShilling(Double kenyanShilling) {
        this.kenyanShilling = kenyanShilling;
    }

    public Double getKyrgystaniSom() {
        return kyrgystaniSom;
    }

    public void setKyrgystaniSom(Double kyrgystaniSom) {
        this.kyrgystaniSom = kyrgystaniSom;
    }

    public Double getCambodianRiel() {
        return cambodianRiel;
    }

    public void setCambodianRiel(Double cambodianRiel) {
        this.cambodianRiel = cambodianRiel;
    }

    public Double getComorianFranc() {
        return comorianFranc;
    }

    public void setComorianFranc(Double comorianFranc) {
        this.comorianFranc = comorianFranc;
    }

    public Double getNorthKoreanWon() {
        return northKoreanWon;
    }

    public void setNorthKoreanWon(Double northKoreanWon) {
        this.northKoreanWon = northKoreanWon;
    }

    public Double getSouthKoreanWon() {
        return southKoreanWon;
    }

    public void setSouthKoreanWon(Double southKoreanWon) {
        this.southKoreanWon = southKoreanWon;
    }

    public Double getKuwaitiDinar() {
        return kuwaitiDinar;
    }

    public void setKuwaitiDinar(Double kuwaitiDinar) {
        this.kuwaitiDinar = kuwaitiDinar;
    }

    public Double getCaymanIslandsDollar() {
        return caymanIslandsDollar;
    }

    public void setCaymanIslandsDollar(Double caymanIslandsDollar) {
        this.caymanIslandsDollar = caymanIslandsDollar;
    }

    public Double getKazakhstaniTenge() {
        return kazakhstaniTenge;
    }

    public void setKazakhstaniTenge(Double kazakhstaniTenge) {
        this.kazakhstaniTenge = kazakhstaniTenge;
    }

    public Double getLaotianKip() {
        return laotianKip;
    }

    public void setLaotianKip(Double laotianKip) {
        this.laotianKip = laotianKip;
    }

    public Double getLebanesePound() {
        return lebanesePound;
    }

    public void setLebanesePound(Double lebanesePound) {
        this.lebanesePound = lebanesePound;
    }

    public Double getSriLankanRupee() {
        return sriLankanRupee;
    }

    public void setSriLankanRupee(Double sriLankanRupee) {
        this.sriLankanRupee = sriLankanRupee;
    }

    public Double getLiberianDollar() {
        return liberianDollar;
    }

    public void setLiberianDollar(Double liberianDollar) {
        this.liberianDollar = liberianDollar;
    }

    public Double getLesothoLoti() {
        return lesothoLoti;
    }

    public void setLesothoLoti(Double lesothoLoti) {
        this.lesothoLoti = lesothoLoti;
    }

    public Double getLithuanianLitas() {
        return lithuanianLitas;
    }

    public void setLithuanianLitas(Double lithuanianLitas) {
        this.lithuanianLitas = lithuanianLitas;
    }

    public Double getLatvianLats() {
        return latvianLats;
    }

    public void setLatvianLats(Double latvianLats) {
        this.latvianLats = latvianLats;
    }

    public Double getLibyanDinar() {
        return libyanDinar;
    }

    public void setLibyanDinar(Double libyanDinar) {
        this.libyanDinar = libyanDinar;
    }

    public Double getMoroccanDirham() {
        return moroccanDirham;
    }

    public void setMoroccanDirham(Double moroccanDirham) {
        this.moroccanDirham = moroccanDirham;
    }

    public Double getMoldovanLeu() {
        return moldovanLeu;
    }

    public void setMoldovanLeu(Double moldovanLeu) {
        this.moldovanLeu = moldovanLeu;
    }

    public Double getMalagasyAriary() {
        return malagasyAriary;
    }

    public void setMalagasyAriary(Double malagasyAriary) {
        this.malagasyAriary = malagasyAriary;
    }

    public Double getMacedonianDenar() {
        return macedonianDenar;
    }

    public void setMacedonianDenar(Double macedonianDenar) {
        this.macedonianDenar = macedonianDenar;
    }

    public Double getMyanmaKyat() {
        return myanmaKyat;
    }

    public void setMyanmaKyat(Double myanmaKyat) {
        this.myanmaKyat = myanmaKyat;
    }

    public Double getMongolianTugrik() {
        return mongolianTugrik;
    }

    public void setMongolianTugrik(Double mongolianTugrik) {
        this.mongolianTugrik = mongolianTugrik;
    }

    public Double getMacanesePataca() {
        return macanesePataca;
    }

    public void setMacanesePataca(Double macanesePataca) {
        this.macanesePataca = macanesePataca;
    }

    public Double getMauritanianOuguiya() {
        return mauritanianOuguiya;
    }

    public void setMauritanianOuguiya(Double mauritanianOuguiya) {
        this.mauritanianOuguiya = mauritanianOuguiya;
    }

    public Double getMauritianRupee() {
        return mauritianRupee;
    }

    public void setMauritianRupee(Double mauritianRupee) {
        this.mauritianRupee = mauritianRupee;
    }

    public Double getMaldivianRufiyaa() {
        return maldivianRufiyaa;
    }

    public void setMaldivianRufiyaa(Double maldivianRufiyaa) {
        this.maldivianRufiyaa = maldivianRufiyaa;
    }

    public Double getMalawianKwacha() {
        return malawianKwacha;
    }

    public void setMalawianKwacha(Double malawianKwacha) {
        this.malawianKwacha = malawianKwacha;
    }

    public Double getMexicanPeso() {
        return mexicanPeso;
    }

    public void setMexicanPeso(Double mexicanPeso) {
        this.mexicanPeso = mexicanPeso;
    }

    public Double getMalaysianRinggit() {
        return malaysianRinggit;
    }

    public void setMalaysianRinggit(Double malaysianRinggit) {
        this.malaysianRinggit = malaysianRinggit;
    }

    public Double getMozambicanMetical() {
        return mozambicanMetical;
    }

    public void setMozambicanMetical(Double mozambicanMetical) {
        this.mozambicanMetical = mozambicanMetical;
    }

    public Double getNamibianDollar() {
        return namibianDollar;
    }

    public void setNamibianDollar(Double namibianDollar) {
        this.namibianDollar = namibianDollar;
    }

    public Double getNigerianNaira() {
        return nigerianNaira;
    }

    public void setNigerianNaira(Double nigerianNaira) {
        this.nigerianNaira = nigerianNaira;
    }

    public Double getNicaraguanCordoba() {
        return nicaraguanCordoba;
    }

    public void setNicaraguanCordoba(Double nicaraguanCordoba) {
        this.nicaraguanCordoba = nicaraguanCordoba;
    }

    public Double getNorwegianKrone() {
        return norwegianKrone;
    }

    public void setNorwegianKrone(Double norwegianKrone) {
        this.norwegianKrone = norwegianKrone;
    }

    public Double getNepaleseRupee() {
        return nepaleseRupee;
    }

    public void setNepaleseRupee(Double nepaleseRupee) {
        this.nepaleseRupee = nepaleseRupee;
    }

    public Double getNewZealandDollar() {
        return newZealandDollar;
    }

    public void setNewZealandDollar(Double newZealandDollar) {
        this.newZealandDollar = newZealandDollar;
    }

    public Double getOmaniRial() {
        return omaniRial;
    }

    public void setOmaniRial(Double omaniRial) {
        this.omaniRial = omaniRial;
    }

    public Double getPanamanianBalboa() {
        return panamanianBalboa;
    }

    public void setPanamanianBalboa(Double panamanianBalboa) {
        this.panamanianBalboa = panamanianBalboa;
    }

    public Double getPeruvianNuevoSol() {
        return peruvianNuevoSol;
    }

    public void setPeruvianNuevoSol(Double peruvianNuevoSol) {
        this.peruvianNuevoSol = peruvianNuevoSol;
    }

    public Double getPapuaNewGuineanKina() {
        return papuaNewGuineanKina;
    }

    public void setPapuaNewGuineanKina(Double papuaNewGuineanKina) {
        this.papuaNewGuineanKina = papuaNewGuineanKina;
    }

    public Double getPhilippinePeso() {
        return philippinePeso;
    }

    public void setPhilippinePeso(Double philippinePeso) {
        this.philippinePeso = philippinePeso;
    }

    public Double getPakistaniRupee() {
        return pakistaniRupee;
    }

    public void setPakistaniRupee(Double pakistaniRupee) {
        this.pakistaniRupee = pakistaniRupee;
    }

    public Double getPolishZloty() {
        return polishZloty;
    }

    public void setPolishZloty(Double polishZloty) {
        this.polishZloty = polishZloty;
    }

    public Double getParaguayanGuarani() {
        return paraguayanGuarani;
    }

    public void setParaguayanGuarani(Double paraguayanGuarani) {
        this.paraguayanGuarani = paraguayanGuarani;
    }

    public Double getQatariRial() {
        return qatariRial;
    }

    public void setQatariRial(Double qatariRial) {
        this.qatariRial = qatariRial;
    }

    public Double getRomanianLeu() {
        return romanianLeu;
    }

    public void setRomanianLeu(Double romanianLeu) {
        this.romanianLeu = romanianLeu;
    }

    public Double getSerbianDinar() {
        return serbianDinar;
    }

    public void setSerbianDinar(Double serbianDinar) {
        this.serbianDinar = serbianDinar;
    }

    public Double getRussianRuble() {
        return russianRuble;
    }

    public void setRussianRuble(Double russianRuble) {
        this.russianRuble = russianRuble;
    }

    public Double getRwandanFranc() {
        return rwandanFranc;
    }

    public void setRwandanFranc(Double rwandanFranc) {
        this.rwandanFranc = rwandanFranc;
    }

    public Double getSaudiRiyal() {
        return saudiRiyal;
    }

    public void setSaudiRiyal(Double saudiRiyal) {
        this.saudiRiyal = saudiRiyal;
    }

    public Double getSolomonIslandsDollar() {
        return solomonIslandsDollar;
    }

    public void setSolomonIslandsDollar(Double solomonIslandsDollar) {
        this.solomonIslandsDollar = solomonIslandsDollar;
    }

    public Double getSeychelloisRupee() {
        return seychelloisRupee;
    }

    public void setSeychelloisRupee(Double seychelloisRupee) {
        this.seychelloisRupee = seychelloisRupee;
    }

    public Double getSudanesePound() {
        return sudanesePound;
    }

    public void setSudanesePound(Double sudanesePound) {
        this.sudanesePound = sudanesePound;
    }

    public Double getSwedishKrona() {
        return swedishKrona;
    }

    public void setSwedishKrona(Double swedishKrona) {
        this.swedishKrona = swedishKrona;
    }

    public Double getSingaporeDollar() {
        return singaporeDollar;
    }

    public void setSingaporeDollar(Double singaporeDollar) {
        this.singaporeDollar = singaporeDollar;
    }

    public Double getSaintHelenaPound() {
        return saintHelenaPound;
    }

    public void setSaintHelenaPound(Double saintHelenaPound) {
        this.saintHelenaPound = saintHelenaPound;
    }

    public Double getSierraLeoneanLeone() {
        return sierraLeoneanLeone;
    }

    public void setSierraLeoneanLeone(Double sierraLeoneanLeone) {
        this.sierraLeoneanLeone = sierraLeoneanLeone;
    }

    public Double getSomaliShilling() {
        return somaliShilling;
    }

    public void setSomaliShilling(Double somaliShilling) {
        this.somaliShilling = somaliShilling;
    }

    public Double getSurinameseDollar() {
        return surinameseDollar;
    }

    public void setSurinameseDollar(Double surinameseDollar) {
        this.surinameseDollar = surinameseDollar;
    }

    public Double getSaoTomeandPrincipeDobra() {
        return saoTomeandPrincipeDobra;
    }

    public void setSaoTomeandPrincipeDobra(Double saoTomeandPrincipeDobra) {
        this.saoTomeandPrincipeDobra = saoTomeandPrincipeDobra;
    }

    public Double getSalvadoranColon() {
        return salvadoranColon;
    }

    public void setSalvadoranColon(Double salvadoranColon) {
        this.salvadoranColon = salvadoranColon;
    }

    public Double getSyrianPound() {
        return syrianPound;
    }

    public void setSyrianPound(Double syrianPound) {
        this.syrianPound = syrianPound;
    }

    public Double getSwaziLilangeni() {
        return swaziLilangeni;
    }

    public void setSwaziLilangeni(Double swaziLilangeni) {
        this.swaziLilangeni = swaziLilangeni;
    }

    public Double getThaiBaht() {
        return thaiBaht;
    }

    public void setThaiBaht(Double thaiBaht) {
        this.thaiBaht = thaiBaht;
    }

    public Double getTajikistaniSomoni() {
        return tajikistaniSomoni;
    }

    public void setTajikistaniSomoni(Double tajikistaniSomoni) {
        this.tajikistaniSomoni = tajikistaniSomoni;
    }

    public Double getTurkmenistaniManat() {
        return turkmenistaniManat;
    }

    public void setTurkmenistaniManat(Double turkmenistaniManat) {
        this.turkmenistaniManat = turkmenistaniManat;
    }

    public Double getTunisianDinar() {
        return tunisianDinar;
    }

    public void setTunisianDinar(Double tunisianDinar) {
        this.tunisianDinar = tunisianDinar;
    }

    public Double getTonganPaanga() {
        return tonganPaanga;
    }

    public void setTonganPaanga(Double tonganPaanga) {
        this.tonganPaanga = tonganPaanga;
    }

    public Double getTurkishLira() {
        return turkishLira;
    }

    public void setTurkishLira(Double turkishLira) {
        this.turkishLira = turkishLira;
    }

    public Double getTrinidadandTobagoDollar() {
        return trinidadandTobagoDollar;
    }

    public void setTrinidadandTobagoDollar(Double trinidadandTobagoDollar) {
        this.trinidadandTobagoDollar = trinidadandTobagoDollar;
    }

    public Double getNewTaiwanDollar() {
        return newTaiwanDollar;
    }

    public void setNewTaiwanDollar(Double newTaiwanDollar) {
        this.newTaiwanDollar = newTaiwanDollar;
    }

    public Double getTanzanianShilling() {
        return tanzanianShilling;
    }

    public void setTanzanianShilling(Double tanzanianShilling) {
        this.tanzanianShilling = tanzanianShilling;
    }

    public Double getUkrainianHryvnia() {
        return ukrainianHryvnia;
    }

    public void setUkrainianHryvnia(Double ukrainianHryvnia) {
        this.ukrainianHryvnia = ukrainianHryvnia;
    }

    public Double getUgandanShilling() {
        return ugandanShilling;
    }

    public void setUgandanShilling(Double ugandanShilling) {
        this.ugandanShilling = ugandanShilling;
    }

    public Double getUnitedStatesDollar() {
        return unitedStatesDollar;
    }

    public void setUnitedStatesDollar(Double unitedStatesDollar) {
        this.unitedStatesDollar = unitedStatesDollar;
    }

    public Double getUruguayanPeso() {
        return uruguayanPeso;
    }

    public void setUruguayanPeso(Double uruguayanPeso) {
        this.uruguayanPeso = uruguayanPeso;
    }

    public Double getUzbekistanSom() {
        return uzbekistanSom;
    }

    public void setUzbekistanSom(Double uzbekistanSom) {
        this.uzbekistanSom = uzbekistanSom;
    }

    public Double getVenezuelanBolivarFuerte() {
        return venezuelanBolivarFuerte;
    }

    public void setVenezuelanBolivarFuerte(Double venezuelanBolivarFuerte) {
        this.venezuelanBolivarFuerte = venezuelanBolivarFuerte;
    }

    public Double getVietnameseDong() {
        return vietnameseDong;
    }

    public void setVietnameseDong(Double vietnameseDong) {
        this.vietnameseDong = vietnameseDong;
    }

    public Double getVanuatuVatu() {
        return vanuatuVatu;
    }

    public void setVanuatuVatu(Double vanuatuVatu) {
        this.vanuatuVatu = vanuatuVatu;
    }

    public Double getSamoanTala() {
        return samoanTala;
    }

    public void setSamoanTala(Double samoanTala) {
        this.samoanTala = samoanTala;
    }

    public Double getCfaFrancBEAC() {
        return cfaFrancBEAC;
    }

    public void setCfaFrancBEAC(Double cfaFrancBEAC) {
        this.cfaFrancBEAC = cfaFrancBEAC;
    }

    public Double getSilver() {
        return silver;
    }

    public void setSilver(Double silver) {
        this.silver = silver;
    }

    public Double getGold() {
        return gold;
    }

    public void setGold(Double gold) {
        this.gold = gold;
    }

    public Double getEastCaribbeanDollar() {
        return eastCaribbeanDollar;
    }

    public void setEastCaribbeanDollar(Double eastCaribbeanDollar) {
        this.eastCaribbeanDollar = eastCaribbeanDollar;
    }

    public Double getSpecialDrawingRights() {
        return specialDrawingRights;
    }

    public void setSpecialDrawingRights(Double specialDrawingRights) {
        this.specialDrawingRights = specialDrawingRights;
    }

    public Double getCfaFrancBCEAO() {
        return cfaFrancBCEAO;
    }

    public void setCfaFrancBCEAO(Double cfaFrancBCEAO) {
        this.cfaFrancBCEAO = cfaFrancBCEAO;
    }

    public Double getCfpFranc() {
        return cfpFranc;
    }

    public void setCfpFranc(Double cfpFranc) {
        this.cfpFranc = cfpFranc;
    }

    public Double getYemeniRial() {
        return yemeniRial;
    }

    public void setYemeniRial(Double yemeniRial) {
        this.yemeniRial = yemeniRial;
    }

    public Double getSouthAfricanRand() {
        return southAfricanRand;
    }

    public void setSouthAfricanRand(Double southAfricanRand) {
        this.southAfricanRand = southAfricanRand;
    }

    public Double getZambianKwachaPre2013() {
        return zambianKwachaPre2013;
    }

    public void setZambianKwachaPre2013(Double zambianKwachaPre2013) {
        this.zambianKwachaPre2013 = zambianKwachaPre2013;
    }

    public Double getZambianKwacha() {
        return zambianKwacha;
    }

    public void setZambianKwacha(Double zambianKwacha) {
        this.zambianKwacha = zambianKwacha;
    }

    public Double getZimbabweanDollar() {
        return zimbabweanDollar;
    }

    public void setZimbabweanDollar(Double zimbabweanDollar) {
        this.zimbabweanDollar = zimbabweanDollar;
    }

}
