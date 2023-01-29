package frc.robot;
import edu.wpi.first.wpilibj.DigitalInput;
import frc.lib.Lidar;

public class LidarTests {

    private int RoboRioDioPortNumber = 0;
    private int m_Iterations = 0;
    final private int kPeriodIterations = 50;

    private Lidar m_Lidar;
    
    public LidarTests() {
        m_Lidar = new Lidar(new DigitalInput(RoboRioDioPortNumber));
    }
    
    public void LidarTestsPeriodic() {
        if (m_Iterations++ % kPeriodIterations == 0) {
            System.out.println("Lidar port: " +  RoboRioDioPortNumber + ", Inches: " + m_Lidar.getDistanceIn());
            m_Iterations = 0;
        }
    }
}
