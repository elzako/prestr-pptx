package com.aspose.slides.internal.p2i;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d5;
import com.aspose.slides.ms.System.p8;

public class x8 {
   private byte[] n5;

   public x8(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      if (var1.length != 10) {
         throw new ArgumentException("data");
      }

      this.n5 = var1;
   }

   public int n5() {
      return this.n5[0] & 0xFF;
   }

   public int l6() {
      return this.n5[1] & 0xFF;
   }

   public int k5() {
      return this.n5[2] & 0xFF;
   }

   public int u3() {
      return this.n5[3] & 0xFF;
   }

   public int a6() {
      return this.n5[4] & 0xFF;
   }

   public int u9() {
      return this.n5[5] & 0xFF;
   }

   public int h0() {
      return this.n5[6] & 0xFF;
   }

   public int c8() {
      return this.n5[7] & 0xFF;
   }

   public int t2() {
      return this.n5[8] & 0xFF;
   }

   public int s7() {
      return this.n5[9] & 0xFF;
   }

   @Override
   public String toString() {
      return "FamilyType: "
         + d5.getName(a6.class, this.n5())
         + p8.n5
         + "SerifStyle: "
         + d5.getName(e2.class, this.l6())
         + p8.n5
         + "Weight: "
         + d5.getName(q0.class, this.k5())
         + p8.n5
         + "Proportion: "
         + d5.getName(n3.class, this.u3())
         + p8.n5
         + "Contrast: "
         + d5.getName(k5.class, this.a6())
         + p8.n5
         + "StrokeVariation: "
         + d5.getName(z1.class, this.u9())
         + p8.n5
         + "ArmStyle: "
         + d5.getName(n5.class, this.h0())
         + p8.n5
         + "Letterform: "
         + d5.getName(h0.class, this.c8())
         + p8.n5
         + "Midline: "
         + d5.getName(t2.class, this.t2())
         + p8.n5
         + "XHeight: "
         + d5.getName(m1.class, this.s7())
         + p8.n5;
   }
}
