package org.krisbox.birt.examples.birt.pojo.utils;

import org.krisbox.birt.examples.birt.pojo.Complaints;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CSVParser extends BIRTPojoLogger {
    public List<Complaints> getDataset(Map<String, Object> dataSetParamValues);
}
