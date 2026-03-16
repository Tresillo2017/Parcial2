# TESTING - Análisis de Caja Negra

Este documento contiene el análisis de caja negra para la clase `Empleado`.

## Parámetros analizados
+
| Parámetro | Tipo | Restricciones |
|---|---|---|
| nombre | String | No vacío, al menos dos palabras (nombre y apellido) |
| cargo | Cargo | Debe pertenecer a la lista definida en `Cargo` |
| salario | double | No vacío, numérico, >= SALARIO_MINIMO |

## Casos válidos
+
| Caso | nombre | cargo | salario | Resultado esperado |
|---|---:|---|---:|---|
| V1 | "Juan Pérez" | DESARROLLADOR | 50000 | Creación OK |
| V2 | "Ana María" | DISENADOR | 30000 | Creación OK (igual al mínimo) |

## Casos no válidos
+
| Caso | nombre | cargo | salario | Resultado esperado |
|---|---|---|---:|---|
| N1 | "" | DESARROLLADOR | 40000 | Excepción por nombre inválido |
| N2 | "SoloNombre" | GERENTE | 50000 | Excepción por no contener apellido |
| N3 | "Luis Pérez" | null | 40000 | Excepción por cargo nulo |
| N4 | "Laura Ruiz" | ADMINISTRATIVO | 1000 | Excepción por salario por debajo del mínimo |

