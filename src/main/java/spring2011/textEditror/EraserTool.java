package spring2011.textEditror;

public class EraserTool {
    private String eraserType;
    private String eraserSize;
    private String eraserColor;

    public String getEraserType() {
        return eraserType;
    }

    public void setEraserType(String eraserType) {
        this.eraserType = eraserType;
    }

    public String getEraserSize() {
        return eraserSize;
    }

    public void setEraserSize(String eraserSize) {
        this.eraserSize = eraserSize;
    }

    public String getEraserColor() {
        return eraserColor;
    }

    public void setEraserColor(String eraserColor) {
        this.eraserColor = eraserColor;
    }

    public String getDetail() {
        return "Eraser text by: \n" +
                "eraserType " + getEraserType() + "\n" +
                "eraserSize " + getEraserSize() + "\n" +
                "eraserColor " + getEraserColor();
    }
}
