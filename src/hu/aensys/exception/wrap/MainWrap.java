package hu.aensys.exception.wrap;

import hu.aensys.exception.wrap.parser.Parser;
import hu.aensys.exception.wrap.parser.StdParser;
import hu.aensys.exception.wrap.parser.StringParser;

/**
 * @author David Szendrei <david.szendrei@aensys.hu>
 */
public class MainWrap {

    public static void main(String[] args) {
        MainWrap.execute(new StdParser());
        MainWrap.execute(new StringParser("2348"));
    }


    private static void execute(final Parser parser) {

        System.out.println("Calling parse of " + parser.getClass().getSimpleName());

        try {
            System.out.println("The parsed number is:\t" + parser.parse());
        } catch (BusinessException ex) {
            ex.printStackTrace(System.err);
        }
    }


}
