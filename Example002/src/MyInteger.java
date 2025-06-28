public class MyInteger {
    public MyInteger(int _i)
    {
        i = _i;
    }

    public int intValue()
    {
        return i;
    }

    public void setValue(int _i)
    {
        i = -i;
    }

    private int i;
}
