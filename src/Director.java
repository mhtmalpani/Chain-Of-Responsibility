public class Director extends ChainHandler implements Employee {

    @Override
    public void handleRequest(ChainedRequest chainedRequest) {

        switch (chainedRequest.getRequestType()) {

            case CONFERENCE:
                System.out.println("Directors can Approve Conferences");
                break;

            case PURCHASE:
                successor.handleRequest(chainedRequest);
                break;

            default:
        }
    }
}
