package com.aspose.slides.internal.q7;

import com.aspose.slides.exceptions.ArgumentNullException;

public class u3 {
   public static final u3 n5 = new u3(new u9());
   private final t2 l6;
   private final x8 k5;
   private long u3 = com.aspose.slides.internal.v6g.k5.h0(1073741824, 9);
   private long a6 = com.aspose.slides.internal.v6g.k5.h0(52428800, 9);
   private long u9 = com.aspose.slides.internal.q7.n5.n5;
   private boolean h0;

   public u3(x8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("tempFileService");
      }

      this.l6 = new k5();
      this.k5 = var1;
   }

   public u3(t2 var1, x8 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("errorHandler");
      }

      if (var2 == null) {
         throw new ArgumentNullException("tempFileService");
      }

      this.l6 = var1;
      this.k5 = var2;
   }

   public final x8 n5() {
      return this.k5;
   }

   public final long l6() {
      return this.a6;
   }

   public final void n5(long var1) {
      this.a6 = var1;
   }

   public final t2 k5() {
      return this.l6;
   }

   public final long u3() {
      return this.u9;
   }

   public final long a6() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   public final boolean u9() {
      return this.h0;
   }

   public final void n5(boolean var1) {
      this.h0 = var1;
   }

   static {
      n5.n5(true);
   }
}
