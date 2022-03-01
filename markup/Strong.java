package markup;

import java.util.List;

public class Strong extends  AbstractMarkup {

    public Strong(List<? extends Markup> list) {
        super("_", "_", list);
    }
}
