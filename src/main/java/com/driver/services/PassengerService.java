package com.driver.services;


import com.driver.model.Passenger;
import com.driver.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

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

    public Integer addPassenger(Passenger passenger){
        //Add the passenger Object in the passengerDb and return the passegnerId that has been returned
        passengerRepository.save(passenger);
        return passenger.getPassengerId();
    }

}
