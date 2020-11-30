package cl.desafiolatam.indicadoreseconomicoschile.domain.repository;

import java.io.IOException;

import cl.desafiolatam.indicadoreseconomicoschile.domain.model.IndicadorEconomico;
        import io.reactivex.Observable;

public interface IIndicadorEconomicoRepository {
        Observable<IndicadorEconomico> getIndicadorEconomicoFromApiLayer(String tipoIndicador, String fechaIndicador);
}
