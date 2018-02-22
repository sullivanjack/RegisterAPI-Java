package edu.uark.models.repositories.interfaces;

import edu.uark.dataaccess.repository.BaseRepositoryInterface;
import edu.uark.models.entities.ProductEntity;

public interface EmployeeRepositoryInterface extends BaseRepositoryInterface<ProductEntity> {
    EmployeeEntity byLookupCode(String lookupCode);
}
