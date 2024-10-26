create database HotelCostaAzul
use HotelCostaAzul
INSERT INTO tb_habitacion (numero, tipo, precio, capacidad, descripcion, url_imagen) VALUES
('101', 'Simple', 100.00, 1, 'Habitación sencilla con cama matrimonial.', 'https://media-cdn.tripadvisor.com/media/photo-s/03/f9/ef/01/pequeno-gran-hotel.jpg'),
('102', 'Doble', 150.00, 2, 'Habitación doble con dos camas individuales.', 'https://media-cdn.tripadvisor.com/media/photo-s/0e/1e/f1/f2/habitacion-doble-dos.jpg'),
('201', 'Suite', 250.00, 3, 'Suite con vista al mar y jacuzzi.', 'https://www.guiadehoteles.es/img/jacuzzi-vistas-al-mar-portada.jpg'),
('202', 'Familiar', 200.00, 4, 'Habitación familiar con dos camas matrimoniales.', 'https://sognare-inova-com-mx.s3.us-west-2.amazonaws.com/notas/wp-content/uploads/2022/06/23171519/1-3.jpg'),
('301', 'Deluxe', 300.00, 2, 'Habitación deluxe con servicio de spa.', 'https://images.squarespace-cdn.com/content/v1/600b53d0d5ef08628d370b52/1617699131158-MEVJWH97GIOSMVR9V0WG/HAB_20_JACUZZI_BB.jpg'),
('302', 'Ejecutiva', 180.00, 1, 'Habitación ejecutiva ideal para viajes de negocios.', 'https://www.hoteltamboreal.com/uploads/rooms/habitacion-ejecutiva-individual-c-070421002838.jpg'),
('303', 'Romántica', 220.00, 2, 'Habitación romántica con decoración especial.', 'https://t1.uc.ltmcdn.com/es/posts/0/8/4/como_decorar_una_habitacion_para_una_noche_romantica_2480_orig.jpg'),
('401', 'Presidencial', 500.00, 4, 'Habitación presidencial con todos los lujos.', 'https://www.swissotel.com/assets/0/92/2119/2178/2217/2219/6442451722/83eb355a-2f1c-49d8-ad51-1ccce3b52b33.jpg'),
('402', 'Con jacuzzi', 350.00, 2, 'Habitación con jacuzzi privado.', 'https://estaticos.turiaventura.com/images/habitacion-hotel-jacuzzi/hotel-jacuzzi/530x300/hotel-jacuzzi-530x300-1.jpg'),
('403', 'Suite Familiar', 400.00, 5, 'Suite familiar con vista al jardín.', 'https://cabanasdellago.com.ec/wp-content/uploads/2023/05/matrimonil-jardin-exterior-1.jpeg');


select * from tb_usuario