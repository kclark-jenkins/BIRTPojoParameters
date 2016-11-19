package org.krisbox.birt.examples.birt.pojo;

import org.krisbox.birt.examples.birt.pojo.impl.ComplaintsImpl;
import org.krisbox.birt.examples.birt.pojo.utils.CSVParser;

import java.util.List;
import java.util.Map;

public interface ComplaintsDataset extends CSVParser {
    public void open(Object appContext, Map<String, Object> dataSetParamValues);
    public Object next();
    public void close();
    public List<ComplaintsImpl> getComplaints(Map<String, Object> dataSetParamValues);
}
