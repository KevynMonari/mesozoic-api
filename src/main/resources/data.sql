-- 1. Cadastrando os Períodos
INSERT INTO periodo (id, nome, epoca, clima, descricao) VALUES
(1, 'Triássico', '252 a 201 milhões de anos atrás', 'Árido e seco', 'O início da Era Mesozoica. Surgimento dos primeiros dinossauros pequenos e rápidos.'),
(2, 'Jurássico', '201 a 145 milhões de anos atrás', 'Úmido e tropical', 'A era dos grandes saurópodes e o surgimento das primeiras aves.'),
(3, 'Cretáceo', '145 a 66 milhões de anos atrás', 'Quente e úmido', 'O auge e o fim dos dinossauros. Surgimento das plantas com flores.');

-- 2. Cadastrando as Criaturas (apontando para os IDs dos períodos acima)
INSERT INTO criatura (id, nome_cientifico, nome_popular, dieta, tamanho, curiosidade, periodo_id) VALUES
(1, 'Coelophysis bauri', 'Coelophysis', 'Carnívoro', '3 metros de comprimento', 'Um dos primeiros dinossauros a dominar o planeta, era muito ágil e caçava em bandos.', 1),
(2, 'Brachiosaurus altithorax', 'Braquiossauro', 'Herbívoro', '25 metros de comprimento e 12 de altura', 'Seu pescoço longo permitia alcançar copas de árvores que outros dinossauros não chegavam.', 2),
(3, 'Tyrannosaurus rex', 'Tiranossauro Rex', 'Carnívoro', '12 metros de comprimento e 8 toneladas', 'Sua mordida tinha uma pressão de quase 6 toneladas, a mais forte de qualquer animal terrestre.', 3),
(4, 'Triceratops horridus', 'Tricerátops', 'Herbívoro', '9 metros de comprimento e 6 toneladas', 'Seu escudo craniano e os três chifres serviam tanto para se defender do T-Rex quanto para disputas.', 3);

-- 3. Cadastrando as Regiões
INSERT INTO regiao (id, nome_local, estado, pais) VALUES
(1, 'Formação Hell Creek', 'Montana', 'EUA'),
(2, 'Bacia do Araripe', 'Ceará', 'Brasil');

-- 4. Cadastrando os Fósseis (Amarrando com o ID da Criatura e o ID da Região)
INSERT INTO fossil (id, tipo_fossil, ano_descoberta, paleontologo, criatura_id, regiao_id) VALUES
(1, 'Crânio Completo', '1902', 'Barnum Brown', 3, 1), -- Crânio de T-Rex em Hell Creek
(2, 'Fêmur Isolado', '1980', 'John Bell', 3, 1),    -- Fêmur de T-Rex em Hell Creek
(3, 'Pegadas fossilizadas', '2004', 'Equipe UFRJ', 1, 2); -- Pegadas de Coelophysis no Ceará