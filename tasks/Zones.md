# Zones #

[Back to readme](/README.md)

### General description ###

That's the case from a real project.

City is divided by transport zones and a user can ask for specific zones.
The task is to understand (based on initial state of the zones in the city) whether
the user can travel through requested zones.

Initial state is defined by a list of Zone objects. Each Zone object may contain a list of it's neighbours.
Link is unidirectional but can be used as bidirectional.

For example, if zone A has a neighbour B then zones A and B are considered as connected, even if B doesn't have A as a neighbour.

Let's imagine the following state: A-B-C-D-E. Some samples:

* Journey with zones A, B and C is allowed
* Journey with zones A, B and D is not allowed, because in order to travel with these zones the user has to go through zone C
* Journey with zones A, B, C and D is allowed
  

### Input and expected output ###
* Input : List of zones (city map) and list of requested zones
* Output : true if the user can travel through requested zones, false otherwise



Так обстоит дело с реальным проектом.

Город разделен транспортными зонами, и пользователь может запросить конкретные зоны.
Задача состоит в том, чтобы понять (исходя из начального состояния зон в городе), независимо от того,
пользователь может путешествовать по запрошенным зонам.

Начальное состояние определяется списком объектов зоны. Каждый объект Zone может содержать список его соседей.
Ссылка является однонаправленной, но может использоваться как двунаправленная.

Например, если зона A имеет соседний B, тогда зоны A и B считаются связанными, даже если B не имеет A в качестве соседа.

Представим себе следующее состояние: A-B-C-D-E. Некоторые образцы:

* Путешествие с зонами A, B и C разрешено
* Путешествие с зонами A, B и D не допускается, поскольку для перемещения по этим зонам пользователь должен пройти через зону C
* Путешествие с зонами A, B, C и D разрешено
  

### Входные и ожидаемые выходные данные ###
* Вход: Список зон (карта города) и список запрашиваемых зон
* Выход: истинно, если пользователь может проехать через запрошенные зоны, false в противном случае