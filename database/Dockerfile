# Use official MySQL image as base
FROM mysql:latest

# Copy the initialization scripts into the image
COPY ./init.sql /docker-entrypoint-initdb.d/
COPY ./sample-data.sql /docker-entrypoint-initdb.d/

EXPOSE 3306