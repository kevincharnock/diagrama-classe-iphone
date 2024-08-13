package Iphone;

import Iphone.Records.IphoneRecord;
import Iphone.Services.AparelhoTelefonicoService;

public class IphoneApplication {

    public static void main(String[] args) {

        AparelhoTelefonicoService aparelhoTelefonicoService = new AparelhoTelefonicoService();
//        IphoneRecord iphoneRecord = new IphoneRecord("12121212");
//
//        aparelhoTelefonicoService.makePhoneCall("121");

        aparelhoTelefonicoService.answerPhoneCall("noss");

    }

}
