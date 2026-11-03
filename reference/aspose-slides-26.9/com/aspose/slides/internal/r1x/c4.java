package com.aspose.slides.internal.r1x;

import com.aspose.slides.ms.System.IDisposable;

public class c4 {
   protected final com.aspose.slides.internal.b8u.q0 n5;
   protected final f0 l6;

   public c4(f0 var1, com.aspose.slides.internal.b8u.q0 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   public final boolean n5() {
      return this.n5.a0();
   }

   public final com.aspose.slides.internal.b8u.q0 l6() {
      return this.n5;
   }

   void n5(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.b8u.x8 var2) {
      try {
         b3 var3 = new b3(this.n5, var2);
         o0.n5(var1.n3(), var3);
      } finally {
         if (com.aspose.slides.internal.v6g.k5.l6(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }
   }

   void n5(com.aspose.slides.internal.o9b.y2 var1, z6 var2, com.aspose.slides.internal.b8u.t9 var3) {
      try {
         z7 var4 = new z7(this.n5, var3, var2);
         o0.n5(var1.n3(), var4);
      } finally {
         if (com.aspose.slides.internal.v6g.k5.l6(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }
   }
}
