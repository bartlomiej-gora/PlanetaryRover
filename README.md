# PlanetaryRover

## Ćwiczenie TDD:</br>
Stworzyć oprogramowanie dla kosmicznego łazika.</br>
Gliwicka Agencja kosmiczna stworzyła łazika planetarnego i teraz potrzebuje twojej pomocy.</br>
</br>
Łazik ma informacje o wielkości planety na której ląduje.</br>
Łazik może poruszać się do przodu, do tyłu. Skręcać w prawo i w lewo.</br>
</br>
Każdy ruch do tyłu lub do przodu zmienia współrzędne (x,y) łazika.</br>
Każdy obrót zmienia kierunek jego ustawienia (północ, południe, wschód, zachód)</br>
Połozenie określone jest przez metodę getPlacement() zwracającą obiekt Placement</br> 
z informacjami o współrzędnych łazika i tego w jakim kierunku jest skierowany (północ, południe, wschód, zachód)</br>
</br>
### Zadane 1</br>
Zaprogramować metodę move(String), która będzie przyjmować łańcuch znaków w postaci:</br>
l - skręć w lewo (left)</br>
r - skręć w prawo (right)</br>
f - do przodu (forwar)</br>
b - do tyłu (back)</br>
</br>
### Zadanie 2.</br>
Planeta jest okrągła, więc należy zmodyfikować tak metodę move, żeby po przejechaniu przez granicę obszaru</br> 
łazik wyjechał z drugiej strony "mapy" </br>
</br>
### Zadanie 3.</br>
Zmodyfikować tak program, aby na planecie pojawiły się przeszkody.</br>
Po natrafieniu na przeszkodę przy próbie poruszania się łazik powinien pozostać</br> 
w miejscu i nie wykonywać dalszych poleceń</br>
