import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void negate() {
        Prop_1 P = new Prop_1();
        Operations.Negate(P);
        assertFalse(P.getValue(0));
        assertFalse(P.getValue(1));
        assertTrue(P.getValue(2));
        assertTrue(P.getValue(3));
    }

    @Test
    void conjunction() {
        Prop_1 P = new Prop_1();
        Prop_2 Q = new Prop_2();
        Proposition result = Operations.Conjunction(P,Q);
        assertTrue(result.getValue(0));
        assertFalse(result.getValue(1));
        assertFalse(result.getValue(2));
        assertFalse(result.getValue(3));
    }

    @Test
    void disjunction() {
        Prop_1 P = new Prop_1();
        Prop_2 Q = new Prop_2();
        Proposition result = Operations.Disjunction(P,Q);
        assertTrue(result.getValue(0));
        assertTrue(result.getValue(1));
        assertTrue(result.getValue(2));
        assertFalse(result.getValue(3));
    }

    @Test
    void conditional() {
        Prop_1 P = new Prop_1();
        Prop_2 Q = new Prop_2();
        Proposition result = Operations.Conditional(P,Q);
        assertTrue(result.getValue(0));
        assertFalse(result.getValue(1));
        assertTrue(result.getValue(2));
        assertTrue(result.getValue(3));
    }

    @Test
    void biconditional() {
        Prop_1 P = new Prop_1();
        Prop_2 Q = new Prop_2();
        Proposition result = Operations.Biconditional(P,Q);
        assertTrue(result.getValue(0));
        assertFalse(result.getValue(1));
        assertFalse(result.getValue(2));
        assertTrue(result.getValue(3));
    }

    @Test
    void nand(){
        Prop_1 P = new Prop_1();
        Prop_2 Q = new Prop_2();
        Proposition result = Operations.NAND(P,Q);

        assertFalse(result.getValue(0));
        assertTrue(result.getValue(1));
        assertTrue(result.getValue(2));
        assertTrue(result.getValue(3));
    }

    @Test
    void nor(){
        Prop_1 P = new Prop_1();
        Prop_2 Q = new Prop_2();
        Proposition result = Operations.NOR(P,Q);

        assertFalse(result.getValue(0));
        assertFalse(result.getValue(1));
        assertFalse(result.getValue(2));
        assertTrue(result.getValue(3));
    }


    @Test
    void xor(){
        Prop_1 P = new Prop_1();
        Prop_2 Q = new Prop_2();
        Proposition result =  Operations.XOR(P,Q);

        assertFalse(result.getValue(0));
        assertTrue(result.getValue(1));
        assertTrue(result.getValue(2));
        assertFalse(result.getValue(3));
    }

}