package com.aspose.slides.internal.e2l;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.j3b.s7;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.t4;
import com.aspose.slides.internal.y5s.z8;

public class k5 implements s7 {
   private final a0 n5;
   private final com.aspose.slides.internal.j3b.u3 l6;
   private final int k5;
   private final int u3;
   private final int a6;
   private final boolean u9;
   private final long h0;
   private com.aspose.slides.internal.v2x.k5 c8;

   public k5(a0 var1, long var2, boolean var4, com.aspose.slides.internal.j3b.u3 var5, int var6, int var7, int var8) {
      if (var1 == null) {
         throw new ArgumentNullException("loadPixelsDataStream");
      }

      if (var5 == null) {
         throw new ArgumentNullException("pixelsPalette");
      }

      this.h0 = var2;
      this.n5 = var1;
      this.l6 = var5;
      this.k5 = var6;
      this.u3 = var7;
      this.a6 = var8;
      this.u9 = var4;
   }

   @Override
   public boolean n5() {
      return false;
   }

   @Override
   public z8 l6() {
      throw new NotImplementedException();
   }

   @Override
   public void n5(j5 var1, z8 var2, com.aspose.slides.internal.j3b.c8 var3) {
      throw new NotImplementedException();
   }

   public void n5(com.aspose.slides.internal.v2x.k5 var1) {
      this.c8 = var1;
   }

   @Override
   public void n5(j5 var1, com.aspose.slides.internal.j3b.u9 var2) {
      k5$l6 var3 = new k5$l6(var1.n3(), this, var2);
      this.n5(var1.n3(), var3);
   }

   public void n5(j5 var1, com.aspose.slides.internal.j3b.c8 var2) {
      this.n5.n5(this.h0, 0);
      com.aspose.slides.internal.b9y.n5 var3 = new com.aspose.slides.internal.b9y.n5(this.n5, this.a6);
      var3.t9();
      k5$k5 var4 = new k5$k5(var3, var2, var1.n3());
      j5.n5(0, 0, this.k5 & 65535, var1.s7()).n5(var1);
      if (this.u9) {
         t4.n5(var1.n3(), this.k5 & 65535, this.u3 & 65535, var4);
      } else {
         t4.n5(var1.n3(), var4);
      }
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.j3b.u3 n5(k5 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v2x.k5 l6(k5 var0) {
      return var0.c8;
   }
}
