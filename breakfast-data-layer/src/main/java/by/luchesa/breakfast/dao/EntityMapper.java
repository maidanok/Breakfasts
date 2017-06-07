package by.luchesa.breakfast.dao;

import by.luchesa.breakfast.datamodel.Breakfast;

import java.util.List;

/**
 * Created by Pasha on 07.06.2017.
 */
public interface EntityMapper<Entity> {

    Entity getByPrimaryKey(Integer primaryKey);

    List<Entity> getAll();

    void create(Entity entity);

    void update(Entity entity);

    void delete(Integer primaryKey);

}
