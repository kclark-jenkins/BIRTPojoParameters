package org.krisbox.birt.examples.birt.pojo.utils.impl;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import org.krisbox.birt.examples.birt.pojo.Complaints;
import org.krisbox.birt.examples.birt.pojo.impl.ComplaintsImpl;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVParserImpl extends BIRTPojoLoggerImpl {
    private final String DATASET;

    public CSVParserImpl() {
        super();
        DATASET = new String("/Consumer_Complaints.csv");
    }

    public List<Complaints> getDataset(Map<String, Object> dataSetParamValues) {
        List<Complaints> dataset = new ArrayList<Complaints>();
        CSVReader datasetReader = null;
        CsvToBean csv = new CsvToBean();

        datasetReader = new CSVReader(new InputStreamReader(CSVParserImpl.class.getResourceAsStream(DATASET)));
        List list = csv.parse(setColumMapping(), datasetReader);

        list.subList(1,list.size()).forEach(line->{
            Complaints complaint = (Complaints) line;

            if(dataSetParamValues != null) {
                dataSetParamValues.forEach((k,v)->{
                    switch(k) {
                        case "dateReceived":
                            if(!((Complaints) line).getDateReceived().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "product":
                            if(!((Complaints) line).getProduct().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "subProduct":
                            if(!((Complaints) line).getSubProduct().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "issue":
                            if(!((Complaints) line).getIssue().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "subIssue":
                            if(!((Complaints) line).getSubIssue().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "consumerComplaintNarrative":
                            if(!((Complaints) line).getConsumerComplaintNarrative().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "companyPublicResponse":
                            if(!((Complaints) line).getCompanyPublicResponse().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "company":
                            if(!((Complaints) line).getCompany().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "state":
                            if(!((Complaints) line).getState().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "zipCode":
                            if(!((Complaints) line).getZipCode().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "tags":
                            if(!((Complaints) line).getTags().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "consumerConsentProvided":
                            if(!((Complaints) line).getConsumerConsentProvided().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "submittedVia":
                            if(!((Complaints) line).getSubmittedVia().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "dateSentToCompany":
                            if(!((Complaints) line).getDateSentToCompany().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "companyResponseToConsumer":
                            if(!((Complaints) line).getCompanyResponseToConsumer().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "timelyResponse":
                            if(!((Complaints) line).getTimelyResponse().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "consumerDisputed":
                            if(!((Complaints) line).getConsumerDisputed().contains((String)v))
                                dataset.add(complaint);
                            break;
                        case "complaintID":
                            if(!((Complaints) line).getComplaintID().contains((String)v))
                                dataset.add(complaint);
                            break;
                    }
                });
            }else{
                dataset.add(complaint);
            }
        });

        return dataset;
    }
    @SuppressWarnings({"rawtypes", "unchecked"})
    private ColumnPositionMappingStrategy setColumMapping() {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(ComplaintsImpl.class);
        String[] columns = new String[] {"dateReceived", "product", "subProduct", "issue", "subIssue", "consumerComplaintNarrative", "companyPublicResponse", "company", "state", "zipCode", "tags", "consumerConsentProvided", "submittedVia", "dateSentToCompany", "companyResponseToConsumer", "timelyResponse", "consumerDisputed", "complaintID"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
}
