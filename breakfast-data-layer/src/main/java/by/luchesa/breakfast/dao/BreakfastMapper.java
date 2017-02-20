package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.Breakfast;

import java.util.List;

/**
 * Created by Admin on 10.02.2017.
 */
public interface BreakfastMapper {

    Breakfast getBreakfastId(int idBreakfast);

    List<Breakfast> getAllBreakfast();

    void setNewPrice(Breakfast breakfast);

    void addNewBreakfast (Breakfast breakfast);

    void deleteBreakfast(Breakfast breakfast);


}
