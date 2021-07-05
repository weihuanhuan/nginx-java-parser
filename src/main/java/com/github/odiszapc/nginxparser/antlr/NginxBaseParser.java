package com.github.odiszapc.nginxparser.antlr;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;

import java.util.Collections;
import java.util.List;

public class NginxBaseParser extends Parser {

    public static final String EMPTY_STRING = "";

    public NginxBaseParser(TokenStream input) {
        super(input);
    }

    @Override
    public String[] getTokenNames() {
        return new String[0];
    }

    @Override
    public String[] getRuleNames() {
        return new String[0];
    }

    @Override
    public String getGrammarFileName() {
        return null;
    }

    @Override
    public ATN getATN() {
        return null;
    }

    protected String getFullContext(String content) {
        String middle = content == null ? EMPTY_STRING : content;
        if (!(_input instanceof BufferedTokenStream)) {
            return middle;
        }

        List<Token> toLeft = getHiddenTokens(Token.HIDDEN_CHANNEL, true);
        List<Token> toRight = getHiddenTokens(Token.HIDDEN_CHANNEL, false);

        String combineLeft = combineToken2String(toLeft);
        String combineRight = combineToken2String(toRight);

        StringBuilder sb = new StringBuilder();
        sb.append(combineLeft);
        sb.append(middle);
        sb.append(combineRight);
        String string = sb.toString();
        return string;
    }

    private List<Token> getHiddenTokens(int channelIndex, boolean isLeft) {
        if (_ctx == null || _ctx.start == null || _ctx.stop == null) {
            return Collections.EMPTY_LIST;
        }

        BufferedTokenStream input = (BufferedTokenStream) _input;
        List<Token> tokenList;
        if (isLeft) {
            tokenList = input.getHiddenTokensToLeft(_ctx.start.getTokenIndex(), channelIndex);
        } else {
            tokenList = input.getHiddenTokensToRight(_ctx.stop.getTokenIndex(), channelIndex);
        }
        return tokenList;
    }

    private String combineToken2String(List<Token> tokenList) {
        if (tokenList.isEmpty()) {
            return EMPTY_STRING;
        }

        StringBuilder sb = new StringBuilder();
        for (Token token : tokenList) {
            sb.append(token.getText());
        }
        String string = sb.toString();
        return string;
    }

}