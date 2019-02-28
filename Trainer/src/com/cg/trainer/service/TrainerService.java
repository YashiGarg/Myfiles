package com.cg.trainer.service;

import java.util.HashMap;
import com.cg.trainer.bean.Trainer;
import com.cg.trainer.dao.ITrainerDao;
import com.cg.trainer.dao.TrainerDao;
import com.cg.trainer.exception.NoTrainerWithThisRatingException;

public class TrainerService implements ITrainerService {
	ITrainerDao trainerdao=new TrainerDao();
	@Override
	public void addFeedback(Trainer trainer) {
	trainerdao.addFeedback(trainer);
	}
	
	@Override
	public HashMap<Integer,Trainer> getTrainerList(int rating) throws NoTrainerWithThisRatingException{
		return (trainerdao.getTrainerList(rating));
}
}