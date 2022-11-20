package ru.mirea.newpr.pr7_done.num5_6;

public class ProcessStrings implements StringAble{
    private String current;

    ProcessStrings(String value){
        current = value;
    }
    public String getCurrent() {
        return current;
    }

    @Override
    public int countChar(char value) {
        int count = 0;
        for (int i = 0; i < current.length(); ++i)
            if (current.charAt(i) == value)
                count++;
        return count;
    }

    @Override
    public String odd() {
        String res = "";
        //for (int i = 0; i < current.length(); i += 2)
        for(int i = 0; i < current.length(); i++) {
            if (i % 2 == 0) {
                res += current.charAt(i);
            }
        }
        return res;
    }

    @Override
    public void reverse() {
        String res = "";
        for (int i = current.length() - 1; i >= 0; --i)
            res += current.charAt(i);
        current = res;
    }
}
