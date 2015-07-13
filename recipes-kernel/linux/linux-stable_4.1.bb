require recipes-kernel/linux/linux-yocto.inc

KERNEL_IMAGETYPE = "zImage"

COMPATIBLE_MACHINE = "beaglebone"

RDEPENDS_kernel_base += "kernel-devicetree"

KERNEL_DEVICETREE_beaglebone = " \
    am335x-boneblack.dtb \
    bbb-hdmi.dtb \
    bbb-4dcape70t.dtb \
    bbb-nh5cape.dtb \
 "

LINUX_VERSION = "4.1"
LINUX_VERSION_EXTENSION = "-jumpnow"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-stable-4.1:"

S = "${WORKDIR}/git"

PR = "r3"

# v4.1.2 = 5cf9896dc5c72a6c68c36140568b755f697f7760 
SRCREV = "5cf9896dc5c72a6c68c36140568b755f697f7760"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-4.1.y \
    file://defconfig \
    file://0001-spidev-Add-generic-compatible-dt-id.patch \
    file://0002-Add-bbb-spi1-spidev-dtsi.patch \
    file://0003-Add-bbb-i2c1-dtsi.patch \
    file://0004-Add-bbb-i2c2-dtsi.patch \
    file://0005-Add-bbb-hdmi-dts.patch \
    file://0006-Add-bbb-4dcape70t-dts.patch \
    file://0007-Add-ft5x06-touchscreen-driver.patch \
    file://0008-Add-bbb-nh5cape-dts.patch \
    file://0009-Add-4dcape70t-button-dtsi.patch \
    file://0010-4dcape70t-dts-include-button-dtsi-comment-out-spi.patch \
 "

