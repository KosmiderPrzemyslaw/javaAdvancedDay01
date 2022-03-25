package Wzorce_Projektowe.FacadeProcessor;

public class ComputerFacade {
    private Proccessor processor;
    private Memory memory;
    private HarddDrive hardDrive;

    public ComputerFacade() {
    }

    public ComputerFacade(Proccessor processor, Memory memory, HarddDrive hardDrive) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void start() {
        processor.freeze();
        memory.load(2048, hardDrive.read(0xAA55, 512));
        processor.jump(2048);
        processor.execute();
    }
}
