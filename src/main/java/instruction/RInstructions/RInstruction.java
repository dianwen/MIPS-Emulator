package main.java.instruction.RInstructions;

import main.java.exceptions.ImproperInstructionSizeException;
import main.java.exceptions.ImproperInstructionValueException;
import main.java.instruction.Instruction;

/**
 * Created by dianwen on 5/8/15.
 */
abstract public class RInstruction extends Instruction {

    protected int registerS, registerT, registerD, shamt, function;

    public RInstruction(String instruction) throws ImproperInstructionSizeException, ImproperInstructionValueException {
        super(instruction);
    }

    public void getReady() {
        registerS = Integer.parseInt(instruction.substring(6, 11), 2);
        registerT = Integer.parseInt(instruction.substring(11, 16), 2);
        registerD = Integer.parseInt(instruction.substring(16, 21), 2);
        shamt = Integer.parseInt(instruction.substring(21, 26), 2);
        function = Integer.parseInt(instruction.substring(26, 32), 2);
        executionReady = true;
    }

}
