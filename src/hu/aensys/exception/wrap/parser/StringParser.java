package hu.aensys.exception.wrap.parser;

import hu.aensys.exception.wrap.BusinessException;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class StringParser implements Parser {


    private final String number;

    public StringParser(String number) {
        this.number = number;
    }

    @Override
    public int parse() throws BusinessException {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            throw new BusinessException(ex);
        }
    }
}
