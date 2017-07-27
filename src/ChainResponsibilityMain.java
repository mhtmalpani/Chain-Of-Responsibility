public class ChainResponsibilityMain {

    public static void main(String[] args) {

        Director director = new Director();
        VicePresident vicePresident = new VicePresident();
        CEO ceo = new CEO();

        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(ceo);

        ChainedRequest chainedRequest = new ChainedRequest(RequestType.CONFERENCE, 10000);
        director.handleRequest(chainedRequest);


        chainedRequest = new ChainedRequest(RequestType.PURCHASE, 10000);
        director.handleRequest(chainedRequest);


        chainedRequest = new ChainedRequest(RequestType.PURCHASE, 25000);
        director.handleRequest(chainedRequest);
    }
}
