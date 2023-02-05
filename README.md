# 2023LidarLiteV3Test
This Java program is to test Lidar Lite V3 in the PWM Wired configuration.

Refer to the [Lidar Lite V3 Manual](https://static.garmin.com/pumac/LIDAR_Lite_v3_Operation_Manual_and_Technical_Specifications.pdf)

## Wiring

Thanks to Girls Of Steel for this simplified and effective wiring
![](Documents\IMG_2876.png)

This hardwiring of the trigger cause the lidar to continually trigger, take measurement and pass back the pulse width proportional to the distance, then immediately repeat. The microcontroller need not send the trigger signal, simply read the DIO.  

Be sure to cut and place shrink tubes strategically before you solder the wire that way after soldering, you can slide them over and heat one at a time to protect from short circuits.  Also choose the tube diameters such that they can fit over the soldering and folded over wires, yet allow for a larger shrink tube diameter to cover them all for a neat final cable assembly.  Fold over wires as necessary to keep the final cable assembly from being a rats nest of different length cables.  Try to continually plan and trim wire lengths to optimize as clean of matching wire lengths to each other as possible to minimize undesired final results. 

Solder the grounds together to a loop folded on one end of the 1kOhm resistor. Use tape to cover each loose orange, blue and green wire end to keep them from shorting, then tape them together. 
![](Documents\IMG_8110.jpg)

Solder the yellow and white wires togetehr to a loop folded on the other end of the resistor.
![](Documents\IMG_8111.jpg)

Solder the 5V reds together.  Be sure to add a small diameter shrink tube onto one end before soldering, then cover solder bead and shrink it. 
![](Documents\IMG_8104.jpg)

Cover all the work with a long larger diameter shrink tube.  Here is the resulting final cable assembly with Lidar.
![](Documents\IMG_8109.jpg)
