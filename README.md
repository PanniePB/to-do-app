# TO-DO APP

## MVP

- CRUD-enabled TSX app with Spring Boot backend 
- Polished
- All endpoints must be error handled such that they return the correct status codes and messages.
- Implement a logging strategy for requests being processed 
- Use spring swagger 

## Design Goals 

- Simple front-end using modals to add/edit Items
- Back-end configured in Spring with model mapper validation

## Features

- Create and update items using modals
- Fetches items from DB and displays them on window load
- Delete item functionality
- Toast notifications when items are added/edited/deleted or fails to do so
- Create and Edit modals use React Hook Form and specifically the Controller component (from RHF) to update the state as the Items are typed out
- Swagger Documentation
- Logging Strategy on back-end 
- Service and Controller layer on back-end to handle and validate data
- Entity and DTOs establishing title, completion status and when the item was added/last updated
