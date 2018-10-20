const http = require('http')
const port = 3000
const ip = 'localhost'

const server = http.createServer((req, res) => {
  console.log('Recebendo uma request!')
  res.writeHead(301, {"Location": "http://" + {ip} + ':' + {port}+ '/index.html'});
  res.end();
})

server.listen(port, ip, () => {
  console.log(`Servidor rodando em http://${ip}:${port}`)
  console.log('Para derrubar o servidor: ctrl + c');
})