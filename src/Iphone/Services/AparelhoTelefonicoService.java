package Iphone.Services;

import Iphone.Interfaces.AparelhoTelefonico.AparelhoTelefonicoImpl;
import Iphone.Interfaces.NavegadorInternet.NavegadorInternetImpl;
import Iphone.Interfaces.ReprodutorMusical.ReprodutorMusicalImpl;

import java.util.Objects;

public class AparelhoTelefonicoService implements AparelhoTelefonicoImpl {

    @Override
    public void makePhoneCall(String phoneNumber) {
        // Verifica se a string é composta apenas por números
        if (phoneNumber == null || !phoneNumber.matches("\\d+")) {
            throw new IllegalArgumentException("O número de telefone deve conter apenas dígitos.");
        }
        // Lógica para realizar a chamada telefônica
        System.out.println("Realizando chamada...\n" + phoneNumber);
    }



    @Override
    public void answerPhoneCall(String phoneCall) {
    //Aceitando ou recusando chamada.
        if (phoneCall == null || !phoneCall.matches("^(yes|no)$")){
            throw new RuntimeException("Erro ao receber chamada: apenas 'yes' ou 'no' são válidos.");
        }
        if (phoneCall=="yes"){
            System.out.println("Ligação Aceita");
        } else {
            System.out.println("Ligação Recusada");
        }


    }

    @Override
    public void startInvoice(String phoneNumber) {

    }
}
