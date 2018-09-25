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
public class GraphSummary extends org.librairy.service.graph.facade.model.GraphSummary {

    public GraphSummary(org.librairy.service.graph.facade.model.GraphSummary graph){
        try {
            BeanUtils.copyProperties(this,graph);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public GraphSummary() {
    }

    @Override
    @ApiModelProperty(hidden = true)
    @JsonIgnore
    public Schema getSchema() {
        return super.getSchema();
    }

    @Override
    @ApiModelProperty(value = "identifier")
    public String getId() {
        return super.getId();
    }

    @Override
    @ApiModelProperty(value = "description")
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    @ApiModelProperty(value = "creation time (ISO-8601)")
    public String getDate() {
        return super.getDate();
    }

    @Override
    @ApiModelProperty(value="'nodes'x'edges'")
    public String getSize() {
        return super.getSize();
    }

}
