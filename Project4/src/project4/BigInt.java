package project4;

public class BigInt {

    public BigInt()
    {
        // makes empty big Int
    }
    
    public BigInt(String value) {
        // fixme!
    }

    private boolean isBigger(BigInt other) {
        return true; // fixme
    }

    public BigInt add(BigInt other) {
        // do something
        BigInt newResult = new BigInt();
        // do not change yourself or the other, return a new big int
        
        // do stuff here to add digits to newResult
        
        
        // 123
        // -45
        // ---
        //  78
        
        return newResult;
    }

    public BigInt subtract(BigInt other) {
        // do something

        // do not change yourself or the other, return a new big int
        if (isBigger(other)) {

        } else {

        }
        return new BigInt();
    }

    public String toString() {
        // return a nicely formatted string with thousands seperator
        // ie -12,345,678
        
        StringBuilder stringBuilder = new StringBuilder();
        
        return "";
    }
}