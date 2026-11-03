package com.aspose.slides.internal.b8n;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.z3;

public class l6 {
   private n3 n5;
   private n5 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cx", "cy", "r", "rx", "ry");

   public l6(n3 var1, n5 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final y2 n5(com.aspose.slides.internal.d0e.t2 var1, Dictionary<Integer, Float> var2, boolean var3) {
      float[] var4 = new float[var2.size()];
      boolean var5 = false;

      for (int var6 = 0; var6 < var2.size(); var6++) {
         var4[var6] = (Float)var2.get_Item(var6);
      }

      return new y2(var4);
   }

   private w1 n5(w1 var1, w1 var2) {
      w1 var3 = new w1();
      var3.n5(var2.l6() + (var2.l6() - var1.l6()));
      var3.l6(var2.k5() + (var2.k5() - var1.k5()));
      return var3;
   }

   public final com.aspose.slides.internal.e1.a6 n5(
      com.aspose.slides.internal.d0e.t2 var1,
      com.aspose.slides.internal.b5j.c8[] var2,
      com.aspose.slides.internal.b5j.c8 var3,
      boolean var4,
      float var5,
      float var6
   ) {
      float[] var7 = new float[8];
      List var8 = new List(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(new int[]{9, 10, 11, 12}))));
      List var9 = new List(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(new int[]{13, 14, 15, 16}))));
      if (var2[0].n5 != 9 && var2[0].n5 != 10) {
         if (var2[0].n5 == 11 || var2[0].n5 == 12) {
            if (var8.containsItem(var3.n5)) {
               var7[0] = var5;
               var7[1] = var6;
               w1 var17 = this.n5(
                     new w1(var3.k5.get_Item(var3.k5.size() - 4), var3.k5.get_Item(var3.k5.size() - 3)),
                     new w1(var3.k5.get_Item(var3.k5.size() - 2), var3.k5.get_Item(var3.k5.size() - 1))
                  )
                  .u3();
               var7[2] = var17.l6();
               var7[3] = var17.k5();
            } else {
               var7[0] = var5;
               var7[1] = var6;
               var7[2] = var5;
               var7[3] = var6;
            }

            if (var2[0].n5 == 12) {
               var7[4] = var5 + var2[0].l6.get_Item(0);
               var7[5] = var6 + var2[0].l6.get_Item(1);
               var7[6] = var5 + var2[0].l6.get_Item(2);
               var7[7] = var6 + var2[0].l6.get_Item(3);
            } else {
               var7[4] = var2[0].l6.get_Item(0);
               var7[5] = var2[0].l6.get_Item(1);
               var7[6] = var2[0].l6.get_Item(2);
               var7[7] = var2[0].l6.get_Item(3);
            }

            for (float var29 : var7) {
               var2[0].k5.addItem(var2[0].k5.size(), var29);
            }
         } else if (var2[0].n5 == 13 || var2[0].n5 == 14) {
            float[] var16 = new float[]{var5, var6, 0.0F, 0.0F, 0.0F, 0.0F};
            if (var2[0].n5 == 14) {
               var16[2] = var5 + var2[0].l6.get_Item(0);
               var16[3] = var6 + var2[0].l6.get_Item(1);
               var16[4] = var5 + var2[0].l6.get_Item(2);
               var16[5] = var6 + var2[0].l6.get_Item(3);
            } else {
               var16[2] = var2[0].l6.get_Item(0);
               var16[3] = var2[0].l6.get_Item(1);
               var16[4] = var2[0].l6.get_Item(2);
               var16[5] = var2[0].l6.get_Item(3);
            }

            var7 = com.aspose.slides.internal.a3k.n5.n5(var16);

            for (float var30 : var16) {
               var2[0].k5.addItem(var2[0].k5.size(), var30);
            }
         } else if (var2[0].n5 == 15 || var2[0].n5 == 16) {
            float[] var15 = new float[6];
            if (var9.containsItem(var3.n5)) {
               var15[0] = var5;
               var15[1] = var6;
               w1 var20 = new w1();
               this.n5(new w1(var3.k5.get_Item(var3.k5.size() - 4), var3.k5.get_Item(var3.k5.size() - 3)), new w1(var5, var6)).n5(var20);
               var15[2] = var20.l6();
               var15[3] = var20.k5();
            } else {
               var15[0] = var5;
               var15[1] = var6;
               var15[2] = var5;
               var15[3] = var6;
            }

            if (var2[0].n5 == 16) {
               var15[4] = var5 + var2[0].l6.get_Item(0);
               var15[5] = var6 + var2[0].l6.get_Item(1);
            } else {
               var15[4] = var2[0].l6.get_Item(0);
               var15[5] = var2[0].l6.get_Item(1);
            }

            var7 = com.aspose.slides.internal.a3k.n5.n5(var15);

            for (float var14 : var15) {
               var2[0].k5.addItem(var2[0].k5.size(), var14);
            }
         }
      } else {
         var7[0] = var5;
         var7[1] = var6;
         if (var2[0].n5 == 10) {
            var7[2] = var5 + var2[0].l6.get_Item(0);
            var7[3] = var6 + var2[0].l6.get_Item(1);
            var7[4] = var5 + var2[0].l6.get_Item(2);
            var7[5] = var6 + var2[0].l6.get_Item(3);
            var7[6] = var5 + var2[0].l6.get_Item(4);
            var7[7] = var6 + var2[0].l6.get_Item(5);
         } else {
            var7[2] = var2[0].l6.get_Item(0);
            var7[3] = var2[0].l6.get_Item(1);
            var7[4] = var2[0].l6.get_Item(2);
            var7[5] = var2[0].l6.get_Item(3);
            var7[6] = var2[0].l6.get_Item(4);
            var7[7] = var2[0].l6.get_Item(5);
         }

         for (float var13 : var7) {
            var2[0].k5.addItem(var2[0].k5.size(), var13);
         }
      }

      com.aspose.slides.internal.e1.u3 var19 = new com.aspose.slides.internal.e1.u3();
      var19.n5(new w1(var7[0], var7[1]));
      var19.l6(new w1(var7[2], var7[3]));
      var19.k5(new w1(var7[4], var7[5]));
      var19.u3(new w1(var7[6], var7[7]));
      return new com.aspose.slides.internal.e1.a6(var19.u9());
   }

   public final c4 n5(com.aspose.slides.internal.d0e.t2 var1, f2 var2) {
      float var3 = 0.0F;
      float var4 = 0.0F;
      float var5 = 0.0F;
      IGenericEnumerator var6 = var1.l6.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            switch (k5.n5((String)var7.getKey())) {
               case 0:
                  var3 = this.n5.n5(var1.l6.k5("cx").toString(), "cx", var1);
                  break;
               case 1:
                  var4 = this.n5.n5(var1.l6.k5("cy").toString(), "cy", var1);
                  break;
               case 2:
                  var5 = this.n5.n5(var1.l6.k5("r").toString(), "r", var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      List var15 = new List<>(com.aspose.slides.internal.a3k.n5.n5(var5, var3, var4));
      c4 var8 = new c4();

      for (int var9 = 0; var9 < var15.size(); var9++) {
         float[] var10 = (float[])var15.get_Item(var9);
         com.aspose.slides.internal.e1.u3 var11 = new com.aspose.slides.internal.e1.u3();
         var11.n5(new w1(var10[0], var10[1]));
         var11.l6(new w1(var10[2], var10[3]));
         var11.k5(new w1(var10[4], var10[5]));
         var11.u3(new w1(var10[6], var10[7]));
         com.aspose.slides.internal.e1.a6 var12 = new com.aspose.slides.internal.e1.a6(var11.u9());
         var8.n5(var12);
      }

      return var8;
   }

   public final c4 l6(com.aspose.slides.internal.d0e.t2 var1, f2 var2) {
      var1.z3();
      float var3 = 0.0F;
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      IGenericEnumerator var7 = var1.l6.iterator();

      try {
         while (var7.hasNext()) {
            KeyValuePair var8 = (KeyValuePair)var7.next();
            switch (k5.n5(((String)var8.getKey()).toString())) {
               case 0:
                  var3 = this.n5.n5(var1.l6.k5("cx").toString(), "cx", var1);
                  break;
               case 1:
                  var4 = this.n5.n5(var1.l6.k5("cy").toString(), "cy", var1);
               case 2:
               default:
                  break;
               case 3:
                  var5 = this.n5.n5(var1.l6.k5("rx").toString(), "rx", var1);
                  break;
               case 4:
                  var6 = this.n5.n5(var1.l6.k5("ry").toString(), "ry", var1);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      float var19 = var3 - var5;
      float var9 = var4 - var6;
      float var10 = var5 * 2.0F;
      float var11 = var6 * 2.0F;
      List var12 = new List<>(com.aspose.slides.internal.a3k.n5.n5(var19, var9, var10, var11));
      c4 var13 = new c4();

      for (int var14 = 0; var14 < var12.size(); var14++) {
         float[] var15 = (float[])var12.get_Item(var14);
         com.aspose.slides.internal.e1.u3 var16 = new com.aspose.slides.internal.e1.u3();
         var16.n5(new w1(var15[0], var15[1]));
         var16.l6(new w1(var15[2], var15[3]));
         var16.k5(new w1(var15[4], var15[5]));
         var16.u3(new w1(var15[6], var15[7]));
         var13.n5(new com.aspose.slides.internal.e1.a6(var16.u9()));
      }

      return var13;
   }

   public final r4 n5(com.aspose.slides.internal.d0e.t2 var1, f2 var2, boolean var3) {
      var1.z3();
      float[] var4 = this.n5(var2.a6(), var1, var3);
      r4 var5 = new r4();
      c4 var6 = new c4();
      y2 var7 = new y2(var4);
      var6.n5(var7);
      var5.n5(var6);
      var6.n5(var3);
      if (var1.l6.n5("transform")) {
         this.l6.n5(var1, var5, var2.a6());
      }

      return var5;
   }

   public final float[] n5(f2 var1, com.aspose.slides.internal.d0e.t2 var2, boolean var3) {
      String var4 = z3.t2(var2.l6.k5("points"));
      String[] var5 = d1.n5(var4, new String[]{" ", ",", "\r", "\n", "\t"}, 1);
      int var6 = var5.length;
      boolean var7 = false;
      if (var3) {
         float var8 = this.n5.n5(d1.l6(var5[0]), d1.n5, var2);
         float var9 = this.n5.n5(d1.l6(var5[1]), d1.n5, var2);
         float var10 = this.n5.n5(d1.l6(var5[var6 - 2]), d1.n5, var2);
         float var11 = this.n5.n5(d1.l6(var5[var6 - 1]), d1.n5, var2);
         var7 = q1.n5(var8 - var10) > 1.0E-5 || q1.n5(var9 - var11) > 1.0E-5;
      }

      int var12 = var6 / 2 * 2;
      float[] var13 = new float[var12 + (var7 ? 2 : 0)];

      for (int var14 = 2; var14 <= var6; var14 += 2) {
         var13[var14 - 2] = this.n5.n5(d1.l6(var5[var14 - 2]), d1.n5, var2);
         var13[var14 - 1] = this.n5.n5(d1.l6(var5[var14 - 1]), d1.n5, var2);
      }

      if (var7) {
         var13[var13.length - 2] = var13[0];
         var13[var13.length - 1] = var13[1];
      }

      return var13;
   }

   public final c4 l6(com.aspose.slides.internal.d0e.t2 var1, f2 var2, boolean var3) {
      c4 var4 = new c4();
      var1.z3();
      if (var1.l6.n5("x") && var1.l6.n5("y") && var1.l6.n5("width") && var1.l6.n5("height")) {
         float var5 = var2.l6();
         float var6 = var2.k5();
         if (var1.l6.n5("bounding-box-width")) {
            var5 = this.n5.n5(var1.l6.k5("bounding-box-width").toString(), d1.n5, var1);
         }

         if (var1.l6.n5("bounding-box-height")) {
            var6 = this.n5.n5(var1.l6.k5("bounding-box-height").toString(), d1.n5, var1);
         }

         float var7 = this.n5.n5(var1.l6.k5("width").toString(), "width", var1);
         float var8 = this.n5.n5(var1.l6.k5("height").toString(), "height", var1);
         float var9 = this.n5.n5(var1.l6.k5("x").toString(), "x", var1);
         float var10 = this.n5.n5(var1.l6.k5("y").toString(), "y", var1);
         if (!var1.l6.n5("rx") && !var1.l6.n5("ry")) {
            var4.l6(new y1(var9, var10, var7, var8));
         } else {
            y1 var11 = new y1(var9, var10, var7, var8);
            float var12 = 0.0F;
            float var13 = 0.0F;
            if (var1.l6.n5("rx")) {
               var12 = this.n5.n5(var1.l6.k5("rx").toString(), "rx", var1);
            }

            if (var1.l6.n5("ry")) {
               var13 = this.n5.n5(var1.l6.k5("ry").toString(), "ry", var1);
            }

            c4 var14 = l6$n5.n5(var11.y4(), new w1(var12, var13), new w1(var12, var13));

            for (int var15 = 0; var15 < var14.t2(); var15++) {
               var4.n5(var14.n5(var15));
            }

            var14 = l6$n5.l6(var11.y4(), new w1(var12, var13), new w1(var12, var13));

            for (int var21 = 0; var21 < var14.t2(); var21++) {
               var4.n5(var14.n5(var21));
            }

            var14 = l6$n5.k5(var11.y4(), new w1(var12, var13), new w1(var12, var13));

            for (int var22 = 0; var22 < var14.t2(); var22++) {
               var4.n5(var14.n5(var22));
            }

            var14 = l6$n5.u3(var11.y4(), new w1(var12, var13), new w1(var12, var13));

            for (int var23 = 0; var23 < var14.t2(); var23++) {
               var4.n5(var14.n5(var23));
            }
         }

         var4.n5(true);
         if (var1.l6.n5("transform")) {
            this.l6.n5(var1, var4, var2.a6());
         }

         return var4;
      } else {
         return var4;
      }
   }

   public static void n5(w1 var0, w1 var1, f2 var2, float var3, boolean var4, boolean var5, c4 var6) {
      int var7 = 0;
      int[] var8 = new int[]{0};
      List var9 = com.aspose.slides.internal.b5j.k5.n5(var0.l6(), var0.k5(), var2.l6(), var2.k5(), var3, var4, var5, var1.l6(), var1.k5(), var8);
      var7 = var8[0];
      if (var7 == -1) {
         var6.n5(new y2(var0.u3(), var0.u3()));
      } else if (var7 == 0) {
         var6.n5(new y2(var0.u3(), var1.u3()));
      } else {
         for (int var10 = 0; var10 < var9.size(); var10 += 3) {
            com.aspose.slides.internal.e1.a6 var11 = new com.aspose.slides.internal.e1.a6(
               (var10 == 0 ? var0 : (w1)var9.get_Item(var10 - 1)).u3(),
               ((w1)var9.get_Item(var10)).u3(),
               ((w1)var9.get_Item(var10 + 1)).u3(),
               ((w1)var9.get_Item(var10 + 2)).u3()
            );
            var6.n5(var11);
         }
      }
   }
}
