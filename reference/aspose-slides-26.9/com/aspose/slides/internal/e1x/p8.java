package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.q1;

public class p8 extends f0 {
   public int n5;
   public int l6;
   public short k5;
   public short u3;
   public int a6;
   public int u9;
   public int h0;
   public int c8;
   public int t2;
   public int s7;
   public int[] x8;
   public List<String> n3;

   public p8(com.aspose.slides.internal.n2d.k5 var1) {
      this.n5 = var1.l6();
      this.l6 = var1.l6();
      this.k5 = var1.u3();
      this.u3 = var1.u3();
      this.a6 = var1.l6();
      this.u9 = var1.l6();
      this.h0 = var1.l6();
      this.c8 = var1.l6();
      this.t2 = var1.l6();
      switch (this.n5) {
         case 131072:
            this.s7 = var1.a6() & 65535;
            this.x8 = new int[this.s7];
            int var2 = 0;

            for (int var3 = 0; var3 < this.x8.length; var3++) {
               int var4 = var1.a6();
               this.x8[var3] = var4 & 65535;
               if ((var4 & 65535) <= 32767) {
                  var2 = q1.n5(var4 & 65535, var2);
               }
            }

            int var5 = var2 - 258 + 1;
            var5 = var5 < 0 ? 0 : var5;
            this.n3 = new List<>(var5);

            for (int var7 = 0; var7 < var5; var7++) {
               this.n3.addItem(n5(var1));
            }
         case 65536:
         case 196608:
            return;
         default:
            throw new InvalidOperationException("Unexpected PostScript table version.");
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.n2d.u3 var1) {
      var1.n5(this.n5);
      var1.n5(this.l6);
      var1.l6(this.k5);
      var1.l6(this.u3);
      var1.n5(this.a6);
      var1.n5(this.u9);
      var1.n5(this.h0);
      var1.n5(this.c8);
      var1.n5(this.t2);
      switch (this.n5) {
         case 131072:
            var1.l6(this.s7);

            for (int var5 : this.x8) {
               var1.l6(var5);
            }

            for (int var6 = 0; var6 < this.n3.size(); var6++) {
               n5(this.n3.get_Item(var6), var1);
            }
         case 65536:
         case 196608:
            return;
         default:
            throw new InvalidOperationException("Unexpected PostScript table version.");
      }
   }

   public final void n5(com.aspose.slides.internal.n2d.k7 var1) {
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
      switch (this.n5) {
         case 131072:
            this.l6(var1);
         case 65536:
         case 196608:
            return;
         default:
            throw new InvalidOperationException("Unexpected PostScript table version.");
      }
   }

   private void l6(com.aspose.slides.internal.n2d.k7 var1) {
      int[] var2 = new int[var1.n5()];
      List var3 = new List();

      for (int var4 = 0; var4 < var1.n5(); var4++) {
         int var5 = var1.u3(var4);
         int var6 = com.aspose.slides.internal.v6g.k5.u3(var1.k5(var4), int.class);
         int var7 = this.x8[var5];
         if (var7 >= 258 && var7 <= 32767) {
            String var8 = this.n3.get_Item(var7 - 258);
            var3.addItem(var8);
            int var9 = var3.size() - 1;
            var2[var6] = var9 + 258 & 65535;
         } else {
            var2[var6] = var7 & 65535;
         }
      }

      this.s7 = var1.n5() & 65535;
      this.x8 = var2;
      this.n3 = var3;
   }

   private static String n5(com.aspose.slides.internal.n2d.k5 var0) {
      int var1 = var0.u9() & 255;
      byte[] var2 = var0.n5(var1);
      com.aspose.slides.internal.l7h.j5 var3 = com.aspose.slides.internal.l7h.j5.e2();
      return var3.l6(var2);
   }

   private static void n5(String var0, com.aspose.slides.internal.n2d.u3 var1) {
      if (var0.length() > 255) {
         throw new InvalidOperationException("The PostScript glyph name is too long.");
      }

      com.aspose.slides.internal.l7h.j5 var2 = com.aspose.slides.internal.l7h.j5.e2();
      byte[] var3 = var2.u3(var0);
      var1.n5((byte)var3.length);
      var1.n5(var3, 0, var3.length);
   }
}
