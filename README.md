# spring_chapter_8
This is the spring starter book chapter 8

┌──────────────┐
│   Browser    │
└──────┬───────┘
       │
       │ 1) POST /products  (form submit)
       │──────────────────────────────▶
       │
       │        ┌──────────────────────┐
       │        │        Server        │
       │        │  @PostMapping        │
       │        │  save product        │
       │        └──────────────────────┘
       │
       │ 2) HTTP 302 Redirect
       │    Location: /products
       │◀──────────────────────────────
       │
       │ 3) GET /products  (auto)
       │──────────────────────────────▶
       │
       │        ┌──────────────────────┐
       │        │        Server        │
       │        │  @GetMapping         │
       │        │  load products       │
       │        └──────────────────────┘
       │
       │ 4) HTTP 200 OK (HTML page)
       │◀──────────────────────────────
       │
       │ 5) Refresh page
       │  GET /products  (safe)
       │──────────────────────────────▶
