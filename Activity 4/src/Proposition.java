public abstract class Proposition{
    abstract boolean getValue(int x);
    abstract char getSymbol(int x);
    abstract void setValue(int x, boolean y);
}

class Prop_0 extends  Proposition{
    boolean []value = new boolean[4];

    @Override
    boolean getValue(int x) {
        return value[x];
    }

    char getSymbol(int x) {
        if (getValue(x)) {
            return 'T';
        } else {
            return 'F';
        }
    }

    void setValue(int x, boolean y){
        value[x] = y;
    }
}
class Prop_1 extends Proposition{
    boolean []value = {true, true, false, false};

    @Override
    boolean getValue(int x) {
        return value[x];
    }

    char getSymbol(int x) {
        if (getValue(x)) {
            return 'T';
        } else {
            return 'F';
        }
    }

    void setValue(int x, boolean y){
        value[x] = y;
    }
}
class Prop_2 extends Proposition{
    boolean []value = {true, false, true, false};

    @Override
    boolean getValue(int x) {
        return value[x];
    }

    char getSymbol(int x) {
        if (getValue(x)) {
            return 'T';
        } else {
            return 'F';
        }
    }

    void setValue(int x, boolean y){
        value[x] = y;
    }
}
