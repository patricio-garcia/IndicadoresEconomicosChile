package cl.desafiolatam.indicadoreseconomicoschile.data.repository;

import cl.desafiolatam.indicadoreseconomicoschile.data.schemas.IndicadorEconomicoSchema;
import io.reactivex.Observable;

public interface IIndicadorEconomicoDataStore {
    Observable<IndicadorEconomicoSchema> getIndicadorEconomicoDataSchema(String tipoIndicador, String fechaIndicador);
}
