package spring2011.textEditror;

public class EditText {
    private PenTool penTool;
    private MarkerTool markerTool;
    private EraserTool eraserTool;

    private Pages pages1;
    private Pages pages2;
    private Pages pages3;


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

    public EraserTool getEraserTool() {
        return eraserTool;
    }

    public void setEraserTool(EraserTool eraserTool) {
        this.eraserTool = eraserTool;
    }

    public Pages getPages1() {
        return pages1;
    }

    public void setPages1(Pages pages1) {
        this.pages1 = pages1;
    }

    public Pages getPages2() {
        return pages2;
    }

    public void setPages2(Pages pages2) {
        this.pages2 = pages2;
    }

    public Pages getPages3() {
        return pages3;
    }

    public void setPages3(Pages pages3) {
        this.pages3 = pages3;
    }

    //default constructor
    public EditText() {
    }

    public EditText(PenTool penTool, MarkerTool markerTool, EraserTool eraserTool) {
        this.penTool = penTool;
        this.markerTool = markerTool;
        this.eraserTool = eraserTool;
    }

    public String getTool() {
        String result = "";
        result +=
                "This text edit Detail:\n" +
                        pages1.getDetail() + "\n" +
                        pages2.getDetail() + "\n" +
                        pages3.getDetail() + "\n" +
                        "Pen:\n"
                        + penTool.getAvailableSize() + "\n" +
                        "Maker:\n"
                        + markerTool.getDetail() + "\n" +
                        "Eraser:\n"
                        + eraserTool.getDetail() + "\n";
        return result;
    }
}
