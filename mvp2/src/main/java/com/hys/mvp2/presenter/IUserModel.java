package com.hys.mvp2.presenter;


import com.hys.mvp2.model.UserBean;

public interface IUserModel {
	void setID(int id);

	void setFirstName(String firstName);

	void setLastName(String lastName);

	UserBean load(int id);
}
