package cl.desafiolatam.indicadoreseconomicoschile.data.repository;

import cl.desafiolatam.indicadoreseconomicoschile.data.schemas.IndicadorEconomicoSchema;
import cl.desafiolatam.indicadoreseconomicoschile.data.schemas.mapper.IndicadorEconomicoMapper;
import cl.desafiolatam.indicadoreseconomicoschile.domain.model.IndicadorEconomico;
import cl.desafiolatam.indicadoreseconomicoschile.domain.repository.IIndicadorEconomicoRepository;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class IndicadoresEconomicosDataRepository implements IIndicadorEconomicoRepository {
    private final IndicadorEconomicoNubeDataStore indicadorEconomicoNubeDataStore;
    private final IndicadorEconomicoMapper indicadorEconomicoMapper;

    public IndicadoresEconomicosDataRepository(IndicadorEconomicoNubeDataStore indicadorEconomicoNubeDataStore,
                                               IndicadorEconomicoMapper indicadorEconomicoMapper){
        this.indicadorEconomicoNubeDataStore = indicadorEconomicoNubeDataStore;
        this.indicadorEconomicoMapper = indicadorEconomicoMapper;
    }

    @Override
    public Observable<IndicadorEconomico> getIndicadorEconomicoFromApiLayer(String tipoIndicador, String fechaIndicador){

        return indicadorEconomicoNubeDataStore
                .getIndicadorEconomicoDataSchema(tipoIndicador, fechaIndicador)
                .map(new Function<IndicadorEconomicoSchema, IndicadorEconomico>() {

                @Override
                public IndicadorEconomico apply(IndicadorEconomicoSchema indicadorEconomicoSchema) throws Exception {
                    return indicadorEconomicoMapper.transform(indicadorEconomicoSchema);
                }
            });
    }
}
