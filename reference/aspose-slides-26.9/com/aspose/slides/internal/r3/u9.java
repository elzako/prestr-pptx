package com.aspose.slides.internal.r3;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.e5a.t2;
import com.aspose.slides.internal.e5a.y2;
import com.aspose.slides.internal.q7.c8;
import com.aspose.slides.internal.q7.l6$n5;
import com.aspose.slides.internal.z0k.t4;

public class u9 implements c8 {
   private final l6$n5 n5;
   private final com.aspose.slides.internal.q7.u3 l6;
   private final y2 k5;
   private n5 u3;

   public u9(y2 var1, com.aspose.slides.internal.q7.u3 var2, l6$n5 var3) {
      if (var1 == null) {
         throw new ArgumentNullException("zipEntry");
      }

      this.k5 = var1;
      this.l6 = var2;
      this.n5 = var3;
   }

   @Override
   public final byte[] n5() {
      if (this.u3 == null) {
         this.a6();
      }

      return this.u3.n5();
   }

   @Override
   public final t4 l6() {
      return this.u3 != null ? this.u3.l6() : new com.aspose.slides.internal.z0k.k5(this.k5.c4(), (int)com.aspose.slides.internal.q7.n5.n5);
   }

   @Override
   public final long k5() {
      return this.u3 == null ? 0L : this.u3.k5();
   }

   @Override
   public final void dispose() {
      if (this.u3 != null) {
         this.u3.dispose();
      }
   }

   public final boolean u3() {
      return this.u3 == null;
   }

   public final void a6() {
      t2 var1 = this.k5.c4();

      try {
         this.u3 = new n5(var1, this.l6, this.n5);
         this.u3.u3();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
