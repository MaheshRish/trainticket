package com.trainticket.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.trainticket.model.Train;
@Repository
public interface TrainRepository {
	 List<Train> getAllTrains();
	    Train getTrainByNumber(String trainNumber);
	    void updateTrain(Train train);

}
