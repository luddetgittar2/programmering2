const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
  res.sendFile(__dirname+'\\htmlfil.html')
})

app.get('/style.css', (req, res) => {
  res.sendFile(__dirname+'\\style.css')
})

app.get('/luvdig.jpg', (req, res) => {
  res.sendFile(__dirname+'\\luvdig.jpg')
})
app.listen(port, () => console.log(`Example app listening on port ${port}!`))