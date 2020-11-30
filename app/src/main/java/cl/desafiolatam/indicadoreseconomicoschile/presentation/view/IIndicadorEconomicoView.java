package cl.desafiolatam.indicadoreseconomicoschile.presentation.view;

import cl.desafiolatam.indicadoreseconomicoschile.presentation.model.IndicadorEconomicoModel;

public interface IIndicadorEconomicoView {

    void showResponseIndicadorEconomico(IndicadorEconomicoModel indicadorEconomicoModel);
    void showLoadSpinner();
    void hideLoadSpinner();
}
