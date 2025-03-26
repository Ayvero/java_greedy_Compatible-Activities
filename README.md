#  Maximizar el Número de Actividades Compatibles

## Descripción del Problema
Dado un conjunto de **n** actividades que requieren el uso exclusivo de un recurso (como una sala de conferencias), cada una con un tiempo de inicio **cᵢ** y un tiempo de finalización **fᵢ**, el objetivo es seleccionar la mayor cantidad de actividades compatibles. 

Dos actividades **i** y **j** son compatibles si sus intervalos **[cᵢ, fᵢ)** y **[cⱼ, fⱼ)** no se superponen, es decir, si **cᵢ ≥ fⱼ** o **cⱼ ≥ fᵢ**.

## Enfoque
- **Algoritmo Greedy (Codicioso)**: La estrategia óptima consiste en seleccionar siempre la actividad que termine más temprano, permitiendo así la inclusión de la mayor cantidad posible de actividades posteriores.
- **Ordenamiento**: Se ordenan las actividades en función de su tiempo de finalización (**fᵢ**) y luego se seleccionan iterativamente según las condiciones de compatibilidad.

## Aplicaciones
Este problema es útil en diversas áreas:
- **Planificación y Asignación de Recursos**: Gestión de salas de reuniones, planificación de producción y programación de tareas.
- **Sistemas Operativos**: Planificación de procesos y asignación de tiempo de CPU.
- **Gestión de Eventos**: Optimización de horarios de reuniones y planificación de agendas.

----------------------------------------

# Maximizing the Number of Compatible Activities

## Problem Description
Given a set of **n** activities that require exclusive use of a resource (such as a conference room), each with a start time **cᵢ** and an end time **fᵢ**, the goal is to select the maximum number of non-overlapping activities. 

Two activities **i** and **j** are compatible if their intervals **[cᵢ, fᵢ)** and **[cⱼ, fⱼ)** do not overlap, meaning **cᵢ ≥ fⱼ** or **cⱼ ≥ fᵢ**.

## Approach
- **Greedy Algorithm**: The optimal approach is to always select the activity that finishes the earliest, ensuring the maximum number of subsequent activities can fit.
- **Sorting**: The activities are sorted in ascending order by their end time (**fᵢ**), and then iteratively selected based on compatibility conditions.

## Applications
This problem is widely used in:
- **Scheduling and Resource Allocation**: Conference room management, task scheduling, and production planning.
- **Operating Systems**: Process scheduling and CPU time allocation.
- **Event Management**: Optimizing meeting times and agenda planning.
