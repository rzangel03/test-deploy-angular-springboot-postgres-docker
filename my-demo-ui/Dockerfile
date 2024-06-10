# FROM node:10 AS builder
# WORKDIR /app
# COPY package*.json ./
# # RUN npm install -g @angular/cli@^7.0.0
# RUN npm install
# # RUN npx ngcc --properties es2023 browser module main --first-only --create-ivy-entry-points
# COPY . .
# RUN npm run build

FROM nginx
COPY ./dist/my-demo-ui /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf




