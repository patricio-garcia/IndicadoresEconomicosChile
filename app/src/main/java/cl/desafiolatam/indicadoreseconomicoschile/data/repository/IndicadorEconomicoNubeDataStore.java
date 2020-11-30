package cl.desafiolatam.indicadoreseconomicoschile.data.repository;

import cl.desafiolatam.indicadoreseconomicoschile.data.IndicadoresEconomicosService;
import cl.desafiolatam.indicadoreseconomicoschile.data.schemas.IndicadorEconomicoSchema;
import io.reactivex.Observable;

public class IndicadorEconomicoNubeDataStore implements IIndicadorEconomicoDataStore{

    @Override
    public Observable<IndicadorEconomicoSchema> getIndicadorEconomicoDataSchema(String tipoIndicador, String fechaIndicador) {
        return IndicadoresEconomicosService.getIndicadoresEconomicosService()
                .getIndicadorEconomico(tipoIndicador, fechaIndicador);
    }
}
