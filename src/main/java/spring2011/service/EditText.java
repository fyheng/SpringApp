package spring2011.service;

public class EditText {
    private PenTool penTool;
    private MarkerTool markerTool;


    public PenTool getPenTool() {
        return penTool;
    }

    public void setPenTool(PenTool penTool) {
        this.penTool = penTool;
    }

    public MarkerTool getMarkerTool() {
        return markerTool;
    }

    public void setMarkerTool(MarkerTool markerTool) {
        this.markerTool = markerTool;
    }


    //default constructor
    public EditText(){ }

    public EditText(PenTool penTool, MarkerTool markerTool) {
        this.penTool = penTool;
        this.markerTool = markerTool;
    }

    public String getTool(){
        return "This text is edit by:\n" +
                "Pen:\n"
                +penTool.getDetail()+"\n" +
                "Maker:\n"
                +markerTool.getDetail()+"\n";
    }
}
