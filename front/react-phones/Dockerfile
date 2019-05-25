FROM node

RUN mkdir /usr/src/app

COPY . /usr/src/app

WORKDIR /usr/src/app

ENV PATH /usr/src/app/node_modules/.bin:$PATH

RUN yarn run build

CMD ["npm","start"]



#FROM mhart/alpine-node:11 AS builder
#WORKDIR /app
#COPY . .
#RUN yarn run build
#
#FROM mhart/alpine-node
#RUN yarn global add serve
#WORKDIR /app
#COPY --from=builder /app/build .
#CMD ["serve", "-p", "80", "-s", "."]
