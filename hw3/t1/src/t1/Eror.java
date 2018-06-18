package t1;

public enum Eror {
 NotFound, ErorComand,Virus,BadRequest;
	

 public static Eror WhatError(int code) {
	 switch (code) {
		case 401:
			return NotFound;
		case 402:
			return ErorComand;

		case 403:
			return Virus;

		case 404:
			return BadRequest;

		default:
			return null;
	 }
 }
 }