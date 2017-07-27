public class CEO extends ChainHandler implements Employee {

    @Override
    public void handleRequest(ChainedRequest chainedRequest) {

        switch (chainedRequest.getRequestType()) {

            case CONFERENCE:
                System.out.println("CEO can approve anything");
                break;

            case PURCHASE:
                System.out.println("CEO can approve anything");
                break;

            default:
        }
    }
}
