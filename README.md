# SeguridadWs_Client
En este ejercicio se desarrolla un cliente que consumira un web service que requiere usuario y contraseña.
1. La estructura del proyecto:
![Imgur](http://i.imgur.com/myV6Qqi.png)
2. Se crea una conexión al web service `WsAuthImplService`
![Imgur](http://i.imgur.com/56x4abC.png)
3. Se inserta en el header de la petición el campo `Username` y `Password` con los valores de usurio y contraseña, y luego se llama al web service para su validación.
![Imgur](http://i.imgur.com/svd8z6Q.png)