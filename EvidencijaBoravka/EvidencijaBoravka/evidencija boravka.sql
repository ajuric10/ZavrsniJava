drop database if exists evidencija_boravka_u_bolnici;
create database evidencija_boravka_u_bolnici;
use evidencija_boravka_u_bolnici;


create table odjel(
    sifra int not null primary key auto_increment,
    naziv varchar(255)
);

create table boravak(

    sifra int not null primary key auto_increment,
    datumPrimitka date,
    datumOtpusta date,
    odjel int
);

create table pacijent(
    sifra int not null primary key auto_increment,
    ime varchar(255),
    prezime varchar(255)
);

create table lijecnik(
    sifra int not null primary key auto_increment,
    ime varchar(255),
    prezime varchar(255),
    pacijent int, 
    odjel int
);

alter table boravak add foreign key(odjel) references odjel(sifra);
alter table lijecnik add foreign key(pacijent) references pacijent(sifra);
alter table lijecnik add foreign key(odjel) references odjel(sifra);



insert into odjel(naziv) values("Odjel za infektologiju i dermatovenerologiju");
insert into odjel(naziv) values("Odjel za psihijatriju");
insert into odjel(naziv) values("Odjel za otorinolaringologiju");

insert into boravak(datumPrimitka, datumOtpusta,odjel) values('2022-04-22 ','2022-04-23 ',1);
insert into boravak(datumPrimitka, datumOtpusta,odjel) values('2022-04-12 ','2022-04-23 ',2);
insert into boravak(datumPrimitka, datumOtpusta,odjel) values('2022-04-2 ','2022-04-23 ',3);

insert into pacijent(ime,prezime) values("Ana","Jurić");
insert into pacijent(ime,prezime) values("Ana","Marić");
insert into pacijent(ime,prezime) values("Matej","Matko");

insert into lijecnik(ime,prezime,pacijent,odjel) values("Marko","Markić",1,1);
insert into lijecnik(ime,prezime,pacijent,odjel) values("Matija","Plenković",2,2);
insert into lijecnik(ime,prezime,pacijent,odjel) values("Marija","Jurić",3,3);



