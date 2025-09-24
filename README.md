# 🚗 DasherAnalyst PRO

**Analizador inteligente de órdenes para conductores de DoorDash, Uber Eats y similares**

![DasherAnalyst](https://img.shields.io/badge/Version-1.0.0-brightgreen)
![Platform](https://img.shields.io/badge/Platform-Android-blue)
![License](https://img.shields.io/badge/License-MIT-orange)

Una aplicación web progresiva (PWA) que ayuda a los conductores de delivery a analizar la rentabilidad de las órdenes en tiempo real y alcanzar sus metas de ingresos por hora.

## ✨ Características Principales

### 📊 Análisis Inteligente de Órdenes
- **Cálculo automático** de $ por milla/km
- **Recomendaciones instantáneas**: ✅ Aceptar, 🟡 Considerar, ❌ Rechazar
- **Reglas personalizables** de rentabilidad

### 🎯 Sistema de Metas Horarias
- **Meta personalizable** (ej: $20, $25, $30 por hora)
- **Barra de progreso visual** en tiempo real
- **Tiempo restante estimado** para alcanzar la meta
- **Estadísticas de sesión**: órdenes aceptadas, ganancia total

### 📱 Experiencia Optimizada
- **Interfaz móvil-first** diseñada para uso en carretera
- **Funciona offline** después de la primera carga
- **Rápida y ligera** - sin anuncios ni tracking

## 🚀 Cómo Usar

### Uso Online (Recomendado)
1. **Abre la app**: [https://kyo.github.io/dasheranalyst](https://kyo.github.io/dasheranalyst)
2. **Agrega a tu pantalla de inicio** (desde el menú del navegador)
3. **¡Listo!** Usa como app nativa

### Instalación como APK
1. **Descarga el APK** desde [Releases](https://github.com/kyo/dasheranalyst/releases)
2. **Habilita "Orígenes desconocidos"** en ajustes de seguridad
3. **Instala y ejecuta**

## 💡 Reglas de Rentabilidad por Defecto

| Categoría | Rango | Recomendación |
|-----------|-------|---------------|
| **Excelente** | > $2.00 por milla | ✅ Aceptar inmediatamente |
| **Considerar** | $1.50 - $2.00 por milla | 🟡 Evaluar tráfico/ubicación |
| **No rentable** | < $1.50 por milla | ❌ Rechazar |

## 🛠️ Personalización

### Ajustar Reglas de Rentabilidad
Edita los valores en el código:
```javascript
// En la función analizarOrden()
if (dolaresPorMilla >= 2.0) {        // Excelente
} else if (dolaresPorMilla >= 1.5) { // Considerar
} else {                             // No rentable
}
