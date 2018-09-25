package org.librairy.service.graph.facade.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */

public class GraphSelection {

    @ApiModelProperty(notes="identifier")
    private String id = "";

    public GraphSelection(String id) {
        this.id = id;
    }

    public GraphSelection(){};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
