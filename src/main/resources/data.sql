insert into users (email_id,contact_number)
values ('user1@gmail.com',1232132);

insert into users (email_id,contact_number)
values ('user2@gmail.com',127827);

insert into purchase (order_id, amount, category, date_of_purchase, product_id, purchased_by, quantity)
values (1, 124.90, 101, current_timestamp(), 10001, 'anitha',1);

insert into purchase (order_id, amount, category, date_of_purchase, product_id, purchased_by, quantity)
values (1, 200.90, 101, current_timestamp(), 10002, 'anitha',1);

insert into product (product_id, product_name, category, price)
values (10001,'addidas running shoes',101,124.90);

insert into product (product_id, product_name, category, price)
values (10002,'addidas sneakers',101,200.90);

insert into admin (username, password)
values ('admin','12345A');