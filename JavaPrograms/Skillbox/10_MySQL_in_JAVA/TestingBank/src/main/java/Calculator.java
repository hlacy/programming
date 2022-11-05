import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class Calculator {
    static double add(double... operands){
        return DoubleStream.of(operands).sum();
    }

    static double multiply(double... operands){
        double res;
        res = DoubleStream.of(operands)
                .reduce(1, (a, b) -> (a * b));
        return (res == -0) ? 0 : res;
    }
}
