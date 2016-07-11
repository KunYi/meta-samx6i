# Provides the i.MX6 common settings

require conf/machine/include/imx-base.inc
require conf/machine/include/tune-cortexa9.inc

SERIAL_CONSOLES = "115200;ttymxc0"
UBOOT_ENTRYPOINT_mx6  = "0x12000000"

MACHINE_FEATURES += "pci "
