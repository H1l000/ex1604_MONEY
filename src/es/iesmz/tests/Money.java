package es.iesmz.tests;
import java.util.Objects;

public class Money {
    private static final float eur_usd = 1.18798f;
    private static final float usd_eur = 0.841815f;
    private static final float eur_gbp = 0.857839f;
    private static final float gbp_eur = 1.165826f;


    public static float change(TipoMoneda origen, TipoMoneda destino, float money) {
        float resultado;

        if (origen != TipoMoneda.EUR && origen != TipoMoneda.USD && origen != TipoMoneda.GBP
                ||
                destino != TipoMoneda.EUR && destino != TipoMoneda.USD && destino != TipoMoneda.GBP) {


            //DE EUR A USD
            if (Objects.equals(origen, TipoMoneda.EUR) && destino.equals(TipoMoneda.USD)) {
                resultado = money * eur_usd;
                return resultado;
            }
            //DE USD A EUR
            else if (origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)) {
                resultado = money * usd_eur;
                return resultado;
            }
            //DE EUR A GBP
            else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) {
                resultado = money * eur_gbp;
                return resultado;
            }

            //DE GBP_EUR
            else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)) {
                resultado = money * gbp_eur;
                return resultado;
            }


        }
        return -1;
    }

}




