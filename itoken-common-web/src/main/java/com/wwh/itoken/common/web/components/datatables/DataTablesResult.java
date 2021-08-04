package com.wwh.itoken.common.web.components.datatables;

import com.wwh.itoken.common.dto.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Bootstrap Datatables 结果街
 * <p>Title: DatatablesResult</p>
 * <p>Description: </p>
 *
 * @author William
 * @version 1.0.0
 * @date 2021/8/4 13:33
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DataTablesResult extends BaseResult implements Serializable {
    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private String error;
}
