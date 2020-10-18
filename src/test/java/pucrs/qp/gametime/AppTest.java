package pucrs.qp.gametime;

import static org.junit.Assert.assertEquals;
import static pucrs.qp.gametime.DayHours.FULLDAY;
import static pucrs.qp.gametime.DayHours.HALFDAY;

import org.junit.Test;

public class AppTest 
{
    static int fullDay = FULLDAY.buscaTempoEmHoras();
    static int halfDay = HALFDAY.buscaTempoEmHoras();

	@Test
    public void testCompleteDay()
    {
        int actual = App.tempoDeJogo(2, 2);
        assertEquals(fullDay, actual);
    }

    @Test
    public void testHalfDay()
    {
        int actual = App.tempoDeJogo(2, 14);
        assertEquals(halfDay, actual);
    }

    @Test
    public void testHours()
    {
        int actual = App.tempoDeJogo(1, 15);
        assertEquals(14, actual);
    }


    @Test
    public void UOJTestSamples() // https://www.urionlinejudge.com.br/judge/en/problems/view/1046
    {
        int sample1 = App.tempoDeJogo(16, 2);
        assertEquals(10, sample1);

        int sample2 = App.tempoDeJogo(0, 0);
        assertEquals(fullDay, sample2);

        int sample3 = App.tempoDeJogo(2, 16);
        assertEquals(14, sample3);
    }
}









