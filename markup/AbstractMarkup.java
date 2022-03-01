package markup;

import java.util.List;

abstract class AbstractMarkup implements  Markup {
    String left, right;
    List<? extends Markup> list;

    public AbstractMarkup(String left, String right, List<? extends Markup> list) {
        this.left = left;
        this.right = right;
        this.list = list;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(left);
        for (Markup m : list) {
            m.toMarkdown(sb);
        }
        sb.append(right);
    }
}
