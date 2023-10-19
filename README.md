# Design Patterns in Software Development

This repository explores several design patterns commonly used in the software development industry. Each pattern is explained and demonstrated with code examples.

## Table of Contents

- [Design Patterns in Software Development](#design-patterns-in-software-development)
    - [Table of Contents](#table-of-contents)
    - [Introduction](#introduction)
    - [Creational Patterns](#creational-patterns)
        - [Factory](#factory)
        - [Builder](#builder)
        - [Singleton](#singleton)
        - [Prototype (Clone)](#prototype-clone)
    - [Behavioral Patterns](#behavioral-patterns)
        - [Observer (Publish-Subscribe)](#observer-publish-subscribe)
        - [Iterator](#iterator)
        - [Strategy](#strategy)
        - [Mediator](#mediator)
        - [State](#state)
    - [Structural Patterns](#structural-patterns)
        - [Adapter](#adapter)
        - [Façade](#façade)
        - [Proxy (Substitute)](#proxy-substitute)
        - [Repository](#repository)
    - [Usage](#usage)
    - [Contributing](#contributing)
    - [License](#license)

## Introduction

(Provide a brief introduction to design patterns and the purpose of this repository.)

## Creational Patterns

### Factory

The Factory pattern defines an interface for creating an object but allows subclasses to alter the type of objects that will be created. It is useful when a class cannot anticipate the class of objects it must create.

### Builder

The Builder pattern is a creational design pattern used for constructing a complex object step by step. This pattern allows you to produce different types and representations of an object using the same construction code.

### Singleton

The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

### Prototype (Clone)

The Prototype pattern creates new objects by copying an existing object, known as the "prototype." This pattern is useful when the cost of creating an object is more expensive or complex than copying an existing one.

## Behavioral Patterns

### Observer (Publish-Subscribe)

The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

### Iterator

The Iterator pattern provides a way to access the elements of an aggregate object (like an array or a list) sequentially without exposing its underlying representation.

### Strategy

The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.

### Mediator

The Mediator pattern reduces coupling between classes by centralizing external communications.

### State

The State pattern allows an object to alter its behavior when its internal state changes.

## Structural Patterns

### Adapter

The Adapter pattern allows incompatible interfaces to work together.

### Façade

The Façade pattern provides a simplified interface to a group of sub-systems.

### Proxy (Substitute)

The Proxy pattern provides a placeholder for another object to control access to it.

### Repository

The Repository pattern acts as a bridge between the application's business logic and data source, providing a way to access domain objects. Useful for decoupling business logic from data retrieval.


## Usage

This repository is for educational purpose. Feel free to explore, see each design pattern, and run Main classes!

