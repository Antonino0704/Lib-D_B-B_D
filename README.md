# Lib-D_B-B_D
Libraries to convert decimal numbers into binary and vice versa

# Installation
To see the documentation on the code download doc.zip extract and open the "inedex" html file

To use the code, download the two files present in "Lib-D_B-B_D/D_B-B_D/binario/src/binario/" and open them with your favorite java IDE

# Known bugs of Class Decimal_to_binary class
convert method: if the number you want to convert is negative or greater than 1023 throws an NumberFormatException, this is related to the maximum size of the integer in java that is of 10 digits

# Known bugs of Binary_to_decimal class
convert method: if the number you want to convert is negative, it returns the number converted to a positive decimal

# What child classes solve
Dec_bin child class by  Decimal_to_binary class solve the problem with negative number and add methods that return number as string or double so to get number over 1023

Bin_dec hild class by Binary_to_decimal class resolve the problem with negative number and launch exception in case there are digits other than 1 or 0

# Authors
Buscarino Antonino

# License
GNU General Public License v3.0
