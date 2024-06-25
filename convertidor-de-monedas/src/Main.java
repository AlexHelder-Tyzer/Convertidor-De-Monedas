import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.*;
import java.awt.event.ContainerAdapter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion; // inicializar la opcion
        float monto, monto_convertido;
        Scanner lectura = new Scanner(System.in);
        try{
            ConsultarExchange exchange = new ConsultarExchange();
            do {
                Modules.menu();// mostrar el menu de opciones
                System.out.println("Digite la opcion: ");
                opcion = Integer.parseInt(lectura.nextLine()); // ingresar la opcion del tipo de cambio

                switch (opcion){
                    case 1:
                        ExchangeRate usd_ars = exchange.buscarTipoDeCambio("USD", "ARS");
                        System.out.println("Ingrese el monto a convertir: ");
                        monto = Float.parseFloat(lectura.nextLine());
                        monto_convertido = Modules.conversion(usd_ars.conversion_rate(), monto);
                        System.out.println("El valor " + monto + "[USD] corresponde al valor final ==> " + monto_convertido + "[ARS]");
                        break;
                    case 2:
                        ExchangeRate ars_usd = exchange.buscarTipoDeCambio("ARS", "USD");
                        System.out.println("Ingrese el monto a convertir: ");
                        monto = Float.parseFloat(lectura.nextLine());
                        monto_convertido = Modules.conversion(ars_usd.conversion_rate(), monto);
                        System.out.println("El valor " + monto + "[ARS] corresponde al valor final ==> " + monto_convertido + "[USD]");
                        break;
                    case 3:
                        ExchangeRate usd_brl = exchange.buscarTipoDeCambio("USD", "BRL");
                        System.out.println("Ingrese el monto a convertir: ");
                        monto = Float.parseFloat(lectura.nextLine());
                        monto_convertido = Modules.conversion(usd_brl.conversion_rate(), monto);
                        System.out.println("El valor " + monto + "[USD] corresponde al valor final ==> " + monto_convertido + "[BRL]");
                        break;
                    case 4:
                        ExchangeRate brl_usd = exchange.buscarTipoDeCambio("BRL", "USD");
                        System.out.println("Ingrese el monto a convertir: ");
                        monto = Float.parseFloat(lectura.nextLine());
                        monto_convertido = Modules.conversion(brl_usd.conversion_rate(), monto);
                        System.out.println("El valor " + monto + "[BRL] corresponde al valor final ==> " + monto_convertido + "[USD]");
                        break;
                    case 5:
                        ExchangeRate usd_pen = exchange.buscarTipoDeCambio("USD", "PEN");
                        System.out.println("Ingrese el monto a convertir: ");
                        monto = Float.parseFloat(lectura.nextLine());
                        monto_convertido = Modules.conversion(usd_pen.conversion_rate(), monto);
                        System.out.println("El valor " + monto + "[USD] corresponde al valor final ==> " + monto_convertido + "[PEN]");
                        break;
                    case 6:
                        ExchangeRate pen_usd = exchange.buscarTipoDeCambio("PEN", "USD");
                        System.out.println("Ingrese el monto a convertir: ");
                        monto = Float.parseFloat(lectura.nextLine());
                        monto_convertido = Modules.conversion(pen_usd.conversion_rate(), monto);
                        System.out.println("El valor " + monto + "[PEN] corresponde al valor final ==> " + monto_convertido + "[USD]");
                        break;
                    case 0:
                        System.out.println("Gracias por usar nuestro sistema de conversiones!!");
                        break;
                    default:
                        System.out.println("Digite una opcion correcta!!");
                }
            } while(opcion != 0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}