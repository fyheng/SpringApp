package springTest.CRUD;

import springTest.service.SimpleCRUD;

public class CRUDCacheDB implements SimpleCRUD {

    public String saveAction() {
        return "save to cache";
    }
}
