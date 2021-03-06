package com.ifountain.opsgenie.client.model.schedule;

/**
 * Container for the parameters to make a list flat who is on call.
 *
 * @see com.ifountain.opsgenie.client.IScheduleOpsGenieClient#listFlatWhoIsOnCall(ListFlatWhoIsOnCallRequest)
 */
public class ListFlatWhoIsOnCallRequest extends AbstractListWhoIsOnCallRequest<ListFlatWhoIsOnCallResponse, ListFlatWhoIsOnCallRequest> {

    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    @Override
    public ListFlatWhoIsOnCallResponse createResponse() {
        return new ListFlatWhoIsOnCallResponse();
    }

    public boolean isFlat() {
        return true;
    }
}
