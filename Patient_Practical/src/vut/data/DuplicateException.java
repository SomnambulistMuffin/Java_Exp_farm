package vut.data;

public class DuplicateException extends Exception {

    private String msg;

    public DuplicateException(){

    }

    public DuplicateException(String msg){
        super(msg);
    }
}
