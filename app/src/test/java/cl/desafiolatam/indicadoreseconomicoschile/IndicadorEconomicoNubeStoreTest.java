package cl.desafiolatam.indicadoreseconomicoschile;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import cl.desafiolatam.indicadoreseconomicoschile.data.repository.IndicadorEconomicoNubeDataStore;
import cl.desafiolatam.indicadoreseconomicoschile.data.schemas.IndicadorEconomicoSchema;
import io.reactivex.Observable;

@RunWith(MockitoJUnitRunner.class)
public class IndicadorEconomicoNubeStoreTest {

        @Mock
        private IndicadorEconomicoNubeDataStore townshipCloudDataStore;

        @Before
        public void setUp(){
            townshipCloudDataStore = new IndicadorEconomicoNubeDataStore();
        }

        @Test
        public void testGetTownshipListFromAPI(){
            Observable<IndicadorEconomicoSchema> a = townshipCloudDataStore.getIndicadorEconomicoDataSchema("dolar", "18-07-2019");
            Mockito.validateMockitoUsage();
            Mockito.verify(townshipCloudDataStore).getIndicadorEconomicoDataSchema("dolar", "18-07-2019");
        }
    }
