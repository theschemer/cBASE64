
(("name" . "cbase64")
("version" . "0.1.0")
("description" . "base 64 for Chez Scheme")
("keywords")
("author" 
    ("WEI Zhicheng" "guenchi"))
("private" . #f)
("scripts" 
    ("build" . "cd ./lib/cbase64/src && cc -o3 -fPIC -shared base64.c -o ../base64.so"))
("dependencies")
("devDependencies"))
