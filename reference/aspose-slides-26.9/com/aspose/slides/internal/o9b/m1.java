package com.aspose.slides.internal.o9b;

import java.awt.Color;
import java.awt.SystemColor;

public final class m1 {
   static c8[] n5 = (c8[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(c8.class), 175));

   private static c8 n5(Color var0, String var1, int var2) {
      return c8.l6(var0.getAlpha(), var0.getRed(), var0.getGreen(), var0.getBlue(), var1, var2);
   }

   public static c8[] n5() {
      return n5;
   }

   public static c8 n5(int var0) {
      if (var0 > 0 && var0 < n5().length) {
         return n5()[var0];
      }

      c8 var1 = c8.n5(0, 0, 0, 0).o8();
      var1.k5 = com.aspose.slides.ms.System.d5.getName(q0.class, var0);
      var1.n5 = (short)(var1.n5 | 4);
      var1.l6 = (short)var0;
      return var1;
   }

   public static String n5(short var0) {
      switch (var0) {
         case 1:
            return "ActiveBorder";
         case 2:
            return "ActiveCaption";
         case 3:
            return "ActiveCaptionText";
         case 4:
            return "AppWorkspace";
         case 5:
            return "Control";
         case 6:
            return "ControlDark";
         case 7:
            return "ControlDarkDark";
         case 8:
            return "ControlLight";
         case 9:
            return "ControlLightLight";
         case 10:
            return "ControlText";
         case 11:
            return "Desktop";
         case 12:
            return "GrayText";
         case 13:
            return "Highlight";
         case 14:
            return "HighlightText";
         case 15:
            return "HotTrack";
         case 16:
            return "InactiveBorder";
         case 17:
            return "InactiveCaption";
         case 18:
            return "InactiveCaptionText";
         case 19:
            return "Info";
         case 20:
            return "InfoText";
         case 21:
            return "Menu";
         case 22:
            return "MenuText";
         case 23:
            return "ScrollBar";
         case 24:
            return "Window";
         case 25:
            return "WindowFrame";
         case 26:
            return "WindowText";
         case 27:
            return "Transparent";
         case 28:
            return "AliceBlue";
         case 29:
            return "AntiqueWhite";
         case 30:
            return "Aqua";
         case 31:
            return "Aquamarine";
         case 32:
            return "Azure";
         case 33:
            return "Beige";
         case 34:
            return "Bisque";
         case 35:
            return "Black";
         case 36:
            return "BlanchedAlmond";
         case 37:
            return "Blue";
         case 38:
            return "BlueViolet";
         case 39:
            return "Brown";
         case 40:
            return "BurlyWood";
         case 41:
            return "CadetBlue";
         case 42:
            return "Chartreuse";
         case 43:
            return "Chocolate";
         case 44:
            return "Coral";
         case 45:
            return "CornflowerBlue";
         case 46:
            return "Cornsilk";
         case 47:
            return "Crimson";
         case 48:
            return "Cyan";
         case 49:
            return "DarkBlue";
         case 50:
            return "DarkCyan";
         case 51:
            return "DarkGoldenrod";
         case 52:
            return "DarkGray";
         case 53:
            return "DarkGreen";
         case 54:
            return "DarkKhaki";
         case 55:
            return "DarkMagenta";
         case 56:
            return "DarkOliveGreen";
         case 57:
            return "DarkOrange";
         case 58:
            return "DarkOrchid";
         case 59:
            return "DarkRed";
         case 60:
            return "DarkSalmon";
         case 61:
            return "DarkSeaGreen";
         case 62:
            return "DarkSlateBlue";
         case 63:
            return "DarkSlateGray";
         case 64:
            return "DarkTurquoise";
         case 65:
            return "DarkViolet";
         case 66:
            return "DeepPink";
         case 67:
            return "DeepSkyBlue";
         case 68:
            return "DimGray";
         case 69:
            return "DodgerBlue";
         case 70:
            return "Firebrick";
         case 71:
            return "FloralWhite";
         case 72:
            return "ForestGreen";
         case 73:
            return "Fuchsia";
         case 74:
            return "Gainsboro";
         case 75:
            return "GhostWhite";
         case 76:
            return "Gold";
         case 77:
            return "Goldenrod";
         case 78:
            return "Gray";
         case 79:
            return "Green";
         case 80:
            return "GreenYellow";
         case 81:
            return "Honeydew";
         case 82:
            return "HotPink";
         case 83:
            return "IndianRed";
         case 84:
            return "Indigo";
         case 85:
            return "Ivory";
         case 86:
            return "Khaki";
         case 87:
            return "Lavender";
         case 88:
            return "LavenderBlush";
         case 89:
            return "LawnGreen";
         case 90:
            return "LemonChiffon";
         case 91:
            return "LightBlue";
         case 92:
            return "LightCoral";
         case 93:
            return "LightCyan";
         case 94:
            return "LightGoldenrodYellow";
         case 95:
            return "LightGray";
         case 96:
            return "LightGreen";
         case 97:
            return "LightPink";
         case 98:
            return "LightSalmon";
         case 99:
            return "LightSeaGreen";
         case 100:
            return "LightSkyBlue";
         case 101:
            return "LightSlateGray";
         case 102:
            return "LightSteelBlue";
         case 103:
            return "LightYellow";
         case 104:
            return "Lime";
         case 105:
            return "LimeGreen";
         case 106:
            return "Linen";
         case 107:
            return "Magenta";
         case 108:
            return "Maroon";
         case 109:
            return "MediumAquamarine";
         case 110:
            return "MediumBlue";
         case 111:
            return "MediumOrchid";
         case 112:
            return "MediumPurple";
         case 113:
            return "MediumSeaGreen";
         case 114:
            return "MediumSlateBlue";
         case 115:
            return "MediumSpringGreen";
         case 116:
            return "MediumTurquoise";
         case 117:
            return "MediumVioletRed";
         case 118:
            return "MidnightBlue";
         case 119:
            return "MintCream";
         case 120:
            return "MistyRose";
         case 121:
            return "Moccasin";
         case 122:
            return "NavajoWhite";
         case 123:
            return "Navy";
         case 124:
            return "OldLace";
         case 125:
            return "Olive";
         case 126:
            return "OliveDrab";
         case 127:
            return "Orange";
         case 128:
            return "OrangeRed";
         case 129:
            return "Orchid";
         case 130:
            return "PaleGoldenrod";
         case 131:
            return "PaleGreen";
         case 132:
            return "PaleTurquoise";
         case 133:
            return "PaleVioletRed";
         case 134:
            return "PapayaWhip";
         case 135:
            return "PeachPuff";
         case 136:
            return "Peru";
         case 137:
            return "Pink";
         case 138:
            return "Plum";
         case 139:
            return "PowderBlue";
         case 140:
            return "Purple";
         case 141:
            return "Red";
         case 142:
            return "RosyBrown";
         case 143:
            return "RoyalBlue";
         case 144:
            return "SaddleBrown";
         case 145:
            return "Salmon";
         case 146:
            return "SandyBrown";
         case 147:
            return "SeaGreen";
         case 148:
            return "SeaShell";
         case 149:
            return "Sienna";
         case 150:
            return "Silver";
         case 151:
            return "SkyBlue";
         case 152:
            return "SlateBlue";
         case 153:
            return "SlateGray";
         case 154:
            return "Snow";
         case 155:
            return "SpringGreen";
         case 156:
            return "SteelBlue";
         case 157:
            return "Tan";
         case 158:
            return "Teal";
         case 159:
            return "Thistle";
         case 160:
            return "Tomato";
         case 161:
            return "Turquoise";
         case 162:
            return "Violet";
         case 163:
            return "Wheat";
         case 164:
            return "White";
         case 165:
            return "WhiteSmoke";
         case 166:
            return "Yellow";
         case 167:
            return "YellowGreen";
         case 168:
            return "ButtonFace";
         case 169:
            return "ButtonHighlight";
         case 170:
            return "ButtonShadow";
         case 171:
            return "GradientActiveCaption";
         case 172:
            return "GradientInactiveCaption";
         case 173:
            return "MenuBar";
         case 174:
            return "MenuHighlight";
         default:
            return "";
      }
   }

   public static String l6(int var0) {
      return n5((short)var0);
   }

   public static c8 n5(c8 var0) {
      long var1 = var0.h0();

      for (int var3 = 0; var3 < n5().length; var3++) {
         if ((int)(var1 & 4294967295L) == n5()[var3].h0()) {
            c8 var4 = n5(var3);
            if (!var4.u3()) {
               return var4;
            }
         }
      }

      return c8.u3.o8();
   }

   static {
      if (com.aspose.slides.internal.r5w.n5.k5()) {
         c8.l6(255, 212, 208, 200, "ActiveBorder", 1).n5(n5[1]);
         c8.l6(255, 10, 36, 106, "ActiveCaption", 2).n5(n5[2]);
         c8.l6(255, 255, 255, 255, "ActiveCaptionText", 3).n5(n5[3]);
         c8.l6(255, 128, 128, 128, "AppWorkspace", 4).n5(n5[4]);
         c8.l6(255, 212, 208, 200, "Control", 5).n5(n5[5]);
         c8.l6(255, 128, 128, 128, "ControlDark", 6).n5(n5[6]);
         c8.l6(255, 64, 64, 64, "ControlDarkDark", 7).n5(n5[7]);
         c8.l6(255, 212, 208, 200, "ControlLight", 8).n5(n5[8]);
         c8.l6(255, 255, 255, 255, "ControlLightLight", 9).n5(n5[9]);
         c8.l6(255, 0, 0, 0, "ControlText", 10).n5(n5[10]);
         c8.l6(255, 58, 110, 165, "Desktop", 11).n5(n5[11]);
         c8.l6(255, 128, 128, 128, "GrayText", 12).n5(n5[12]);
         c8.l6(255, 10, 36, 106, "Highlight", 13).n5(n5[13]);
         c8.l6(255, 255, 255, 255, "HighlightText", 14).n5(n5[14]);
         c8.l6(255, 0, 0, 128, "HotTrack", 15).n5(n5[15]);
         c8.l6(255, 212, 208, 200, "InactiveBorder", 16).n5(n5[16]);
         c8.l6(255, 128, 128, 128, "InactiveCaption", 17).n5(n5[17]);
         c8.l6(255, 212, 208, 200, "InactiveCaptionText", 18).n5(n5[18]);
         c8.l6(255, 255, 255, 225, "Info", 19).n5(n5[19]);
         c8.l6(255, 0, 0, 0, "InfoText", 20).n5(n5[20]);
         c8.l6(255, 212, 208, 200, "Menu", 21).n5(n5[21]);
         c8.l6(255, 0, 0, 0, "MenuText", 22).n5(n5[22]);
         c8.l6(255, 212, 208, 200, "ScrollBar", 23).n5(n5[23]);
         c8.l6(255, 255, 255, 255, "Window", 24).n5(n5[24]);
         c8.l6(255, 0, 0, 0, "WindowFrame", 25).n5(n5[25]);
         c8.l6(255, 0, 0, 0, "WindowText", 26).n5(n5[26]);
         c8.l6(255, 192, 192, 192, "ButtonFace", 168).n5(n5[168]);
         c8.l6(255, 255, 255, 255, "ButtonHighlight", 169).n5(n5[169]);
         c8.l6(255, 128, 128, 128, "ButtonShadow", 170).n5(n5[170]);
         c8.l6(255, 16, 132, 208, "GradientActiveCaption", 171).n5(n5[171]);
         c8.l6(255, 181, 181, 181, "GradientInactiveCaption", 172).n5(n5[172]);
         c8.l6(255, 192, 192, 192, "MenuBar", 173).n5(n5[173]);
         c8.l6(255, 0, 0, 0, "MenuHighlight", 174).n5(n5[174]);
      } else {
         n5[1] = n5(SystemColor.activeCaptionBorder, "ActiveBorder", 1);
         n5[2] = n5(SystemColor.activeCaption, "ActiveCaption", 2);
         n5[3] = n5(SystemColor.activeCaptionText, "ActiveCaptionText", 3);
         n5[4] = n5(SystemColor.desktop, "AppWorkspace", 4);
         n5[5] = n5(SystemColor.control, "Control", 5);
         n5[6] = n5(SystemColor.controlShadow, "ControlDark", 6);
         n5[7] = n5(SystemColor.controlDkShadow, "ControlDarkDark", 7);
         n5[8] = n5(SystemColor.controlHighlight, "ControlLight", 8);
         n5[9] = n5(SystemColor.controlLtHighlight, "ControlLightLight", 9);
         n5[10] = n5(SystemColor.controlText, "ControlText", 10);
         n5[11] = n5(SystemColor.desktop, "Desktop", 11);
         n5[12] = n5(SystemColor.textInactiveText, "GrayText", 12);
         n5[13] = n5(SystemColor.textHighlight, "Highlight", 13);
         n5[14] = n5(SystemColor.textHighlightText, "HighlightText", 14);
         n5[15] = n5(SystemColor.textText, "HotTrack", 15);
         n5[16] = n5(SystemColor.inactiveCaptionBorder, "InactiveBorder", 16);
         n5[17] = n5(SystemColor.inactiveCaption, "InactiveCaption", 17);
         n5[18] = n5(SystemColor.inactiveCaptionText, "InactiveCaptionText", 18);
         n5[19] = n5(SystemColor.info, "Info", 19);
         n5[20] = n5(SystemColor.infoText, "InfoText", 20);
         n5[21] = n5(SystemColor.menu, "Menu", 21);
         n5[22] = n5(SystemColor.menuText, "MenuText", 22);
         n5[23] = n5(SystemColor.scrollbar, "ScrollBar", 23);
         n5[24] = n5(SystemColor.window, "Window", 24);
         n5[25] = n5(SystemColor.windowBorder, "WindowFrame", 25);
         n5[26] = n5(SystemColor.windowText, "WindowText", 26);
         n5[168] = n5(SystemColor.control, "ButtonFace", 168);
         n5[169] = n5(SystemColor.controlHighlight, "ButtonHighlight", 169);
         n5[170] = n5(SystemColor.controlShadow, "ButtonShadow", 170);
         n5[171] = n5(SystemColor.activeCaption, "GradientActiveCaption", 171);
         n5[172] = n5(SystemColor.inactiveCaption, "GradientInactiveCaption", 172);
         n5[173] = n5(SystemColor.menu, "MenuBar", 173);
         n5[174] = n5(SystemColor.menu, "MenuHighlight", 174);
      }

      c8[] var0 = new c8[]{
         c8.n5(0, 255, 255, 255, "Transparent", 27),
         c8.n5(255, 240, 248, 255, "AliceBlue", 28),
         c8.n5(255, 250, 235, 215, "AntiqueWhite", 29),
         c8.n5(255, 0, 255, 255, "Aqua", 30),
         c8.n5(255, 127, 255, 212, "Aquamarine", 31),
         c8.n5(255, 240, 255, 255, "Azure", 32),
         c8.n5(255, 245, 245, 220, "Beige", 33),
         c8.n5(255, 255, 228, 196, "Bisque", 34),
         c8.n5(255, 0, 0, 0, "Black", 35),
         c8.n5(255, 255, 235, 205, "BlanchedAlmond", 36),
         c8.n5(255, 0, 0, 255, "Blue", 37),
         c8.n5(255, 138, 43, 226, "BlueViolet", 38),
         c8.n5(255, 165, 42, 42, "Brown", 39),
         c8.n5(255, 222, 184, 135, "BurlyWood", 40),
         c8.n5(255, 95, 158, 160, "CadetBlue", 41),
         c8.n5(255, 127, 255, 0, "Chartreuse", 42),
         c8.n5(255, 210, 105, 30, "Chocolate", 43),
         c8.n5(255, 255, 127, 80, "Coral", 44),
         c8.n5(255, 100, 149, 237, "CornflowerBlue", 45),
         c8.n5(255, 255, 248, 220, "Cornsilk", 46),
         c8.n5(255, 220, 20, 60, "Crimson", 47),
         c8.n5(255, 0, 255, 255, "Cyan", 48),
         c8.n5(255, 0, 0, 139, "DarkBlue", 49),
         c8.n5(255, 0, 139, 139, "DarkCyan", 50),
         c8.n5(255, 184, 134, 11, "DarkGoldenrod", 51),
         c8.n5(255, 169, 169, 169, "DarkGray", 52),
         c8.n5(255, 0, 100, 0, "DarkGreen", 53),
         c8.n5(255, 189, 183, 107, "DarkKhaki", 54),
         c8.n5(255, 139, 0, 139, "DarkMagenta", 55),
         c8.n5(255, 85, 107, 47, "DarkOliveGreen", 56),
         c8.n5(255, 255, 140, 0, "DarkOrange", 57),
         c8.n5(255, 153, 50, 204, "DarkOrchid", 58),
         c8.n5(255, 139, 0, 0, "DarkRed", 59),
         c8.n5(255, 233, 150, 122, "DarkSalmon", 60),
         c8.n5(255, 143, 188, 139, "DarkSeaGreen", 61),
         c8.n5(255, 72, 61, 139, "DarkSlateBlue", 62),
         c8.n5(255, 47, 79, 79, "DarkSlateGray", 63),
         c8.n5(255, 0, 206, 209, "DarkTurquoise", 64),
         c8.n5(255, 148, 0, 211, "DarkViolet", 65),
         c8.n5(255, 255, 20, 147, "DeepPink", 66),
         c8.n5(255, 0, 191, 255, "DeepSkyBlue", 67),
         c8.n5(255, 105, 105, 105, "DimGray", 68),
         c8.n5(255, 30, 144, 255, "DodgerBlue", 69),
         c8.n5(255, 178, 34, 34, "Firebrick", 70),
         c8.n5(255, 255, 250, 240, "FloralWhite", 71),
         c8.n5(255, 34, 139, 34, "ForestGreen", 72),
         c8.n5(255, 255, 0, 255, "Fuchsia", 73),
         c8.n5(255, 220, 220, 220, "Gainsboro", 74),
         c8.n5(255, 248, 248, 255, "GhostWhite", 75),
         c8.n5(255, 255, 215, 0, "Gold", 76),
         c8.n5(255, 218, 165, 32, "Goldenrod", 77),
         c8.n5(255, 128, 128, 128, "Gray", 78),
         c8.n5(255, 0, 128, 0, "Green", 79),
         c8.n5(255, 173, 255, 47, "GreenYellow", 80),
         c8.n5(255, 240, 255, 240, "Honeydew", 81),
         c8.n5(255, 255, 105, 180, "HotPink", 82),
         c8.n5(255, 205, 92, 92, "IndianRed", 83),
         c8.n5(255, 75, 0, 130, "Indigo", 84),
         c8.n5(255, 255, 255, 240, "Ivory", 85),
         c8.n5(255, 240, 230, 140, "Khaki", 86),
         c8.n5(255, 230, 230, 250, "Lavender", 87),
         c8.n5(255, 255, 240, 245, "LavenderBlush", 88),
         c8.n5(255, 124, 252, 0, "LawnGreen", 89),
         c8.n5(255, 255, 250, 205, "LemonChiffon", 90),
         c8.n5(255, 173, 216, 230, "LightBlue", 91),
         c8.n5(255, 240, 128, 128, "LightCoral", 92),
         c8.n5(255, 224, 255, 255, "LightCyan", 93),
         c8.n5(255, 250, 250, 210, "LightGoldenrodYellow", 94),
         c8.n5(255, 211, 211, 211, "LightGray", 95),
         c8.n5(255, 144, 238, 144, "LightGreen", 96),
         c8.n5(255, 255, 182, 193, "LightPink", 97),
         c8.n5(255, 255, 160, 122, "LightSalmon", 98),
         c8.n5(255, 32, 178, 170, "LightSeaGreen", 99),
         c8.n5(255, 135, 206, 250, "LightSkyBlue", 100),
         c8.n5(255, 119, 136, 153, "LightSlateGray", 101),
         c8.n5(255, 176, 196, 222, "LightSteelBlue", 102),
         c8.n5(255, 255, 255, 224, "LightYellow", 103),
         c8.n5(255, 0, 255, 0, "Lime", 104),
         c8.n5(255, 50, 205, 50, "LimeGreen", 105),
         c8.n5(255, 250, 240, 230, "Linen", 106),
         c8.n5(255, 255, 0, 255, "Magenta", 107),
         c8.n5(255, 128, 0, 0, "Maroon", 108),
         c8.n5(255, 102, 205, 170, "MediumAquamarine", 109),
         c8.n5(255, 0, 0, 205, "MediumBlue", 110),
         c8.n5(255, 186, 85, 211, "MediumOrchid", 111),
         c8.n5(255, 147, 112, 219, "MediumPurple", 112),
         c8.n5(255, 60, 179, 113, "MediumSeaGreen", 113),
         c8.n5(255, 123, 104, 238, "MediumSlateBlue", 114),
         c8.n5(255, 0, 250, 154, "MediumSpringGreen", 115),
         c8.n5(255, 72, 209, 204, "MediumTurquoise", 116),
         c8.n5(255, 199, 21, 133, "MediumVioletRed", 117),
         c8.n5(255, 25, 25, 112, "MidnightBlue", 118),
         c8.n5(255, 245, 255, 250, "MintCream", 119),
         c8.n5(255, 255, 228, 225, "MistyRose", 120),
         c8.n5(255, 255, 228, 181, "Moccasin", 121),
         c8.n5(255, 255, 222, 173, "NavajoWhite", 122),
         c8.n5(255, 0, 0, 128, "Navy", 123),
         c8.n5(255, 253, 245, 230, "OldLace", 124),
         c8.n5(255, 128, 128, 0, "Olive", 125),
         c8.n5(255, 107, 142, 35, "OliveDrab", 126),
         c8.n5(255, 255, 165, 0, "Orange", 127),
         c8.n5(255, 255, 69, 0, "OrangeRed", 128),
         c8.n5(255, 218, 112, 214, "Orchid", 129),
         c8.n5(255, 238, 232, 170, "PaleGoldenrod", 130),
         c8.n5(255, 152, 251, 152, "PaleGreen", 131),
         c8.n5(255, 175, 238, 238, "PaleTurquoise", 132),
         c8.n5(255, 219, 112, 147, "PaleVioletRed", 133),
         c8.n5(255, 255, 239, 213, "PapayaWhip", 134),
         c8.n5(255, 255, 218, 185, "PeachPuff", 135),
         c8.n5(255, 205, 133, 63, "Peru", 136),
         c8.n5(255, 255, 192, 203, "Pink", 137),
         c8.n5(255, 221, 160, 221, "Plum", 138),
         c8.n5(255, 176, 224, 230, "PowderBlue", 139),
         c8.n5(255, 128, 0, 128, "Purple", 140),
         c8.n5(255, 255, 0, 0, "Red", 141),
         c8.n5(255, 188, 143, 143, "RosyBrown", 142),
         c8.n5(255, 65, 105, 225, "RoyalBlue", 143),
         c8.n5(255, 139, 69, 19, "SaddleBrown", 144),
         c8.n5(255, 250, 128, 114, "Salmon", 145),
         c8.n5(255, 244, 164, 96, "SandyBrown", 146),
         c8.n5(255, 46, 139, 87, "SeaGreen", 147),
         c8.n5(255, 255, 245, 238, "SeaShell", 148),
         c8.n5(255, 160, 82, 45, "Sienna", 149),
         c8.n5(255, 192, 192, 192, "Silver", 150),
         c8.n5(255, 135, 206, 235, "SkyBlue", 151),
         c8.n5(255, 106, 90, 205, "SlateBlue", 152),
         c8.n5(255, 112, 128, 144, "SlateGray", 153),
         c8.n5(255, 255, 250, 250, "Snow", 154),
         c8.n5(255, 0, 255, 127, "SpringGreen", 155),
         c8.n5(255, 70, 130, 180, "SteelBlue", 156),
         c8.n5(255, 210, 180, 140, "Tan", 157),
         c8.n5(255, 0, 128, 128, "Teal", 158),
         c8.n5(255, 216, 191, 216, "Thistle", 159),
         c8.n5(255, 255, 99, 71, "Tomato", 160),
         c8.n5(255, 64, 224, 208, "Turquoise", 161),
         c8.n5(255, 238, 130, 238, "Violet", 162),
         c8.n5(255, 245, 222, 179, "Wheat", 163),
         c8.n5(255, 255, 255, 255, "White", 164),
         c8.n5(255, 245, 245, 245, "WhiteSmoke", 165),
         c8.n5(255, 255, 255, 0, "Yellow", 166),
         c8.n5(255, 154, 205, 50, "YellowGreen", 167)
      };
      com.aspose.slides.ms.System.u3.n5(var0, 0, n5, 27, var0.length);
   }
}
