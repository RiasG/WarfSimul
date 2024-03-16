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

DROP TABLE IF EXISTS ws_weapons_primary;

CREATE TABLE ws_weapons_primary
(
    weapon_id SERIAL,
    weapon_name varchar(20),
    attack_speed float,
    disposition float,
    damage_type varchar (20),
    amount_damage float,
    crit_chance float,
    crit_multi float,
    status_chance float,
    multi_shot float,
    reload_speed float,
    magazine_ammo integer,
    full_ammo integer,
    noise_level varchar(10),
    PRIMARY KEY (weapon_id)
);