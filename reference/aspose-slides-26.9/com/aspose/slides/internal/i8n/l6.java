package com.aspose.slides.internal.i8n;

import com.aspose.slides.internal.f4l.b3;
import com.aspose.slides.internal.f4l.h2;
import com.aspose.slides.internal.f4l.m3;
import com.aspose.slides.internal.j9e.y4;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.z0k.e2;

public class l6 {
   public static t4 n5(b3 var0) {
      if (var0.n5() instanceof com.aspose.slides.internal.f4l.a6) {
         return n5((com.aspose.slides.internal.f4l.a6)var0.n5());
      } else if (var0.n5() instanceof h2) {
         return n5((h2)var0.n5());
      } else {
         throw new IllegalArgumentException("Unknown type of EMF+ Image");
      }
   }

   private static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.f4l.a6 var0) {
      if (var0.n5() instanceof com.aspose.slides.internal.f4l.u9) {
         byte[] var5 = ((com.aspose.slides.internal.f4l.u9)var0.n5()).n5();
         com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var0.u9(), var0.l6(), var0.k5());
         com.aspose.slides.internal.j9e.n5 var3 = var2.n5(new y2(0, 0, var2.e2(), var2.h0()), 3, var2.s7());
         byte[] var4 = (byte[])var3.u3().k5().n5();
         System.arraycopy(var5, 0, var4, 0, var5.length);
         var2.n5(var3);
         return var2;
      } else if (var0.n5() instanceof m3) {
         m3 var1 = (m3)var0.n5();
         return new com.aspose.slides.internal.o9b.l6(new e2(var1.n5().n5()));
      } else {
         throw new IllegalArgumentException("Unknown type of EMF+ Bitmap");
      }
   }

   private static y4 n5(h2 var0) {
      return new y4(new e2(var0.n5().n5()));
   }
}
