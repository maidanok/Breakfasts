package by.luchesa.breakfast.service.impl;

import by.luchesa.breakfast.dao.BreakfastMapper;
import by.luchesa.breakfast.datamodel.Breakfast;
import by.luchesa.breakfast.service.api.BreakfastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Pasha on 08.06.2017.
 */
@Service("BreakfastService")
@Transactional
public class BreakfastServiceImpl implements BreakfastService {
    @Autowired
    BreakfastMapper breakfastMapper;

    @Override
    public List<Breakfast> getAllBreakfast() {
        return breakfastMapper.getAll();
    }

    @Override
    public Breakfast getBreakfast(int idBreakfast) {
        return breakfastMapper.getByPrimaryKey(idBreakfast);
    }

    @Override
    public void insertNewBreakfast(Breakfast breakfast) {
        breakfastMapper.create(breakfast);
    }

    @Override
    public void updateBreakfast(Breakfast breakfast) {
        breakfastMapper.update(breakfast);
    }

    @Override
    public void deleteBreakfast(int idBreakfast) {
        breakfastMapper.delete(idBreakfast);
    }
}
