public class VicePresident extends ChainHandler implements Employee {

    @Override
    public void handleRequest(ChainedRequest chainedRequest) {

        switch (chainedRequest.getRequestType()) {

            case CONFERENCE:
                System.out.println("VP can Approve Conferences");
                break;

            case PURCHASE:
                if (chainedRequest.getAmount() < 15000) {
                    System.out.println("VP can Approve Purchases up to 15000");
                    return;
                }

                successor.handleRequest(chainedRequest);
                break;

            default:
        }
    }
}
