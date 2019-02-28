package com.cg.trainer.service;

import java.util.HashMap;

import com.cg.trainer.bean.Trainer;
import com.cg.trainer.exception.NoTrainerWithThisRatingException;

public interface ITrainerService {

	public void addFeedback(Trainer trainer);

	HashMap<Integer, Trainer> getTrainerList(int rating) throws NoTrainerWithThisRatingException;

}