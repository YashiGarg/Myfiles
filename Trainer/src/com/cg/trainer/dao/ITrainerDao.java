package com.cg.trainer.dao;

import java.util.HashMap;


import com.cg.trainer.bean.Trainer;
import com.cg.trainer.exception.NoTrainerWithThisRatingException;

public interface ITrainerDao {
	public void addFeedback(Trainer trainer);
	public HashMap<Integer,Trainer> getTrainerList(int rating) throws NoTrainerWithThisRatingException;
}
