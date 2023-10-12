## Server

Server actually can be run only in socket, and is located at `src/main/java/testlang/lsp/SocketLauncher.java`

## Clients

### VIM Configuration

Create file `ftdetect/[lang].vim`

```
" [lang]
au BufNewFile,BufRead *.[ext] set filetype=[lang]
```

Configure socket, add the following entry to `coc-settings.json`
```json
"languageserver": {
  "[lang]": {
  "host": "127.0.0.1",
  "port": 5123,
  "rootPatterns": [".root"],
  "filetypes": ["[lang]"]
 },
```


### NVIM Configuration

Create file `ftdetect/[lang].vim`

```
" [lang]
au BufNewFile,BufRead *.[ext] set filetype=[lang]
```

Configure socket, add the following code to any file in your nvim configuration
```lua
vim.api.nvim_create_autocmd('FileType', {
  pattern = '[lang]',
  callback = function()
    vim.lsp.start({
      name = '[lang]',
      cmd = vim.lsp.rpc.connect('127.0.0.1', 5123),
      root_dir = vim.fs.dirname(vim.fs.find({ 'build.gradle' }, { upward = true })[1]),
      -- filetypes = { 'tst' },
    })
  end,
})
```
