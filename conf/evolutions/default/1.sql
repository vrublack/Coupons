# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table business (
  bemail                        varchar(255) not null,
  bname                         varchar(255),
  password                      varchar(255),
  constraint pk_business primary key (bemail)
);

create table category (
  catid                         integer not null,
  cname                         varchar(255),
  cdescription                  varchar(255),
  constraint pk_category primary key (catid)
);
create sequence category_seq;

create table coupon (
  id                            bigint not null,
  name                          varchar(255),
  description                   varchar(255),
  promocode                     varchar(255),
  discount_rate                 float,
  expiration_date               varchar(255),
  bemail                        varchar(255),
  constraint pk_coupon primary key (id)
);
create sequence coupon_seq;

create table favorite (
  key                           varchar(255) not null,
  cookie                        varchar(255),
  couponid                      integer,
  constraint pk_favorite primary key (key)
);

create table user (
  cookie                        varchar(255) not null,
  location                      varchar(255),
  constraint pk_user primary key (cookie)
);


# --- !Downs

drop table if exists business;

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists coupon;
drop sequence if exists coupon_seq;

drop table if exists favorite;

drop table if exists user;

