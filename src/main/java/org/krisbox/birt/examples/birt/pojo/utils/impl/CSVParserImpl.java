package org.krisbox.birt.examples.birt.pojo.utils.impl;

import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.common.processor.ConcurrentRowProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.krisbox.birt.examples.birt.pojo.Complaints;
import org.krisbox.birt.examples.birt.pojo.impl.ComplaintsImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVParserImpl extends BIRTPojoLoggerImpl {
    private String DATASET;

    public CSVParserImpl() {
        super();
    }

    public List<ComplaintsImpl> getDataset(Map<String, Object> dataSet) {
        return parseFile(dataSet);
    }

    private List<ComplaintsImpl> parseFile(Map<String, Object> datasetFilters) {
        BeanListProcessor<ComplaintsImpl> rowProcessor = new BeanListProcessor<ComplaintsImpl>(ComplaintsImpl.class);

        CsvParserSettings parserSettings = new CsvParserSettings();
        parserSettings.setHeaderExtractionEnabled(true);
        parserSettings.setMaxCharsPerColumn(8000);
        parserSettings.setProcessor(new ConcurrentRowProcessor(rowProcessor));
        CsvParser parser = new CsvParser(parserSettings);

        try {
            parser.parse(new InputStreamReader(new FileInputStream((String)datasetFilters.get("flatfile"))));
        }catch(FileNotFoundException ex){
            fatal(ex);
        }


        final List<ComplaintsImpl>[] dataset = new List[]{new ArrayList<ComplaintsImpl>()};
        dataset[0] = rowProcessor.getBeans();


        return filterDataset(dataset, datasetFilters);
    }

    private List<ComplaintsImpl> filterDataset(List<ComplaintsImpl>[] dataset, Map<String, Object> datasetFilters) {
        datasetFilters.forEach((k,v)->{
            switch(k) {
                case "dateReceived":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getDateReceived())).collect(Collectors.toList());
                    break;
                case "product":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getProduct())).collect(Collectors.toList());
                    break;
                case "subProduct":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getSubProduct())).collect(Collectors.toList());
                    break;
                case "issue":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getIssue())).collect(Collectors.toList());
                    break;
                case "subIssue":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getSubIssue())).collect(Collectors.toList());
                    break;
                case "consumerComplaintNarrative":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getConsumerComplaintNarrative())).collect(Collectors.toList());
                    break;
                case "companyPublicResponse":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getCompanyPublicResponse())).collect(Collectors.toList());
                    break;
                case "company":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getCompany())).collect(Collectors.toList());
                    break;
                case "state":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getState())).collect(Collectors.toList());
                    break;
                case "zipCode":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getZipCode())).collect(Collectors.toList());
                    break;
                case "tags":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getTags())).collect(Collectors.toList());
                    break;
                case "consumerConsentProvided":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getConsumerConsentProvided())).collect(Collectors.toList());
                    break;
                case "submittedVia":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getSubmittedVia())).collect(Collectors.toList());
                    break;
                case "dateSentToCompany":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getDateSentToCompany())).collect(Collectors.toList());
                    break;
                case "companyResponseToConsumer":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getCompanyResponseToConsumer())).collect(Collectors.toList());
                    break;
                case "timelyResponse":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getTimelyResponse())).collect(Collectors.toList());
                    break;
                case "consumerDisputed":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getConsumerDisputed())).collect(Collectors.toList());
                    break;
                case "complaintID":
                    dataset[0] = dataset[0].stream().filter(line -> !datasetFilters.get(k).equals(line.getComplaintID())).collect(Collectors.toList());
                    break;
            }
        });

        return dataset[0];
    }
}
