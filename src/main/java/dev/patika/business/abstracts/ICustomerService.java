package dev.patika.business.abstracts;

import dev.patika.dto.request.CustomerRequest;
import dev.patika.dto.response.CustomerResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ICustomerService {
    CustomerResponse getById (Long id);

    CustomerResponse create(CustomerRequest request);
    void delete(Long id);
    CustomerResponse update(Long id, CustomerRequest request);

    List<CustomerResponse> findAll ();
    Page<CustomerResponse> cursor(int page, int size);
}