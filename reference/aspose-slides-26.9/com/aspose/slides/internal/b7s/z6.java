package com.aspose.slides.internal.b7s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.j8;

public class z6 extends com.aspose.slides.internal.v6g.h0<z6> {
   public byte n5;
   public int[] l6;

   public final byte n5() {
      return (byte)((this.n5 & 255) >> 4);
   }

   public final void n5(byte var1) {
      this.n5 = (byte)(this.n5 & 0xFF | (var1 & 255) << 4);
   }

   public final byte l6() {
      return (byte)(this.n5 & 0xFF & 15);
   }

   public final void l6(byte var1) {
      this.n5 = (byte)(this.n5 & 0xFF & 360 | var1 & 0xFF);
   }

   public static z6 n5(byte var0, byte[] var1, int var2, boolean var3) {
      z6 var4 = new z6();
      var4.l6(var0);
      var4.n5((byte)0);
      int[] var5 = new int[64];

      for (int var6 = 0; var6 < 64; var6++) {
         int var7 = ((var1[var6] & 255) * var2 + 50) / 100;
         if (var7 <= 0) {
            var7 = 1;
         }

         if (var3) {
            if (var7 > 255) {
               var7 = 255;
            }
         } else if (var7 > 65535) {
            var7 = 65535;
         }

         var5[var6] = var7 & 65535;
      }

      var4.l6 = var5;
      return var4;
   }

   public static z6[] n5(h2 var0) {
      List var1 = new List();
      int var2 = 0;
      int[] var3 = new int[]{0};
      var0.n5(var3);
      var2 = var3[0];
      int var4 = 2;

      while (var4 < var2) {
         z6 var5 = new z6();
         int var6 = 0;
         int[] var7 = new int[]{0};
         var0.l6(var7);
         var6 = var7[0];
         var5.n5 = (byte)var6;
         var4++;
         int[] var8 = new int[64];
         if ((var5.n5() & 255) == 0) {
            for (int var14 = 0; var14 < 64; var14++) {
               int var16 = 0;
               int[] var18 = new int[]{0};
               var0.l6(var18);
               var16 = var18[0];
               var4++;
               var8[com.aspose.slides.internal.n5p.u9.n5()[var14]] = var16 & 65535;
            }
         } else {
            for (int var9 = 0; var9 < 64; var9++) {
               int var10 = 0;
               int[] var11 = new int[]{0};
               var0.n5(var11);
               var10 = var11[0];
               var4 += 2;
               var8[com.aspose.slides.internal.n5p.u9.n5()[var9]] = var10 & 65535;
            }
         }

         var5.l6 = var8;
         var1.addItem(var5.k5());
      }

      return (z6[])var1.toArray(new z6[0]);
   }

   static void n5(y0 var0, z6[] var1) {
      var0.n5((byte)-1);
      var0.n5((byte)-37);
      int var2 = 2;

      for (z6 var6 : var1) {
         var2 = 65 + 64 * (var6.n5() & 255) + (var2 & 65535) & 65535;
      }

      var0.n5(var2);

      for (z6 var12 : var1) {
         var0.n5(var12.n5);
         int[] var7 = var12.l6;
         if ((var12.n5() & 255) == 0) {
            for (int var13 = 0; var13 < 64; var13++) {
               var0.n5((byte)var7[com.aspose.slides.internal.n5p.u9.n5()[var13]]);
            }
         } else {
            for (int var8 = 0; var8 < 64; var8++) {
               var0.n5(var7[com.aspose.slides.internal.n5p.u9.n5()[var8]]);
            }
         }
      }
   }

   public void n5(z6 var1) {
      var1 = var1 == null ? new z6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public z6 k5() {
      z6 var1 = new z6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(z6 var1) {
      return var1.n5 == this.n5 && j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof z6) ? false : this.l6((z6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z6 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(z6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
