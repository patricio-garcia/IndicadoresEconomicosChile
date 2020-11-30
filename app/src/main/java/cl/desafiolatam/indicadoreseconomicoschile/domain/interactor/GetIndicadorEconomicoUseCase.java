package cl.desafiolatam.indicadoreseconomicoschile.domain.interactor;

import cl.desafiolatam.indicadoreseconomicoschile.domain.model.IndicadorEconomico;
import cl.desafiolatam.indicadoreseconomicoschile.domain.repository.IIndicadorEconomicoRepository;
import io.reactivex.Observable;

public class GetIndicadorEconomicoUseCase extends UseCase<IndicadorEconomico, String[]>{

        private final IIndicadorEconomicoRepository iIndicadorEconomicoRepository;

        public GetIndicadorEconomicoUseCase(IIndicadorEconomicoRepository iIndicadorEconomicoRepository){
            this.iIndicadorEconomicoRepository = iIndicadorEconomicoRepository;
        }
        @Override
        public Observable<IndicadorEconomico> buildUseCaseObservable(String[] input) {
            return iIndicadorEconomicoRepository.getIndicadorEconomicoFromApiLayer(input[0], input[1]);
        }
}
