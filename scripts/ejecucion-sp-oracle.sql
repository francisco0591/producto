VAR x REFCURSOR;
exec pkg_producto.splistarproductos(:x);
print x;


VAR y varchar2;
VAR z varchar2;
execute pkg_producto.spinsertaproductos('cds',:y,:z);
print y;
print z;