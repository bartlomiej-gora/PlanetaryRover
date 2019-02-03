# PlanetaryRover

## Ćwiczenie TDD:</br>
Stworzyć oprogramowanie dla kosmicznego łazika.</br>
Gliwicka Agencja kosmiczna stworzyła łazika planetarnego i teraz potrzebuje twojej pomocy.</br>
</br>
Łazik ma inforamcje o wielkości planety na której ląduje.</br>
Łazik może poruszać się do przodu, do tyłu. Skręcać w prawo i w lewo.</br>
</br>
Każdy ruch do tyłu lub do przodu zmienia położenie łazika.</br>
Połozenie okreslone jest prze metodę getPlacement() zwracającą obiekt Placement</br> 
z informacjami o wspołrzędnych łazika i tego w jakim kierunku jest skierowany (półnow, południe, wscóch zachów)</br>
</br>
### Zadane 1</br>
Zaprogramować metodę move(String), która będzie przyjmować łańcuch znaków w postaci:</br>
l - skręc w lewo (left)</br>
r - skręc w prawo (right)</br>
f - do przodu (forwar)</br>
b - do tyłu (back)</br>
</br>
### Zadanie 2.</br>
Planeta jest okrągła, więc należy zmowdyfikowac tak metodę móve, żeby po przejechaniu przez granicę obszaru</br> 
łazik wyjachł z drugiej strony "mapy" </br>
</br>
### Zadanie 3.</br>
Zmodyfikować tak program, aby na planecie pojawiły się przeszkody.</br>
Po natrafieniu na przeszkodę przy próbie poruszania się łazik powinen pozostać</br> 
w miejscu i nie wykonywać dalszych poleceń</br>
