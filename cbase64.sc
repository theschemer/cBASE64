
(library (cbase64 cbase64)
  (export
    todo
  )
  (import
    (scheme)
  )


  (define lib (load-shared-object "./lib/cbase64/base64.so"))

  (define to
    (foreign-procedure "todo" (string) string))
 
 
 )
