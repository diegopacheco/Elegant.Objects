package com.github.diegopacheco.elegantobjects.book.education;

import java.io.PrintStream;

/**
 * Principles here:
 *   * Don't use Public Constants.
 */
public class Row {

    // Code duplication
    //private static final String EOL = "\r\n";
    private String data;

    public Row(String data){
        this.data=data;
    }

    public void print(PrintStream ps){
        //ps.printf("[ROW] {s} {s} ",data,EOL);
        ps.print(new StringEOL("[ROW] " + data));
    }

}

class Record {
    // Code duplication
    //private static final String EOL = "\r\n";
    private String data;

    public Record(String data){
        this.data=data;
    }

    public void print(PrintStream ps){
        //ps.printf("[Record] {s} {s} ",data,EOL);
        ps.print(new StringEOL("[RECORD] " + data));
    }

}

// Wrong: Because share data, has coupling and loos cohesion on Row and Record.
class Constants{
    public static final String EOL = "\r\n";
}

// Right: Because class shares functionality.
class StringEOL{
    private String str;
    public StringEOL(String str){
        this.str=str;
    }
    @Override
    public String toString(){
        return String.format("%s \r\n",str);
    }
}

class MainApp{
    public static void main(String[] args) {
        Row row = new Row("Simple record come from DB. UserID=1");
        Record rec = new Record("Simple record come from External Service. UserID=2");
        row.print(System.out);
        rec.print(System.out);
    }
}