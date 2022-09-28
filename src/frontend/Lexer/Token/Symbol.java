package frontend.Lexer.Token;

public enum Symbol {
    MAINTK("main"),
    CONSTTK("const"),
    INTTK("int"),
    BREAKTK("break"),
    CONTINUETK("continue"),
    IFTK("if"),
    ELSETK("else"),
    VOIDTK("void"),
    WHILETK("while"),
    GETINTTK("getint"),
    PRINTFTK("printf"),
    RETURNTK("return"),

    IDENFR("(_|[a-z]|[A-Z])(_|[a-z]|[A-Z]|\\d)+"),
    INTCON("\\d+"),
    STRCON(""),

    AND("&&"),
    OR("\\|\\|"),
    NOT("!"),
    PLUS("\\+"),
    MINU("-"),
    MULT("\\*"),
    DIV("/"),
    MOD("%"),
    LSS("<"),
    LEQ("<="),
    GRE(">"),
    GEQ(">="),
    EQL("=="),
    NEQ("!="),
    ASSIGN("="),
    SEMICN(";"),
    COMMA(","),
    LPARENT("\\("),
    RPARENT("\\)"),
    LBRACK("\\["),
    RBRACK("\\]"),
    LBRACE("\\{"),
    RBRACE("\\}")
    ;

    String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    Symbol(String symbol) {
        this.symbol = symbol;
    }
}
