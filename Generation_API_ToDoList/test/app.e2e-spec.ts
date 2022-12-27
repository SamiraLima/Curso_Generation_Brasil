import { Test, TestingModule } from '@nestjs/testing';
import { INestApplication } from '@nestjs/common';
import * as request from 'supertest';
import { AppModule } from './../src/app.module';
import { TypeOrmModule } from '@nestjs/typeorm';


describe('AppController (e2e)', () => {
  let app: INestApplication;

  let tarefaId: number

  beforeAll(async () => {
    const moduleFixture: TestingModule = await Test.createTestingModule({
      imports: [
        TypeOrmModule.forRoot({
          type: 'mysql',
          host: 'localhost',
          port: 3306,
          username: 'root',
          password: 'samira123',
          database: 'db_todolistatarefas_test',
          autoLoadEntities: true,
          synchronize: true,
          logging: false,
          dropSchema: true
        }),
        AppModule
      ],
    }).compile();

    app = moduleFixture.createNestApplication();
    await app.init();
  });

  it('01 - Criar tarefa', async () => {
    let response = await request(app.getHttpServer())
      .post('/tarefa')
      .send({
        nome: 'Tarefa 1',
        descricao: 'Tarefa do dia',
        responsavel: 'Samira',
        data: '2022-09-15',
        status: true
      })
      .expect(201)

      tarefaId = response.body.id

  })

  it('02 - Recuperar tarefa pelo id', async () => {
    return request(app.getHttpServer())
      .get(`/tarefa/${tarefaId}`)
      .expect(200)
  })

  it('03 - Atualizar tarefa', async () => {
    return request(app.getHttpServer())
      .put('/tarefa')
      .send({
        id: 1,
        nome: 'Tarefa 1 - Atualizada',
        descricao: 'Tarefa do dia',
        responsavel: 'Samira',
        data: '2022-09-17',
        status: false
      })
      .expect(200)
      .then(response => {
        expect('Tarefa 1 - Atualizada').toEqual(response.body.nome)
        expect('2022-09-17').toEqual(response.body.data)
      })
  })

  it('04 - Não atualizar tarefa que não existe', async () => {
    return request(app.getHttpServer())
      .put('/tarefa')
      .send({
        id: 10000,
        nome: 'Tarefa 1 - Atualizada',
        descricao: 'Tarefa do dia',
        responsavel: 'Samira',
        data: '2022-09-17',
        status: false
      })
      .expect(404)
  })
  
  it('05 - Deletar tarefa', async () => {
    return request(app.getHttpServer())
      .delete('/tarefa/' + tarefaId)
      .expect(204)
  })

  afterAll(async () => {
    await app.close()
  })
});
