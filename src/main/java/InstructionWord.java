public class InstructionWord {

    private int opcode;
    private int R1;

    public void setOpcode(int opcode) {
        if(opcode>11 || opcode<0)
            System.out.println("Invalid Opcode");
        else
            this.opcode = opcode;
    }

    public void setR1(int r1) {
        if(R1>63 || R1<0)
            System.out.println("Invalid Register R1 number");
        else
            R1 = r1;
    }

    public int getOpcode() {
        return opcode;
//        return value >> 12;
    }


    public int getR1() {
//        (value & 4032)>>6
        return R1;
    }
//    public int getImmediateOrR2() {
//        return (value & 63);
//    }


}
