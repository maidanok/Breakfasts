package by.luchesa.breakfast.datamodel;

import java.io.Serializable;

/**
 * Created by Pasha on 07.06.2017.
 */
public interface Entity extends Serializable {

    Integer getPrimaryKey();

    void setPrimaryKey(Integer primaryKey);

}
