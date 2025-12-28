create table store.users
(	
	id bigint not null auto_increment,
    fullname varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    primary key users_pk (id)
);
create table store.addresses
(
	id bigint not null auto_increment,
    street varchar(255) not null,
    city varchar(255) not null,
    zip varchar(255) not null,
    user_id bigint not null,
    primary key addresses_pk (id),
    constraint users_fk foreign key (user_id) references users(id)
);

