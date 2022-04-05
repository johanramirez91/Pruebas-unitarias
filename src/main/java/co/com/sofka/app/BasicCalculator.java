package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sumar(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long restar(Long number1, Long number2) {
        logger.info( "Subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplicar(Long number1, Long number2) {
        logger.info( "Multiplicate {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long dividir(Long number1, Long number2) {
        logger.info( "Divide {} / {}", number1, number2 );
        long result = 0L;
        try {
            result = number1 / number2;
        }catch (ArithmeticException error){
            logger.error("División por 0 no permitida", error);
        }
        return result;
    }
}
