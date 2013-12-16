# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tweet (
  id                        bigint not null,
  num                       integer,
  creation_date             timestamp,
  label                     varchar(255),
  Tweet_userID              varchar(255),
  constraint pk_tweet primary key (id))
;

create table utilisateur (
  email                     varchar(255) not null,
  sexe                      varchar(255),
  date_inscription          timestamp,
  username                  varchar(255),
  password                  varchar(255),
  constraint pk_utilisateur primary key (email))
;

create sequence tweet_seq;

create sequence utilisateur_seq;

alter table tweet add constraint fk_tweet_user_1 foreign key (Tweet_userID) references utilisateur (email) on delete restrict on update restrict;
create index ix_tweet_user_1 on tweet (Tweet_userID);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists tweet;

drop table if exists utilisateur;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists tweet_seq;

drop sequence if exists utilisateur_seq;

