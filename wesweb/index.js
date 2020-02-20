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

app.use(express.json())

app.use(express.urlencoded())

app.post('/form', (req, res) => {
    const name = req.body.name
    console.log(name)
    res.redirect('/luvdig.jpg')
  })

app.listen(port, () => console.log(`Example app listening on port ${port}!`))