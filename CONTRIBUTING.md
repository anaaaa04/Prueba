# Convención de nombres en este repositorio

## Ramas
- feature/<descripcion> → para nuevas funcionalidades
- fix/<descripcion> → para corregir errores
- hotfix/<descripcion> → para arreglos urgentes en producción
- release/v<version> → para preparar una versión

Ejemplos:
- feature/login-usuario
- fix/arreglo-contador
- hotfix/error-produccion
- release/v1.0.0

## Commits
Formato: <tipo>(<alcance opcional>): <mensaje corto>

Tipos: feat, fix, docs, refactor, test, chore, build, ci

Ejemplos:
- feat(contador): agregar función de reinicio
- fix(contador): corregir bug al llegar a 100
- docs: actualizar instrucciones en README

## Tags
Usar [SemVer](https://semver.org/):  
- v1.0.0, v1.1.0, v1.1.1
