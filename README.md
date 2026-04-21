# ☕ Contador de Café

Aplicación Android desarrollada con **Jetpack Compose** que permite llevar un conteo de tazas de café consumidas durante el día.

---

## 📚 Unidad 2: Construir la UI de la Aplicación

### Conceptos Clave

- **State (Estado):** Representación de los datos que pueden cambiar a lo largo del tiempo dentro de una pantalla.
- **`remember`:** Función de Compose que permite recordar un valor a través de recomposiciones.
- **`mutableStateOf`:** Crea un estado mutable observable; cuando su valor cambia, Compose recompone automáticamente los componentes que lo leen.
- **Interacción con botones:** Uso de `Button` y `onClick` para capturar eventos del usuario.
- **Condicionales en Kotlin:** Uso de `if/else` para mostrar u ocultar elementos de la UI según el estado.

---

## 🚀 Funcionalidades

- Pantalla principal con un **contador** que comienza en **0**.
- Botón **"Añadir taza"** que incrementa el contador en **+1** con cada pulsación.
- Botón **"Reiniciar"** que restablece el contador a **0**.
- Cuando el contador llega a **10**, se muestra el mensaje: **"¡Demasiada cafeína!"**

---

## 🏗️ State Hoisting (Elevación de Estado)

El proyecto aplica el patrón de **State Hoisting**, que consiste en elevar el estado de un composable hijo hacia el composable padre. Esto permite:

- Mantener los composables **sin estado** (stateless), haciéndolos más reutilizables y fáciles de probar.
- Tener una **única fuente de verdad** para el estado de la aplicación.
- Facilitar el **flujo de datos unidireccional**: el estado baja del padre al hijo, y los eventos suben del hijo al padre.

---

## 📋 Instrucciones

1. Crea una **variable de estado** para el contador numérico utilizando `remember` y `mutableStateOf`.
2. Añade un botón de **"Incrementar"** que sume 1 al contador con cada clic.
3. Añade un botón de **"Reiniciar"** que restablezca el contador a 0.

### 🎯 Reto

Si el contador es **mayor a 10**, muestra un **mensaje de advertencia en color rojo** en la pantalla.

---

## 📦 Entregable

Una aplicación Android funcional que incluya:

- [ ] Pantalla con contador iniciando en 0.
- [ ] Botón "Añadir taza" (+1).
- [ ] Botón "Reiniciar" (vuelve a 0).
- [ ] Mensaje "¡Demasiada cafeína!" al llegar a 10 tazas.
- [ ] Mensaje de advertencia en **rojo** cuando el contador supera 10.
- [ ] Implementación del patrón **State Hoisting**.

---

## 🛠️ Tecnologías Utilizadas

- [Kotlin](https://kotlinlang.org/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- Android Studio