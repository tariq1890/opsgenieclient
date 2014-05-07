package com.ifountain.client.opsgenie.model.alert;

import com.ifountain.client.ClientConstants;
import com.ifountain.client.ClientValidationException;

import java.util.Map;

/**
 * Container for the parameters to make an assign ownership call.
 *
 * @author Sezgin Kucukkaraaslan
 * @version 11/26/12 4:36 PM
 * @see com.ifountain.client.opsgenie.IAlertOpsGenieClient#assign(AssignRequest)
 */
public class AssignRequest extends BaseAlertRequestWithSource<AssignResponse> {
    private String user;
    private String owner;
    private String note;

    /**
     * Rest api uri of assign ownership operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/alert/assign";
    }

    /**
     * The user who is performing the assign ownership operation.
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the user who is performing the assign ownership operation.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * The user who will be the owner of the alert after the operation.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the user who will be the owner of the alert after the operation.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Additional alert note.
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets additional alert note.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @see com.ifountain.client.model.BaseRequest#serialize()
     */
    public Map<String,Object> serialize() throws ClientValidationException {
        Map<String,Object> json = super.serialize();
        json.put(ClientConstants.API.OWNER, getOwner());
        if (getUser() != null)
            json.put(ClientConstants.API.USER, getUser());
        if (getNote() != null)
            json.put(ClientConstants.API.NOTE, getNote());
        return json;
    }

    @Override
    /**
     * @see com.ifountain.client.model.BaseRequest#createResponse()
     */
    public AssignResponse createResponse() {
        return new AssignResponse();
    }
}
