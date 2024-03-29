package com.shadowsdream.service;

import com.shadowsdream.dto.PersonDto;
import com.shadowsdream.dto.PersonSaveDto;
import com.shadowsdream.dto.PersonViewDto;
import com.shadowsdream.dto.PhoneNumberDto;
import com.shadowsdream.exception.PersonServiceException;

import java.util.List;

public interface PersonService {

    Long save(PersonSaveDto personSaveDto) throws PersonServiceException;

    List<PersonViewDto> findAll();

    PersonDto findById(Long id) throws PersonServiceException;

    void updatePerson(PersonDto person) throws PersonServiceException;

    void updatePhoneNumber(PhoneNumberDto phoneNumberDto) throws PersonServiceException;

    void removePerson(Long id) throws PersonServiceException;

    void removePhoneNumber(Long id) throws PersonServiceException;
}
