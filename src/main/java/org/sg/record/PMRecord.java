package org.sg.record;


/*
Use record when the object is:
immutable
only holds data
no complex behavior
---------------------------
Key Limitation of Records

Records cannot:
extend other classes
change field values
have non-final fields

They implicitly extend java.lang.Record
 */
public record PMRecord(String nodeId, long timestamp,
                       String metricName, double value) {
}
