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

Comandos empleados:

--git init para crear un repositorio nuevo
--git clone para descargar un repositorio
--git add para preparar los cambios que se haran, se guardara de manera local una vez se haga el commit
--git push para enviar nuestros commits (cambios confirmados) del repo local a la nube
--git branch <name> para crear una rama nueva
--git checkout <branchName> para cambiar de rama
--git merge <branch> toma los cambios de "branch" y los integra a la rama actual (en el que estamos)
--git commit -m "Manda un mensaje para dar a saber que se hizo"
--git commit -am "Guarda cambios de manera local y se envia un mensaje siempre y cuando git conozca nuestros archivos, es decir, que se hayan guardado o añadido anteriormente"
--git reset --hard es para retroceder hacia el ultimo commit, sirve cuando estas haciendo cambios pero salio algun error inesperado y quieres regresar al codigo como lo tenias antes,es donde entra este comando