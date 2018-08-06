/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50611
Source Host           : localhost:3306
Source Database       : ajaxserver

Target Server Type    : MYSQL
Target Server Version : 50611
File Encoding         : 65001

Date: 2018-08-02 09:49:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(50) NOT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_sex` int(11) DEFAULT NULL,
  `user_mail` varchar(100) DEFAULT NULL,
  `user_tel` varchar(50) DEFAULT NULL,
  `user_birthday` date DEFAULT NULL,
  `user_status` varchar(10) DEFAULT NULL,
  `org_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e0230001', 'devil13th_0', '0', 'devil13th_0@dev.org.cn', '13401020304', '2014-06-28', '0', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e1a30002', 'devil13th_1', '1', 'devil13th_1@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e1b90003', 'devil13th_2', '0', 'devil13th_2@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e1d00004', 'devil13th_3', '1', 'devil13th_3@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e1d60005', 'devil13th_4', '0', 'devil13th_4@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e1ed0006', 'devil13th_5', '1', 'devil13th_5@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e1f60007', 'devil13th_6', '0', null, null, '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e1ff0008', 'devil13th_7', '1', 'devil13th_7@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e2080009', 'devil13th_8', '0', 'devil13th_8@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e210000a', 'devil13th_9', '1', 'devil13th_9@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e218000b', 'devil13th_10', '0', 'devil13th_10@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e22d000c', 'devil13th_11', '1', 'devil13th_11@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e249000d', 'devil13th_12', '0', 'devil13th_12@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e252000e', 'devil13th_13', '1', 'devil13th_13@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e25f000f', 'devil13th_14', '0', 'devil13th_14@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e26d0010', 'devil13th_15', '1', 'devil13th_15@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e28d0011', 'devil13th_16', '0', 'devil13th_16@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e2940012', 'devil13th_17', '1', 'devil13th_17@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e29c0013', 'devil13th_18', '0', 'devil13th_18@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e2a80014', 'devil13th_19', '1', 'devil13th_19@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e2b50015', 'devil13th_20', '0', 'devil13th_20@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e2c20016', 'devil13th_21', '1', 'devil13th_21@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e2e00017', 'devil13th_22', '0', 'devil13th_22@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e2e90018', 'devil13th_23', '1', 'devil13th_23@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e2f00019', 'devil13th_24', '0', 'devil13th_24@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e30b001a', 'devil13th_25', '1', 'devil13th_25@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e314001b', 'devil13th_26', '0', 'devil13th_26@dev.org.cn', '13401020304', '2014-06-28', '0', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e320001c', 'devil13th_27', '1', 'devil13th_27@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e338001d', 'devil13th_28', '0', 'devil13th_28@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e346001e', 'devil13th_29', '1', 'devil13th_29@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e351001f', 'devil13th_30', '0', 'devil13th_30@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3590020', 'devil13th_31', '1', 'devil13th_31@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3660021', 'devil13th_32', '0', 'devil13th_32@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3780022', 'devil13th_33', '1', 'devil13th_33@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3870023', 'devil13th_34', '0', 'devil13th_34@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3920024', 'devil13th_35', '1', 'devil13th_35@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3b60025', 'devil13th_36', '0', 'devil13th_36@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3c70026', 'devil13th_37', '1', 'devil13th_37@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3dd0027', 'devil13th_38', '0', 'devil13th_38@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e3f70028', 'devil13th_39', '1', 'devil13th_39@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e40b0029', 'devil13th_40', '0', 'devil13th_40@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e413002a', 'devil13th_41', '1', 'devil13th_41@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e41f002b', 'devil13th_42', '0', 'devil13th_42@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e427002c', 'devil13th_43', '1', 'devil13th_43@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e42e002d', 'devil13th_44', '0', 'devil13th_44@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e436002e', 'devil13th_45', '1', 'devil13th_45@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e43d002f', 'devil13th_46', '0', 'devil13th_46@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4470030', 'devil13th_47', '1', 'devil13th_47@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e44e0031', 'devil13th_48', '0', 'devil13th_48@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4550032', 'devil13th_49', '1', 'devil13th_49@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e45f0033', 'devil13th_50', '0', 'devil13th_50@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4670034', 'devil13th_51', '1', 'devil13th_51@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e46f0035', 'devil13th_52', '0', 'devil13th_52@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4750036', 'devil13th_53', '1', 'devil13th_53@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4800037', 'devil13th_54', '0', 'devil13th_54@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4870038', 'devil13th_55', '1', 'devil13th_55@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e48c0039', 'devil13th_56', '0', 'devil13th_56@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4ae003a', 'devil13th_57', '1', 'devil13th_57@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4c9003b', 'devil13th_58', '0', 'devil13th_58@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4df003c', 'devil13th_59', '1', 'devil13th_59@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e4f9003d', 'devil13th_60', '0', 'devil13th_60@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e502003e', 'devil13th_61', '1', 'devil13th_61@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e50f003f', 'devil13th_62', '0', 'devil13th_62@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e5170040', 'devil13th_63', '1', 'devil13th_63@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e5330041', 'devil13th_64', '0', 'devil13th_64@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e5410042', 'devil13th_65', '1', 'devil13th_65@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e54f0043', 'devil13th_66', '0', 'devil13th_66@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e5580044', 'devil13th_67', '1', 'devil13th_67@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e55f0045', 'devil13th_68', '0', 'devil13th_68@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e56c0046', 'devil13th_69', '1', 'devil13th_69@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e119dc0146e119e5780047', 'devil13th_70', '0', 'devil13th_70@dev.org.cn', '13401020304', '2014-06-28', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e139fa0146e13a4e840001', null, null, null, null, null, null, 'TJ');
INSERT INTO `sys_user` VALUES ('402881e846e139fa0146e13ca9730002', '2', '1', null, null, '2014-06-02', '1', 'TJ');
INSERT INTO `sys_user` VALUES ('4028901864ef65e60164ef6b05120000', 'aaa', '1', 'aaa@ccc.com', '1234', null, '1', '5');
INSERT INTO `sys_user` VALUES ('4028901864ef6bd80164ef6c424f0000', 'aaa', '1', 'aaa@ccc.com', '1234', '2015-01-01', '1', '5');
INSERT INTO `sys_user` VALUES ('4028901864ef6bd80164ef6d0ea50001', 'aaa', '1', 'aaa@ccc.com', '1234', '2015-01-01', '1', '5');
INSERT INTO `sys_user` VALUES ('4028901864ef6daa0164ef6ef96f0000', 'aaa222', '1', 'aaa@ccc.com', '1234', '2015-01-01', '1', '5');
INSERT INTO `sys_user` VALUES ('4028901864f37a130164f37dd3530000', 'a3a2a', '1', 'aaa@ccc.com', '1234', '2015-01-01', '1', '5');
