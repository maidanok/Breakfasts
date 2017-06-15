package by.luchesa.breakfast.service.api;

import by.luchesa.breakfast.datamodel.Breakfast;

import java.util.List;

/**
 * Created by Pasha on 08.06.2017.
 */
public interface BreakfastService {

    List<Breakfast> getAllBreakfast();

    Breakfast getBreakfast(int idBreakfast);

    void insertNewBreakfast(Breakfast breakfast);

    void updateBreakfast(Breakfast breakfast);

    void deleteBreakfast(int idBreakfast);

}
