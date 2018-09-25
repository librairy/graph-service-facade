package org.librairy.service.graph.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Selection extends org.librairy.service.graph.facade.model.Selection {

    public Selection(org.librairy.service.graph.facade.model.Selection bean){
        try {
            BeanUtils.copyProperties(this,bean);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Selection() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "search parameters")
    public Query getQuery() {
        return new Query(super.getQuery());
    }

    @Override
    @ApiModelProperty(value = "number of elements")
    public Long getCount() {
        return super.getCount();
    }

}
