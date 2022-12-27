import { Module } from '@nestjs/common';
import { TypeOrmModule } from '@nestjs/typeorm';
import { AppController } from './app.controller';
import { Categoria } from './categoria/entities/categoria.entity';
import { CategoriaModule } from './categoria/modules/categoria.module';
import { Tarefa } from './tarefa/entities/tarefa.entity';
import { TarefaModule } from './tarefa/modules/tarefa.module';



@Module({
  imports: [
    /* TypeOrmModule.forRoot({
    type: 'mysql',
    host: 'localhost',
    port: 3306,
    username: 'root',
    password: 'samira123',
    database: 'db_todolistatarefas',
    entities: [Tarefa, Categoria],
    synchronize: true
  }),*/

  TypeOrmModule.forRoot({
    type: 'postgres',
    url: process.env.DATABASE_URL,
    logging: false,
    dropSchema: false,
    ssl: {
      rejectUnauthorized: false
    },
    autoLoadEntities: true,
    synchronize: true
    
  }),
  TarefaModule,
  CategoriaModule
 ],
  controllers: [AppController],
  providers: [],
})
export class AppModule {}
