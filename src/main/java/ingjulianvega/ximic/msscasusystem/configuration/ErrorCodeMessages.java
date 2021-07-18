package ingjulianvega.ximic.msscasusystem.configuration;

import ingjulianvega.ximic.msscasusystem.services.SystemService;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ErrorCodeMessages {

    public static final String SYSTEM_NOT_FOUND_API_CODE = "401";
    public static final String SYSTEM_NOT_FOUND_ERROR = "SYSTEM_NOT_FOUND";
    public static final String SYSTEM_NOT_FOUND_MESSAGE = "No se encontró el sistema";
    public static final String SYSTEM_NOT_FOUND_SOLUTION = "Verifique los datos";

    public static final String ARGUMENT_NOT_VALID_API_CODE = "402";
    public static final String ARGUMENT_NOT_VALID_ERROR = "ARGUMENT_NOT_VALID";
    public static final String ARGUMENT_NOT_VALID_SOLUTION = "Verifique los datos";

    }
