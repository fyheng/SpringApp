package spring_Annotations.service;

import spring_Annotations.util.Properties;

public class DeleteAnchorPoint extends Properties {
    private String deletePoint;

    public String getDeletePoint() {
        return deletePoint;
    }

    public void setDeletePoint(String deletePoint) {
        this.deletePoint = deletePoint;
    }


    public String getDetail() {
        return super.getDetail("DeletePoint")+
                "Delete :"+getDeletePoint();
    }
}
