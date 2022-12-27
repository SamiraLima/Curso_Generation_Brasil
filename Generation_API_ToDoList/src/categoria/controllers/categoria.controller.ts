import { Body, Controller, Delete, Get, HttpCode, HttpStatus, Param, ParseIntPipe, Post, Put } from "@nestjs/common";
import { ApiTags } from "@nestjs/swagger";
import { Categoria } from "../entities/categoria.entity";
import { CategoriaService } from "../services/categoria.service";

@ApiTags('Categoria')
@Controller('/categoria')
export class CategoriaController{
    
    constructor(private readonly service: CategoriaService){}

    @Get()
    @HttpCode(HttpStatus.OK)
    findAll(): Promise<Categoria[]>{
        return this.service.findAll()
    }

    @Get('/:id')
    @HttpCode(HttpStatus.OK)
    findbyId(@Param('id', ParseIntPipe) id: number): Promise<Categoria>{
        return this.service.findbyId(id)
    }

    @Get('/descricao/:descricao')
    @HttpCode(HttpStatus.OK)
    findbyNome(@Param('descricao') descricao : string): Promise<Categoria[]>{
        return this.service.findbyDescricao(descricao)
    }

    @Post()
    @HttpCode(HttpStatus.CREATED)
    create(@Body() categoria : Categoria): Promise<Categoria>{
        return this.service.create(categoria)
    }

    @Put()
    @HttpCode(HttpStatus.OK)
    update(@Body() categoria : Categoria): Promise<Categoria>{
        return this.service.update(categoria)
    }

    @Delete('/:id')
    @HttpCode(HttpStatus.NO_CONTENT)
    delete(@Param('id', ParseIntPipe) id: number ){
        return this.service.delete(id)
    }
}