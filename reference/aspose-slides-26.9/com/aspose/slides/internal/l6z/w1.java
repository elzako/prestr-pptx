package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

public class w1 {
   private final x8 n5;
   private final e2 l6;
   private String k5;

   public w1(e2 var1, x8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var2 == null) {
         throw new ArgumentNullException();
      }

      this.l6 = var1;
      this.n5 = var2;
   }

   public w1(com.aspose.slides.internal.x1.u9 var1, e2 var2, x8 var3) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      if (var2 == null) {
         throw new ArgumentNullException();
      }

      if (var3 == null) {
         throw new ArgumentNullException();
      }

      this.l6 = var2;
      this.n5 = var3;
      byte[] var4 = var1.l6();
      this.n5(var4);
   }

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final e2 l6() {
      return this.l6;
   }

   public final x8 k5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.x1.u9 var1) {
      com.aspose.slides.internal.l7h.j5 var2 = com.aspose.slides.internal.n2d.x8.n5(this.n5.n5().n5().l6() & 65535);
      List var3 = new List<>(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.n8e.v4.n5(var2.u3(this.k5))));
      var3.addItem((byte)0);
      byte[] var4 = p6.l6(com.aspose.slides.internal.n8e.v4.l6(var3));
      var1.n5(var4);
   }

   private void n5(byte[] var1) {
      byte[] var2 = new byte[(int)(var1.length - (this.l6.l6().l6() & 4294967295L) & 4294967295L)];
      com.aspose.slides.ms.System.y4.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(var1)), (int)this.l6.l6().l6(), com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, var2.length
      );
      byte[] var3 = p6.n5(var2);
      this.k5 = com.aspose.slides.internal.l6z.k5.n5(var3, this.n5.n5().n5().l6() & 65535);
   }
}
