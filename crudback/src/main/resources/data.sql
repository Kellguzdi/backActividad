INSERT INTO authors (id, name) VALUES
                                   (1, 'Juan Pérez'),
                                   (2, 'María López'),
                                   (3, 'Carlos García'),
                                   (4, 'Ana Fernández'),
                                   (5, 'Luis González'),
                                   (6, 'Sofía Rodríguez'),
                                   (7, 'José Martínez'),
                                   (8, 'Laura Hernández'),
                                   (9, 'Patricia Gómez'),
                                   (10, 'Manuel Jiménez');

-- Insertando registros en la tabla `categories`
INSERT INTO categories (id, name_category) VALUES
                                               (1, 'Ficción'),
                                               (2, 'No Ficción'),
                                               (3, 'Educativo'),
                                               (4, 'Ciencia Ficción'),
                                               (5, 'Biografía'),
                                               (6, 'Autoayuda'),
                                               (7, 'Historia'),
                                               (8, 'Infantil'),
                                               (9, 'Cocina'),
                                               (10, 'Arte');

-- Insertando registros en la tabla `books`
INSERT INTO books (id, image, issue_date, title, author_id, genero_id) VALUES

                                                                           (1, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2021, 'El viaje del tiempo', 1, 1),
                                                                           (2, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2022, 'La realidad detrás del espejo', 2, 2),
                                                                           (3, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2020, 'Aprendiendo SQL', 3, 3),
                                                                           (4, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2019, 'Las estrellas son nuestro hogar', 4, 4),
                                                                           (5, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2018, 'Vida de un viajero', 5, 5),
                                                                           (6, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2021, 'Encuentra tu camino', 6, 6),
                                                                           (7, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2017, 'Relatos del pasado', 7, 7),
                                                                           (8, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2022, 'Aventuras de Luna', 8, 8),
                                                                           (9, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2020, 'Sabores del mundo', 9, 9),
                                                                           (10, 'https://static.wikia.nocookie.net/leagueoflegendsoficial/images/c/c3/Ashe_loading_screen.jpg/revision/latest?cb=20191006200206&path-prefix=es', 2019, 'El arte de la creación', 10, 10);