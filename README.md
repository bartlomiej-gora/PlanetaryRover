# PlanetaryRover

Ćwiczenie TDD:
Stworzyć oprogramowanie dla kosmicznego łazika.
Gliwicka Agencja kosmiczna stworzyła łazika planetarnego i teraz potrzebuje twojej pomocy.

Łazik ma inforamcje o wielkości planety na której ląduje.
Łazik może poruszać się do przodu, do tyłu. Skręcać w prawo i w lewo.

Każdy ruch do tyłu lub do przodu zmienia położenie łazika.
Połozenie okreslone jest prze metodę getPlacement() zwracającą obiekt Placement 
z informacjami o wspołrzędnych łazika i tego w jakim kierunku jest skierowany (półnow, południe, wscóch zachów)

Zadane 1
Zaprogramować metodę move(String), która będzie przyjmować łańcuch znaków w postaci:
l - skręc w lewo (left)
r - skręc w prawo (right)
f - do przodu (forwar)
b - do tyłu (back)

Zadanie 2.
Planeta jest okrągła, więc należy zmowdyfikowac tak metodę móve, żeby po przejechaniu przez granicę obszaru 
łazik wyjachł z drugiej strony "mapy" 

Zadanie 3.
Zmodyfikować tak program, aby na planecie pojawiły się przeszkody.
Po natrafieniu na przeszkodę przy próbie poruszania się łazik powinen pozostać 
w miejscu i nie wykonywać dalszych poleceń
