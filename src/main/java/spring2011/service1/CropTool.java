package spring2011.service1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import spring2011.service.MarkerTool;

public class CropTool implements ApplicationContextAware , BeanNameAware , InitializingBean , DisposableBean {
    private ApplicationContext context = null;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    //this will invoked after properties set, AND before all method inside this class invoked
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean init method call or CropTool");
    }

    //this method will invoke before bean create obj
    public void setBeanName(String beanName) {
        System.out.println("Bean name :"+beanName);
    }

    //spring will call destroy of DisposableBean class after application END
    public void destroy() throws Exception {
        System.out.println("Spring Auto call this Destroy bean method!!!");
    }


    private Crop crop1;
    private Crop crop2;
    private MarkerTool markerTool;
    private PerspectiveCrop perspectiveCrop;

    public Crop getCrop1() {
        return crop1;
    }

    public void setCrop1(Crop crop1) {
        this.crop1 = crop1;
    }

    public Crop getCrop2() {
        return crop2;
    }

    public void setCrop2(Crop crop2) {
        this.crop2 = crop2;
    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public PerspectiveCrop getPerspectiveCrop() {
        return perspectiveCrop;
    }

    public void setPerspectiveCrop(PerspectiveCrop perspectiveCrop) {
        this.perspectiveCrop = perspectiveCrop;
    }

    public String getDetail(){
        return "CropTool details\n"
                +crop1.getDetail()+"\n"
                +crop2.getDetail()+"\n"
                +perspectiveCrop.getPoint()+"\n"+perspectiveCrop.getDes();
    }



}
