package frontend.Lexer.Token;

public class Token {
    public Symbol symbol;
    public int line_no;
    public String content;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public int getLine_no() {
        return line_no;
    }

    public void setLine_no(int line_no) {
        this.line_no = line_no;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Token(Symbol symbol, int line_no, String content) {
        this.symbol = symbol;
        this.line_no = line_no;
        this.content = content;
    }

    @Override
    public String toString(){
        String str = "";
        str = getSymbol().getSymbol() + " " + getContent();
        return str;
    }
}
