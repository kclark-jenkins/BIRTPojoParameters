package org.krisbox.birt.examples.birt.pojo.impl;

import com.univocity.parsers.annotations.NullString;
import com.univocity.parsers.annotations.Parsed;
import org.krisbox.birt.examples.birt.pojo.Complaints;
import org.krisbox.birt.examples.birt.pojo.utils.impl.BIRTPojoLoggerImpl;

import java.util.Date;

public class ComplaintsImpl extends BIRTPojoLoggerImpl implements Complaints {
    public ComplaintsImpl() {
        super();
    }

    @Parsed(index=0)
    private String  dateReceived;
    @Parsed(index=1)
    private String  product;
    @Parsed(index=2)
    private String  subProduct;
    @Parsed(index=3)
    private String  issue;
    @Parsed(index=4)
    private String  subIssue;
    @Parsed(index=5)
    private String  consumerComplaintNarrative;
    @Parsed(index=6)
    private String  companyPublicResponse;
    @Parsed(index=7)
    private String  company;
    @Parsed(index=8)
    private String  state;
    @Parsed(index=9)
    private String  zipCode;
    @Parsed(index=10)
    private String  tags;
    @Parsed(index=11)
    private String  consumerConsentProvided;
    @Parsed(index=12)
    private String  submittedVia;
    @Parsed(index=13)
    private String  dateSentToCompany;
    @Parsed(index=14)
    private String  companyResponseToConsumer;
    @Parsed(index=15)
    private String  timelyResponse;
    @Parsed(index=16)
    private String  consumerDisputed;
    @Parsed(index=17)
    private String  complaintID;


    public String getDateReceived() {
        return dateReceived;
    }

    public String getProduct() {
        return product;
    }

    public String getSubProduct() {
        return subProduct;
    }

    public String getIssue() {
        return issue;
    }

    public String getSubIssue() {
        return subIssue;
    }

    public String getConsumerComplaintNarrative() {
        return consumerComplaintNarrative;
    }

    public String getCompanyPublicResponse() {
        return companyPublicResponse;
    }

    public String getCompany() {
        return company;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getTags() {
        return tags;
    }

    public String getConsumerConsentProvided() {
        return consumerConsentProvided;
    }

    public String getSubmittedVia() {
        return submittedVia;
    }

    public String getDateSentToCompany() {
        return dateSentToCompany;
    }

    public String getCompanyResponseToConsumer() {
        return companyResponseToConsumer;
    }

    public String getTimelyResponse() {
        return timelyResponse;
    }

    public String getConsumerDisputed() {
        return consumerDisputed;
    }

    public String getComplaintID() {
        return complaintID;
    }

    public void setDateReceived(String dateReceived) {
        this.dateReceived = dateReceived;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setSubProduct(String subProduct) {
        this.subProduct = subProduct;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setSubIssue(String subIssue) {
        this.subIssue = subIssue;
    }

    public void setConsumerComplaintNarrative(String consumerComplaintNarrative) {
        this.consumerComplaintNarrative = consumerComplaintNarrative;
    }

    public void setCompanyPublicResponse(String companyPublicResponse) {
        this.companyPublicResponse = companyPublicResponse;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setConsumerConsentProvided(String consumerConsentProvided) {
        this.consumerConsentProvided = consumerConsentProvided;
    }

    public void setSubmittedVia(String submittedVia) {
        this.submittedVia = submittedVia;
    }

    public void setDateSentToCompany(String dateSentToCompany) {
        this.dateSentToCompany = dateSentToCompany;
    }

    public void setCompanyResponseToConsumer(String companyResponseToConsumer) {
        this.companyResponseToConsumer = companyResponseToConsumer;
    }

    public void setTimelyResponse(String timelyResponse) {
        this.timelyResponse = timelyResponse;
    }

    public void setConsumerDisputed(String consumerDisputed) {
        this.consumerDisputed = consumerDisputed;
    }

    public void setComplaintID(String complaintID) {
        this.complaintID = complaintID;
    }
}
