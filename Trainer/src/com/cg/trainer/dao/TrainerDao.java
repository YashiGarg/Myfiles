package com.cg.trainer.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.trainer.bean.Trainer;
import com.cg.trainer.exception.NoTrainerWithThisRatingException;
import com.cg.trainer.util.CollectionUtil;

public class TrainerDao implements ITrainerDao {
	//Linking between collection util and dao
	CollectionUtil collectionutil = new CollectionUtil();
	Map<Integer, Trainer> map = new HashMap<Integer, Trainer>();

	@Override
	//
	public void addFeedback(Trainer trainer) {
		int key = (int) collectionutil.getId();
		map.put(key, trainer);
		System.out.println(map);
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rating) throws NoTrainerWithThisRatingException {
		Map<Integer, Trainer> map1 = new HashMap<Integer, Trainer>();
		for (Map.Entry<Integer, Trainer> trainers : map.entrySet()) {
			if (trainers.getValue().getRating() == rating) {
			map1.put(trainers.getKey(), trainers.getValue());
			return (HashMap<Integer, Trainer>) map1;
			}
		}
			throw new  NoTrainerWithThisRatingException();

		}
	}
