# Java Library for CRUD Development with Spring Boot and JPA

This library in an implementation of the core library:

https://github.com/Camilo2102/web-starter

Provides an agile and straightforward solution for creating CRUD (Create, Read, Update, Delete) operations and their respective endpoints in Spring Boot applications using annotations, compatible with Netflix Eureka(disable with application.propeties "eureka.client.enabled=false") redy to use with SQL databases(Requiere a SQl JDBC) available in Sonatype Maven Central:

https://central.sonatype.com/artifact/cloud.webgen.web.starter.sql/web-sql-starter

## Main Features

- **Automatic CRUD Endpoint Generation**: With a simple annotation, the endpoints for handling CRUD operations of an entity are automatically created.
- **Generic CRUD Implementation**: A generic CRUD service transparently handles CRUD operations for any type of entity.
- **Audit Sql Repository**: Thanks to the `AuditSqlRepository` interface, you can use the core library with all SQL databases.
- **Audit Sql Model**: The `AuditSqlModel` class provides a base structure for audit SQL registers handling and common fields.

## Core Components

The library consists of the following core components:

1. `AuditSqlRepository` interface
2. `AuditSqlModel` class

## Usage

1. Define in application.propeties your Driver, and hibernate properties
2. Create a @Entity marked class, make that this extends the `AuditSqlModel` and annotate it with `@AutoControlable`.
3. Define a @Repostiry marked interface and extends `AuditSqlRepository`.
4. The library will automatically generate the CRUD endpoints for your entity.

## Application.Properties example with PostgreSQL

Spring properties

- spring.application.name=your-app-name

All your mongodb config

- spring.datasource.url=your-sql-db-uri
- spring.datasource.username=your-sql-db-username
- spring.datasource.password=your-sql-db-password

Hibernate Config:

- spring.jpa.properties.hibernate.hbm2ddl.auto=create
- spring.datasource.driver-class-name=org.postgresql.Driver
- spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

Requiered cors data

- cors.allowed-origin=http://localhost:3000
