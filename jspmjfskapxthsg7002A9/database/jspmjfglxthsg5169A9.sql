USE [master]
GO
/****** Object:  Database [jspmjfglxthsg5169A9]    Script Date: 03/22/2019 22:33:59 ******/
CREATE DATABASE [jspmjfglxthsg5169A9] ON  PRIMARY 
( NAME = N'jspmjfglxthsg5169A9', FILENAME = N'E:\程序\MVC\2019\jspm机房管理系统hsg5169A9\database\jspmjfglxthsg5169A9.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'jspmjfglxthsg5169A9_log', FILENAME = N'E:\程序\MVC\2019\jspm机房管理系统hsg5169A9\database\jspmjfglxthsg5169A9_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [jspmjfglxthsg5169A9].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET ANSI_NULLS OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET ANSI_PADDING OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET ARITHABORT OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET  DISABLE_BROKER
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET  READ_WRITE
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET RECOVERY SIMPLE
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET  MULTI_USER
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [jspmjfglxthsg5169A9] SET DB_CHAINING OFF
GO
USE [jspmjfglxthsg5169A9]
GO
/****** Object:  Table [dbo].[xueshengxinxi]    Script Date: 03/22/2019 22:34:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[xueshengxinxi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[xuehao] [varchar](50) NULL,
	[mima] [varchar](50) NULL,
	[xingming] [varchar](50) NULL,
	[xingbie] [varchar](50) NULL,
	[chushengriqi] [varchar](50) NULL,
	[banji] [varchar](50) NULL,
	[yuanxi] [varchar](50) NULL,
	[zhuanye] [varchar](50) NULL,
	[lianxidianhua] [varchar](50) NULL,
	[addtime] [datetime] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[xueshengxinxi] ON
INSERT [dbo].[xueshengxinxi] ([ID], [xuehao], [mima], [xingming], [xingbie], [chushengriqi], [banji], [yuanxi], [zhuanye], [lianxidianhua], [addtime]) VALUES (1, N'008', N'001', N'贾静雯', N'男', N'2019-4-18', N'', N'化工学院', N'', N'13748589658', CAST(0x0000AA16000FE068 AS DateTime))
INSERT [dbo].[xueshengxinxi] ([ID], [xuehao], [mima], [xingming], [xingbie], [chushengriqi], [banji], [yuanxi], [zhuanye], [lianxidianhua], [addtime]) VALUES (2, N'021', N'001', N'何永康', N'男', N'2019-3-12', N'', N'旅游学院', N'', N'13159863241', CAST(0x0000AA16000FE068 AS DateTime))
INSERT [dbo].[xueshengxinxi] ([ID], [xuehao], [mima], [xingming], [xingbie], [chushengriqi], [banji], [yuanxi], [zhuanye], [lianxidianhua], [addtime]) VALUES (3, N'022', N'001', N'范冰冰', N'女', N'2019-3-30', N'', N'商学院', N'', N'13489665487', CAST(0x0000AA16000FE068 AS DateTime))
INSERT [dbo].[xueshengxinxi] ([ID], [xuehao], [mima], [xingming], [xingbie], [chushengriqi], [banji], [yuanxi], [zhuanye], [lianxidianhua], [addtime]) VALUES (4, N'012', N'001', N'方之明', N'女', N'2019-3-12', N'', N'政法学院', N'', N'13184865998', CAST(0x0000AA16000FE068 AS DateTime))
INSERT [dbo].[xueshengxinxi] ([ID], [xuehao], [mima], [xingming], [xingbie], [chushengriqi], [banji], [yuanxi], [zhuanye], [lianxidianhua], [addtime]) VALUES (5, N'001', N'001', N'易建联', N'女', N'2019-3-12', N'', N'土建学院', N'', N'18956482221', CAST(0x0000AA16000FE069 AS DateTime))
SET IDENTITY_INSERT [dbo].[xueshengxinxi] OFF
/****** Object:  Table [dbo].[xueshengshenqing]    Script Date: 03/22/2019 22:34:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[xueshengshenqing](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[jifangbianhao] [varchar](50) NULL,
	[jifangmingcheng] [varchar](50) NULL,
	[xuehao] [varchar](50) NULL,
	[xingming] [varchar](50) NULL,
	[banji] [varchar](50) NULL,
	[shiyongriqi] [varchar](50) NULL,
	[shenqingzuowei] [varchar](50) NULL,
	[huifu] [varchar](300) NULL,
	[issh] [varchar](2) NULL,
	[addtime] [datetime] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[xueshengshenqing] ON
INSERT [dbo].[xueshengshenqing] ([ID], [jifangbianhao], [jifangmingcheng], [xuehao], [xingming], [banji], [shiyongriqi], [shenqingzuowei], [huifu], [issh], [addtime]) VALUES (1, N'301', N'301计算机类机房', N'029', N'郭依洁', N'', N'2019-3-22', N'10号', N'', N'是', CAST(0x0000AA16000FF566 AS DateTime))
INSERT [dbo].[xueshengshenqing] ([ID], [jifangbianhao], [jifangmingcheng], [xuehao], [xingming], [banji], [shiyongriqi], [shenqingzuowei], [huifu], [issh], [addtime]) VALUES (2, N'201', N'201多媒体机房', N'034', N'陈智一', N'', N'2019-3-30', N'8号', N'', N'是', CAST(0x0000AA16000FF567 AS DateTime))
INSERT [dbo].[xueshengshenqing] ([ID], [jifangbianhao], [jifangmingcheng], [xuehao], [xingming], [banji], [shiyongriqi], [shenqingzuowei], [huifu], [issh], [addtime]) VALUES (3, N'201', N'201多媒体机房', N'014', N'余少庆', N'', N'2019-2-22', N'4号', N'', N'是', CAST(0x0000AA16000FF567 AS DateTime))
INSERT [dbo].[xueshengshenqing] ([ID], [jifangbianhao], [jifangmingcheng], [xuehao], [xingming], [banji], [shiyongriqi], [shenqingzuowei], [huifu], [issh], [addtime]) VALUES (4, N'301', N'301计算机类机房', N'020', N'林书豪', N'', N'2019-2-22', N'7号', N'', N'是', CAST(0x0000AA16000FF567 AS DateTime))
INSERT [dbo].[xueshengshenqing] ([ID], [jifangbianhao], [jifangmingcheng], [xuehao], [xingming], [banji], [shiyongriqi], [shenqingzuowei], [huifu], [issh], [addtime]) VALUES (5, N'201', N'201多媒体机房', N'001', N'詹姆斯', N'', N'2019-3-22', N'9号', N'', N'是', CAST(0x0000AA16000FF567 AS DateTime))
SET IDENTITY_INSERT [dbo].[xueshengshenqing] OFF
/****** Object:  Table [dbo].[paike]    Script Date: 03/22/2019 22:34:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[paike](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[kechengbianhao] [varchar](50) NULL,
	[kechengmingcheng] [varchar](300) NULL,
	[zhuanye] [varchar](50) NULL,
	[jifangbianhao] [varchar](50) NULL,
	[jifangmingcheng] [varchar](50) NULL,
	[xingqi] [varchar](50) NULL,
	[shiduan] [varchar](50) NULL,
	[jiaoshihao] [varchar](50) NULL,
	[jiaoshixingming] [varchar](50) NULL,
	[addtime] [datetime] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[paike] ON
INSERT [dbo].[paike] ([ID], [kechengbianhao], [kechengmingcheng], [zhuanye], [jifangbianhao], [jifangmingcheng], [xingqi], [shiduan], [jiaoshihao], [jiaoshixingming], [addtime]) VALUES (1, N'0025', N'火锅刚回家', N'计算机', N'301', N'301计算机类机房', N'周一', N'上午', N'555', N'王菲', CAST(0x0000AA1601690AF4 AS DateTime))
INSERT [dbo].[paike] ([ID], [kechengbianhao], [kechengmingcheng], [zhuanye], [jifangbianhao], [jifangmingcheng], [xingqi], [shiduan], [jiaoshihao], [jiaoshixingming], [addtime]) VALUES (2, N'0025', N'火锅刚回家', N'计算机', N'201', N'201多媒体机房', N'周三', N'中午', N'222', N'黄华', CAST(0x0000AA16016A7F9C AS DateTime))
INSERT [dbo].[paike] ([ID], [kechengbianhao], [kechengmingcheng], [zhuanye], [jifangbianhao], [jifangmingcheng], [xingqi], [shiduan], [jiaoshihao], [jiaoshixingming], [addtime]) VALUES (3, N'036974', N'发过火规范化', N'计算机', N'303', N'303计算机类机房3', N'周二', N'中午', N'111', N'周红', CAST(0x0000AA160174E3C4 AS DateTime))
INSERT [dbo].[paike] ([ID], [kechengbianhao], [kechengmingcheng], [zhuanye], [jifangbianhao], [jifangmingcheng], [xingqi], [shiduan], [jiaoshihao], [jiaoshixingming], [addtime]) VALUES (4, N'036974', N'发过火规范化', N'计算机', N'303', N'303计算机类机房3', N'周日', N'中午', N'222', N'黄华', CAST(0x0000AA160174EF7C AS DateTime))
SET IDENTITY_INSERT [dbo].[paike] OFF
/****** Object:  Table [dbo].[kechengxinxi]    Script Date: 03/22/2019 22:34:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[kechengxinxi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[kechengbianhao] [varchar](50) NULL,
	[kechengmingcheng] [varchar](300) NULL,
	[zhuanye] [varchar](50) NULL,
	[kechengjieshao] [varchar](500) NULL,
	[addtime] [datetime] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[kechengxinxi] ON
INSERT [dbo].[kechengxinxi] ([ID], [kechengbianhao], [kechengmingcheng], [zhuanye], [kechengjieshao], [addtime]) VALUES (1, N'02548', N'电饭锅分店', N'计算机', N'的非官方的给', CAST(0x0000AA160166B678 AS DateTime))
INSERT [dbo].[kechengxinxi] ([ID], [kechengbianhao], [kechengmingcheng], [zhuanye], [kechengjieshao], [addtime]) VALUES (2, N'0025', N'火锅刚回家', N'计算机', N'发过火高峰', CAST(0x0000AA160166C230 AS DateTime))
INSERT [dbo].[kechengxinxi] ([ID], [kechengbianhao], [kechengmingcheng], [zhuanye], [kechengjieshao], [addtime]) VALUES (3, N'036974', N'发过火规范化', N'计算机', N'电饭锅', CAST(0x0000AA160174BAC0 AS DateTime))
SET IDENTITY_INSERT [dbo].[kechengxinxi] OFF
/****** Object:  Table [dbo].[jifangxinxi]    Script Date: 03/22/2019 22:34:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[jifangxinxi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[jifangbianhao] [varchar](50) NULL,
	[jifangmingcheng] [varchar](300) NULL,
	[rongliang] [varchar](50) NULL,
	[zhuangtai] [varchar](50) NULL,
	[addtime] [datetime] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[jifangxinxi] ON
INSERT [dbo].[jifangxinxi] ([ID], [jifangbianhao], [jifangmingcheng], [rongliang], [zhuangtai], [addtime]) VALUES (1, N'201', N'201多媒体机房', N'50', N'空闲', CAST(0x0000AA160166F944 AS DateTime))
INSERT [dbo].[jifangxinxi] ([ID], [jifangbianhao], [jifangmingcheng], [rongliang], [zhuangtai], [addtime]) VALUES (2, N'301', N'301计算机类机房', N'60', N'空闲', CAST(0x0000AA16016857A8 AS DateTime))
INSERT [dbo].[jifangxinxi] ([ID], [jifangbianhao], [jifangmingcheng], [rongliang], [zhuangtai], [addtime]) VALUES (3, N'303', N'303计算机类机房3', N'60', N'空闲', CAST(0x0000AA160174D488 AS DateTime))
SET IDENTITY_INSERT [dbo].[jifangxinxi] OFF
/****** Object:  Table [dbo].[jiaoshixinxi]    Script Date: 03/22/2019 22:34:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[jiaoshixinxi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[jiaoshihao] [varchar](50) NULL,
	[mima] [varchar](50) NULL,
	[jiaoshixingming] [varchar](50) NULL,
	[xingbie] [varchar](50) NULL,
	[chushengnianyue] [varchar](50) NULL,
	[gongling] [varchar](50) NULL,
	[zhicheng] [varchar](50) NULL,
	[shouji] [varchar](50) NULL,
	[youxiang] [varchar](50) NULL,
	[beizhu] [varchar](500) NULL,
	[addtime] [datetime] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[jiaoshixinxi] ON
INSERT [dbo].[jiaoshixinxi] ([ID], [jiaoshihao], [mima], [jiaoshixingming], [xingbie], [chushengnianyue], [gongling], [zhicheng], [shouji], [youxiang], [beizhu], [addtime]) VALUES (1, N'111', N'111', N'周红', N'女', N'2017-04-12', N'5', N'中级', N'13353369874', N'259879@qq.com', N'时段发', CAST(0x0000AA160165DED8 AS DateTime))
INSERT [dbo].[jiaoshixinxi] ([ID], [jiaoshihao], [mima], [jiaoshixingming], [xingbie], [chushengnianyue], [gongling], [zhicheng], [shouji], [youxiang], [beizhu], [addtime]) VALUES (2, N'222', N'222', N'黄华', N'男', N'2017-04-19', N'9', N'初级', N'13323657894', N'2593479@qq.com', N'水电费地方', CAST(0x0000AA160165FAF8 AS DateTime))
INSERT [dbo].[jiaoshixinxi] ([ID], [jiaoshihao], [mima], [jiaoshixingming], [xingbie], [chushengnianyue], [gongling], [zhicheng], [shouji], [youxiang], [beizhu], [addtime]) VALUES (3, N'555', N'555', N'王菲', N'女', N'2017-04-20', N'10', N'高级', N'13353321548', N'2593479@qq.com', N'水电费都是', CAST(0x0000AA160166A610 AS DateTime))
INSERT [dbo].[jiaoshixinxi] ([ID], [jiaoshihao], [mima], [jiaoshixingming], [xingbie], [chushengnianyue], [gongling], [zhicheng], [shouji], [youxiang], [beizhu], [addtime]) VALUES (4, N'333', N'333', N'林文', N'男', N'2017-04-04', N'9', N'中级', N'13353369874', N'259879@qq.com', N'水电费', CAST(0x0000AA1601749D74 AS DateTime))
SET IDENTITY_INSERT [dbo].[jiaoshixinxi] OFF
/****** Object:  Table [dbo].[jiaoshishenqing]    Script Date: 03/22/2019 22:34:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[jiaoshishenqing](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[jifangbianhao] [varchar](50) NULL,
	[jifangmingcheng] [varchar](50) NULL,
	[jiaoshihao] [varchar](50) NULL,
	[jiaoshixingming] [varchar](50) NULL,
	[shiyongriqi] [varchar](50) NULL,
	[huifu] [varchar](300) NULL,
	[issh] [varchar](2) NULL,
	[addtime] [datetime] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[jiaoshishenqing] ON
INSERT [dbo].[jiaoshishenqing] ([ID], [jifangbianhao], [jifangmingcheng], [jiaoshihao], [jiaoshixingming], [shiyongriqi], [huifu], [issh], [addtime]) VALUES (1, N'201', N'201多媒体机房', N'033', N'何永康', N'2019-3-25', N'', N'是', CAST(0x0000AA16000FE8F9 AS DateTime))
INSERT [dbo].[jiaoshishenqing] ([ID], [jifangbianhao], [jifangmingcheng], [jiaoshihao], [jiaoshixingming], [shiyongriqi], [huifu], [issh], [addtime]) VALUES (2, N'201', N'201多媒体机房', N'018', N'陈燕琪', N'2019-2-20', N'', N'是', CAST(0x0000AA16000FE8F9 AS DateTime))
INSERT [dbo].[jiaoshishenqing] ([ID], [jifangbianhao], [jifangmingcheng], [jiaoshihao], [jiaoshixingming], [shiyongriqi], [huifu], [issh], [addtime]) VALUES (3, N'301', N'301计算机类机房', N'015', N'邓超', N'2019-2-27', N'', N'是', CAST(0x0000AA16000FE8F9 AS DateTime))
INSERT [dbo].[jiaoshishenqing] ([ID], [jifangbianhao], [jifangmingcheng], [jiaoshihao], [jiaoshixingming], [shiyongriqi], [huifu], [issh], [addtime]) VALUES (4, N'303', N'303计算机类机房3', N'019', N'官小芝', N'2019-3-25', N'', N'是', CAST(0x0000AA16000FE8F9 AS DateTime))
INSERT [dbo].[jiaoshishenqing] ([ID], [jifangbianhao], [jifangmingcheng], [jiaoshihao], [jiaoshixingming], [shiyongriqi], [huifu], [issh], [addtime]) VALUES (5, N'301', N'301计算机类机房', N'001', N'穆铁柱', N'2019-2-20', N'可以使用', N'是', CAST(0x0000AA16000FE8F9 AS DateTime))
INSERT [dbo].[jiaoshishenqing] ([ID], [jifangbianhao], [jifangmingcheng], [jiaoshihao], [jiaoshixingming], [shiyongriqi], [huifu], [issh], [addtime]) VALUES (6, N'303', N'303计算机类机房3', N'111', N'周红', N'2019-03-20', N'机房冲突', N'否', CAST(0x0000AA160017BC2C AS DateTime))
SET IDENTITY_INSERT [dbo].[jiaoshishenqing] OFF
/****** Object:  Table [dbo].[allusers]    Script Date: 03/22/2019 22:34:00 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[allusers](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](50) NULL,
	[pwd] [varchar](50) NULL,
	[cx] [varchar](50) NULL,
	[addtime] [datetime] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[allusers] ON
INSERT [dbo].[allusers] ([ID], [username], [pwd], [cx], [addtime]) VALUES (1, N'hsg', N'hsg', N'超级管理员', CAST(0x0000AA1601608E4C AS DateTime))
INSERT [dbo].[allusers] ([ID], [username], [pwd], [cx], [addtime]) VALUES (2, N'admin', N'admin', N'超级管理员', CAST(0x0000AA1600172500 AS DateTime))
SET IDENTITY_INSERT [dbo].[allusers] OFF
/****** Object:  Default [DF__xueshengx__addti__0BC6C43E]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[xueshengxinxi] ADD  DEFAULT (getdate()) FOR [addtime]
GO
/****** Object:  Default [DF__xueshengsh__issh__108B795B]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[xueshengshenqing] ADD  DEFAULT ('否') FOR [issh]
GO
/****** Object:  Default [DF__xueshengs__addti__117F9D94]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[xueshengshenqing] ADD  DEFAULT (getdate()) FOR [addtime]
GO
/****** Object:  Default [DF__paike__addtime__03317E3D]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[paike] ADD  DEFAULT (getdate()) FOR [addtime]
GO
/****** Object:  Default [DF__kechengxi__addti__0425A276]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[kechengxinxi] ADD  DEFAULT (getdate()) FOR [addtime]
GO
/****** Object:  Default [DF__jifangxin__addti__0519C6AF]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[jifangxinxi] ADD  DEFAULT (getdate()) FOR [addtime]
GO
/****** Object:  Default [DF__jiaoshixi__addti__060DEAE8]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[jiaoshixinxi] ADD  DEFAULT (getdate()) FOR [addtime]
GO
/****** Object:  Default [DF__jiaoshishe__issh__0DAF0CB0]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[jiaoshishenqing] ADD  DEFAULT ('否') FOR [issh]
GO
/****** Object:  Default [DF__jiaoshish__addti__0EA330E9]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[jiaoshishenqing] ADD  DEFAULT (getdate()) FOR [addtime]
GO
/****** Object:  Default [DF__allusers__cx__08EA5793]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[allusers] ADD  DEFAULT ('普通管理员') FOR [cx]
GO
/****** Object:  Default [DF__allusers__addtim__09DE7BCC]    Script Date: 03/22/2019 22:34:00 ******/
ALTER TABLE [dbo].[allusers] ADD  DEFAULT (getdate()) FOR [addtime]
GO
