package com.aspose.slides.internal.y3;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.y1;

public class l6 {
   private long n5;
   private short l6;
   private short k5;
   private short u3;
   private short a6;
   private short u9;
   private short h0;
   private long c8;
   private short t2;

   public final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.k7();
      this.k5 = var1.k7();
      this.u3 = var1.k7();
      this.a6 = var1.k7();
      this.u9 = var1.k7();
      this.h0 = var1.k7();
      this.c8 = var1.c4();
      this.t2 = var1.k7();
      this.u3();
   }

   private void u3() {
      short var1 = 0;
      var1 = (short)(var1 ^ (short)(this.n5 & 4294967295L & 65535L));
      var1 = (short)(var1 ^ (short)((this.n5 & 4294901760L & 4294967295L) >> 16));
      var1 = (short)(var1 ^ this.l6);
      var1 = (short)(var1 ^ this.k5);
      var1 = (short)(var1 ^ this.u3);
      var1 = (short)(var1 ^ this.a6);
      var1 = (short)(var1 ^ this.u9);
      var1 = (short)(var1 ^ this.h0);
      var1 = (short)(var1 ^ (short)(this.c8 & 4294967295L & 65535L));
      var1 = (short)(var1 ^ (short)((this.c8 & 4294901760L & 4294967295L) >> 16));
      if (var1 != this.t2) {
         throw new InvalidOperationException("Metafile checksum is invalid.");
      }
   }

   public final boolean n5() {
      return this.a6 - this.k5 > 0 && this.u9 - this.u3 > 0;
   }

   public final y1 l6() {
      return new y1(0.0F, 0.0F, this.a6 - this.k5, this.u9 - this.u3);
   }

   public final int k5() {
      return this.h0;
   }
}
