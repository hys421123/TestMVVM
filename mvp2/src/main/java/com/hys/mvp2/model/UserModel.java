package com.hys.mvp2.model;

import android.util.SparseArray;

import com.hys.mvp2.presenter.IUserModel;
import com.hys.mvp2.model.UserBean;


public class UserModel implements IUserModel {
// 查找数据的模型
	private String mFristName;
	private String mLastName;
	private int mID;
	private SparseArray<UserBean> mUsererArray = new SparseArray<UserBean>();

	@Override
	public void setID(int id) {
		// TODO Auto-generated method stub
		mID = id;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		mFristName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		mLastName = lastName;
		UserBean UserBean = new UserBean(mFristName, mLastName);
		mUsererArray.append(mID, UserBean);
	}

	@Override
	public UserBean load(int id) {
		// TODO Auto-generated method stub
		mID = id;
		UserBean userBean = mUsererArray.get(mID, new UserBean("not found",
				"not found"));
		return userBean;

	}

}
