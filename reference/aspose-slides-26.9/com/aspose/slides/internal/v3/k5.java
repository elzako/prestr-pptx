package com.aspose.slides.internal.v3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.b3.z8;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e2;
import com.aspose.slides.ms.System.n1;

public class k5 {
   private static final Dictionary<String, com.aspose.slides.internal.o9b.c8> n5 = new Dictionary<>();

   public static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.y1.u3 var0, String var1) {
      if (var1 == null) {
         return com.aspose.slides.internal.o9b.c8.u3;
      }

      com.aspose.slides.internal.o9b.c8 var2 = com.aspose.slides.internal.o9b.c8.u3.o8();
      if (n5.containsKey(d1.u9(var1))) {
         n5.get_Item(d1.u9(var1)).n5(var2);
      }

      if (!var2.t2()) {
         return var2;
      }

      if (d1.l6(var1, "#")) {
         a6(var1).n5(var2);
      } else if (d1.l6(var1, "rgb(")) {
         u3(var1).n5(var2);
      } else {
         if (d1.l6(var1, "url(")) {
            throw new z8("Colors starting with url( are not yet supported!");
         }

         if (d1.l6(var1, "java.awt.Color")) {
            k5(var1).n5(var2);
         } else if (d1.l6(var1, "system-color(")) {
            l6(var1).n5(var2);
         } else {
            if (d1.l6(var1, "fop-rgb-icc")) {
               throw new Exception("Color space fop-rgb-icc is not supported");
            }

            if (d1.l6(var1, "fop-rgb-named-color")) {
               throw new Exception("Color space fop-rgb-named-color is not supported");
            }

            if (d1.l6(var1, "cie-lab-color")) {
               throw new Exception("Color space cie-lab-color is not supported");
            }

            if (d1.l6(var1, "cmyk")) {
               throw new Exception("Color space cmyk is not supported");
            }
         }
      }

      if (var2.t2()) {
         throw new z8(d1.n5(new String[]{"Unknown Color: ", var1}));
      }

      n5.set_Item(var1, var2.o8());
      return var2;
   }

   private static com.aspose.slides.internal.o9b.c8 l6(String var0) {
      int var1 = d1.c8(var0, "(");
      int var2 = d1.c8(var0, ")");
      if (var1 != -1 && var2 != -1) {
         var0 = x8.n5(var0, var1 + 1, var2);
         com.aspose.slides.internal.o9b.c8 var3 = new com.aspose.slides.internal.o9b.c8();
         com.aspose.slides.internal.o9b.c8[] var4 = new com.aspose.slides.internal.o9b.c8[]{var3};
         n5.tryGetValue(var0, var4);
         var4[0].n5(var3);
         return var3;
      } else {
         throw new z8(d1.n5(new String[]{"Unknown color format: ", var0, ". Must be system-color(x)"}));
      }
   }

   private static com.aspose.slides.internal.o9b.c8 k5(String var0) {
      float var1 = 0.0F;
      float var2 = 0.0F;
      float var3 = 0.0F;
      int var4 = d1.c8(var0, "[");
      int var5 = d1.c8(var0, "]");

      try {
         if (var4 == -1 || var5 == -1) {
            throw new ArgumentException(d1.n5(new String[]{"Invalid format for a java.awt.Color: ", var0}));
         }

         var0 = x8.n5(var0, var4 + 1, var5);
         String[] var6 = d1.n5(var0, ',');
         if (var6.length != 3) {
            throw new z8(d1.n5(new String[]{"Invalid number of arguments for a java.awt.Color: ", var0}));
         }

         var1 = n1.n5(d1.k5(d1.l6(var6[0]), 2), 511, com.aspose.slides.internal.r4.k5.n5.n5()) / 255.0F;
         var2 = n1.n5(d1.k5(d1.l6(var6[1]), 2), 511, com.aspose.slides.internal.r4.k5.n5.n5()) / 255.0F;
         var3 = n1.n5(d1.k5(d1.l6(var6[2]), 2), 511, com.aspose.slides.internal.r4.k5.n5.n5()) / 255.0F;
         if (var1 < 0.0 || var1 > 1.0 || var2 < 0.0 || var2 > 1.0 || var3 < 0.0 || var3 > 1.0) {
            throw new z8("Color values out of range");
         }
      } catch (RuntimeException var7) {
         throw new z8(var7.getMessage());
      }

      return com.aspose.slides.internal.o9b.c8.n5(
         com.aspose.slides.internal.v6g.k5.u3(var1 * 255.0F + 0.5F, 13),
         com.aspose.slides.internal.v6g.k5.u3(var2 * 255.0F + 0.5F, 13),
         com.aspose.slides.internal.v6g.k5.u3(var3 * 255.0F + 0.5F, 13)
      );
   }

   private static com.aspose.slides.internal.o9b.c8 u3(String var0) {
      com.aspose.slides.internal.o9b.c8 var1 = new com.aspose.slides.internal.o9b.c8();
      int var2 = d1.c8(var0, "(");
      int var3 = d1.c8(var0, ")");
      if (var2 != -1 && var3 != -1) {
         var0 = x8.n5(var0, var2 + 1, var3);

         try {
            String[] var4 = d1.n5(var0, ',');
            if (var4.length != 3) {
               throw new z8(d1.n5(new String[]{"Invalid number of arguments: rgb(", var0, ")"}));
            }

            float var5 = n5(var4[0], var0);
            float var6 = n5(var4[1], var0);
            float var7 = n5(var4[2], var0);
            int var8 = com.aspose.slides.internal.v6g.k5.u3(var5 * 255.0F + 0.5, 14);
            int var9 = com.aspose.slides.internal.v6g.k5.u3(var6 * 255.0F + 0.5, 14);
            int var10 = com.aspose.slides.internal.v6g.k5.u3(var7 * 255.0F + 0.5, 14);
            com.aspose.slides.internal.o9b.c8.n5(var8, var9, var10).n5(var1);
            return var1;
         } catch (RuntimeException var11) {
            throw new z8(var11.getMessage());
         }
      } else {
         throw new z8(d1.n5(new String[]{"Unknown color format: ", var0, ". Must be rgb(r,g,b)"}));
      }
   }

   private static float n5(String var0, String var1) {
      var0 = d1.l6(var0);
      float var2;
      if (d1.k5(var0, "%")) {
         var2 = n1.n5(x8.n5(var0, 0, var0.length() - 1), 511, com.aspose.slides.internal.r4.k5.n5.n5()) / 100.0F;
      } else {
         var2 = n1.n5(var0, 511, com.aspose.slides.internal.r4.k5.n5.n5()) / 255.0F;
      }

      if (!(var2 < 0.0) && !(var2 > 1.0)) {
         return var2;
      } else {
         throw new z8(d1.n5(new String[]{"Color value out of range for ", var1, ": ", var0, ". Valid range: [0..255] or [0%..100%]"}));
      }
   }

   private static com.aspose.slides.internal.o9b.c8 a6(String var0) {
      com.aspose.slides.internal.o9b.c8 var1 = new com.aspose.slides.internal.o9b.c8();

      try {
         int var2 = var0.length();
         int var3;
         switch (var2) {
            case 5:
               var3 = a3.n5(d1.k5(var0, 3), 515);
               break;
            case 9:
               var3 = a3.n5(x8.n5(var0, 1, 3), 515);
               break;
            default:
               var3 = 255;
         }

         int var4;
         int var5;
         int var6;
         switch (var2) {
            case 4:
            case 5:
               var4 = a3.n5(x8.n5(var0, 1, 2), 515) * 17;
               var5 = a3.n5(x8.n5(var0, 2, 3), 515) * 17;
               var6 = a3.n5(x8.n5(var0, 3, 4), 515) * 17;
               break;
            case 6:
            case 8:
            default:
               throw new Exception();
            case 7:
               var4 = a3.n5(x8.n5(var0, 1, 3), 515);
               var5 = a3.n5(x8.n5(var0, 3, 5), 515);
               var6 = a3.n5(x8.n5(var0, 5, 7), 515);
               break;
            case 9:
               var4 = a3.n5(x8.n5(var0, 3, 5), 515);
               var5 = a3.n5(x8.n5(var0, 5, 7), 515);
               var6 = a3.n5(x8.n5(var0, 7, 9), 515);
         }

         com.aspose.slides.internal.o9b.c8.n5(var3, var4, var5, var6).n5(var1);
         return var1;
      } catch (RuntimeException var7) {
         throw new z8(d1.n5(new String[]{"Unknown color format: ", var0, ". Must be #RGB. #RGBA, #RRGGBB, or #AARRGGBB"}));
      }
   }

   public static String n5(com.aspose.slides.internal.o9b.c8 var0) {
      return l6(var0.o8());
   }

   private static String l6(com.aspose.slides.internal.o9b.c8 var0) {
      a5 var1 = new a5();
      var1.n5('#');
      String var2 = e2.n5(var0.x8(), "X");
      if (var2.length() == 1) {
         var1.n5('0');
      }

      var1.n5(var2);
      var2 = e2.n5(var0.n3(), "X");
      if (var2.length() == 1) {
         var1.n5('0');
      }

      var1.n5(var2);
      var2 = e2.n5(var0.y4(), "X");
      if (var2.length() == 1) {
         var1.n5('0');
      }

      var1.n5(var2);
      if ((var0.s7() & 255) != 255) {
         var2 = e2.n5(var0.s7(), "X");
         if (var2.length() == 1) {
            var1.n5('0');
         }

         var1.n5(var2);
      }

      return var1.toString();
   }

   private static com.aspose.slides.internal.o9b.c8 n5(int var0, int var1, int var2) {
      return com.aspose.slides.internal.o9b.c8.n5(var0, var1, var2);
   }

   public static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, float var1) {
      if (n5(var1)) {
         return var0;
      } else if (l6(var1)) {
         return com.aspose.slides.internal.o9b.c8.w4();
      } else {
         return k5(var1) ? l6(var0.o8(), var1) : k5(var0.o8(), var1);
      }
   }

   private static boolean n5(float var0) {
      float var1 = var0 - 1.0F;
      return var1 < 0.01F && var1 > -0.01F;
   }

   private static boolean l6(float var0) {
      return var0 >= 2.0F;
   }

   private static boolean k5(float var0) {
      return var0 < 1.0F;
   }

   private static com.aspose.slides.internal.o9b.c8 l6(com.aspose.slides.internal.o9b.c8 var0, float var1) {
      int var2 = l6(var0.x8(), var1) & 255;
      int var3 = l6(var0.n3(), var1) & 255;
      int var4 = l6(var0.y4(), var1) & 255;
      return com.aspose.slides.internal.o9b.c8.n5(var2, var3, var4);
   }

   private static com.aspose.slides.internal.o9b.c8 k5(com.aspose.slides.internal.o9b.c8 var0, float var1) {
      float var2 = var1;
      if (var2 > 1.0F) {
         var2--;
      }

      int var3 = n5(var0.x8(), var2) & 255;
      int var4 = n5(var0.n3(), var2) & 255;
      int var5 = n5(var0.y4(), var2) & 255;
      return com.aspose.slides.internal.o9b.c8.n5(var3, var4, var5);
   }

   private static byte n5(byte var0, float var1) {
      int var2 = 255 - (var0 & 255);
      var0 = (byte)((var0 & 255) + (com.aspose.slides.internal.v6g.k5.n5((Object)(var2 * var1), 13) & 255));
      return (var0 & 255) < 255 ? var0 : -1;
   }

   private static byte l6(byte var0, float var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3((var0 & 0xFF) - (var0 & 0xFF) * -var1, 13);
      return var2 < 255 ? (byte)var2 : -1;
   }

   public static boolean n5(String var0) {
      String var1 = d1.u9(var0);
      return d1.a6(d1.u9("#CMYK"), var1) || d1.a6(d1.u9("#Separation"), var1);
   }

   static {
      n5.addItem("aliceblue", n5(240, 248, 255).o8());
      n5.addItem("antiquewhite", n5(250, 235, 215).o8());
      n5.addItem("aqua", n5(0, 255, 255).o8());
      n5.addItem("aquamarine", n5(127, 255, 212).o8());
      n5.addItem("azure", n5(240, 255, 255).o8());
      n5.addItem("beige", n5(245, 245, 220).o8());
      n5.addItem("bisque", n5(255, 228, 196).o8());
      n5.addItem("black", n5(0, 0, 0).o8());
      n5.addItem("blanchedalmond", n5(255, 235, 205).o8());
      n5.addItem("blue", n5(0, 0, 255).o8());
      n5.addItem("blueviolet", n5(138, 43, 226).o8());
      n5.addItem("brown", n5(165, 42, 42).o8());
      n5.addItem("burlywood", n5(222, 184, 135).o8());
      n5.addItem("cadetblue", n5(95, 158, 160).o8());
      n5.addItem("chartreuse", n5(127, 255, 0).o8());
      n5.addItem("chocolate", n5(210, 105, 30).o8());
      n5.addItem("coral", n5(255, 127, 80).o8());
      n5.addItem("cornflowerblue", n5(100, 149, 237).o8());
      n5.addItem("cornsilk", n5(255, 248, 220).o8());
      n5.addItem("crimson", n5(220, 20, 60).o8());
      n5.addItem("cyan", n5(0, 255, 255).o8());
      n5.addItem("darkblue", n5(0, 0, 139).o8());
      n5.addItem("darkcyan", n5(0, 139, 139).o8());
      n5.addItem("darkgoldenrod", n5(184, 134, 11).o8());
      n5.addItem("darkgray", n5(169, 169, 169).o8());
      n5.addItem("darkgreen", n5(0, 100, 0).o8());
      n5.addItem("darkgrey", n5(169, 169, 169).o8());
      n5.addItem("darkkhaki", n5(189, 183, 107).o8());
      n5.addItem("darkmagenta", n5(139, 0, 139).o8());
      n5.addItem("darkolivegreen", n5(85, 107, 47).o8());
      n5.addItem("darkorange", n5(255, 140, 0).o8());
      n5.addItem("darkorchid", n5(153, 50, 204).o8());
      n5.addItem("darkred", n5(139, 0, 0).o8());
      n5.addItem("darksalmon", n5(233, 150, 122).o8());
      n5.addItem("darkseagreen", n5(143, 188, 143).o8());
      n5.addItem("darkslateblue", n5(72, 61, 139).o8());
      n5.addItem("darkslategray", n5(47, 79, 79).o8());
      n5.addItem("darkslategrey", n5(47, 79, 79).o8());
      n5.addItem("darkturquoise", n5(0, 206, 209).o8());
      n5.addItem("darkviolet", n5(148, 0, 211).o8());
      n5.addItem("deeppink", n5(255, 20, 147).o8());
      n5.addItem("deepskyblue", n5(0, 191, 255).o8());
      n5.addItem("dimgray", n5(105, 105, 105).o8());
      n5.addItem("dimgrey", n5(105, 105, 105).o8());
      n5.addItem("dodgerblue", n5(30, 144, 255).o8());
      n5.addItem("firebrick", n5(178, 34, 34).o8());
      n5.addItem("floralwhite", n5(255, 250, 240).o8());
      n5.addItem("forestgreen", n5(34, 139, 34).o8());
      n5.addItem("fuchsia", n5(255, 0, 255).o8());
      n5.addItem("gainsboro", n5(220, 220, 220).o8());
      n5.addItem("ghostwhite", n5(248, 248, 255).o8());
      n5.addItem("gold", n5(255, 215, 0).o8());
      n5.addItem("goldenrod", n5(218, 165, 32).o8());
      n5.addItem("gray", n5(128, 128, 128).o8());
      n5.addItem("green", n5(0, 128, 0).o8());
      n5.addItem("greenyellow", n5(173, 255, 47).o8());
      n5.addItem("grey", n5(128, 128, 128).o8());
      n5.addItem("honeydew", n5(240, 255, 240).o8());
      n5.addItem("hotpink", n5(255, 105, 180).o8());
      n5.addItem("indianred", n5(205, 92, 92).o8());
      n5.addItem("indigo", n5(75, 0, 130).o8());
      n5.addItem("ivory", n5(255, 255, 240).o8());
      n5.addItem("khaki", n5(240, 230, 140).o8());
      n5.addItem("lavender", n5(230, 230, 250).o8());
      n5.addItem("lavenderblush", n5(255, 240, 245).o8());
      n5.addItem("lawngreen", n5(124, 252, 0).o8());
      n5.addItem("lemonchiffon", n5(255, 250, 205).o8());
      n5.addItem("lightblue", n5(173, 216, 230).o8());
      n5.addItem("lightcoral", n5(240, 128, 128).o8());
      n5.addItem("lightcyan", n5(224, 255, 255).o8());
      n5.addItem("lightgoldenrodyellow", n5(250, 250, 210).o8());
      n5.addItem("lightgray", n5(211, 211, 211).o8());
      n5.addItem("lightgreen", n5(144, 238, 144).o8());
      n5.addItem("lightgrey", n5(211, 211, 211).o8());
      n5.addItem("lightpink", n5(255, 182, 193).o8());
      n5.addItem("lightsalmon", n5(255, 160, 122).o8());
      n5.addItem("lightseagreen", n5(32, 178, 170).o8());
      n5.addItem("lightskyblue", n5(135, 206, 250).o8());
      n5.addItem("lightslategray", n5(119, 136, 153).o8());
      n5.addItem("lightslategrey", n5(119, 136, 153).o8());
      n5.addItem("lightsteelblue", n5(176, 196, 222).o8());
      n5.addItem("lightyellow", n5(255, 255, 224).o8());
      n5.addItem("lime", n5(0, 255, 0).o8());
      n5.addItem("limegreen", n5(50, 205, 50).o8());
      n5.addItem("linen", n5(250, 240, 230).o8());
      n5.addItem("magenta", n5(255, 0, 255).o8());
      n5.addItem("maroon", n5(128, 0, 0).o8());
      n5.addItem("mediumaquamarine", n5(102, 205, 170).o8());
      n5.addItem("mediumblue", n5(0, 0, 205).o8());
      n5.addItem("mediumorchid", n5(186, 85, 211).o8());
      n5.addItem("mediumpurple", n5(147, 112, 219).o8());
      n5.addItem("mediumseagreen", n5(60, 179, 113).o8());
      n5.addItem("mediumslateblue", n5(123, 104, 238).o8());
      n5.addItem("mediumspringgreen", n5(0, 250, 154).o8());
      n5.addItem("mediumturquoise", n5(72, 209, 204).o8());
      n5.addItem("mediumvioletred", n5(199, 21, 133).o8());
      n5.addItem("midnightblue", n5(25, 25, 112).o8());
      n5.addItem("mintcream", n5(245, 255, 250).o8());
      n5.addItem("mistyrose", n5(255, 228, 225).o8());
      n5.addItem("moccasin", n5(255, 228, 181).o8());
      n5.addItem("navajowhite", n5(255, 222, 173).o8());
      n5.addItem("navy", n5(0, 0, 128).o8());
      n5.addItem("oldlace", n5(253, 245, 230).o8());
      n5.addItem("olive", n5(128, 128, 0).o8());
      n5.addItem("olivedrab", n5(107, 142, 35).o8());
      n5.addItem("orange", n5(255, 165, 0).o8());
      n5.addItem("orangered", n5(255, 69, 0).o8());
      n5.addItem("orchid", n5(218, 112, 214).o8());
      n5.addItem("palegoldenrod", n5(238, 232, 170).o8());
      n5.addItem("palegreen", n5(152, 251, 152).o8());
      n5.addItem("paleturquoise", n5(175, 238, 238).o8());
      n5.addItem("palevioletred", n5(219, 112, 147).o8());
      n5.addItem("papayawhip", n5(255, 239, 213).o8());
      n5.addItem("peachpuff", n5(255, 218, 185).o8());
      n5.addItem("peru", n5(205, 133, 63).o8());
      n5.addItem("pink", n5(255, 192, 203).o8());
      n5.addItem("plum ", n5(221, 160, 221).o8());
      n5.addItem("plum", n5(221, 160, 221).o8());
      n5.addItem("powderblue", n5(176, 224, 230).o8());
      n5.addItem("purple", n5(128, 0, 128).o8());
      n5.addItem("red", n5(255, 0, 0).o8());
      n5.addItem("rosybrown", n5(188, 143, 143).o8());
      n5.addItem("royalblue", n5(65, 105, 225).o8());
      n5.addItem("saddlebrown", n5(139, 69, 19).o8());
      n5.addItem("salmon", n5(250, 128, 114).o8());
      n5.addItem("sandybrown", n5(244, 164, 96).o8());
      n5.addItem("seagreen", n5(46, 139, 87).o8());
      n5.addItem("seashell", n5(255, 245, 238).o8());
      n5.addItem("sienna", n5(160, 82, 45).o8());
      n5.addItem("silver", n5(192, 192, 192).o8());
      n5.addItem("skyblue", n5(135, 206, 235).o8());
      n5.addItem("slateblue", n5(106, 90, 205).o8());
      n5.addItem("slategray", n5(112, 128, 144).o8());
      n5.addItem("slategrey", n5(112, 128, 144).o8());
      n5.addItem("snow", n5(255, 250, 250).o8());
      n5.addItem("springgreen", n5(0, 255, 127).o8());
      n5.addItem("steelblue", n5(70, 130, 180).o8());
      n5.addItem("tan", n5(210, 180, 140).o8());
      n5.addItem("teal", n5(0, 128, 128).o8());
      n5.addItem("thistle", n5(216, 191, 216).o8());
      n5.addItem("tomato", n5(255, 99, 71).o8());
      n5.addItem("turquoise", n5(64, 224, 208).o8());
      n5.addItem("violet", n5(238, 130, 238).o8());
      n5.addItem("wheat", n5(245, 222, 179).o8());
      n5.addItem("white", n5(255, 255, 255).o8());
      n5.addItem("whitesmoke", n5(245, 245, 245).o8());
      n5.addItem("yellow", n5(255, 255, 0).o8());
      n5.addItem("yellowgreen", n5(154, 205, 50).o8());
      n5.addItem("transparent", com.aspose.slides.internal.o9b.c8.n5(0, 0, 0, 0).o8());
   }
}
