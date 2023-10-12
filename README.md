
## Server

Server actually can be run only in socket, and is located at `src/main/java/testlang/lsp/SocketLauncher.java`

## Clients

### VIM Configuration

Create file `ftdetect/[lang].vim`

```
" [lang]
au BufNewFile,BufRead *.[ext] set filetype=[lang]
```

Configure socket
```json
"languageserver": {
  "[lang]": {
  "host": "127.0.0.1",
  "port": 5123,
  "rootPatterns": [".root"],
  "filetypes": ["[lang]"]
 },




```
