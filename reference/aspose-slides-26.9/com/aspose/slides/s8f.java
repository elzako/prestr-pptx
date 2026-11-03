package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.DOMResourcesUtils;

class s8f {
   private static final String[] n5 = new String[]{
      "05",
      "10",
      "20",
      "25",
      "30",
      "40",
      "50",
      "60",
      "70",
      "75",
      "80",
      "90",
      "Dark Horizontal",
      "Dark Vertical",
      "Dark Downward Diagonal",
      "Dark Upward Diagonal",
      "Small Checker Board",
      "Trellis",
      "Light Horizontal",
      "Light Vertical",
      "Light Downward Diagonal",
      "Light Upward Diagonal",
      "Small Grid",
      "Dotted Diamond",
      "Wide Downward Diagonal",
      "Wide Upward Diagonal",
      "Dashed Downward Diagonal",
      "Dashed Upward Diagonal",
      "Narrow Vertical",
      "Narrow Horizontal",
      "Dashed Vertical",
      "Dashed Horizontal",
      "Large Confetti",
      "Large Grid",
      "Horizontal Brick",
      "Large Checker Board",
      "Small Confetti",
      "Zigzag",
      "Solid Diamond",
      "Diagonal Brick",
      "Outlined Diamond",
      "Plaid",
      "Sphere",
      "Weave",
      "Dotted Grid",
      "Divot",
      "Shingle",
      "Wave"
   };
   private static final Dictionary<Byte, Byte> l6 = new Dictionary<>();

   static void n5(PatternFormat var0, boolean var1, a9x var2) {
      com.aspose.slides.internal.k0r.q5 var3 = var2.n3();
      if (var1) {
         u0b.n5((ColorFormat)var0.getForeColor(), var3, 448, 449, 0L);
         u0b.n5((ColorFormat)var0.getBackColor(), var3, 450, 388, 16777215L);
      } else {
         u0b.n5((ColorFormat)var0.getForeColor(), var3, 385, 386, 16777215L);
         u0b.n5((ColorFormat)var0.getBackColor(), var3, 387, 388, 16777215L);
      }

      d5f var4 = var2.y4().a6();
      com.aspose.slides.internal.k0r.z5 var5 = com.aspose.slides.internal.v6g.k5.n5(
         com.aspose.slides.internal.k0r.c2.l6(var3, var1 ? 453 : 390), com.aspose.slides.internal.k0r.z5.class
      );
      var0.setPatternStyle((byte)0);
      if (var5 != null) {
         SortedList var6 = var4.t2();
         y8g var7 = null;
         y8g[] var8 = new y8g[]{var7};
         boolean var9 = var6.tryGetValue((int)var5.j5(), var8);
         var7 = var8[0];
         if (var9) {
            byte var10 = 0;
            Byte[] var11 = new Byte[]{var10};
            boolean var12 = l6.tryGetValue(var7.h0(), var11);
            var10 = var11[0];
            if (var12) {
               var0.setPatternStyle(var10);
               return;
            }
         }

         com.aspose.slides.ms.System.o0 var15 = var4.t4()[(int)((var5.j5() & 4294967295L) - 1L & 4294967295L)].k5();

         for (int var16 = 1; var16 < 49; var16++) {
            com.aspose.slides.ms.System.o0 var17 = DOMResourcesUtils.getResourceGuid(
                  "resources/patterns", com.aspose.slides.ms.System.d1.n5(new String[]{n5(var16), " Guid.dat"})
               )
               .k5();
            if (com.aspose.slides.ms.System.j8.n5(var15.k5(), var17.k5())) {
               var0.setPatternStyle(s1f.h0(var16));
               return;
            }
         }
      }
   }

   static void n5(PatternFormat var0, com.aspose.slides.internal.k0r.r3 var1, boolean var2, g6o var3) {
      com.aspose.slides.internal.k0r.w8 var4 = var1.l6();
      if (var2) {
         var4.l6(new com.aspose.slides.internal.k0r.z5(452, 1L));
         u0b.n5(var0.getForeColor(), var4, 448, 449, var3);
         u0b.n5(var0.getBackColor(), var4, 450, 388, var3);
      } else {
         var4.l6(new com.aspose.slides.internal.k0r.z5(384, 1L));
         u0b.n5(var0.getForeColor(), var4, 385, 386, var3);
         u0b.n5(var0.getBackColor(), var4, 387, 388, var3);
      }

      var4.k5(390);
      if (var0.getPatternStyle() != 0 && var0.getPatternStyle() != -1) {
         com.aspose.slides.internal.k0r.z5 var5 = new com.aspose.slides.internal.k0r.z5(var2 ? 453 : 390, true, 0L);
         var4.n5(var5);
         g8h var6 = var3.n5(var5, var0.getPatternStyle());
      }
   }

   static String n5(int var0) {
      int var1 = var0 - 1;
      return var1 >= 0 && var1 < n5.length ? n5[var1] : n5[3];
   }

   static {
      l6.addItem((byte)-60, (byte)1);
      l6.addItem((byte)-52, (byte)2);
      l6.addItem((byte)-44, (byte)3);
      l6.addItem((byte)-36, (byte)4);
      l6.addItem((byte)-28, (byte)5);
      l6.addItem((byte)-20, (byte)6);
      l6.addItem((byte)-59, (byte)7);
      l6.addItem((byte)-51, (byte)8);
      l6.addItem((byte)-43, (byte)9);
      l6.addItem((byte)-35, (byte)10);
      l6.addItem((byte)-27, (byte)11);
      l6.addItem((byte)-19, (byte)12);
      l6.addItem((byte)-17, (byte)13);
      l6.addItem((byte)-25, (byte)14);
      l6.addItem((byte)-42, (byte)15);
      l6.addItem((byte)-34, (byte)16);
      l6.addItem((byte)-37, (byte)17);
      l6.addItem((byte)-22, (byte)18);
      l6.addItem((byte)-49, (byte)19);
      l6.addItem((byte)-57, (byte)20);
      l6.addItem((byte)-58, (byte)21);
      l6.addItem((byte)-50, (byte)22);
      l6.addItem((byte)-53, (byte)23);
      l6.addItem((byte)-38, (byte)24);
      l6.addItem((byte)-26, (byte)25);
      l6.addItem((byte)-18, (byte)26);
      l6.addItem((byte)-48, (byte)28);
      l6.addItem((byte)-56, (byte)27);
      l6.addItem((byte)-41, (byte)29);
      l6.addItem((byte)-33, (byte)30);
      l6.addItem((byte)-32, (byte)31);
      l6.addItem((byte)-40, (byte)32);
      l6.addItem((byte)-16, (byte)33);
      l6.addItem((byte)-45, (byte)34);
      l6.addItem((byte)-31, (byte)35);
      l6.addItem((byte)-29, (byte)36);
      l6.addItem((byte)-24, (byte)37);
      l6.addItem((byte)-55, (byte)38);
      l6.addItem((byte)-13, (byte)39);
      l6.addItem((byte)-39, (byte)40);
      l6.addItem((byte)-21, (byte)41);
      l6.addItem((byte)-15, (byte)42);
      l6.addItem((byte)-14, (byte)43);
      l6.addItem((byte)-23, (byte)44);
      l6.addItem((byte)-46, (byte)45);
      l6.addItem((byte)-54, (byte)46);
      l6.addItem((byte)-30, (byte)47);
      l6.addItem((byte)-47, (byte)48);
   }
}
