package application;

import javafx.scene.control.TextFormatter.Change;
import java.util.function.UnaryOperator;

public class TextFormatterTylkoCyfry implements UnaryOperator<Change> {
    @Override
    public Change apply(Change t) {
        if (t.isContentChange()) {
             System.out.println("getText = " + t.getControlText());
            if(t.getText().matches("[^0-9]")) {
                if (t.isReplaced()) {
                    t.setText(t.getControlText().substring(t.getRangeStart(), t.getRangeEnd()));
                } else if (t.isAdded()) {
                    t.setText("");
                } else if (t.isDeleted()) {
                    t.setText("");
                }
            }
        }
        return t;
    }

}
