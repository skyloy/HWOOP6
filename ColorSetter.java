import java.util.List;

public class ColorSetter {
    private List<ColorInterface> ColorsList;

    public ColorSetter(List<ColorInterface> ColorsList) {
        this.ColorsList = ColorsList;
    }

    public String SetColor(int value){
        for (ColorInterface item : ColorsList) {
            int[] colorValue = item.getColorValue();
            if (value >= colorValue[0] && value <= colorValue[1])
                return item.getColorParam() + value;
        }
        return "Error";
    }
}

