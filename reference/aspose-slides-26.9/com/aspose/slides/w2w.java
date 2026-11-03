package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class w2w {
   private byte[] n5 = new byte[10];

   w2w() {
   }

   w2w(byte[] var1) {
      this();
      this.n5(var1);
   }

   final void n5(byte[] var1) {
      if (var1 != null && var1.length == 10) {
         com.aspose.slides.ms.System.u3.n5((Object)(var1)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0);
      }
   }

   final int n5() {
      return this.n5[0] & 0xFF;
   }

   final int l6() {
      return this.n5[1] & 0xFF;
   }

   final int k5() {
      return this.n5[2] & 0xFF;
   }

   final int u3() {
      return this.n5[3] & 0xFF;
   }

   final int a6() {
      return this.n5[4] & 0xFF;
   }

   final int u9() {
      return this.n5[5] & 0xFF;
   }

   final int h0() {
      return this.n5[6] & 0xFF;
   }

   final int c8() {
      return this.n5[7] & 0xFF;
   }

   final int t2() {
      return this.n5[8] & 0xFF;
   }

   final int s7() {
      return this.n5[9] & 0xFF;
   }

   final boolean x8() {
      for (int var1 = 0; var1 < 10; var1++) {
         if ((this.n5[var1] & 255) != 0) {
            return false;
         }
      }

      return true;
   }

   public final boolean n5(w2w var1) {
      for (int var2 = 0; var2 < 10; var2++) {
         if ((this.n5[var2] & 255) != 0 && (var1.n5[var2] & 255) != 0 && (this.n5[var2] & 255) != (var1.n5[var2] & 255)) {
            return false;
         }
      }

      return true;
   }

   public final String n5(Dictionary<byte[], String> var1) {
      Dictionary var2 = new Dictionary();
      double[] var3 = new double[]{1.0, 0.01, 1.0, 10.0, 1.0, 10.0, 1.0, 1.0, 1.0, 1.0};
      double var4 = Double.MAX_VALUE;
      String var6 = "";
      Dictionary$Enumerator var7 = var1.iterator();

      try {
         while (var7.hasNext()) {
            KeyValuePair var8 = (KeyValuePair)var7.next();
            if ((this.n5[3] & 255) == 9 && (((byte[])var8.getKey())[3] & 255) == 9) {
               var2.addItem(var8.getKey(), var8.getValue());
            } else if ((((byte[])var8.getKey())[3] & 255) != 9) {
               var2.addItem(var8.getKey(), var8.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (var2.size() == 0) {
         var2 = new Dictionary(var1);
      }

      Dictionary$Enumerator var20 = var2.iterator();

      try {
         while (var20.hasNext()) {
            KeyValuePair var9 = (KeyValuePair)var20.next();
            double var10 = 0.0;

            for (int var12 = 0; var12 < 10; var12++) {
               if ((this.n5[var12] & 255) != 0) {
                  var10 += com.aspose.slides.ms.System.q1.a6(((this.n5[var12] & 255) - (((byte[])var9.getKey())[var12] & 255)) * var3[var12], 2.0);
               }
            }

            var10 = com.aspose.slides.ms.System.q1.z3(var10);
            if (var10 < var4) {
               var4 = var10;
               var6 = (String)var9.getValue();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }

      return var6;
   }

   @Override
   public String toString() {
      String var1 = "FontPanose: ";
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            "FamilyKind: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[0], "X2"), "]", com.aspose.slides.ms.System.s3.n5(j7x.class, this.n5())
         )
      );
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * SerifStyle: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[1], "X2"), "]", com.aspose.slides.ms.System.s3.n5(s5t.class, this.l6())
         )
      );
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * Weight: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[2], "X2"), "]", com.aspose.slides.ms.System.s3.n5(t1s.class, this.k5())
         )
      );
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * Proportion: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[3], "X2"), "]", com.aspose.slides.ms.System.s3.n5(d1v.class, this.u3())
         )
      );
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * Contrast: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[4], "X2"), "]", com.aspose.slides.ms.System.s3.n5(p5r.class, this.a6())
         )
      );
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * StrokeVariation: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[5], "X2"), "]", com.aspose.slides.ms.System.s3.n5(b1z.class, this.u9())
         )
      );
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * ArmStyle: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[6], "X2"), "]", com.aspose.slides.ms.System.s3.n5(i5x.class, this.h0())
         )
      );
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * LetterForm: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[7], "X2"), "]", com.aspose.slides.ms.System.s3.n5(s3l.class, this.c8())
         )
      );
      var1 = com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * Midline: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[8], "X2"), "]", com.aspose.slides.ms.System.s3.n5(g0u.class, this.t2())
         )
      );
      return com.aspose.slides.ms.System.d1.n5(
         var1,
         com.aspose.slides.ms.System.d1.n5(
            " * Xheight: [0x", com.aspose.slides.ms.System.e2.n5(this.n5[9], "X2"), "]", com.aspose.slides.ms.System.s3.n5(w6i.class, this.s7())
         )
      );
   }
}
