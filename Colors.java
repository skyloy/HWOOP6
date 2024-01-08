public class Colors implements ColorInterface {
    private String colorParam;
    private int[] colorValue;

    public Colors( int minValue, int maxValue, String colorParam) {
        this.colorParam = colorParam;
        colorValue = new int[2];
        colorValue[0] = minValue;
        colorValue[1] = maxValue;
    }

    @Override
    public String getColorParam() {
        return colorParam;
    }

    @Override
    public int[] getColorValue() {
        return colorValue;
    }
}
