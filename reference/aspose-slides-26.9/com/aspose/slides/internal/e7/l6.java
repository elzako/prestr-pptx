package com.aspose.slides.internal.e7;

import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public class l6 implements IDisposable {
   private final com.aspose.slides.internal.v2.u3 n5;
   private k5 l6;

   public final k5 n5() {
      if (this.l6 == null && this.n5 != null && this.n5.k5() != null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.k5().u9(com.aspose.slides.internal.v2.c8.u0a);
         if (var1 != null) {
            this.l6 = new k5(this, var1);
         } else {
            this.l6 = new k5(this);
         }
      }

      return this.l6;
   }

   public final a6 l6() {
      if (this.n5 != null && this.n5.k5() != null) {
         com.aspose.slides.internal.v2.k5 var1 = (com.aspose.slides.internal.v2.k5)this.n5.k5().u9(com.aspose.slides.internal.v2.c8.s6);
         if (var1 != null) {
            return new a6(var1);
         }
      }

      return null;
   }

   public final int k5() {
      return this.n5() != null ? this.n5().n5().size() : 0;
   }

   public l6() {
      this.n5 = new com.aspose.slides.internal.v2.u3();
      this.n5.n5(new com.aspose.slides.internal.v2.k5());
      com.aspose.slides.internal.v2.k5 var1 = new com.aspose.slides.internal.v2.k5();
      this.n5.k5().l6(com.aspose.slides.internal.v2.c8.u0a, var1);
      var1.l6(com.aspose.slides.internal.v2.c8.g2x, com.aspose.slides.internal.v2.c8.u6);
      var1.l6(com.aspose.slides.internal.v2.c8.m4d, com.aspose.slides.internal.v2.c8.l6("1.4"));
      com.aspose.slides.internal.v2.k5 var2 = new com.aspose.slides.internal.v2.k5();
      var1.l6(com.aspose.slides.internal.v2.c8.z6z, var2);
      var2.l6(com.aspose.slides.internal.v2.c8.g2x, com.aspose.slides.internal.v2.c8.z6z);
      com.aspose.slides.internal.v2.n5 var3 = new com.aspose.slides.internal.v2.n5();
      var2.l6(com.aspose.slides.internal.v2.c8.q9, var3);
      var2.l6(com.aspose.slides.internal.v2.c8.s4, com.aspose.slides.internal.v2.h0.n5());
   }

   private l6(com.aspose.slides.internal.v2.u3 var1) {
      this.n5 = var1;
   }

   public static l6 n5(t4 var0) {
      com.aspose.slides.internal.m6.k5 var1 = new com.aspose.slides.internal.m6.k5(var0);
      com.aspose.slides.internal.v2.u3 var2 = var1.u9();
      return new l6(var2);
   }

   public final com.aspose.slides.internal.v2.u3 u3() {
      return this.n5;
   }

   @Override
   public final void dispose() {
      if (!this.n5.u3()) {
         this.n5.dispose();
      }
   }
}
