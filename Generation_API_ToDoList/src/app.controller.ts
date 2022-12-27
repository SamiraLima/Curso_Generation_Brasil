import { Controller, Get, Res } from '@nestjs/common';
import { ApiExcludeEndpoint } from '@nestjs/swagger';
import { AppService } from './app.service';

@Controller()
export class AppController {
  constructor() {}


  @ApiExcludeEndpoint()
  @Get()
  redirect(@Res() res: any) {
    return res.redirect('/swagger')
  }
}
