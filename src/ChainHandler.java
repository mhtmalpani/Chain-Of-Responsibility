public abstract class ChainHandler {

    protected ChainHandler successor;

    public void setSuccessor(ChainHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(ChainedRequest chainedRequest);
}
