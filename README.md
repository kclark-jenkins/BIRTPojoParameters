# BIRT POJO Data Source with parameters

This is an example showing how you can pass parameters to a POJO Data Source in BIRT using a Map<String, Object>

# Example Data

Sample data I used in the unit tests can be downloaded from [here](https://catalog.data.gov/dataset/consumer-complaint-database)

# Example usage

To get all data
```
        Map<String, Object> filters = new HashMap<String, Object>();
        filters.put("company", "Wells Fargo & Company");

        ComplaintsDataset dataset = new ComplaintsDatasetImpl();
        dataset.open(null, filters);
        complaints = (Complaints)dataset.next();
```

or to filter on a row
```
        Map<String, Object> filters = new HashMap<String, Object>();
        filters.put("company", "Wells Fargo & Company");

        ComplaintsDataset dataset = new ComplaintsDatasetImpl();
        dataset.open(null, filters);
        complaints = (Complaints)dataset.next();
```