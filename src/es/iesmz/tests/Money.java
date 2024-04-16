package es.iesmz.tests;

public class Money {

    /*
        No conseguí hacer del enum variables constantes de tipo final dentro de la clase
        private final TipoMoneda eur = TipoMoneda.EUR;
        eur = 1.18798
        : (
     */


    public float change(TipoMoneda origen, TipoMoneda destino, float money){
        if (origen != TipoMoneda.EUR && origen != TipoMoneda.USD && origen != TipoMoneda.GBP ||
                destino != TipoMoneda.EUR && destino != TipoMoneda.USD && destino != TipoMoneda.GBP){

            


        }
        return -1;
    }




}
