const Koa = require('koa');
const server = new Koa();

server.use(async (ctx,next)=>{
    console.log(1)
    await next();               //执行顺序 13 56 42
    console.log(2)
    const rt = ctx.response.get('X-Response-Time');
    console.log(`${ctx.method} ${ctx.url} - ${rt}`);
})

server.use(async (ctx,next)=>{
    const start = Date.now();
    console.log(3)
    await next();
    console.log(4)
    const ms = Date.now() - start;
    ctx.set('X-Response-Time', `${ms}ms`);
})

server.use(async ctx=>{
    console.log(5)
    ctx.body = 'Hello World';
    console.log(6)
})


server.listen(3000,()=>{
    console.log('server is running \n');
})