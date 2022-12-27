import { IsNotEmpty, MaxLength } from "class-validator";
import { Tarefa } from "../../tarefa/entities/tarefa.entity";
import { Column, Entity, OneToMany, PrimaryGeneratedColumn } from "typeorm";
import { ApiProperty } from "@nestjs/swagger";

@Entity('tb_categoria')
export class Categoria{

    @PrimaryGeneratedColumn()
    @ApiProperty()
    id: number
    
    @IsNotEmpty()
    @MaxLength(250)
    @ApiProperty()
    @Column({nullable: false, length: 250})
    descricao: string

    @OneToMany(() => Tarefa, (tarefa) => tarefa.categoria)
    
    @ApiProperty()
    tarefas : Tarefa[]
}