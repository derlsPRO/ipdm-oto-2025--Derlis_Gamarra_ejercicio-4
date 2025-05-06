# 💼 Tarjeta de Presentación – Jetpack Compose

**Tarjeta de Presentación** es una aplicación creada con **Jetpack Compose** que simula una tarjeta personal digital. Muestra de forma clara y ordenada información básica de una persona como el nombre, el cargo y los datos de contacto. Este proyecto fue realizado como parte de la materia *Programación en Dispositivos Móviles*, integrando conceptos de diseño visual y estructuración de UI en Compose.

---

## 📱 ¿Qué muestra esta app?

La pantalla se divide en dos secciones principales:

1. **Perfil profesional:**
   - Imagen o logotipo superior
   - Nombre completo (Derlis Gamarra)
   - Título o descripción personal (por ejemplo, “Desarrollador Android Apasionado”)

2. **Información de contacto:**
   - Teléfono
   - Usuario de red social (ej: @derlsPRO)
   - Dirección de correo electrónico

Cada dato está acompañado de un ícono representativo y alineado correctamente.

---

## 🧩 Componentes utilizados

- `Column()` y `Row()` para estructurar el layout.
- `Image()` para mostrar el logotipo o imagen superior.
- `Text()` con `fontSize`, `fontWeight`, `color` para personalizar textos.
- `Icon()` junto a texto para representar teléfono, redes y email.
- `Modifier.fillMaxSize()`, `padding()`, `Alignment`, `Arrangement` para organización visual.
- `Material Icons` para íconos de contacto.

---

## 🎨 Estilo y alineación

- Todo el contenido está **centrado vertical y horizontalmente**.
- El nombre tiene estilo **negrita** y tamaño grande (`28sp`).
- La descripción profesional y los datos de contacto usan tamaños y colores adecuados.
- Íconos en verde Android (`Color(0xFF3DDC84)`), acordes al diseño Material.

---

## 🛠️ Tecnologías utilizadas

- Kotlin + Jetpack Compose
- Android Studio
- Material 3
- Uso de recursos locales (`drawable`) y `Icons.Default`

---

## 📂 Recursos

- Imagen: `android_logo.png` o similar ubicada en `res/drawable`
- Íconos: importados desde `androidx.compose.material.icons`

---

## 🚀 Cómo probar

1. Cloná o abrí el proyecto en Android Studio.
2. Verificá que la imagen esté en `res/drawable` y se llame igual que en el código.
3. Ejecutá el proyecto en un emulador o dispositivo.
4. Observá cómo se adapta la presentación a la pantalla y se muestra de forma profesional.

---

## 🧑‍🎓 Autor

- **Nombre:** Derlis Gamarra  
- **Materia:** Programación en Dispositivos Móviles  
- **Universidad:** Universidad Autónoma de Asunción  

---

Esta tarjeta representa una forma profesional, moderna y adaptable de presentarte con estilo y claridad en aplicaciones Android. 👨‍💻📱

