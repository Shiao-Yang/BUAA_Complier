package frontend.Source;

import java.io.*;
import java.util.ArrayList;

public class Source {
    public ArrayList<String> lines = new ArrayList<>();
    public int line_no = 0;   //当前所读行(输出时要+1)
    public int cursor = 0; //读取每行内容所用游标，表示目前处于当前行的cursor下标处

    public ArrayList<String> getLines() {return lines;}

    public void setLines(ArrayList<String> lines) {this.lines = lines;}

    public int getLine_no() {return line_no;}

    public void setLine_no(int line_no) {this.line_no = line_no;}

    public int getCursor() {return cursor;}

    public void setCursor(int cursor) {this.cursor = cursor;}

    public Source(String filename) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = "";

        while((line = br.readLine()) != null) {
            lines.add(line);
        }

    }

    public void nextLine() {
        line_no++;
        cursor = 0;
    }

    public String getLine(int lineNo) {
        return lines.get(lineNo);
    }

    public String getLine() {
        return lines.get(this.line_no);
    }

    public boolean reachFileEnd() {          //此处可以直接这样写，是因为每次读取一行并遍历的过程中，会控制cursor严格处于行内
        return line_no >= lines.size();
    }

    public boolean reachLineEnd() {          //此处可以直接这样写，是因为每次读取一行并遍历的过程中，会控制cursor严格处于行内
        return cursor >= this.getLine().length();
    }

    public void skipBlanks() {
        while(!this.reachFileEnd()) {
            String line = lines.get(line_no);
            if(Character.isWhitespace(line.charAt(cursor)))
                cursor++;
            if(cursor >= line.length()) {
                this.nextLine();
            }
        }
    }

    public String getRemainLine(){
        return this.getLine().substring(cursor);
    }

    //跳过单行注释
    public void skipLineComment() {
        String line = this.getLine();
        if(!this.reachFileEnd() && line.substring(cursor,cursor+2).equals("//")) {
            this.nextLine();
        }
    }

    //跳过多行注释
    public void skipBlockComment() {

        if(!this.reachFileEnd() && this.reachLineEnd()) {
            this.nextLine();
        }
    }


}
