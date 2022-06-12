package behavioral.memento;

class MemoryState {
    private Memento ptrMemento;

    public Memento GetMemento() {
        return ptrMemento;
    }

    public void SetMemento(Memento pMemento) {
        ptrMemento = pMemento;
    }
}