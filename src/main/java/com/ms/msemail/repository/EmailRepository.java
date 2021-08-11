package com.ms.msemail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.msemail.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
	

}
