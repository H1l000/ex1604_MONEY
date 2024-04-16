package es.iesmz.tests;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    TipoMoneda origen = TipoMoneda.EUR;
    TipoMoneda destino = TipoMoneda.USD;
    float money = 23.88f;
    float resultado = Money.change(origen, destino, money);
    AssertEquals(28.37f, resultado);

    @Test
    TipoMoneda origen = TipoMoneda.GBP;
    TipoMoneda destino = TipoMoneda.EUR;
    float money = 1000.0f;
    float resultado = Money.change(origen, destino, money);
    AssertEquals(1165.83f, resultado);

    @Test
    TipoMoneda origen = TipoMoneda.EUR;
    TipoMoneda destino = TipoMoneda.GBP;
    float money = 234.56f;
    float resultado = Money.change(origen, destino, money);
    AssertEquals(201.21f, resultado);

    @Test
    TipoMoneda origen = TipoMoneda.USD;
    TipoMoneda destino = TipoMoneda.EUR;
    float money = 44.56f;
    float resultado = Money.change(origen, destino, money);
    AssertEquals(37.51f, resultado);


    //POR CALCULAR (EN CHANGE: DE GBP-USD)
  /*  @Test
    TipoMoneda origen = TipoMoneda.GBP;
    TipoMoneda destino = TipoMoneda.USD;
    float money = 234.56f;
    float resultado = Money.change(origen, destino, money);
    AssertEquals(201.21f, resultado);

    ...
*/

    @Test
    TipoMoneda origen = TipoMoneda.PTS;
    TipoMoneda destino = TipoMoneda.EUR;
    float money = 100.0F;
    float resultado = Money.change(origen, destino, money);
    AssertEquals(-1f, resultado);

    @Test
    TipoMoneda origen = TipoMoneda.EUR;
    TipoMoneda destino = TipoMoneda.PTS;
    float money = 123.23F;
    float resultado = Money.change(origen, destino, money);
    AssertEquals(-1f, resultado);

    @Test
    TipoMoneda origen = TipoMoneda.USD;
    TipoMoneda destino = TipoMoneda.EUR;
    float money = -167.34F;
    float resultado = Money.change(origen, destino, money);
    AssertEquals(-1f, resultado);

}
