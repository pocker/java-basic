package hu.aensys.exception.wrap.parser;

import hu.aensys.exception.wrap.BusinessException;

public interface Parser {

    int parse() throws BusinessException;

}
