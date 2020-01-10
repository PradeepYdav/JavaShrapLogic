package com.pradeep;

import com.pradeep.model.Person;
import com.pradeep.model.Response;

public interface PersonService {
	Response addPerson(Person p);
	Response deletePerson(int id);
	Person getPerson(int id);
	Person[] getAllPerson();
}
