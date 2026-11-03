package com.aspose.slides.internal.t7q;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.b8u.a6;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.b8u.u9;
import com.aspose.slides.internal.b8u.x8;
import com.aspose.slides.internal.b8u.y4;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.b3;
import com.aspose.slides.internal.r1x.e2;
import com.aspose.slides.internal.r1x.f0;
import com.aspose.slides.internal.r1x.j9;
import com.aspose.slides.internal.r1x.o0;
import com.aspose.slides.internal.r1x.q0;
import com.aspose.slides.internal.r1x.y0;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public class n5 extends e2 implements u9 {
   private int[] n3;
   private f0 y4;
   private a6 e2;
   private byte[] t9 = null;

   public n5(a6 var1) {
      this.n5(var1);
   }

   public final a6 x8() {
      return this.e2;
   }

   @Override
   public final void n5(a6 var1) {
      this.e2 = var1;
   }

   @Override
   public final boolean a0() {
      return this.t9 != null;
   }

   @Override
   public boolean l6() {
      throw new NotImplementedException();
   }

   @Override
   public final void n5(y2 var1, z6 var2, t9 var3) {
      if (this.t9 == null) {
         throw new InvalidOperationException("Method saveRawData must be called before this method to initialize pixels");
      }

      l6 var4 = new l6(this.t9, this.x8());
      var4.n5(var1, var2, var3);
   }

   public final u9 n5(f0 var1) {
      this.y4 = var1;
      return this;
   }

   @Override
   public final void l6(y2 var1, x8 var2) {
      if (this.n3 == null) {
         throw new InvalidOperationException("Method saveArgb32Pixels must be called before this method to initialize pixels");
      }

      l6 var3 = new l6(this.n3, this.x8());
      y4 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, y4.class);
      q0 var5;
      if (var4 == null) {
         var5 = new y0(this.y4, var2);
      } else {
         var5 = new j9(this.y4, var4);
      }

      try {
         b3 var6 = new b3(var3.n5(), (com.aspose.slides.internal.b8u.x8)var5);
         o0.n5(var1.n3(), var6);
      } finally {
         if (com.aspose.slides.internal.v6g.k5.l6(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   @Override
   public final void l6(y2 var1, int[] var2) {
      this.n3 = var2;
   }

   @Override
   public void u3() {
      throw new NotImplementedException();
   }

   @Override
   protected void l6(t4 var1) {
      throw new NotImplementedException();
   }

   public void n5(byte[] var1) {
      this.t9 = var1;
   }
}
