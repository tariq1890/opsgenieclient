package com.ifountain.opsgenie.client.model.policy;

import com.ifountain.opsgenie.client.OpsGenieClientConstants;
import com.ifountain.opsgenie.client.OpsGenieClientValidationException;
import com.ifountain.opsgenie.client.model.BaseRequest;

import java.util.Map;

/**
 * Container for the parameters to make an disable policy api call.
 *
 * @see com.ifountain.opsgenie.client.IPolicyOpsGenieClient#disablePolicy(com.ifountain.opsgenie.client.model.policy.DisablePolicyRequest2)
 */
public class DisablePolicyRequest extends BaseRequest<DisablePolicyResponse> {
    private String name;

    /**
     * Rest api uri of disable policy operation.
     */
    @Override
    public String getEndPoint() {
          return "/v1/json/alert/policy/disable";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    public DisablePolicyResponse createResponse() {
        return new DisablePolicyResponse();
    }

    @Override
    public Map serialize() throws OpsGenieClientValidationException {
        Map json = super.serialize();
        if(getName() != null)
        	json.put(OpsGenieClientConstants.API.NAME, getName());
        return json;
    }
}
