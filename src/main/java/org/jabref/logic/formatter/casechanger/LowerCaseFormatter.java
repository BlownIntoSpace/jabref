package org.jabref.logic.formatter.casechanger;

import org.jabref.logic.formatter.AbstractFormatter;
import org.jabref.logic.l10n.Localization;

public class LowerCaseFormatter extends AbstractFormatter {

    @Override
    public String getName() {
        return Localization.lang("Lower case");
    }

    @Override
    public String getKey() {
        return "lower_case";
    }

    /**
     * Converts all characters of the string to lower case, but does not change words starting with "{"
     */
    @Override
    public String format(String input) {
        Title title = new Title(input);

        title.getWords().stream().forEach(Word::toLowerCase);

        return title.toString();
    }

    @Override
    public String getDescription() {
        return Localization.lang("Changes all letters to lower case.");
    }

    @Override
    public String getExampleInput() {
        return "KDE {Amarok}";
    }

}
