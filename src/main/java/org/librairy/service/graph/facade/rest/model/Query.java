package org.librairy.service.graph.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Query extends org.librairy.service.graph.facade.model.Query {

    public Query(org.librairy.service.graph.facade.model.Query query){
        try {
            BeanUtils.copyProperties(this,query);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Query() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "type to search")
    public String getType() {
        return super.getType();
    }

    @Override
    @ApiModelProperty(value = "query condition")
    public String getFilter() {
        return super.getFilter();
    }

    @Override
    @ApiModelProperty(value = "attributes")
    public List<String> getFields() {
        return super.getFields();
    }


}
