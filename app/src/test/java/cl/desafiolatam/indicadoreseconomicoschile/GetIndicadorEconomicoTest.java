package cl.desafiolatam.indicadoreseconomicoschile;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import cl.desafiolatam.indicadoreseconomicoschile.domain.interactor.GetIndicadorEconomicoUseCase;
import cl.desafiolatam.indicadoreseconomicoschile.domain.repository.IIndicadorEconomicoRepository;

@RunWith(MockitoJUnitRunner.class)
public class GetIndicadorEconomicoTest {

    private GetIndicadorEconomicoUseCase getIndicadorEconomicoUseCase;
    private String[] params = new String[2];
    private static final String tipoIndicador = "dolar";
    private static final String fechaIndicador = "18-07-2019";
    @Mock
    private IIndicadorEconomicoRepository mIIndicadorEconomicoRepository;

    @Before
    public void setUp() {
        getIndicadorEconomicoUseCase = new GetIndicadorEconomicoUseCase(mIIndicadorEconomicoRepository);
    }

    @Test
    public void testGetIndicadorEconomico() {
        params[0] = tipoIndicador;
        params[1] = fechaIndicador;
        getIndicadorEconomicoUseCase.buildUseCaseObservable(params);
        Mockito.verify(mIIndicadorEconomicoRepository).getIndicadorEconomicoFromApiLayer(tipoIndicador, fechaIndicador);
        Mockito.verifyNoMoreInteractions(mIIndicadorEconomicoRepository);

        getIndicadorEconomicoUseCase.dispose();
    }
}