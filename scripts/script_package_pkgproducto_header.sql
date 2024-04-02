CREATE OR REPLACE NONEDITIONABLE PACKAGE pkg_producto IS
    PROCEDURE spinsertaproductos (
        nombre  IN VARCHAR2,
        codigo  OUT VARCHAR2,
        mensaje OUT VARCHAR2
    );

    PROCEDURE splistarproductos (
        ccursor OUT SYS_REFCURSOR
    );

END pkg_producto;