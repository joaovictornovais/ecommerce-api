INSERT INTO TB_USERS (name, email, phone, password) VALUES ('Arthur Rodrigues', 'arthur@gmail.com', '11987898765', 'senha123')
INSERT INTO TB_USERS (name, email, phone, password) VALUES ('Pedro Henrique', 'pedro@gmail.com', '11983746525', 'senha456')
INSERT INTO TB_USERS (name, email, phone, password) VALUES ('Mateus Meira', 'mateus@gmail.com', '11987687632', 'senha789')

INSERT INTO TB_ORDERS (moment, client_id, order_status) VALUES ('2023-07-27T12:27:12Z', 1, 1)
INSERT INTO TB_ORDERS (moment, client_id, order_status) VALUES ('2023-07-27T13:43:21Z', 1, 1)
INSERT INTO TB_ORDERS (moment, client_id, order_status) VALUES ('2023-07-27T18:53:55Z', 2, 2)
INSERT INTO TB_ORDERS (moment, client_id, order_status) VALUES ('2023-07-27T18:22:55Z', 3, 4)

INSERT INTO TB_CATEGORIES (name) VALUES ('Electronics')
INSERT INTO TB_CATEGORIES (name) VALUES ('Books')
INSERT INTO TB_CATEGORIES (name) VALUES ('Computers')

INSERT INTO TB_PRODUCTS (name, description, price, img_url) VALUES ('Pai Rico Pai Pobre', 'Livro de dicas financeiras', 39.90, '')
INSERT INTO TB_PRODUCTS (name, description, price, img_url) VALUES ('Mouse HyperX Pulsefire', 'Mouse gamer 32.000 dpi', 99.90, '')
INSERT INTO TB_PRODUCTS (name, description, price, img_url) VALUES ('GTX 1050ti', 'Placa de video feita para jogos', 39.90, '')

INSERT INTO TB_PRODUCTS_CATEGORIES (product_id, category_id) VALUES (1, 2)

INSERT INTO TB_ORDER_ITEM (order_id, product_id, quantity, price) VALUES (1, 1, 1, 39.90)
INSERT INTO TB_ORDER_ITEM (order_id, product_id, quantity, price) VALUES (2, 1, 1, 99.90)
INSERT INTO TB_ORDER_ITEM (order_id, product_id, quantity, price) VALUES (3, 1, 2, 79.80)



