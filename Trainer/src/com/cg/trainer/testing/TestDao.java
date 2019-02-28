package com.cg.trainer.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.trainer.bean.Trainer;
import com.cg.trainer.dao.ITrainerDao;
import com.cg.trainer.dao.TrainerDao;
import com.cg.trainer.exception.NoTrainerWithThisRatingException;

public class TestDao {
	@Before
	public void RunEachTime() {
		System.out.println("i am printing");
	}

	@Test
	public void Test1Dao() {
		ITrainerDao td = new TrainerDao();
		Trainer trainer = new Trainer("yashi", "jee", "24", "53", 5);
		td.addFeedback(trainer);

	}

	@Test(expected = NoTrainerWithThisRatingException.class)
	public void test2Dao() throws NoTrainerWithThisRatingException {
		ITrainerDao td = new TrainerDao();
		Trainer trainer = new Trainer("yashi", "jee", "24", "53", 5);
		td.getTrainerList(6);
	}
}
