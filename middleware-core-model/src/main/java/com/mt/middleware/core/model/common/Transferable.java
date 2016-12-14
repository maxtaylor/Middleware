package com.mt.middleware.core.model.common;

import com.mt.middleware.core.model.common.MiddlewareDTO;

import java.io.Externalizable;

/**
 * Created by max on 14/12/16.
 */
public interface Transferable<X extends MiddlewareDTO> extends Externalizable {
    X getDTO();
}
