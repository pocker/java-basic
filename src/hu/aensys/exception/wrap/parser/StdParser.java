package hu.aensys.exception.wrap.parser;

import hu.aensys.exception.wrap.BusinessException;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class StdParser implements Parser {

    @Override
    public int parse() throws BusinessException {
        try {
            System.out.print("Give me a number: ");
            final Scanner in = new Scanner(System.in);
            return in.nextInt();
        } catch (NoSuchElementException | IllegalStateException ex) {
            throw new BusinessException("Couldn't read integer from the stdin.",ex);
        }
    }
}
