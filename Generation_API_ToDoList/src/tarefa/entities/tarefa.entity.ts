import { IsNotEmpty, MaxLength } from "class-validator";
import { Categoria } from "../../categoria/entities/categoria.entity";
import {Column, Entity, ManyToOne, PrimaryGeneratedColumn} from "typeorm";
import { ApiProperty } from "@nestjs/swagger";

@Entity({name: 'tb_tarefa'})
export class Tarefa{

    @PrimaryGeneratedColumn()
    @ApiProperty()
    id: number

    @IsNotEmpty()
    @MaxLength(40)
    @ApiProperty()
    @Column({nullable: false, length: 40})
    nome: string

    
    @IsNotEmpty()
    @MaxLength(450)
    @ApiProperty()
    @Column({nullable: false, length: 450})
    descricao: string

    @IsNotEmpty()
    @MaxLength(40)
    @ApiProperty()
    @Column({nullable: false, length: 40})
    responsavel: string

    @Column()
    @ApiProperty()
    data: Date

    @Column()
    @ApiProperty()
    status: boolean

    @ManyToOne(() => Categoria, (categoria) => categoria.tarefas, {
        onDelete: 'CASCADE'
    })
    @ApiProperty({type: () => Categoria})
    categoria : Categoria


}