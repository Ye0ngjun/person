package com.pg.pg.service;

import com.pg.pg.dto.PersonRequestDto;
import com.pg.pg.entity.Person;
import com.pg.pg.repository.PersonRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    public final PersonRepository personRepository;
    @Transactional // sql 작업선언
    public Long update(Long id, PersonRequestDto requestDto){
        Person person1 = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다!")
        );
        person1.update(requestDto);
        return person1.getId();
    }
}
