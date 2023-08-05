package com.driver.services;


import com.driver.EntryDto.BookTicketEntryDto;
import com.driver.model.Passenger;
import com.driver.model.Ticket;
import com.driver.model.Train;
import com.driver.repository.PassengerRepository;
import com.driver.repository.TicketRepository;
import com.driver.repository.TrainRepository;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {


    TicketRepository ticketRepository = new TicketRepository() {
        @Override
        public List<Ticket> findAll() {
            return null;
        }

        @Override
        public List<Ticket> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<Ticket> findAllById(Iterable<Integer> iterable) {
            return null;
        }

        @Override
        public <S extends Ticket> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends Ticket> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<Ticket> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public Ticket getOne(Integer integer) {
            return null;
        }

        @Override
        public <S extends Ticket> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends Ticket> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<Ticket> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Ticket> S save(S s) {
            return null;
        }

        @Override
        public Optional<Ticket> findById(Integer integer) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Integer integer) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public void delete(Ticket ticket) {

        }

        @Override
        public void deleteAll(Iterable<? extends Ticket> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends Ticket> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends Ticket> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Ticket> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends Ticket> boolean exists(Example<S> example) {
            return false;
        }
    };

    @Autowired
    TrainRepository trainRepository = new TrainRepository() {
        @Override
        public List<Train> findAll() {
            return null;
        }

        @Override
        public List<Train> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<Train> findAllById(Iterable<Integer> iterable) {
            return null;
        }

        @Override
        public <S extends Train> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends Train> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<Train> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public Train getOne(Integer integer) {
            return null;
        }

        @Override
        public <S extends Train> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends Train> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<Train> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Train> S save(S s) {
            return null;
        }

        @Override
        public Optional<Train> findById(Integer integer) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Integer integer) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public void delete(Train train) {

        }

        @Override
        public void deleteAll(Iterable<? extends Train> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends Train> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends Train> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Train> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends Train> boolean exists(Example<S> example) {
            return false;
        }
    };

    @Autowired
    PassengerRepository passengerRepository = new PassengerRepository() {
        @Override
        public List<Passenger> findAll() {
            return null;
        }

        @Override
        public List<Passenger> findAll(Sort sort) {
            return null;
        }

        @Override
        public List<Passenger> findAllById(Iterable<Integer> iterable) {
            return null;
        }

        @Override
        public <S extends Passenger> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends Passenger> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<Passenger> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public Passenger getOne(Integer integer) {
            return null;
        }

        @Override
        public <S extends Passenger> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends Passenger> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public Page<Passenger> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Passenger> S save(S s) {
            return null;
        }

        @Override
        public Optional<Passenger> findById(Integer integer) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Integer integer) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public void delete(Passenger passenger) {

        }

        @Override
        public void deleteAll(Iterable<? extends Passenger> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends Passenger> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends Passenger> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Passenger> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends Passenger> boolean exists(Example<S> example) {
            return false;
        }
    };


    public Integer bookTicket(BookTicketEntryDto bookTicketEntryDto)throws Exception{

        //Check for validity
        //Use bookedTickets List from the TrainRepository to get bookings done against that train
        // Incase the there are insufficient tickets
        // throw new Exception("Less tickets are available");
        //otherwise book the ticket, calculate the price and other details
        //Save the information in corresponding DB Tables
        //Fare System : Check problem statement
        //Incase the train doesn't pass through the requested stations
        //throw new Exception("Invalid stations");
        //Save the bookedTickets in the train Object
        //Also in the passenger Entity change the attribute bookedTickets by using the attribute bookingPersonId.
       //And the end return the ticketId that has come from db

        Train train = trainRepository.findById(bookTicketEntryDto.getTrainId()).get();
        int bookedSeats = 0;
        List<Ticket> booked = train.getBookedTickets();
        for(Ticket ticket : booked){
            bookedSeats = ticket.getPassengersList().size();
        }
        if(bookedSeats + bookTicketEntryDto.getNoOfSeats() > train.getNoOfSeats()){
            throw new Exception("Less tickets are available");
        }
        String [] stations = train.getRoute().split(",");
        List<Passenger> passengerList = new ArrayList<>();
        List<Integer> ids = bookTicketEntryDto.getPassengerIds();
        for(int id : ids){
            passengerList.add(passengerRepository.findById(id).get());
        }

        int x = -1,y = -1;
        for(int i=0;i<stations.length;i++){
            if(bookTicketEntryDto.getFromStation().toString().equals(stations[i])){
                x = i;
                break;
            }
        }
        for(int i=0;i<stations.length;i++){
            if(bookTicketEntryDto.getToStation().toString().equals(stations[i])){
                y = i;
                break;
            }
        }

        if(x == -1 || y == -1 || y - x < 0){
            throw new Exception("Invalid stations");
        }

        Ticket ticket = new Ticket();
        ticket.setPassengersList(passengerList);
        ticket.setFromStation(bookTicketEntryDto.getFromStation());
        ticket.setToStation(bookTicketEntryDto.getToStation());

        int fair = 0;
        fair = bookTicketEntryDto.getNoOfSeats()*(y-x)*300;

        ticket.setTotalFare(fair);
        ticket.setTrain(train);

        train.getBookedTickets().add(ticket);
        train.setNoOfSeats(train.getNoOfSeats()-bookTicketEntryDto.getNoOfSeats());

        Passenger passenger = passengerRepository.findById(bookTicketEntryDto.getBookingPersonId()).get();
        passenger.getBookedTickets().add(ticket);

        trainRepository.save(train);

        return ticketRepository.save(ticket).getTicketId();
    }
}
