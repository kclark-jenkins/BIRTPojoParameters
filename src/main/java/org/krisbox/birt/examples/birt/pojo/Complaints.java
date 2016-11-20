package org.krisbox.birt.examples.birt.pojo;

import org.krisbox.birt.examples.birt.pojo.utils.BIRTPojoLogger;

import java.util.Date;

public interface Complaints extends BIRTPojoLogger {
    public String getDateReceived();
    public String getProduct();
    public String getSubProduct();
    public String getIssue();
    public String getSubIssue();
    public String getConsumerComplaintNarrative();
    public String getCompanyPublicResponse();
    public String getCompany();
    public String getState();
    public String getZipCode();
    public String getTags();
    public String getConsumerConsentProvided();
    public String getSubmittedVia();
    public String getDateSentToCompany();
    public String getCompanyResponseToConsumer();
    public String getTimelyResponse();
    public String getConsumerDisputed();
    public String getComplaintID();

    public void setDateReceived(String date);
    public void setProduct(String product);
    public void setSubProduct(String subProduct);
    public void setIssue(String issue);
    public void setSubIssue(String subIssue);
    public void setConsumerComplaintNarrative(String consumerComplaintNarrative);
    public void setCompanyPublicResponse(String companyPublicResponse);
    public void setCompany(String company);
    public void setState(String state);
    public void setZipCode(String zipCode);
    public void setTags(String tags);
    public void setConsumerConsentProvided(String consumerConsentProvided);
    public void setSubmittedVia(String submittedVia);
    public void setDateSentToCompany(String dateSentToCompany);
    public void setCompanyResponseToConsumer(String companyResponseToConsumer);
    public void setTimelyResponse(String timelyResponse);
    public void setConsumerDisputed(String consumerDisputed);
    public void setComplaintID(String complaintID);
}
