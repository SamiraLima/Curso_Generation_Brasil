import { ValidationPipe } from '@nestjs/common';
import { NestFactory } from '@nestjs/core';
import { DocumentBuilder, SwaggerModule } from '@nestjs/swagger';
import { AppModule } from './app.module';

async function bootstrap() {

  const app = await NestFactory.create(AppModule);

  const config = new DocumentBuilder()
  .setTitle('Todo lista tarefa Mobile')
  .setDescription('Projeto Todo lista tarefa Mobile')
  .setContact("Samira Santos","http://www.generationbrasil.online","sasalima609@gmail.com")
  .setVersion('1.0')
  .addBearerAuth()
  .build()
  const document = SwaggerModule.createDocument(app, config)
  SwaggerModule.setup('/swagger', app, document)

  process.env.TZ = '-03:00'

  app.useGlobalPipes(new ValidationPipe())

  await app.listen(process.env.PORT || 3000);

  app.enableCors()
}
bootstrap();
