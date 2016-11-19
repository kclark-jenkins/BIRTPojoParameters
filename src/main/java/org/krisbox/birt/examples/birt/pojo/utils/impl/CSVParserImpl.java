package org.krisbox.birt.examples.birt.pojo.utils.impl;

import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.common.processor.ConcurrentRowProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.krisbox.birt.examples.birt.pojo.Complaints;
import org.krisbox.birt.examples.birt.pojo.impl.ComplaintsImpl;

import java.io.InputStreamReader;
import java.util.*;

public class CSVParserImpl extends BIRTPojoLoggerImpl {
    private final String DATASET;

    public CSVParserImpl() {
        super();
        DATASET = new String("/Consumer_Complaints.csv");
    }

    public List<ComplaintsImpl> getDataset(Map<String, Object> dataSetParamValues) {
        return parseFile(dataSetParamValues);
    }

    private List<ComplaintsImpl> parseFile(Map<String, Object> datasetFilters) {
        BeanListProcessor<ComplaintsImpl> rowProcessor = new BeanListProcessor<ComplaintsImpl>(ComplaintsImpl.class);

        CsvParserSettings parserSettings = new CsvParserSettings();
        parserSettings.setHeaderExtractionEnabled(true);
        parserSettings.setMaxCharsPerColumn(8000);
        parserSettings.setProcessor(new ConcurrentRowProcessor(rowProcessor));
        CsvParser parser = new CsvParser(parserSettings);
        parser.parse(new InputStreamReader(CSVParserImpl.class.getResourceAsStream(DATASET)));
        List<ComplaintsImpl> beans = rowProcessor.getBeans();

        if(datasetFilters == null)
            return beans;
        else
            return filter(beans, datasetFilters);
    }

    private List<ComplaintsImpl> filter(List<ComplaintsImpl> dataSetParamValues, Map<String, Object> filters) {
        List<ComplaintsImpl> dataset = new ArrayList<ComplaintsImpl>();

        if(dataSetParamValues != null) {
            dataSetParamValues.forEach(line->{
                filters.forEach((k,v)->{
                    switch(k) {
                        case "dateReceived":
                            if(!((Complaints) line).getDateReceived().contains((String)v))
                                dataset.add(line);
                            break;
                        case "product":
                            if(!((Complaints) line).getProduct().contains((String)v))
                                dataset.add(line);
                            break;
                        case "subProduct":
                            if(!((Complaints) line).getSubProduct().contains((String)v))
                                dataset.add(line);
                            break;
                        case "issue":
                            if(!((Complaints) line).getIssue().contains((String)v))
                                dataset.add(line);
                            break;
                        case "subIssue":
                            if(!((Complaints) line).getSubIssue().contains((String)v))
                                dataset.add(line);
                            break;
                        case "consumerComplaintNarrative":
                            if(!((Complaints) line).getConsumerComplaintNarrative().contains((String)v))
                                dataset.add(line);
                            break;
                        case "companyPublicResponse":
                            if(!((Complaints) line).getCompanyPublicResponse().contains((String)v))
                                dataset.add(line);
                            break;
                        case "company":
                            if(!((Complaints) line).getCompany().contains((String)v))
                                dataset.add(line);
                            break;
                        case "state":
                            if(!((Complaints) line).getState().contains((String)v))
                                dataset.add(line);
                            break;
                        case "zipCode":
                            if(!((Complaints) line).getZipCode().contains((String)v))
                                dataset.add(line);
                            break;
                        case "tags":
                            if(!((Complaints) line).getTags().contains((String)v))
                                dataset.add(line);
                            break;
                        case "consumerConsentProvided":
                            if(!((Complaints) line).getConsumerConsentProvided().contains((String)v))
                                dataset.add(line);
                            break;
                        case "submittedVia":
                            if(!((Complaints) line).getSubmittedVia().contains((String)v))
                                dataset.add(line);
                            break;
                        case "dateSentToCompany":
                            if(!((Complaints) line).getDateSentToCompany().contains((String)v))
                                dataset.add(line);
                            break;
                        case "companyResponseToConsumer":
                            if(!((Complaints) line).getCompanyResponseToConsumer().contains((String)v))
                                dataset.add(line);
                            break;
                        case "timelyResponse":
                            if(!((Complaints) line).getTimelyResponse().contains((String)v))
                                dataset.add(line);
                            break;
                        case "consumerDisputed":
                            if(!((Complaints) line).getConsumerDisputed().contains((String)v))
                                dataset.add(line);
                            break;
                        case "complaintID":
                            if(!((Complaints) line).getComplaintID().contains((String)v))
                                dataset.add(line);
                            break;
                    }
                });
            });
        }

        return dataset;
    }
}
