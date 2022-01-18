public class Operations{
    public static Proposition Negate(Proposition x){
        for (int index = 0; index < 4; index++) {
            if (x.getValue(index)) {
                x.setValue(index, false);
            } else {
                x.setValue(index, true);
            }
        }
        return x;
    }

    public static Proposition Conjunction(Proposition x, Proposition y){
        Prop_0 and_answer = new Prop_0();
        for (int index = 0; index < 4; index++) {
            if (x.getValue(index) && y.getValue(index)) {
                and_answer.setValue(index, true);
            } else {
                and_answer.setValue(index, false);
            }
        }
        return and_answer;
    }

    public static Proposition Disjunction(Proposition x, Proposition y){
        Prop_0 or_answer = new Prop_0();
        for (int index = 0; index < 4; index++) {
            if (x.getValue(index) || y.getValue(index)) {
                or_answer.setValue(index, true);
            } else {
                or_answer.setValue(index, false);
            }
        }
        return or_answer;
    }

    public static Proposition Conditional(Proposition x, Proposition y){
        Prop_0 then_answer = new Prop_0();
        for (int index = 0; index < 4; index++) {
            if (x.getValue(index)){
                if(!y.getValue(index)){
                    then_answer.setValue(index, false);
                }
                else{
                    then_answer.setValue(index, true);
                }
            }
            else{
                then_answer.setValue(index, true);
            }
        }
        return then_answer;
    }

    public static Proposition Biconditional(Proposition x, Proposition y){
        Prop_0 if_then_answer = new Prop_0();
        for(int index = 0; index < 4; index++){
            if(x.getValue(index) == y.getValue(index)){
                if_then_answer.setValue(index, true);
            }
            else{
                if_then_answer.setValue(index, false);
            }
        }
        return if_then_answer;
    }

    public static Proposition NAND(Proposition x, Proposition y){
        Prop_0 NAND_answer = new Prop_0();
        for (int index = 0; index < 4; index++) {
            if (x.getValue(index) && y.getValue(index)) {
                NAND_answer.setValue(index, false);
            } else {
                NAND_answer.setValue(index, true);
            }
        }
        return NAND_answer;
    }

    public static Proposition NOR(Proposition x, Proposition y){
        Prop_0 NOR_answer = new Prop_0();
        for (int index = 0; index < 4; index++) {
            if (x.getValue(index) || y.getValue(index)) {
                NOR_answer.setValue(index, false);
            } else {
                NOR_answer.setValue(index, true);
            }
        }
        return NOR_answer;
    }

    public static Proposition XOR(Proposition x, Proposition y){
        Prop_0 XOR_answer = new Prop_0();
        for(int index = 0; index < 4; index++){
            if(x.getValue(index) == y.getValue(index)){
                XOR_answer.setValue(index, false);
            }
            else{
                XOR_answer.setValue(index, true);
            }
        }
        return XOR_answer;
    }
}
