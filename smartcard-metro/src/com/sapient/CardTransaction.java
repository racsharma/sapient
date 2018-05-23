package com.sapient;

import java.time.LocalDateTime;

public class CardTransaction {
	
	SmartCard card;
	long id;
	
	LocalDateTime startTime;
	LocalDateTime endTime;
	double balance; 
	double fare;
	
	Station startStation;
	Station endStation;
	int distance;
	FareStrategy fareStrategy;
	
	
	public SmartCard getCard() {
		return card;
	}
	public void setCard(SmartCard card) {
		this.card = card;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public Station getStartStation() {
		return startStation;
	}
	public void setStartStation(Station startStation) {
		this.startStation = startStation;
	}
	public Station getEndStation() {
		return endStation;
	}
	public void setEndStation(Station endStation) {
		this.endStation = endStation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public FareStrategy getFareStrategy() {
		return fareStrategy;
	}
	public void setFareStrategy(FareStrategy fareStrategy) {
		this.fareStrategy = fareStrategy;
	}
	

}
