package com.aspose.slides.internal.j7;

import com.aspose.slides.internal.n2d.m1;
import com.aspose.slides.internal.z0k.t4;

public class a6 extends n5 {
   public a6(com.aspose.slides.internal.o9b.l6 var1, byte[] var2) {
      this.n5(var1);
      this.h0 = com.aspose.slides.internal.k4d.a6.z3(var2).u3();
   }

   public a6(com.aspose.slides.internal.w0.y4 var1) {
      super(var1);
   }

   @Override
   public void l6(t4 var1, int var2) {
      l6 var3 = new l6(this.a6, this.y4());

      try {
         if (this.a6.s7() == 8207) {
            var3.n5(this.n3());
         }

         n5(var3.n5(), var1, var2);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public void n5(t4 var1) {
      l6 var2 = new l6(this.a6, this.y4());

      try {
         n5(this.a6, var1, m1.n5(var2.n5()), m1.l6(var2.n5()));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public void l6(t4 var1) {
      l6 var2 = new l6(this.a6, this.y4());

      try {
         l6(var2.n5(), var1);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public void k5(t4 var1, int var2) {
      l6 var3 = new l6(this.a6, this.y4());

      try {
         y4 var4 = new y4();

         try {
            var4.n5(var3.n5(), var1, var2, false);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private com.aspose.slides.internal.o9b.l6 y4() {
      return this.h0 ? this.s7() : this.a6;
   }

   @Override
   protected void n5(boolean var1) {
   }
}
