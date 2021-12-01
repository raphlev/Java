package org.rlu.springiowebjpah2.repository;

import org.rlu.springiowebjpah2.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
