DROP TABLE IF EXISTS ws_weapons_primary;


CREATE TABLE ws_weapons_primary
(
    weapon_id SERIAL,
    weapon_name varchar(20) not null,
    attack_speed float not null,
    disposition float,
    damage_type varchar (20),
    amount_damage float,
    crit_chance float,
    crit_multi float,
    status_chance float,
    multi_shot float not null,
    reload_speed float not null,
    magazine_ammo integer not null,
    full_ammo integer not null,
    noise_level varchar(10) not null,
    PRIMARY KEY (weapon_id)
);

DROP TABLE IF EXISTS ws_primary_weapon;
CREATE TABLE ws_weapon_primary
(
    primary_weapon_id SERIAL,
    weapon_name varchar(20),
    attack_speed float,
    crit_chance float,
    crit_multi float,
    status_chance float,
    multi_shot float,
    reload_speed float,
    magazine_ammo integer,
    full_ammo integer,
    PRIMARY KEY (primary_weapon_id)
);

DROP TABLE IF EXISTS
CREATE TABLE weapon_damage
(
    wd_id SERIAL,
    weapon_id integer,
    wd_type varchar(20),
    wd_amount float,
    PRIMARY KEY (wd_id),
    FOREIGN KEY (weapon_id) REFERENCES ws_primary_weapon(weapon_id) ON DELETE RESTRICT

)