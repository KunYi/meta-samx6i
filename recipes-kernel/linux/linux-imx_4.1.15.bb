SUMMARY = "Linux Kernel provided by KunYi Chen"
DESCRIPTION = "Linux Kernel provided by KunYi Chen with focus on \
	       Kontron sAMX6/i.MX6Q "

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.1.15_1.0.0_ga"
LOCALVERSION = "-1.2.0"
SRCREV = "d7c7b5b3a4a29f4be9cfa2c19845511398d3308c"
KERNEL_SRC ?= "git://github.com/KunYi/linux_samx6i.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

addtask copy_defconfig after do_unpack before do_configure
do_copy_defconfig () {
	# copy latest samx6i_defconfig to use
	cp ${S}/arch/arm/configs/samx6i_defconfig ${B}/.config
	cp ${S}/arch/arm/configs/samx6i_defconfig ${B}/../defconfig
}

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
