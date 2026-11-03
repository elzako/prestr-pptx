package com.aspose.slides.internal.f7;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public class n5 implements IDisposable {
   private l6 n5;
   private final com.aspose.slides.internal.w0.n5[] l6;
   private final com.aspose.slides.internal.a9.l6 k5;
   private final p8 u3 = new p8();

   public n5(t4 var1, p8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      var2.k5(this.u3);
      this.k5 = com.aspose.slides.internal.a9.l6.n5(var1, new com.aspose.slides.internal.w0.t4(var2.l6(), var2.k5()), null, (byte)0);
      int var3 = var2.l6() * var2.k5();
      this.l6 = (com.aspose.slides.internal.w0.n5[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.w0.n5.class), var3)
      );
      this.n5 = new u9(new k5(var3));
   }

   public final void n5(com.aspose.slides.internal.o9b.l6 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("frame");
      }

      if (p8.n5(var1.n3(), this.u3)) {
         throw new ArgumentOutOfRangeException("frame", "frame.Size != FrameSize");
      }

      com.aspose.slides.internal.d8.k5 var3 = this.n5(var1);
      byte[] var4 = new byte[var3.n5()];
      IGenericList var5 = this.n5.n5(var3, var4);
      com.aspose.slides.internal.a9.k5 var6 = this.k5.n5(var2);

      try {
         com.aspose.slides.internal.a9.n5 var7 = new com.aspose.slides.internal.a9.n5();
         var7.k5 = var5;
         var7.l6 = var4;
         var7.n5 = new com.aspose.slides.internal.u0.n5<>(
            new com.aspose.slides.internal.w0.t4(0, 0), new com.aspose.slides.internal.w0.t4(var1.e2(), var1.h0())
         );
         var6.n5(var7.n5());
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   @Override
   public final void dispose() {
      this.k5.dispose();
   }

   private com.aspose.slides.internal.d8.k5<com.aspose.slides.internal.w0.n5> n5(com.aspose.slides.internal.o9b.l6 var1) {
      com.aspose.slides.internal.d8.k5 var2 = new com.aspose.slides.internal.d8.k5<>(this.l6, 0, 0);
      com.aspose.slides.internal.d8.n5 var3 = new com.aspose.slides.internal.d8.n5<>(new n5$1(this, var2), new n5$2(this));
      com.aspose.slides.internal.o9.n5.n5(var1, new n5$3(this, var3));
      return var2;
   }
}
