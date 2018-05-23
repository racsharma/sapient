package com.sapient.test;

/*import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItemInArray;*/
import static org.junit.Assert.assertThat;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import org.hamcrest.CustomMatcher;
import org.junit.Before;
import org.junit.Test;

import com.sapient.CardTransaction;
import com.sapient.InsufficientCardBalanceException;
import com.sapient.MetroService;
import com.sapient.MinimumCardBalanceException;
import com.sapient.SmartCard;
import com.sapient.Station;
import com.sapient.Traveller;
import com.sapient.WeekdayFareStrategy;
import com.sapient.WeekendFareStrategy;

public class MetroServiceTest {
	    private MetroService metroService = new MetroService();
	    private SmartCard card;
	    @Before
	    public void setUp() throws Exception {
	        card = new SmartCard();
	        card.setId(1);
	        card.setBalance(100);
	        card.setTraveller(new Traveller("Rachna", 1L));
	    }
	   /* @Test
	    public void testCalculateFootFallForStation() throws Exception {
	        metroService.swipeIn(card, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
	        metroService.swipeOut(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
	        metroService.swipeIn(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 10, 19, 05));
	        metroService.swipeOut(card, Station.A10, LocalDateTime.of(2016, Month.APRIL, 10, 19, 15));
	        assertThat("FootFall for station A6 should be 2", metroService.calculateFootFall(Station.A6), equalTo(2));
	        assertThat("FootFall for station A1 should be 1", metroService.calculateFootFall(Station.A1), equalTo(1));
	        assertThat("FootFall for station A10 should be 1", metroService.calculateFootFall(Station.A10), equalTo(1));
	    }
	    @Test
	    public void testCardReport() throws Exception {
	        metroService.swipeIn(card, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
	        metroService.swipeOut(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
	        metroService.swipeIn(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 10, 19, 05));
	        metroService.swipeOut(card, Station.A10, LocalDateTime.of(2016, Month.APRIL, 10, 19, 15));
	        final List<CardTransaction> trxs = metroService.cardReport(card);
	        assertThat("There should be 2 trxs for this card", trxs.size(), equalTo(2));
	        assertThat("One of the Trx should be charged 35", trxs.toArray(new CardTransaction[0]), hasItemInArray(new CustomMatcher<CardTrx>("Fare shall be 35") {
	            @Override
	            public boolean matches(Object o) {
	            	CardTransaction trx = (CardTransaction) o;
	                return trx.getFare() == 35.0 && trx.getFareStrategy() instanceof WeekdayFareStrategy && trx.distance == 5;
	            }
	        }));
	        assertThat("Other Trx should be charged 35", trxs.toArray(new CardTransaction[0]), hasItemInArray(new CustomMatcher<CardTrx>("Fare shall be 35") {
	            @Override
	            public boolean matches(Object o) {
	            	CardTransaction trx = (CardTransaction) o;
	                return trx.getFare() == 22.0 && trx.getFareStrategy() instanceof WeekendFareStrategy && trx.distance == 4;
	            }
	        }));
	    }*/
	    @Test(expected = MinimumCardBalanceException.class)
	    public void testMinimumBalanceAtSwipeIn() throws Exception {
	        card.setBalance(1);
	        metroService.swipeIn(card, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
	    }
	    @Test(expected = InsufficientCardBalanceException.class)
	    public void testSufficientBalanceAtSwipeOut() throws Exception {
	        card.setBalance(10);
	        metroService.swipeIn(card, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
	        metroService.swipeOut(card, Station.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
	    }
	}


