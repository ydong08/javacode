package com.castles.winter;



public class TestException {
    public void test() throws Exception {
        if (true)
            throw new Exception("parameter overflow");
        //System.out.println(" after exception ");
    }

    public static void main(String[] args) {
        try{
            TestException te = new TestException() ;
            te.test();
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

/*
public class InvalidCommandException extends Exception {
    public InvalidCommandException(String str) {
        super(str);
    }
}

public class SmartTapException extends InvalidCommandException {
    public SmartTapException(String str) {
        super(str);
    }
}


public class SmartTapV2Exception extends SmartTapException {
    private final Code responseCode;
    private final Status status;

    public SmartTapV2Exception(Status status, Code code, String str) {
        super(str);
        this.status = status;
        this.responseCode = code;
    }

    public static void check(boolean z, Status status, Code code, String str, Object... objArr) throws SmartTapV2Exception {
        if (!z) {
            throw new SmartTapV2Exception(status, code, String.format(str, objArr));
        }
    }
}
*/