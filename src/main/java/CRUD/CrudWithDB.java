package CRUD;

import service.SimpleCRUD;


public class CrudWithDB implements SimpleCRUD {

    public String saveAction() {
        return "save to DataBase";
    }
}
