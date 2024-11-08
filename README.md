# GitTest2
Testing git and github

This is the part of dev 2
This is the part of dev1


Conclusion:
Para hacer un merge primero se hace un pull request, dependiendo del contexto, se hara automaticamente o causara conflictos, si se mergea automaticamente no habra problema
simplemente se hara un commit indicando el merge
en cambio si hay conflictos, habra que cambiar de la rama que se encuentre a la rama de conflictos
y asi asi hacer un merge de la rama actual a la rama de conflictos:
git merge <rama actual> <rama destino>
git commit -am "resolviendo conflictos"
git push origin <rama destino>

y ya dependiendo de lo que se haga, hacer un merge de la rama destino a la rama main para poder tener
todo dentro del main otra vez