package cl.desafiolatam.indicadoreseconomicoschile.data.schemas.mapper;

import java.util.ArrayList;

import cl.desafiolatam.indicadoreseconomicoschile.data.schemas.IndicadorEconomicoSchema;
import cl.desafiolatam.indicadoreseconomicoschile.domain.model.IndicadorEconomico;
import cl.desafiolatam.indicadoreseconomicoschile.domain.model.SerieIndicadorEconomico;

public class IndicadorEconomicoMapper {

    public IndicadorEconomicoMapper(){}

    public IndicadorEconomico transform(IndicadorEconomicoSchema indicadorEconomicoSchema){
        IndicadorEconomico indicadorEconomico = null;

        try {
            if (indicadorEconomicoSchema != null) {
                SerieIndicadorEconomico serieIndicadorEconomico = null;
                serieIndicadorEconomico = new SerieIndicadorEconomico(indicadorEconomicoSchema.getSerie().get(0).getFecha(),
                        indicadorEconomicoSchema.getSerie().get(0).getValor());
                ArrayList<SerieIndicadorEconomico> listSerieIndicadorEconomico = new ArrayList<SerieIndicadorEconomico>();
                listSerieIndicadorEconomico.add(serieIndicadorEconomico);

                indicadorEconomico = new IndicadorEconomico(indicadorEconomicoSchema.getNombre(),
                        indicadorEconomicoSchema.getUnidadMedida(),
                        listSerieIndicadorEconomico);
            }
        }catch (Exception e){
            return new IndicadorEconomico("", "", null);
        }
        return indicadorEconomico;
    }
}
