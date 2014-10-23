package com.brokaw.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.brokaw.model.Account;
import com.brokaw.service.AccountReg;
import com.brokaw.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService studentService;
	
	
		@RequestMapping(value="/saveData/{socmedia}/{sid}/{email}" , method = RequestMethod.POST)
		@ResponseBody
		public ResponseEntity<Account> addAccount(@PathVariable("socmedia")String socialmedia ,@PathVariable("sid") int aid ,@PathVariable("email") String emailId)
		{
			
			AccountReg sr = new AccountReg();
			sr.setAccountId(aid);
			sr.setEmailId(emailId);
			sr.setSocMedia(socialmedia);
			
			studentService.add(sr.createAccount());
			return new ResponseEntity<Account>( HttpStatus.OK);
			
		}
	}

