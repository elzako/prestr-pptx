package com.aspose.slides.internal.e8b;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.r1x.t4;
import com.aspose.slides.ms.System.j3;

@j3
public class k5 {
   private final Dictionary<Integer, int[]> n5 = new Dictionary<>();
   private final Dictionary<Integer, int[]> l6 = new Dictionary<>();
   private final Dictionary<Integer, double[]> k5 = new Dictionary<>();

   public k5(int var1) {
   }

   public final int n5() {
      return this.n5.size();
   }

   public final k5 l6() {
      return (k5)t4.n5(this);
   }

   public final byte[] n5(byte var1) {
      if ((var1 & 255) >= 0 && (var1 & 255) < this.n5.size()) {
         byte[] var2 = new byte[((int[])this.n5.get_Item(var1 & 255)).length];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = (byte)this.n5.get_Item(var1 & 255)[var3];
         }

         return var2;
      } else {
         throw new com.aspose.slides.internal.z3b.l6("Color component number is out of range");
      }
   }

   final void n5(int var1, int[] var2, int[] var3, double[] var4) {
      this.n5.addItem(var1, var2);
      this.l6.addItem(var1, var3);
      this.k5.addItem(var1, var4);
   }
}
