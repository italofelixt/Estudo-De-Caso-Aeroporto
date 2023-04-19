

# Estudo de caso: Aeroporto

## Requisitos:
• Aviões fazem vôos entre aeroportos e um vôo é sempre entre dois aeroportos(origem e destino).

• Cada vôo possui um número que o identifica.

• Cada Aeroporto possui um número variável de pistas, terminais e hangares, mas deve, obrigatoriamente,
possuir ao menos uma pista e uma torre de controle. Cada avião, aeroporto, pista, terminal e torre de controle
devem possuir um número único de identificação para que possa haver o tráfego aéreo.

• Alguns hangares são utilizados para estacionamento e outros para manutenção das aeronaves.

• Um avião pode ser considerado como sendo de asa fixa ou helicóptero.

• As características de cada aparelho são diferentes, como por exemplo:
– um helicóptero não necessita de pista para pousar ou decolar. Entretanto, também possuem características semelhantes, como por exemplo:

• ambos necessitam de pilotos, utilizam combustível e possuem motor. Dependendo do tipo de aeronave, pode haver também a necessidade de um co-piloto.

• Vôos transportam passageiros e todos os vôos são registrados numa base central que pode ser acessada por todos os aeroportos.

• Cada aeroporto possui Radares que fazem parte da torre de controle.

• Na torre de controle, deve existir ao menos um controlador, sendo que em aeroportos maiores e mais movimentados, o número pode ser muito maior.

• Os pilotos podem solicitar à torre de controle, através de seus controladores, os procedimentos de Pouso ou de decolagem.

• Em ambos os casos, os vôos podem ser colocados em listas de espera.

• Nos pousos, Caso o aeroporto não possua condições para receber o vôo, o controlador pode solicitar uma relação de aeroportos abertos e dirigir o vôo para um aeroporto alternativo.

• A administração deve manter o cadastro de vôos e pode também localizar os aviões que estiverem em solo, no aeroporto.

• Em caso de pouso, o piloto entra em contato com o controlador e solicita os procedimentos necessários.

• O controlador solicita ao sistema que informe os procedimentos de pouso para o vôo cujo número foi fornecido pelo piloto.

• O sistema solicita que o objeto Vôo informe os dados necessários.

• Faz parte dos atributos do objeto Vôo as informações do tipo de avião. Assim sendo o objeto solicita ao objeto Avião as características físicas da aeronave.

• As informações são repassadas à interface que, de posse desses dados, solicita ao objeto Pista as informações sobre a pista adequada ao tipo de aeronave.

• Ocorre, entretanto, que as condições climáticas e outros fatores físicos podem influenciar no tipo de pista a ser utilizada.

• Desse modo, o objeto Pista necessita informações do Radar para que seja escolhida a pista adequada.

• As informações obtidas são repassadas à interface e o controlador informa ao piloto os procedimentos de pouso.
