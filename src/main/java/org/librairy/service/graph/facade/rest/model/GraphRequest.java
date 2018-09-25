package org.librairy.service.graph.facade.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.apache.avro.Schema;
import org.apache.commons.beanutils.BeanUtils;
import org.librairy.service.graph.facade.model.Format;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GraphRequest extends org.librairy.service.graph.facade.model.GraphRequest {

    public GraphRequest(org.librairy.service.graph.facade.model.GraphRequest graph){
        try {
            BeanUtils.copyProperties(this,graph);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public GraphRequest() {
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
    @ApiModelProperty(value = "output format")
    public Format getFormat() {return super.getFormat();
    }

    @Override
    @ApiModelProperty(value = "nodes criteria")
    public Query getNodes() {
        return new Query(super.getNodes());
    }

    @Override
    @ApiModelProperty(value="edges criteria")
    public Query getEdges() {
        return new Query(super.getEdges());
    }

}
