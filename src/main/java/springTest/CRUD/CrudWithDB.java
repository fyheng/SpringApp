package springTest.CRUD;

import springTest.service.SimpleCRUD;


public class CrudWithDB implements SimpleCRUD {

    public String saveAction() {
        return "save to DataBase";
    }
}
