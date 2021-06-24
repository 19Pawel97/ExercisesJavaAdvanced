package enums.exercise3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TemperatureConverter {
    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn * 9 / 5) + 32;
        }
    }),
    C_K('C', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C('K', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn - 273.15f;
        }
    }),
    F_C('F', 'C', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9;
        }
    }),
    F_K('F', 'K', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5 / 9 + 273.15f;
        }
    }),
    K_F('K', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn + 273.15f) * 9 / 5 + 32;
        }
    });

    private char inputTemperature;
    private char outputTemperature;
    private Converter converter;

    public static float convertTemperature(char inputTemperature, char outputTemperature, float temperature) {
        float returnedTemp = 0;
        for (TemperatureConverter TemperatureConverter :
                values()) {
            if (TemperatureConverter.inputTemperature == inputTemperature && outputTemperature == TemperatureConverter.outputTemperature) {
                returnedTemp = TemperatureConverter.converter.convert(temperature);
            } else {
                continue;
            }
        }
        return returnedTemp;
    }
}
