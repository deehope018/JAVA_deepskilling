create table customers (
    customerid number primary key,
    customername varchar(50),
    age number,
    balance number,
    isvip varchar(10)
);
insert into customers values (1, 'deepak', 65, 5000, 'true');
insert into customers values (2, 'sriram', 45, 2000, 'false');
insert into customers values (3, 'priyanka', 70, 12000, 'true');
insert into customers values (4, 'anita', 55, 9500, 'false');
commit;
select * from customers;
set serveroutput on;

declare
    cursor cust_cur is
        select customerid,
               customername,
               balance
        from customers;
begin
    for rec in cust_cur loop
        if rec.balance < 10000 then
            update customers
            set isvip = 'true'
            where customerid = rec.customerid;
            dbms_output.put_line(
                rec.customername ||
                ' promoted to VIP status.'
            );
        end if;
    end loop;
    commit;
    dbms_output.put_line('VIP update completed.');
end;
/

select * from customers;