-- 1. Cadastrando os Períodos
INSERT INTO periodo (id, nome, epoca, clima, descricao) VALUES
(1, 'Triássico', '252 a 201 milhões de anos atrás', 'Árido e seco', 'O início da Era Mesozoica. Surgimento dos primeiros dinossauros pequenos e rápidos.'),
(2, 'Jurássico', '201 a 145 milhões de anos atrás', 'Úmido e tropical', 'A era dos grandes saurópodes e o surgimento das primeiras aves.'),
(3, 'Cretáceo', '145 a 66 milhões de anos atrás', 'Quente e úmido', 'O auge e o fim dos dinossauros. Surgimento das plantas com flores.');

-- 2. Cadastrando as Criaturas (Lista completa do ID 1 ao 14 com a coluna PESO)
INSERT INTO criatura (id, nome_cientifico, nome_popular, dieta, tamanho, peso, curiosidade, periodo_id) VALUES
(1, 'Coelophysis bauri', 'Coelophysis', 'Carnívoro', '3 metros', 30.0, 'Um dos primeiros dinossauros a dominar o planeta, era muito ágil e caçava em bandos.', 1),
(2, 'Brachiosaurus altithorax', 'Braquiossauro', 'Herbívoro', '25 metros de comprimento e 12 de altura', 56000.0, 'Seu pescoço longo permitia alcançar copas de árvores que outros dinossauros não chegavam.', 2),
(3, 'Tyrannosaurus rex', 'Tiranossauro Rex', 'Carnívoro', '12 metros', 8000.0, 'Sua mordida tinha uma pressão de quase 6 toneladas, a mais forte de qualquer animal terrestre.', 3),
(4, 'Triceratops horridus', 'Tricerátops', 'Herbívoro', '9 metros', 6000.0, 'Seu escudo craniano e os três chifres serviam tanto para se defender do T-Rex quanto para disputas.', 3),
(5, 'Spinosaurus aegyptiacus', 'Espinossauro', 'Carnívoro', '15 metros', 7000.0, 'O maior dinossauro carnívoro conhecido, tinha uma grande vela nas costas e era um excelente nadador adaptado para caçar peixes.', 3),
(6, 'Velociraptor mongoliensis', 'Velociraptor', 'Carnívoro', '2 metros', 15.0, 'Apesar de pequeno, era extremamente inteligente, rápido e caçava em bandos usando uma garra curva fatal em cada pata.', 3),
(7, 'Stegosaurus stenops', 'Estegossauro', 'Herbívoro', '9 metros', 4500.0, 'Famoso pelas grandes placas ósseas nas costas usadas para regulação térmica e pelos espinhos afiados na cauda para defense.', 2),
(8, 'Ankylosaurus magniventris', 'Anquilossauro', 'Herbívoro', '8 metros', 6000.0, 'Um verdadeiro tanque de guerra biológico, coberto por uma armadura de placas ósseas e com uma clava pesada na ponta da cauda.', 3),
(9, 'Allosaurus fragilis', 'Alossauro', 'Carnívoro', '9 metros', 2000.0, 'O maior predador do período Jurássico. Tinha braços fortes com garras afiadas e uma mandíbula que funcionava como um machado.', 2),
(10, 'Parasaurolophus walkeri', 'Parassaurolofos', 'Herbívoro', '10 metros', 2500.0, 'Possuía uma longa crista tubular na cabeça que servia para emitir sons de alerta ecoantes e ajudar na comunicação com o bando.', 3),
(11, 'Dilophosaurus wetherilli', 'Dilofossauro', 'Carnívoro', '6 metros', 4000.0, 'Conhecido pelas duas cristas paralelas no topo do crânio. Diferente dos filmes, não há evidências de que cuspia veneno.', 2),
(12, 'Carnotaurus sastrei', 'Carnotauro', 'Carnívoro', '8 metros', 1500.0, 'Um predador ultraveloz com pernas longas e dois chifres curtos na testa, lembrando a anatomia de um touro.', 3),
(13, 'Staurikosaurus pricei', 'Estauricossauro', 'Carnívoro', '2 metros', 30.0, 'Um dos dinossauros mais antigos do mundo, descoberto no Rio Grande do Sul (Brasil). Era um caçador bípede muito ágil.', 1),
(14, 'Irritator challengeri', 'Irritator', 'Carnívoro', '8 metros', 2000.0, 'Outro dino brasileiro, habitava a região da Bacia do Araripe. Tinha o focinho comprido igual ao de um crocodilo, ideal para pescar.', 3);

-- 3. Cadastrando as Regiões
INSERT INTO regiao (id, nome_local, estado, pais) VALUES
(1, 'Formação Hell Creek', 'Montana', 'EUA'),
(2, 'Bacia do Araripe', 'Ceará', 'Brasil');

-- 4. Cadastrando os Fósseis (Agora os IDs 1 e 3 existem lá em cima!)
INSERT INTO fossil (id, tipo_fossil, ano_descoberta, paleontologo, criatura_id, regiao_id) VALUES
(1, 'Crânio Completo', '1902', 'Barnum Brown', 3, 1),
(2, 'Fêmur Isolado', '1980', 'John Bell', 3, 1),
(3, 'Pegadas fossilizadas', '2004', 'Equipe UFRJ', 1, 2);