# Этап сборки
FROM node:22-alpine AS builder

WORKDIR /app

# Кэшируем зависимости
COPY package.json package-lock.json ./
RUN npm ci

# Копируем исходники и собираем
COPY . .
RUN npm run build

# Этап запуска
FROM nginx:alpine

# Копируем кастомный конфиг Nginx (для SPA-роутинга)
COPY nginx.conf /etc/nginx/conf.d/default.conf

# Копируем собранную статику
COPY --from=builder /app/dist /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
