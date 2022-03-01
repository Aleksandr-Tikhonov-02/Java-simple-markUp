package markup;

import java.util.List;

public class Paragraph extends AbstractMarkup {

    public Paragraph(List<? extends Markup> list) {
        super("", "", list);
    }

}
