package org.krisbox.birt.examples.birt.pojo.tests;

import org.junit.Test;
import org.krisbox.birt.examples.birt.pojo.Complaints;
import org.krisbox.birt.examples.birt.pojo.ComplaintsDataset;
import org.krisbox.birt.examples.birt.pojo.impl.ComplaintsDatasetImpl;
import org.krisbox.birt.examples.birt.pojo.impl.ComplaintsImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestPojo {
    @Test
    public void testAllData() {
        List<Exception> exceptions = new ArrayList<Exception>();

        ComplaintsDataset dataset = null;
        List<ComplaintsImpl> complaints = new ArrayList<ComplaintsImpl>();
        try {
            dataset = new ComplaintsDatasetImpl();
        }catch(Exception ex) {
            exceptions.add(ex);
        }

        try {
            complaints = dataset.getComplaints(null);
        }catch(Exception ex){
            exceptions.add(ex);
        }

        exceptions.forEach(ex->{
            assertEquals(null,ex);
        });

        try {
            assertEquals("Wells Fargo & Company",       complaints.get(0).getCompany());
            assertEquals(null,                          complaints.get(0).getCompanyPublicResponse());
            assertEquals("Closed with explanation",     complaints.get(0).getCompanyResponseToConsumer());
            assertEquals("468882",                      complaints.get(0).getComplaintID());
            assertEquals(null,                            complaints.get(0).getConsumerComplaintNarrative());
            assertEquals("N/A",                         complaints.get(0).getConsumerConsentProvided());
            assertEquals("No",                          complaints.get(0).getConsumerDisputed());
            assertEquals("07/29/2013",                  complaints.get(0).getDateReceived());
            assertEquals("07/30/2013",                  complaints.get(0).getDateSentToCompany());
            assertEquals("Managing the loan or lease",  complaints.get(0).getIssue());
            assertEquals("Consumer Loan",               complaints.get(0).getProduct());
            assertEquals("VA",                          complaints.get(0).getState());
            assertEquals(null,                            complaints.get(0).getSubIssue());
            assertEquals("Phone",                       complaints.get(0).getSubmittedVia());
            assertEquals("Vehicle loan",                complaints.get(0).getSubProduct());
            assertEquals(null,                            complaints.get(0).getTags());
            assertEquals("Yes",                         complaints.get(0).getTimelyResponse());
            assertEquals("24540",                       complaints.get(0).getZipCode());
        }catch(Exception ex){
            exceptions.add(ex);
        }
    }

    @Test
    public void testFilteredData() {
        List<Exception> exceptions = new ArrayList<Exception>();

        Map<String, Object> filters = new HashMap<String, Object>();
        filters.put("company", "Wells Fargo & Company");

        ComplaintsDataset dataset = null;

        try {
            dataset   = new ComplaintsDatasetImpl();
        }catch(Exception ex) {
            exceptions.add(ex);
        }

        try {
            dataset.open(null, filters);
        }catch(Exception ex){
            exceptions.add(ex);
        }

        Complaints complaints = null;

        try {
            complaints = (Complaints)dataset.next();
        }catch(Exception ex){
            exceptions.add(ex);
        }

        exceptions.forEach(ex->{
            assertEquals(null,ex);
        });

        try {
            assertEquals("Santander Bank US",                       complaints.getCompany());
            assertEquals(null,                                      complaints.getCompanyPublicResponse());
            assertEquals("Closed",                                  complaints.getCompanyResponseToConsumer());
            assertEquals("468879",                                  complaints.getComplaintID());
            assertEquals(null,                                      complaints.getConsumerComplaintNarrative());
            assertEquals("N/A",                                     complaints.getConsumerConsentProvided());
            assertEquals("No",                                      complaints.getConsumerDisputed());
            assertEquals("07/29/2013",                              complaints.getDateReceived());
            assertEquals("07/31/2013",                              complaints.getDateSentToCompany());
            assertEquals("Account opening, closing, or management", complaints.getIssue());
            assertEquals("Bank account or service",                 complaints.getProduct());
            assertEquals("NY",                                      complaints.getState());
            assertEquals(null,                                      complaints.getSubIssue());
            assertEquals("Fax",                                     complaints.getSubmittedVia());
            assertEquals("Checking account",                        complaints.getSubProduct());
            assertEquals(null,                                      complaints.getTags());
            assertEquals("Yes",                                     complaints.getTimelyResponse());
            assertEquals("10065",                                   complaints.getZipCode());
        }catch(Exception ex){
            exceptions.add(ex);
        }
    }
}
