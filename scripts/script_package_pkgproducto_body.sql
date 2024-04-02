CREATE OR REPLACE NONEDITIONABLE PACKAGE BODY pkg_producto IS

    PROCEDURE spinsertaproductos (
        nombre  IN VARCHAR2,
        codigo  OUT VARCHAR2,
        mensaje OUT VARCHAR2
    ) AS
    BEGIN
        INSERT INTO productos (
            nombre,
            fecha_registro
        ) VALUES (
            nombre,
            sysdate
        );

        codigo := '200';
        mensaje := 'datos insertados correctamente';
    EXCEPTION
        WHEN OTHERS THEN
            codigo := '500';
            mensaje := 'error al insertar producto';
    END;

    PROCEDURE splistarproductos (
        ccursor OUT SYS_REFCURSOR
    ) AS
    BEGIN
        OPEN ccursor FOR SELECT
                             *
                         FROM
                             productos;

    END;

END;