# override default u-boot settings

DESCRIPTION = "U-Boot provided by KunYi"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "master"
UBOOT_SRC ?= "git://github.com/KunYi/uboot-samx6i.git;"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "ef80ec9130132a85a69750c272a998605c93a3e0"

SRC_URI[md5sum] = "ff8b518ecde9ee2b8c7d56d627a69023"
SRC_URI[sha256sum] = "daa8d6c1be0cf64bfb5d53f07b4e25b4d6b92adb98931819de5335f64cf81f34"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"

