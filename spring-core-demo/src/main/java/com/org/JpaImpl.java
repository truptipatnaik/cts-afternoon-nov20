package com.org;

public class JpaImpl implements EmployeeDao {

	@Override
	public void store() {
		System.out.println("store() implementation done via JPA");
	}

}
